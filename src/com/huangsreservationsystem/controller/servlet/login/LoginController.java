package com.huangsreservationsystem.controller.servlet.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.huangsreservationsystem.business.LoginManager;
import com.huangsreservationsystem.model.domain.CustomerBean;
import com.huangsreservationsystem.model.domain.LoginBean;

@WebServlet("/LoginController")
public class LoginController extends HttpServlet {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8095282046652575492L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public LoginController() {
		super();
	}

	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Inside the LoginController");
		
		LoginBean loginBean = new LoginBean();

		String userName = req.getParameter("username");
		String password = req.getParameter("password");

		loginBean.setUserName(userName);
		loginBean.setPassword(password);

		// process the data
		CustomerBean customer = LoginManager.authenticateLogin(loginBean);
		
		HttpSession session = req.getSession();
		
		//Using the http session accept request from multiple customer

		session.setAttribute("customer", customer);
		
		// generate a response
		if (customer != null) {
			/*
			 * If the customer is not null, that means the username and password match
			 * with an existing customer,redirct them to the welcome page of the website.
			 */
			getServletContext().getRequestDispatcher("/welcome").forward(req, res);

		} else {
			/*
			 * If the customer object is null, redirect them to the error page.
			 */
			getServletContext().getRequestDispatcher("/error").forward(req, res);
		}
	}

}
