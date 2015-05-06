/**
 * 
 */
package de.webtemplate.web.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created for project webTemplate
 * 
 * @author Chris
 * @since 09.02.2015 - 20:22:22
 */
@Controller(value="/vote")
public class ExampleController {
//	@Autowired
//	private ExampleDAO exampleDAO;
	
//	@Autowired
//	private ExampleRepository repo;

	@RequestMapping(value = "/", method = RequestMethod.GET)
	public String index(final Model model) {

		
		model.addAttribute("project", "Web Template");
//		repo.save(new Example());
		
//		final Example example = new Example();
//		example.setExampleAttribute("example");
//		exampleDAO.save(example);
		
		return "vote";
	}
}
