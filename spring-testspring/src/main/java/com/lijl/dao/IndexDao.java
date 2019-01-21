package com.lijl.dao;

import org.springframework.aop.framework.AbstractAdvisingBeanPostProcessor;
import org.springframework.beans.BeansException;
import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Repository;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.lang.reflect.Method;

@Repository("indexDao")
public class IndexDao implements ApplicationContextAware {

	public void query(){
		System.out.println("spring源码测试");
	}

	public IndexDao() {
		System.out.println("构造");
	}

	@PostConstruct
	public void init(){
		System.out.println("init");
	}

	/**
	 * 解决多例里获取多例对象
	 * @param applicationContext the ApplicationContext object to be used by this object
	 * @throws BeansException
	 */
	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

	}

}
