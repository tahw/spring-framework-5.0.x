package com.lijl.rootbeandefinition;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ConfigurationClassPostProcessor;

public class MyConfigurationClassPostProcessor extends ConfigurationClassPostProcessor {

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) {
		System.out.println("MyConfigurationClassPostProcessor---postProcessBeanDefinitionRegistry");
		super.postProcessBeanDefinitionRegistry(registry);
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) {
		System.out.println("MyConfigurationClassPostProcessor---postProcessBeanFactory");
		super.postProcessBeanFactory(beanFactory);
	}
}
