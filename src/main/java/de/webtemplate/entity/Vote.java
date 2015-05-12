/**
 * 
 */
package de.webtemplate.entity;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;

/**
 * Created for project webTemplate
 * @author JensSiegmund
 * @since 12.05.2015 - 16:58:56
 */
@Entity
public class Vote {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	
	@OneToOne
	private VoteItem voteItem;
	
	@ManyToOne(cascade={CascadeType.PERSIST,
			CascadeType.MERGE})
	private User user;

	/**
	 * @return the voteItem
	 */
	public VoteItem getVoteItem() {
		return voteItem;
	}

	/**
	 * @param voteItem the voteItem to set
	 */
	public void setVoteItem(VoteItem voteItem) {
		this.voteItem = voteItem;
	}

	/**
	 * @return the user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user the user to set
	 */
	public void setUser(User user) {
		this.user = user;
	}

	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}
}
