/**
 * 
 */
package de.webtemplate.entity;

import javax.persistence.Entity;

/**
 * Created for project webTemplate
 * @author JensSiegmund
 * @since 20.04.2015 - 10:10:51
 */
@Entity
public class Location extends VoteItem {
	
	public static final String CATEGORY = "location";

	private String link;
	
    protected Location() {}
	
	/**
	 * @param name
	 */
	public Location(String name, String link) {
		super(name, CATEGORY);
		this.link = link;
	}
	
	/**
	 * @return the link
	 */
	public String getLink() {
		return link;
	}
	/**
	 * @param link the link to set
	 */
	public void setLink(String link) {
		this.link = link;
	}
}
