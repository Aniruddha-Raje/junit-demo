/**
 * 
 */
package com.jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpa.repository.ProjectCodeRepository;

/**
 * @author Aniruddha.Raje
 *
 */
@Repository
public class ProjectCodeDao {

	@Autowired
	private ProjectCodeRepository projectCodeRepository;
}
