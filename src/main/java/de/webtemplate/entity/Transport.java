/**
 * 
 */
package de.webtemplate.entity;

import javax.persistence.Entity;

/**
 * Created for project webTemplate
 * @author JensSiegmund
 * @since 20.04.2015 - 10:23:36
 */
@Entity
public class Transport extends VoteItem {

	public static final String CATEGORY = "transport";
	
	public Transport(String name) {
		super(name, CATEGORY);
	}
	
}
