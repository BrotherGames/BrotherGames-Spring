package com.eci.cosw.springbootsecureapi;

import com.eci.cosw.springbootsecureapi.config.JwtFilter;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import javax.persistence.Entity;

@SpringBootApplication
@EnableJpaRepositories("com.eci.cosw.springbootsecureapi.repositories")
@EntityScan("com.eci.cosw.springbootsecureapi.model")
public class SpringBootSecureApiApplication {


	@Bean
	public FilterRegistrationBean jwtFilter()
	{
		final FilterRegistrationBean registrationBean = new FilterRegistrationBean();
		registrationBean.setFilter( new JwtFilter() );
		registrationBean.addUrlPatterns( "/api/*" );

		return registrationBean;
	}


	public static void main(String[] args) {
		SpringApplication.run(SpringBootSecureApiApplication.class, args);
	}
}
