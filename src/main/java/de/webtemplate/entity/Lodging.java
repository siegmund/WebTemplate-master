/**
 * 
 */
package de.webtemplate.entity;

import javax.persistence.Entity;

/**
 * Created for project webTemplate
 * @author JensSiegmund
 * @since 20.04.2015 - 10:30:07
 */
@Entity
public class Lodging extends VoteItem {

	public static final String CATEGORY = "lodging";
	
	public Lodging(String name) {
		super(name, CATEGORY);
	}
	
}
