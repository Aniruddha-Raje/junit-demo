/**
 * 
 */
package com.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.models.Role;

/**
 * @author Aniruddha.Raje
 *
 */
@Repository
public interface RoleRepository extends CrudRepository<Role, Integer> {

}
