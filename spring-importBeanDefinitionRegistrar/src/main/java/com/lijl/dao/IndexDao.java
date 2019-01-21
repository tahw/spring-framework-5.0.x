package com.lijl.dao;

import com.lijl.annotation.SelectAnnotation;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface IndexDao {

	@SelectAnnotation("select * from dual where id = 1")
	public List<String> list(String name);
}
