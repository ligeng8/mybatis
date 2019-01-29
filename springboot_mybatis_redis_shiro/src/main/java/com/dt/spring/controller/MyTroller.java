package com.dt.spring.controller;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.dt.spring.config.DataSourceConfig;
import com.dt.spring.service.DbtoService;

@RestController
public class MyTroller {
    @Autowired
	private DbtoService dbtoService;
	
	@GetMapping("/hello")
	public String ss() {
		
		dbtoService.dbser();
		return "hello";
	}
	@GetMapping("/hello1")
	public String ss1() {
		
		dbtoService.insertById() ;
		return "hello";
	}
	@GetMapping("/hello2")
	public String ss12() {
		
		dbtoService.checkInsert();
		return "hello";
	}
}
