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
import org.springframework.core.io.ClassPathResource;
import org.springframework.dao.annotation.PersistenceExceptionTranslationPostProcessor;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;

@Configuration
@AutoConfigureAfter(DataSourceConfig.class)
public class MybatisConfig2 {

	@Bean("annotationDriverTransactionManager2")
	public PlatformTransactionManager annotationDriverTransactionManager2(@Autowired@Qualifier("address2")DataSource dataSource) {
		DataSourceTransactionManager dataSourceTransactionManager = new DataSourceTransactionManager(dataSource);
		return dataSourceTransactionManager;
	}

	
    @Bean("sqlSessionFactory2")
	public SqlSessionFactory sqlSessionFactory2(@Autowired@Qualifier("address2") DataSource dataSource) {
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
    
    
    @Bean("sqlSessionTemplate2")
    public SqlSessionTemplate sqlSessionTemplate2(@Autowired@Qualifier("sqlSessionFactory2")SqlSessionFactory sqlSessionFactory) {
    	return new SqlSessionTemplate(sqlSessionFactory);
    }
    
    @Bean("scannerConfigurer2")
    public MapperScannerConfigurer scannerConfigurer2(@Autowired@Qualifier("sqlSessionFactory2")SqlSessionFactory sqlSessionFactory) {
    	MapperScannerConfigurer scannerConfigurer = new MapperScannerConfigurer();
//    	scannerConfigurer.setSqlSessionFactoryBeanName("sqlSessionFactory2");
    	scannerConfigurer.setSqlSessionFactory(sqlSessionFactory);
    	scannerConfigurer.setBasePackage("com.dt.spring.mapper1");
    	return scannerConfigurer ;
    }
}
