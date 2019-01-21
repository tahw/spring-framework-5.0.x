package com.lijl.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ComponentScan("com.lijl")
@ImportResource("classpath:spring.xml")
public class AppConfig {
}
