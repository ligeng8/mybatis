package com.dt.spring.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dt.spring.config.DataSourceConfig;

@RestController
public class MyTroller {
    @Autowired
	private DataSourceConfig dataSourceConfig;
	@GetMapping("/")
	public String ss() {
		
		String driverClass = dataSourceConfig.getDriverClass();
		return driverClass;
	}
}
