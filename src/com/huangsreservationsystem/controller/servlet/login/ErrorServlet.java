package com.huangsreservationsystem.controller.servlet.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class ErrorServlet extends HttpServlet{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -6157880780313769376L;

	public ErrorServlet() {
		super();
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		//TODO:replace this with a logger
		System.out.println("Inside the doPost of the error Servlet");
		res.sendRedirect("loginError.html");
	}
}
