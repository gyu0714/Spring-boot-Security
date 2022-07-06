package com.spring.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


@Configuration
@EnableWebSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {
	
	@Override
	protected void configure(AuthenticationManagerBuilder auth) {
		// 인증 Provider
	}
	
	@Override
	public void configure(WebSecurity web) {
		// resources 보안 설정
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// HTTP 관련 보안 설정
//		http
//			.cors()
//			.and()
//			.csrf()
//			.disable()
//			.exceptionHandling()
//			.authenticationEntryPoint()
			
	}
}
