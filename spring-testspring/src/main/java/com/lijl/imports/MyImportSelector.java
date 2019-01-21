package com.lijl.imports;

import com.lijl.annot.EnableImportSelect;
import com.lijl.dao.IndexDao;
import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

import java.util.Map;

public class MyImportSelector implements ImportSelector {
	@Override
	public String[] selectImports(AnnotationMetadata importingClassMetadata) {
		Map<String, Object> annotationAttributes = importingClassMetadata.getAnnotationAttributes(EnableImportSelect.class.getName());
		if(annotationAttributes.get("value").toString().equals("1")){
			return new String[]{IndexDao.class.getName()};
		}
		return new String[0];
	}
}
