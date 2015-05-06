/**
 * 
 */
package de.webtemplate.entity;

import javax.persistence.Entity;

/**
 * Created for project webTemplate
 * @author JensSiegmund
 * @since 20.04.2015 - 10:30:57
 */
@Entity
public class Music extends VoteItem {
	
	public static final String CATEGORY = "music";
	
	public Music(String name) {
		super(name, CATEGORY);
	}

}
