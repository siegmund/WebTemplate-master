/**
 * 
 */
package de.webtemplate.entity;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

/**
 * Created for project webTemplate
 * @author JensSiegmund
 * @since 14.04.2015 - 13:18:55
 */
@Entity
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long id;
	private String name;

	private String password;
	
	private Boolean enabled;
	
	@OneToMany(mappedBy="user",
			cascade={CascadeType.PERSIST, CascadeType.MERGE})
	private List<Vote> votes;
	
	protected User() {}
	
	/**
	 * @param name
	 */
	public User(String name) {
		super();
		this.name = name;
	}

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * @return the id
	 */
	public long getId() {
		return id;
	}

	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return the votes
	 */
	public List<Vote> getVotes() {
		return votes;
	}

	/**
	 * @param votes the votes to set
	 */
	public void setVotes(List<Vote> votes) {
		this.votes = votes;
	}

	/**
	 * @return the enabled
	 */
	public Boolean getEnabled() {
		return enabled;
	}

	/**
	 * @param enabled the enabled to set
	 */
	public void setEnabled(Boolean enabled) {
		this.enabled = enabled;
	}

}
