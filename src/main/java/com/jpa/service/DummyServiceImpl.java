/**
 * 
 */
package com.jpa.service;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Component;

/**
 * @author Aniruddha.Raje
 *
 */
@Component
public class DummyServiceImpl {
	
	static final Logger log = Logger.getLogger(DummyServiceImpl.class);

	public Boolean dummyMethod() {
		log.debug("Dummy method called!");
		return false;
	}
}
