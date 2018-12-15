/**
 * 
 */
package com.jpa.sevice;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

import java.util.Arrays;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.jpa.dao.UserDao;
import com.jpa.models.User;
import com.jpa.service.DummyServiceImpl;
import com.jpa.service.UserServiceImpl;

/**
 * @author Aniruddha.Raje
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class MockitoTest {

	@Mock
	private UserDao dao;

	@Mock
	private DummyServiceImpl dummyService;
	
	
	@InjectMocks
	private UserServiceImpl service;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
	}

	@Test
	public void testListUsers() {

		List<User> users = Arrays.asList(new User());
		when(dao.listUsers()).thenReturn(users);
		
		assertEquals(users, service.listUsers());
	}

	@Test
	public void testSaveUser() {

		when(dao.saveUser(null, null)).thenReturn(new Integer(1));
		when(dummyService.dummyMethod()).thenReturn(new Boolean(true));
		
		assertEquals(new Integer(1), service.saveUser(null, null));
	}

}
