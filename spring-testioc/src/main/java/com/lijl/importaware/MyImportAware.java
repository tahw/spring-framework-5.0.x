package com.lijl.importaware;

import org.springframework.context.annotation.ImportAware;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * @author lijunlong
 * @date 2018/12/10
 */
@Component
public class MyImportAware implements ImportAware {

	@Override
	public void setImportMetadata(AnnotationMetadata importMetadata) {
		System.out.println("===aware===");
	}
}
