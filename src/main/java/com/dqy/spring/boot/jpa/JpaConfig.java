package com.dqy.spring.boot.jpa;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableJpaRepositories(basePackages = "com.dqy.spring.boot.jpa.dao")
@EntityScan(basePackages = "com.dqy.spring.boot.jpa.entity")
public class JpaConfig {
	
}
