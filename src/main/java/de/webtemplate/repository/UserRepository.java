/**
 * 
 */
package de.webtemplate.repository;

import org.springframework.data.repository.CrudRepository;

import de.webtemplate.entity.Example;
import de.webtemplate.entity.User;

/**
 * Created for project webTemplate
 * @author JensSiegmund
 * @since 14.04.2015 - 12:57:31
 */
public interface UserRepository extends CrudRepository<User, Long> {

	/**
	 * @param string
	 */
	User findByName(String name);

}
