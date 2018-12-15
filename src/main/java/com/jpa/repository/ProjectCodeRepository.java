/**
 * 
 */
package com.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.models.Project_Code;

/**
 * @author Aniruddha.Raje
 *
 */
@Repository
public interface ProjectCodeRepository extends CrudRepository<Project_Code, Integer> {

}
