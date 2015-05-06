/**
 * 
 */
package de.webtemplate.web.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;

import de.webtemplate.entity.Budget;
import de.webtemplate.entity.Location;
import de.webtemplate.entity.Lodging;
import de.webtemplate.entity.Music;
import de.webtemplate.entity.Time;
import de.webtemplate.entity.Transport;
import de.webtemplate.entity.VoteItem;
import de.webtemplate.service.VoteItemService;

/**
 * Created for project webTemplate
 * @author JensSiegmund
 * @since 20.04.2015 - 11:09:35
 */
@Controller
public class VotingController {

	@Autowired
	private VoteItemService voteItemService;
	
	@ModelAttribute("allBudgets")
	public List<VoteItem> populateBudget() {
	    return this.voteItemService.findByCategory(Budget.CATEGORY);
	}
	
	@ModelAttribute("allLocaltions")
	public List<VoteItem> populateLcoation() {
	    return this.voteItemService.findByCategory(Location.CATEGORY);
	}
	
	@ModelAttribute("allLodging")
	public List<VoteItem> populateLodging() {
	    return this.voteItemService.findByCategory(Lodging.CATEGORY);
	}
	
	@ModelAttribute("allMusic")
	public List<VoteItem> populateMusic() {
	    return this.voteItemService.findByCategory(Music.CATEGORY);
	}
	
	@ModelAttribute("allTime")
	public List<VoteItem> populateTime() {
	    return this.voteItemService.findByCategory(Time.CATEGORY);
	}
	
	@ModelAttribute("allTransport")
	public List<VoteItem> populateTransport() {
	    return this.voteItemService.findByCategory(Transport.CATEGORY);
	}
	
}
