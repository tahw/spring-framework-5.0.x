package com.lijl.scanner;

import org.springframework.stereotype.Repository;

import java.io.File;
import java.io.FileFilter;
import java.util.HashMap;
import java.util.Map;

public class AnnotationScaner {

	Map<String,String> map = new HashMap<String,String>();

	public void scan(String basePackage){
		String rootPath = AnnotationScaner.class.getResource("/").getPath();
		String besePackagePath = basePackage.replaceAll("\\.","\\\\");
		File dir = new File(rootPath+"//"+besePackagePath);
		if(!dir.exists()){
			return ;
		}
		//只取文件夹和class文件
		File[] files = dir.listFiles(new FileFilter(){
			@Override
			public boolean accept(File pathname) {
				return pathname.isDirectory() || pathname.getName().endsWith(".class");
			}
		});
		if(files == null || files.length == 0){
			return ;
		}
		for (File file : files) {
			if(file.isDirectory()){
				scan(basePackage+"."+file.getName());
				continue;
			}
			String name = file.getName().replace(".class","");
			try {
				Class clazz = Class.forName(basePackage + "." + name);
				if(clazz.isInterface() && clazz.isAnnotationPresent(Repository.class)){
					map.put(formatName(clazz.getSimpleName()),basePackage + "." + name);
				}
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
		}
	}

	/**
	 * 首字母转换
	 * @param simpleName
	 * @return
	 */
	private String formatName(String simpleName) {
		if(Character.isLowerCase(simpleName.charAt(0)))
			return simpleName;
		else
			return (new StringBuilder()).append(Character.toLowerCase(simpleName.charAt(0))).append(simpleName.substring(1)).toString();
	}

	public Map<String,String> getClass(String basePackage){
		clear();
		scan(basePackage);
		return map;
	}

	public void clear(){
		map.clear();
	}
}
