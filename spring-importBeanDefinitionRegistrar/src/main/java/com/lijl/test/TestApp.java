package com.lijl.test;

import com.lijl.AppConfig;
import com.lijl.dao.IndexDao;
import com.lijl.dao.IndexDao2;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestApp {

	public static void main(String[] args) throws NoSuchMethodException {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexDao2 indexDao = (IndexDao2) ac.getBean("indexDao2");
		indexDao.list2("1");
	}
}
