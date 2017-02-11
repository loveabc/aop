package com.imooc;

/*
 * @author loveabc
 * 使用java使用AOP功能
 */
public interface Calculator {

	//计算除法
	//使用AOP劫持该方法,在不修改原除法代码的前提下添加检查除数是否为零的功能
	double div(int d1,int d2);
}
