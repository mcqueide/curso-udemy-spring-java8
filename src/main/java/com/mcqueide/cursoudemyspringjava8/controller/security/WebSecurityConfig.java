package com.mcqueide.cursoudemyspringjava8.controller.security;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class WebSecurityConfig extends WebSecurityConfigurerAdapter {

	@Override
	protected void configure(HttpSecurity httpSecurity) throws Exception {
		String[] caminhosPermitos = new String[] {"/**"};
		httpSecurity
			.authorizeRequests()
				.antMatchers(caminhosPermitos).permitAll()
				.anyRequest().authenticated()
			.and()
			.csrf().disable();
	}
}
