/**
 * 
 */
package com.jpa.aspects;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.stereotype.Component;

/**
 * @author Aniruddha.Raje
 *
 */

@Component
@Aspect
@EnableAspectJAutoProxy
public class LoggingAspect {
	
	//@Before("execution(* com.jpa.aspects.DummyServiceImpl.callHello(..))")
	@Before("execution(public void callHello())")
	public void logBefore(JoinPoint joinPoint) {

		System.out.println("logBefore() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}
	
	//@After("execution(* com.jpa.aspects.DummyServiceImpl.callHello(..))")
	@After("execution(public void callHello())")
	public void logAfter(JoinPoint joinPoint) {

		System.out.println("logAfter() is running!");
		System.out.println("hijacked : " + joinPoint.getSignature().getName());
		System.out.println("******");
	}

}
