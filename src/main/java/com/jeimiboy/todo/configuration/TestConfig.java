package com.jeimiboy.todo.configuration;

import java.text.ParseException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import com.jeimiboy.todo.services.DBService;

@Configuration
@Profile("test")
public class TestConfig {
	
	@Autowired
	private DBService dbService;
	
	@Bean	
	public Boolean instancia() throws ParseException {
		this.dbService.instanciaBaseDeDados();
		return true;
	}
	
}
