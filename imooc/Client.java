package com.imooc;

import java.lang.reflect.InvocationHandler;

public class Client {

	public static void main(String[] args) throws ClassNotFoundException {
		CalculatorImpl target=new CalculatorImpl();
		InvocationHandler handler=new MyHandler(target);
		Calculator cal=(Calculator)ProxyFactory.getProxy(target, handler);
		double d=cal.div(10, 2);
		System.out.println(d);
	}
}
