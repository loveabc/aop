package com.imooc;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
/*
 * 进行除法之前,检查除数是否为零
 */
public class MyHandler implements InvocationHandler{

	//被代理的类对象
	private Object target;
	public MyHandler(Object target){
		this.target=target;
	}
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		System.out.println("before");
		if((int)args[1]==0){
			System.out.println("除数不能为零");
			return -1024d;
		}
		//invoke是InvocationHandler提供的方法,用来调用被代理类的方法
		double d=(double)method.invoke(target, args);
		System.out.println("after");
		return d;
	}

}
