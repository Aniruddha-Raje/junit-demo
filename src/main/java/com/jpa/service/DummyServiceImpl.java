/**
 * 
 */
package com.jpa.service;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

/**
 * @author Aniruddha.Raje
 *
 */
@Component
public class DummyServiceImpl {
	
	@Autowired
	@Qualifier("impl2")
	Inf inf;
	
	static final Logger log = Logger.getLogger(DummyServiceImpl.class);

	public Boolean dummyMethod() {
		log.debug("Dummy method called!");
		return false;
	}
	
	public void callHello() {
		inf.sayHello();
	}
}
