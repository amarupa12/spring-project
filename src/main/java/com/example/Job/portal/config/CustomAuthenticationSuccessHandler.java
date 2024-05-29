package com.example.Job.portal.config;

import java.io.IOException;

import org.apache.tomcat.util.net.openssl.ciphers.Authentication;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.web.authentication.AuthenticationSuccessHandler;
import org.springframework.stereotype.Component;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@Component
public class CustomAuthenticationSuccessHandler implements AuthenticationSuccessHandler {

 

	@Override
	public void onAuthenticationSuccess(HttpServletRequest request, HttpServletResponse response,
			org.springframework.security.core.Authentication authentication) throws IOException, ServletException {
		
		
		
		
		
		  UserDetails userDetails = (UserDetails) authentication.getPrincipal();
	        String username = userDetails.getUsername();
	        System.out.println("The username " + username + " is logged in.");
	        boolean hasJobSeekerRole = authentication.getAuthorities().stream().anyMatch(r->r.getAuthority().equals("Job Seeker"));
	        boolean hasRecruiterRole = authentication.getAuthorities().stream().anyMatch(r->r.getAuthority().equals("Recruiter"));

	        if (hasRecruiterRole || hasJobSeekerRole) {
	            response.sendRedirect("/dashboard/");
	        }
		// TODO Auto-generated method stub
		
	}
	public boolean isAccountNonExpired() {
	   // TODO Auto-generated method stub
	   return true;
	}

	
}

