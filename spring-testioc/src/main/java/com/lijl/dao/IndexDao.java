package com.lijl.dao;

import com.lijl.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
public class IndexDao {

	@Autowired
	Map<String,IndexService> map;

	public void test(){
		System.out.println("111");
	}
}
