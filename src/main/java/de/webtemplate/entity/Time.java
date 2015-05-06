/**
 * 
 */
package de.webtemplate.entity;

import javax.persistence.Entity;

/**
 * Created for project webTemplate
 * @author JensSiegmund
 * @since 20.04.2015 - 10:27:38
 */
@Entity
public class Time extends VoteItem {
    
	public static final String CATEGORY = "time";
    
	public Time(String name) {
		super(name, CATEGORY);
	}
}
