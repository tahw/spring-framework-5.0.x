package test;

import app.AppConfig;
import methodInterceptor.MyMethodInterceptor;
import org.springframework.cglib.core.SpringNamingPolicy;
import org.springframework.cglib.proxy.Enhancer;

import java.io.IOException;

public class TestApp {

	public static void main(String[] args) {
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(AppConfig.class);
		enhancer.setNamingPolicy(SpringNamingPolicy.INSTANCE);
		enhancer.setCallback(new MyMethodInterceptor());
		AppConfig appConfig = (AppConfig) enhancer.create();
		appConfig.index();
		try {
			//java -classpath "D:\Program Files\Java\jdk\lib\sa-jdi.jar" sun.jvm.hotspot.HSDB
			//其中生成的代理类，见https://blog.csdn.net/lzufeng/article/details/79322391这个可以操作出来
			System.in.read();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
