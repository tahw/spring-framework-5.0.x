package com.lijl.service;

import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component("indexService")
public class IndexService implements FactoryBean{

	@Override
	public Object getObject() throws Exception {
		return new IndexServiceImpl();
	}

	@Override
	public Class<?> getObjectType() {
		return IndexServiceImpl.class;
	}

	@Override
	public boolean isSingleton() {
		return true;
	}

	public void test(){
		System.out.println("IndexService");
	}
}
