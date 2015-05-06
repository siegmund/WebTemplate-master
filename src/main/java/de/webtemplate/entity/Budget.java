/**
 * 
 */
package de.webtemplate.entity;

import javax.persistence.Entity;

/**
 * Created for project webTemplate
 * @author JensSiegmund
 * @since 20.04.2015 - 10:32:13
 */
@Entity
public class Budget extends VoteItem {

	public static final String CATEGORY = "budget";
	
	public Budget(String name) {
		super(name, CATEGORY);
	}
}
