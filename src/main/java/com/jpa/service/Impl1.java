/**
 * 
 */
package com.jpa.service;

import org.springframework.stereotype.Component;

/**
 * @author Aniruddha.Raje
 *
 */
@Component
public class Impl1 implements Inf {

	@Override
	public void sayHello() {
		System.out.println("Impl1");
	}

}
