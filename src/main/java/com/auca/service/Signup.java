package com.auca.service;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Signup extends HttpServlet{
	private static final String CORRECT_USERNAME = "auca.yvan@auca.rw";
	private static final String CORRECT_PASSWORD = "Yvanox@2020";

	public void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException{
		String email, password;
		email = req.getParameter("email");
		password = req.getParameter("password");
		
		try {
			
			PrintWriter out = res.getWriter();
			if(!isValidEmail(email) && !isValidEmail(password)) {
				res.getWriter().write("email and password format Incorrect");
			};
			
			if(CORRECT_USERNAME.equals(email) && CORRECT_PASSWORD.equals(password)) {
				res.sendRedirect("Student.jsp");
			}else {
				out.println( "email or password doesnt matchs");
			}
			
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}
	
	public boolean isValidEmail(String email) {
		String regexPattern = "^[A-Za-z0-9+_.-]+@(.+)$";
		return email != null && email.matches(regexPattern);
	}
	
	public boolean isValidPassword(String password) {
		return password != null && password.length() >= 8;
	}
}
