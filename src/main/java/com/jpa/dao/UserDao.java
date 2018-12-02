/**
 * 
 */
package com.jpa.dao;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpa.models.User;

/**
 * @author Aniruddha.Raje
 *
 */
@Repository
public class UserDao {

	@Autowired
	private UserRepository userRepository;

	public List<User> listUsers() {

		return userRepository.findAll();
	}

	public Integer saveUser(String name, String email) {

		User n = new User();
		n.setName(name);
		n.setEmail(email);
		User response = userRepository.save(n);

		return response.getId();
	}

	public Optional<User> findById(Integer id) {

		return userRepository.findById(id);
	}

	public Iterable<User> findUsersByIds(String ids) {

		String idList[] = ids.split(",");
		List<Integer> it = new ArrayList<>();
		for (String tmp : idList) {
			it.add(Integer.parseInt(tmp));
		}

		return userRepository.findAllById(it);
	}

	public List<User> findUsersByNameAndId(String name, Integer id) {

		return userRepository.findUsersByNameAndId(name, id);
	}

}
