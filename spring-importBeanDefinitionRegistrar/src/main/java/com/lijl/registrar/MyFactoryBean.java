package com.lijl.registrar;

import com.lijl.annotation.SelectAnnotation;
import com.lijl.dao.IndexDao;
import org.springframework.beans.factory.FactoryBean;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class MyFactoryBean implements FactoryBean,InvocationHandler {

	private Class clazz;

	public MyFactoryBean(Class clazz){
		this.clazz = clazz;
	}

	@Override
	public Object getObject() throws Exception {
		return Proxy.newProxyInstance(this.getClass().getClassLoader(), new Class[]{clazz}, this);
	}

	@Override
	public Class<?> getObjectType() {
		return clazz;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("proxy");
		Method method1 = proxy.getClass().getInterfaces()[0].getMethod(method.getName(),method.getParameterTypes());
		SelectAnnotation annotation = method1.getDeclaredAnnotation(SelectAnnotation.class);
		System.out.println(annotation.value());
		return null;
	}
}
