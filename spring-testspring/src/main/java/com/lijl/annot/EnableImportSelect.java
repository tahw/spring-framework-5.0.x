package com.lijl.annot;

import com.lijl.importaware.MyImportAware;
import com.lijl.imports.MyImportSelector;
import org.springframework.context.annotation.Import;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)
@Import({MyImportSelector.class, MyImportAware.class})
public @interface EnableImportSelect {

	public String value();
}
