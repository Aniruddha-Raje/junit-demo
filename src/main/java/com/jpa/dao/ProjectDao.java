/**
 * 
 */
package com.jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpa.repository.ProjectRepository;

/**
 * @author Aniruddha.Raje
 *
 */
@Repository
public class ProjectDao {
	
	@Autowired
	private ProjectRepository projectRepository;
	
}
