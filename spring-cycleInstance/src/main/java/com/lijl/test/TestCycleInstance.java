package com.lijl.test;

import com.lijl.app.AppConfig;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestCycleInstance {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext ac = new AnnotationConfigApplicationContext(AppConfig.class);
	}
}
