
/**
 * 
 */
package de.webtemplate;

/**
 * Created for project webTemplate
 * @author JensSiegmund
 * @since 15.04.2015 - 09:49:28
 */
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class MvcConfig extends WebMvcConfigurerAdapter {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("login");
        registry.addViewController("/vote").setViewName("vote");
        registry.addViewController("/login").setViewName("login");
    }

}
