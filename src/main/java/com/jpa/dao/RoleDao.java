/**
 * 
 */
package com.jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpa.repository.RoleRepository;

/**
 * @author Aniruddha.Raje
 *
 */
@Repository
public class RoleDao {

	@Autowired
	private RoleRepository roleRepository;
}
