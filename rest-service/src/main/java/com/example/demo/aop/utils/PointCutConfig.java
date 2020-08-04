package com.example.demo.aop.utils;

import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Component
public class PointCutConfig {

	/* @Pointcut(value="execution(* com.example.demo.controllers.*.*(..))")
	 *  * Star For all The Methed scope (like public , private , protected )
	 *  and last * for all the clases inside package and and Next star for all the method.
	 *  */
	@Pointcut(value="execution(* com.example.demo.*.*.*(..))")
	public void logging() {}
}
