/**
 * 
 */
package com.jpa.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

/**
 * @author Aniruddha.Raje
 *
 */

@Aspect
public class LoggingAspect {
	
	@Before("execution(* com.jpa.aspects.DummyServiceImpl.callHello(..))")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
	
	@After("execution(* com.jpa.aspects.DummyServiceImpl.callHello(..))")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("logAfter() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}

}
