package com.dt.spring.config;

import javax.sql.DataSource;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.ClassPathResource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@AutoConfigureAfter(DataSourceConfig.class)
public class MybatisConfig {

	@Bean("annotationDriverTransactionManager")
	@Primary
	public PlatformTransactionManager annotationDriverTransactionManager(@Autowired@Qualifier("address")DataSource dataSource) {
		DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager(dataSource);
		return dataSourceTransactionManager;
	}

//	@Bean
//	@Primary
//	public PersistenceExceptionTranslationPostProcessor persistenceExceptionTranslationPostProcessor() {
//		PersistenceExceptionTranslationPostProcessor postProcessor = new PersistenceExceptionTranslationPostProcessor();
//		return postProcessor;
//	}
	
    @Bean("sqlSessionFactory")
    @Primary
	public SqlSessionFactory sqlSessionFactory(@Autowired@Qualifier("address")DataSource dataSource) {
		SqlSessionFactoryBean sqlSessionFactoryBean = new SqlSessionFactoryBean();
		sqlSessionFactoryBean.setDataSource(dataSource);
		sqlSessionFactoryBean.setConfigLocation(new ClassPathResource("/sqlMapConfig.xml"));
		try {
			return sqlSessionFactoryBean.getObject();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}
    
    
    @Bean("sqlSessionTemplate")
    @Primary
    public SqlSessionTemplate sqlSessionTemplate(@Autowired@Qualifier("sqlSessionFactory") SqlSessionFactory sqlSessionFactory) {
    	return new SqlSessionTemplate(sqlSessionFactory);
    }
    
    @Bean("scannerConfigurer")
    @Primary
    public MapperScannerConfigurer scannerConfigurer(@Autowired@Qualifier("sqlSessionFactory")SqlSessionFactory sqlSessionFactory) {
    	MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
//    	scannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory");
    	scannerConfigurer.setSqlSessionFactory(sqlSessionFactory);
    	scannerConfigurer.setBasePackage("com.dt.spring.mapper");
    	return scannerConfigurer ;
    }
}
