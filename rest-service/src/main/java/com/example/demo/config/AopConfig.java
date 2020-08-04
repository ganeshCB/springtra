package com.example.demo.config;


import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

import lombok.extern.slf4j.Slf4j;

@Configuration
@Aspect
@EnableAspectJAutoProxy
@Slf4j

public class AopConfig {

	
	@Around("com.example.demo.aop.utils.PointCutConfig.logging()")
	public Object myaroundAdvice(ProceedingJoinPoint jp)  throws Throwable{
		
		log.info( jp.getSignature().getName() + " Called  ########");
		
		     Object obj = jp.proceed();
		
		log.info( jp.getSignature().getName() + " Completed  ########");

		return obj;
	}
}
