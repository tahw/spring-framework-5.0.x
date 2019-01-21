package methodInterceptor;


import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {

	/**
	 * 其中method是执行方法，methodProxy就是调用方法
	 * 这里区别执行方法和调用方法是为了判断是否第一次调用，在配置类里@Bean里获得
	 * 是直接从beanFactory获取还是直接new出来，这里的new指代的是调用父类的方法，就是配置类的方法去new操作
	 * a(){
	 *		c();
	 *		a();
	 *	}
	 * 上面的伪代码就是指执行到c()方法时，method就是c()，而methodProxy就是a()，代理方法，这个时候就是不一样的
	 * @param o
	 * @param method
	 * @param objects
	 * @param methodProxy
	 * @return
	 * @throws Throwable
	 */

	@Override
	public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
		System.out.println("====proxy===");
		return methodProxy.invokeSuper(o,objects);
	}
}
