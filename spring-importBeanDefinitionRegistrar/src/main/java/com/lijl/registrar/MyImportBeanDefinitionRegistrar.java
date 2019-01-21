package com.lijl.registrar;

import com.lijl.dao.IndexDao;
import com.lijl.scanner.AnnotationScaner;
import org.springframework.beans.factory.support.AbstractBeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Map;

public class MyImportBeanDefinitionRegistrar implements ImportBeanDefinitionRegistrar{

	private final String basePackage = "com.lijl";

	@Override
	public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
		AnnotationScaner annotationScaner = new AnnotationScaner();
		Map<String,String> map = annotationScaner.getClass(basePackage);
		/**
		 * 动态扫描所有的包下面的加了注解@Repository，然后可以获取对应的包名和id
		 */
		for(String key:map.keySet()){
			BeanDefinitionBuilder beanDefinitionBuilder = BeanDefinitionBuilder.genericBeanDefinition(MyFactoryBean.class);
			AbstractBeanDefinition beanDefinition = beanDefinitionBuilder.getBeanDefinition();
			beanDefinition.getConstructorArgumentValues().addGenericArgumentValue(map.get(key));
			registry.registerBeanDefinition(key,beanDefinition);
		}
	}


}
