/**
 * 
 */
package com.jpa.service;

import java.util.List;
import java.util.Optional;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jpa.dao.UserDao;
import com.jpa.models.User;

/**
 * @author Aniruddha.Raje
 *
 */
@Service
public class UserServiceImpl {

	@Autowired
	UserDao dao;
	
	@Autowired
	DummyServiceImpl dummyService;

	static final Logger log = Logger.getLogger(UserServiceImpl.class);

	public List<User> listUsers() {

		log.debug("List User method called!");
		List<User> userList = dao.listUsers();
		log.debug("UserList values => " + userList);
		
		Boolean dummyMethodResponse = dummyMethod();
		log.debug("Dummy Method Response => " + dummyMethodResponse);
		
		return userList;
	}

	public Integer saveUser(String name, String email) {

		log.debug("SaveUser method called!");
		Integer result = dao.saveUser(name, email);
		log.debug("Dao response => " + result);
		
		Boolean dummyMethodResponse = dummyService.dummyMethod();
		log.debug("Dummy Method Response => " + dummyMethodResponse);
		
		return result;
	}
	
	public Boolean dummyMethod() {
		log.debug("Dummy method called!");
		return false;
	}

	public Optional<User> getUserById(Integer id) {

		return dao.findById(id);
	}

	public Iterable<User> findUsersByIds(String ids) {

		return dao.findUsersByIds(ids);
	}

	public List<User> findUsersByNameAndId(String name, Integer id) {

		return dao.findUsersByNameAndId(name, id);
	}
}
