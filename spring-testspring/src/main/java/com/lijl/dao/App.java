package com.lijl.dao;

import com.lijl.annot.EnableImportSelect;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@EnableImportSelect("1")
//@ComponentScan("com.lijl")
//@Import({AppConfigSetter.class})
public class App {
}
