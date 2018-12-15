/**
 * 
 */
package com.jpa.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jpa.models.Code;

/**
 * @author Aniruddha.Raje
 *
 */
@Repository
public interface CodeRepository extends CrudRepository<Code, Integer> {

}
