package com.lijl.app;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * 解决循环依赖
 */
@Configuration
@ComponentScan("com.lijl")
public class AppConfig {
}
