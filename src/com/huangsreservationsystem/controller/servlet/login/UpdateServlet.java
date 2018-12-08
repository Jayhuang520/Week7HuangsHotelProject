package com.huangsreservationsystem.controller.servlet.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class UpdateServlet extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = 7953418690418918992L;
	
	public UpdateServlet() {}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res)throws ServletException, IOException {
		//TODO:replace this with a logger
		System.out.println("Inside the doPost of the update Servlet");
		res.sendRedirect("AvailableRoom.html");
	}
}
