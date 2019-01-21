package com.lijl;

import com.lijl.registrar.MyImportBeanDefinitionRegistrar;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.lijl")
@Import(MyImportBeanDefinitionRegistrar.class)
public class AppConfig {
}
