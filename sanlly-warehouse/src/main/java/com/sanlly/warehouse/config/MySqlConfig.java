package com.sanlly.warehouse.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;

import com.alibaba.druid.pool.DruidDataSource;

@Configuration
@MapperScan(basePackages="com.sanlly.warehouse.dao")
public class MySqlConfig {
	@Autowired
    private Environment env;
	
	@Bean
	public DataSource getDataSource(){
		DruidDataSource datasource=new DruidDataSource(); 
		datasource.setDriverClassName(env.getProperty("spring.mysql.driverClassName"));
		datasource.setUrl(env.getProperty("spring.mysql.url"));
		datasource.setUsername(env.getProperty("spring.mysql.username"));
		datasource.setPassword(env.getProperty("spring.mysql.password"));
		if(env.containsProperty("spring.mysql.initialSize")){
			datasource.setInitialSize(Integer.parseInt(env.getProperty("spring.mysql.initialSize")));
		}
		if(env.containsProperty("spring.mysql.maxActive")){
			datasource.setMaxActive(Integer.parseInt(env.getProperty("spring.mysql.maxActive")));
		}
		if(env.containsProperty("spring.mysql.minIdle")){
			datasource.setMinIdle(Integer.parseInt(env.getProperty("spring.mysql.minIdle")));
		}
		return datasource;
	}
	
	@Bean
	public SqlSessionFactory sqlSessionFactory(DataSource ds) throws Exception{
		SqlSessionFactoryBean bean=new SqlSessionFactoryBean();
		bean.setDataSource(ds);
		bean.setMapperLocations(new PathMatchingResourcePatternResolver().getResources(env.getProperty("spring.mysql.mapperLocations")));
		return bean.getObject();
	}
	
	@Bean
	public DataSourceTransactionManager datasourceTransactionManager(DataSource ds){
		return new DataSourceTransactionManager(ds);
	}
	
	@Bean
	public SqlSessionTemplate sqlSessionTemplate(SqlSessionFactory sqlSessionFactory){
		return new SqlSessionTemplate(sqlSessionFactory);
	}
}
