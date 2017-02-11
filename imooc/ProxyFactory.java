package com.imooc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class ProxyFactory {

	public static Object getProxy(Object target,InvocationHandler handler) {
		
		return Proxy.newProxyInstance(handler.getClass().getClassLoader(), target.getClass().getInterfaces(), handler);
		
	}

}
