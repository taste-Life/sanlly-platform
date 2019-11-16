package com.sanlly.production.config;

import java.util.Properties;

import org.quartz.Scheduler;
import org.quartz.SchedulerException;
import org.quartz.spi.TriggerFiredBundle;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.AutowireCapableBeanFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.concurrent.ThreadPoolTaskScheduler;
import org.springframework.scheduling.quartz.AdaptableJobFactory;
import org.springframework.scheduling.quartz.SchedulerFactoryBean;
import org.springframework.stereotype.Component;

@Configuration
@EnableScheduling
public class TheadPoolTaskConfig {

	@Bean
	public ThreadPoolTaskScheduler threadPoolTaskScheduler() {
		ThreadPoolTaskScheduler threadPoolTaskScheduler = new ThreadPoolTaskScheduler();
		threadPoolTaskScheduler.setPoolSize(20);
		threadPoolTaskScheduler.setWaitForTasksToCompleteOnShutdown(true);
		return threadPoolTaskScheduler;
	}
	
	@Bean
	public SchedulerFactoryBean schedulerFactoryBean(){
		 SchedulerFactoryBean schedulerFactoryBean=  new SchedulerFactoryBean();
		 schedulerFactoryBean.setQuartzProperties(quartzProperties());
		 return schedulerFactoryBean;
	}
	
	@Bean
	public Scheduler scheduler(SchedulerFactoryBean schedulerFactoryBean) {
		Scheduler scheduler = schedulerFactoryBean.getScheduler();
		try {
			scheduler.start();
		} catch (SchedulerException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return scheduler;
	}
	
	public Properties quartzProperties() {
		Properties prop = new Properties();
		prop.put("quartz.scheduler.instanceName", "schedulerFactoryBean");
		prop.put("org.quartz.scheduler.instanceId", "AUTO");
		prop.put("org.quartz.scheduler.skipUpdateCheck", "true");
		// prop.put("org.quartz.scheduler.jobFactory.class",
		// "org.quartz.simpl.SimpleJobFactory");
		// JobStoreTX
		// prop.put("org.quartz.jobStore.class",
		// "org.quartz.impl.jdbcjobstore.JobStoreTX");
//		prop.put("org.quartz.jobStore.class",
//				"org.quartz.impl.jdbcjobstore.JobStoreCMT");
//		prop.put("org.quartz.jobStore.driverDelegateClass",
//				"org.quartz.impl.jdbcjobstore.StdJDBCDelegate");
//		prop.put("org.quartz.jobStore.dataSource", "quartzDataSource");
//		prop.put("org.quartz.jobStore.tablePrefix", "QRTZ_");
//		prop.put("org.quartz.jobStore.isClustered", "true");
		prop.put("org.quartz.threadPool.class",
				"org.quartz.simpl.SimpleThreadPool");
		prop.put("org.quartz.threadPool.threadCount", "20");
 
//		prop.put("org.quartz.jobStore.maxMisfiresToHandleAtATime", "1");
//		prop.put("org.quartz.jobStore.misfireThreshold", "50000");
//		// org.quartz.jobStore.txIsolationLevelSerializable 如果为true 会出现无法连续事物的错误
//		prop.put("org.quartz.jobStore.txIsolationLevelSerializable", "false");
//		prop.put("org.quartz.jobStore.useProperties", "true");
 
		// prop.put("org.quartz.dataSource.quartzDataSource.driver",
		// "oracle.jdbc.driver.OracleDriver");
		// prop.put("org.quartz.dataSource.quartzDataSource.URL",
		// "jdbc:oracle:thin:@127。0.0.1/orcl");
		// prop.put("org.quartz.dataSource.quartzDataSource.user", "spcp");
		// prop.put("org.quartz.dataSource.quartzDataSource.password", "spcp");
		// prop.put("org.quartz.dataSource.quartzDataSource.maxConnections",
		// "10");
 
//		prop.put("org.quartz.jobStore.dontSetAutoCommitFalse", "false");
 
		return prop;
	}

	@Component("myJobFactory")
	public static class MyJobFactory extends AdaptableJobFactory{
		@Autowired
		private AutowireCapableBeanFactory beanFactory;
	 
		@Override
		protected Object createJobInstance(TriggerFiredBundle bundle)
				throws Exception {
			// TODO Auto-generated method stub
			Object jobInstance = super.createJobInstance(bundle);
			//AutowireCapableBeanFactory只是让jobInstance具备了自动配置属性的功能，并不是把jobInstance放入到了spring容器中
			beanFactory.autowireBean(jobInstance);
			return jobInstance;
		}
	}
}
