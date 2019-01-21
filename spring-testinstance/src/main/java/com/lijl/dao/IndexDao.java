package com.lijl.dao;

import com.lijl.service.IndexService;
import org.springframework.stereotype.Component;


public class IndexDao {

	public IndexDao(IndexService indexService){

	}
	public IndexDao(String str,Object str1){

	}
	protected IndexDao(Object indexService){

	}
	protected IndexDao(String str,String str1){

	}
//	public IndexDao(){
//
//	}

	public void index(){
		System.out.println("===========index=============");
	}
}
