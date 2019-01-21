package com.lijl.test;

import com.lijl.app.AppConfig;
import com.lijl.dao.IndexDao;
import com.lijl.prototype.IndexPrototype;
import com.lijl.service.AnotherIndexService;
import com.lijl.service.IndexService;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestInstance {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
		IndexDao indexDao = (IndexDao) ac.getBean("index");
		indexDao.index();
	}
}
