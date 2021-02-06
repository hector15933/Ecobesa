package com.example.ecobesa.configuration;



import javax.servlet.ServletContext;
import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.User.UserBuilder;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.context.AbstractSecurityWebApplicationInitializer;
import org.springframework.web.multipart.support.MultipartFilter;

import com.example.ecobesa.service.JpaUserDetailService;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SpringSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private LoginSuccessHandler successHandler;
	
	@Autowired
	private BCryptPasswordEncoder passwordEncoder;
	

	@Autowired
	private JpaUserDetailService userDetailsService;
	
	
	
    
	@Override
	protected void configure(HttpSecurity http) throws Exception{
		
		http
		.authorizeRequests()
		.antMatchers("/uploads/**","/resources/**", "/static/**", "/css/**", "/js/**", "/img/**","/node_modules/**","/notifications/**"
				,"/icons/**","/vendors").permitAll()
		/*.antMatchers("/").permitAll()
		.antMatchers("/h2-console/**").permitAll()
		.antMatchers("/ver/**").hasAnyRole("USER")
		.antMatchers("/uploads/**").hasAnyRole("ADMIN")
		.antMatchers("/principal/**").hasAnyRole("ADMIN","ADMINISTRATOR")
		.antMatchers("/form/**").hasAnyRole("ADMIN")
		.antMatchers("/admin/**").hasAnyRole("ADMIN","ADMINISTRATOR")
		.antMatchers("/empresa/**").hasAnyRole("ADMIN")*/
		.anyRequest().authenticated().and().csrf().disable().formLogin().permitAll()
		.loginPage("/login").successHandler(successHandler)
		.and().logout().permitAll()
		.and()
		.exceptionHandling().accessDeniedPage("/error_403");
	}
	
    @Autowired
	protected void configureGlobal(AuthenticationManagerBuilder authBuilder) throws Exception{
    	
    	
    	
    	authBuilder.userDetailsService(userDetailsService)
    	.passwordEncoder(passwordEncoder);

    	/*
		PasswordEncoder encoder= this.passwordEncoder;
		UserBuilder userBuilder = User.builder().passwordEncoder(encoder::encode);
		
		authBuilder.inMemoryAuthentication()
		.withUser(userBuilder.username("admin").password("123456").roles("ADMIN","USER"))
		.withUser(userBuilder.username("andres").password("123456").roles("USER"))
		.withUser(userBuilder.username("hector").password("123456").roles("ADMINISTRATOR"));*/
	}
	
    public class SecurityApplicationInitializer extends AbstractSecurityWebApplicationInitializer {

        @Override
        protected void beforeSpringSecurityFilterChain(ServletContext servletContext) {
            insertFilters(servletContext, new MultipartFilter());
        }
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
}
