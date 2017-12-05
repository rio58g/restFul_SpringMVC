package com.skorniychuk.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.Resource;

@Configuration
@EnableJpaRepositories("com.skorniychuk.repository")
@EnableTransactionManagement
@PropertySource("classpath: db.properties")
@ComponentScan("com.skorniychuk")
public class DataBaseConfig {
    @Resource
    private Environment enw;
}
