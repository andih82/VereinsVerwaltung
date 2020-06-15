package com.luftenberg.vevw;

import javax.faces.webapp.FacesServlet;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import com.luftenberg.vevw.configuration.VereinsverwaltungConfiguration;
import com.luftenberg.vevw.configuration.WebSecurityConfig;

@Configuration
@SpringBootApplication
@Import(  {VereinsverwaltungConfiguration.class, WebSecurityConfig.class})
public class VereinsVerwaltungApplication {

	public static void main(String[] args) {
		SpringApplication.run(VereinsVerwaltungApplication.class, args);
	}

	@Bean
	public ServletRegistrationBean<FacesServlet> facesServletRegistration() {
		ServletRegistrationBean<FacesServlet> registration = new ServletRegistrationBean<FacesServlet>(new FacesServlet(), "*.xhtml");
		registration.setLoadOnStartup(1);
		
		return registration;
	}
	
	
}
