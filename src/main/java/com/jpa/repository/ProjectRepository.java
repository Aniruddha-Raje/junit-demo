/**
 * 
 */
package com.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.models.Project;

/**
 * @author Aniruddha.Raje
 *
 */
@Repository
public interface ProjectRepository extends CrudRepository<Project, Integer> {

}
