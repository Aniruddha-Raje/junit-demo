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
public class Impl2 implements Inf{

	@Override
	public void sayHello() {
		System.out.println("Impl2");
	}

}
