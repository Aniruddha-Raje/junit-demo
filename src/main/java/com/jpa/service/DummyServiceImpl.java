/**
 * 
 */
package com.jpa.service;

import javax.annotation.Resource;

import org.apache.log4j.Logger;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author Aniruddha.Raje
 *
 */
@Component
@PropertySource(value = {"classpath:application.properties"})
public class DummyServiceImpl {
	
	//@Autowired
	//@Qualifier("impl2")
	@Resource(name="${beanName}")
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
