package com.sky.aop;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
public class AnnoSecurityAspect {

//	@Before ("execution(* com.sky.aop.ApplicationService.*(..))")
//	public void VerifyApplication() {
//		System.out.println("Ina Anno BeforeCall");
//	}
//	
//	@After ("execution(* com.sky.aop.ApplicationService.*(..))")
//	public void processResults() {
//		System.out.println("processresults");
//	}

	@Before("@annotation(com.sky.aop.Log)")
	public void processloger() {
		System.out.println("processResults");
	}

}
