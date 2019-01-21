package com.lijl.importaware;

import com.lijl.annot.EnableImportSelect;
import com.lijl.dao.IndexDao;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

import java.util.Map;

@Configuration
public class MyImportAware implements ImportAware{
	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		Map<String, Object> annotationAttributes = importMetadata.getAnnotationAttributes(EnableImportSelect.class.getName());
		if(annotationAttributes.get("value").toString().equals("1")){
			System.out.println("======ImportAware======");
		}
	}
}
