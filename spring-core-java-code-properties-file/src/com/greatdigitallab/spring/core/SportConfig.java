package com.greatdigitallab.spring.core;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("com.greatdigitallab.spring.core")
@PropertySource("classpath:trainer.properties")
public class SportConfig {

}
