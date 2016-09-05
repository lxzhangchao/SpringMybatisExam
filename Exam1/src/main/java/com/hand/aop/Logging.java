package com.hand.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class Logging {

	@Before("execution(* com.hand.dao.impl.FilmTemplate.create(..))")
	public void before(){
		System.out.println("Before Insert Film Data");
	}
	@After("execution(* com.hand.dao.impl.FilmTemplate.create(..))")
	public void after(){
		System.out.println("After Insert Film Data");
	}
}