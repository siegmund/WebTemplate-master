/**
 * 
 */
package de.webtemplate;

import org.apache.tomcat.jdbc.pool.DataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

/**
 * Created for project webTemplate
 * @author JensSiegmund
 * @since 14.04.2015 - 15:10:17
 */
@Configuration
@EnableWebSecurity
public class WebSecurityConfiguration extends WebSecurityConfigurerAdapter {

	@Autowired
	private DataSource dataSource;
	
	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http
	        .csrf().disable()
	            .authorizeRequests()
	                .anyRequest().authenticated()
	                .and()
	            .formLogin()
	                .loginPage("/login")
	                .permitAll()
	                .and()
	            .logout()
	                .permitAll();	        
	    }

	    @Autowired
	    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
	    	auth
	    	.jdbcAuthentication()
	    	    .dataSource(dataSource)
	    	    .passwordEncoder(new BCryptPasswordEncoder())
			    .usersByUsernameQuery(
				    "select name,password,enabled from user where name=?")
				.authoritiesByUsernameQuery(
			        "select name, role from user_roles where name=?");;
	    }
}
