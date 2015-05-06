/**
 * 
 */
package de.webtemplate.service;

import java.util.Collection;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.common.collect.Lists;

import de.webtemplate.entity.VoteItem;
import de.webtemplate.repository.VoteItemRepository;

/**
 * Created for project webTemplate
 * @author JensSiegmund
 * @since 20.04.2015 - 10:59:55
 */
@Service
public class VoteItemService {
	
    @Autowired
    private VoteItemRepository voteItemRepository; 

    public List<VoteItem> findAll() {
        return Lists.newArrayList(this.voteItemRepository.findAll());
    }
    
    public List<VoteItem> findByCategory(String category) {
    	return this.voteItemRepository.findByCategory(category);
    }
}
