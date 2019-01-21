package com.lijl.test;

import com.lijl.app.AppConfig;
import com.lijl.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();
		annotationConfigApplicationContext.register(AppConfig.class);
		annotationConfigApplicationContext.refresh();
		IndexDao indexDao = (IndexDao) annotationConfigApplicationContext.getBean("indexDao");
		indexDao.test();
	}
}
