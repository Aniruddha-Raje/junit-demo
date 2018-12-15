package com.jpa.sevice;

import org.apache.log4j.Logger;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.jpa.configurations.Application;
import com.jpa.models.User;
import com.jpa.service.UserServiceImpl;

/**
 * @author Aniruddha.Raje
 *
 */
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT, classes = Application.class)
public class SpringTest {

	@Autowired
	private UserServiceImpl service;
	
	static final Logger log = Logger.getLogger(SpringTest.class);

	@BeforeClass
	public static void beforeClass() {
		log.debug("\n============================= 1. Before Class =============================\n");
	}
	
	@Before
	public void before() {
		log.debug("\n============================= 2. Before =============================\n");
		System.out.println("");
	}

	@Test
	public void testListUsers() {
		Iterable<User> users = service.listUsers();
		log.debug(""+users);
	}
	
	@After
	public void after() {
		log.debug("\n============================= 4. After =============================\n");
	}

	@AfterClass
	public static void afterClass() {
		log.debug("\n============================= 5. After Class =============================\n");
	}

}
