package com.jpa.dao;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.models.User;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

/**
 * @author Aniruddha.Raje
 *
 */
@Repository
public interface UserRepository extends CrudRepository<User, Integer> {

	@Query(value = "SELECT * FROM user where name = ?1 AND id = ?2", nativeQuery = true)
	public List<User> findUsersByNameAndId(String name, Integer id);
	
	List<User> findAll();
	
}
