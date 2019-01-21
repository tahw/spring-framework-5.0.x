package com.lijl.test;


import com.lijl.dao.App;
import com.lijl.dao.IndexDao;
import com.lijl.rootbeandefinition.MyBeanDefinitionRegistryPostProcessor;
import com.lijl.rootbeandefinition.MyBeanFactoryPostProcessor;
import com.lijl.rootbeandefinition.MyConfigurationClassPostProcessor;
import com.lijl.service.IndexService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext();
		ac.register(App.class);
		ac.addBeanFactoryPostProcessor(new MyBeanFactoryPostProcessor());
		ac.addBeanFactoryPostProcessor(new MyBeanDefinitionRegistryPostProcessor());
		//ac.addBeanFactoryPostProcessor(new MyConfigurationClassPostProcessor());
		ac.refresh();
		//IndexService indexService = (IndexService) ac.getBean("&indexService");
		//indexService.test();
		IndexDao indexDao = (IndexDao) ac.getBean("indexDao");
		indexDao.query();
	}
}
