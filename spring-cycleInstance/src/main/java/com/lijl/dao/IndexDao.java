package com.lijl.dao;

import com.lijl.service.IndexService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class IndexDao {

	@Autowired
	private IndexService indexService;
}
