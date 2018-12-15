/**
 * 
 */
package com.jpa.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.jpa.repository.CodeRepository;

/**
 * @author Aniruddha.Raje
 *
 */
@Repository
public class CodeDao {

	@Autowired
	private CodeRepository codeRepository;
}
