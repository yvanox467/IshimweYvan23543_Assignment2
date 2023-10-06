package com.auca.service;

import java.io.File;
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;

@MultipartConfig
public class Submission extends HttpServlet{
	protected void doPost(HttpServletRequest req, HttpServletResponse res) 
			throws ServletException, IOException{
		String email = req.getParameter("email");
		String password = req.getParameter("password");
		try {
			Part profilePicture = req.getPart("profilePicture");
			Part certificates = req.getPart("certificates");
			
			if(!isValidTypes(profilePicture, "images/jpeg", "images/png")|| 
					!isValidTypes(certificates, "application/pdf")) {
				res.getWriter().write("Invalid file types");
				return;
			}
			
			
			String uploadDirectory = "";
			File profilePictureFile = new File(uploadDirectory,"profile_picture.jpeg");
			File certificateFile = new File(uploadDirectory,"certificate.pdf");
			
			
			profilePicture.write(profilePictureFile.getAbsolutePath());
			certificates.write(certificateFile.getAbsolutePath());
		}catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public boolean isValidTypes(Part part, String...allowedContentTypes) {
		String contentTypes = part.getContentType();
		for(String allowedTypes : allowedContentTypes) {
			if(contentTypes.equals(allowedTypes)) {
				return true;
			}
		}
		return false;
	}

}
