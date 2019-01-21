package com.lijl.dao;

import com.lijl.annotation.SelectAnnotation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndexDao2 {

	@SelectAnnotation("select * from dual where id = 2")
	public List<String> list2(String name);
}