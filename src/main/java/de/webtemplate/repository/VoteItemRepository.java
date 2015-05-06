/**
 * 
 */
package de.webtemplate.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import de.webtemplate.entity.User;
import de.webtemplate.entity.VoteItem;

/**
 * Created for project webTemplate
 * @author JensSiegmund
 * @since 14.04.2015 - 12:57:31
 */
public interface VoteItemRepository extends CrudRepository<VoteItem, Long> {

	/**
	 * @param string
	 */
	VoteItem findByName(String name);
	
	List<VoteItem> findByCategory(String category);
	
	List<VoteItem> findByUser(User user);
	
	List<VoteItem> findByUserAndCategory(User user, String category);

}
