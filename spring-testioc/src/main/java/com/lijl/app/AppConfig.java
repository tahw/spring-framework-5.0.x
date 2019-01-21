package com.lijl.app;

import com.lijl.dao.ImportDao1;
import com.lijl.importBeanDefinitionRegistrar.MyImportBeanDefinitionRegistrar;
import com.lijl.importBeanDefinitionRegistrar.MyImportSelector;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan("com.lijl")
@Import({MyImportBeanDefinitionRegistrar.class,MyImportSelector.class,ImportDao1.class})
public class AppConfig {
}
