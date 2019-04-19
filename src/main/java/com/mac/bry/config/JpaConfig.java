package com.mac.bry.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.jpa.LocalEntityManagerFactoryBean;
@Configuration
public class JpaConfig {
	
	@Bean
	public LocalEntityManagerFactoryBean createEMF() {
		LocalEntityManagerFactoryBean factoryBean = new LocalEntityManagerFactoryBean();
		factoryBean.setPersistenceUnitName("pring-jpa-pu");
		return factoryBean;
	}
}