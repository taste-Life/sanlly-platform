package com.sanlly.warehouse.timedTask;

import org.apache.commons.lang.StringUtils;
import org.springframework.context.annotation.Configuration;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.SchedulingConfigurer;
import org.springframework.scheduling.config.ScheduledTaskRegistrar;
import org.springframework.scheduling.support.CronTrigger;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

/**
 * ClassName: SchedulingDemo
 * Description: 定时任务demo
 * date: 2019/8/30 10:39
 *
 * @author wannt
 * @since JDK 1.8
 */
@Component
@Configuration
@EnableScheduling   //开启定时任务
public class SchedulingDemo implements SchedulingConfigurer {

    @Override
    public void configureTasks(ScheduledTaskRegistrar scheduledTaskRegistrar) {
        scheduledTaskRegistrar.addTriggerTask(
                //添加任务内容
                () -> System.out.println("定时任务启动: " + LocalDateTime.now().toLocalTime()),
                //2.设置执行周期
                triggerContext -> {
                    //从数据库获取执行周期 零点执行
                    String trigger = "* * 0 * * ?";
                    //合法性校验.
                    if (StringUtils.isEmpty(trigger)) {

                    }
                    //返回执行周期(Date)
                    return new CronTrigger(trigger).nextExecutionTime(triggerContext);
                }
        );
    }

}
