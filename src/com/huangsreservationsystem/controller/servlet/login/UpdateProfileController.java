package com.huangsreservationsystem.controller.servlet.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.huangsreservationsystem.business.UpdateProfileManager;
import com.huangsreservationsystem.model.domain.CustomerBean;

@WebServlet("/UpdateProfileController")
public class UpdateProfileController extends HttpServlet{

	/**
	 * 
	 */
	private static final long serialVersionUID = -684430868931810612L;
	
	public UpdateProfileController() {
		super();
	}
	
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
		System.out.println("Inside the UpdateProfileController");
		String firstname = req.getParameter("firstname");
		String lastname = req.getParameter("lastname");
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String birthday = req.getParameter("birthday");
		String cardtype = req.getParameter("Type");
		String cardNumber = req.getParameter("cardnum");
		String expdate = req.getParameter("expdate");
		String cvv = req.getParameter("cvv");
		CustomerBean customer = new CustomerBean();
		customer.setFirstName(firstname);
		customer.setLastName(lastname);
		customer.setUserName(username);
		customer.setPassword(password);
		customer.setBirthday(birthday);
		customer.setCardType(cardtype);
		customer.setExpDate(expdate);
		customer.setCvv(cvv);
		customer.setCardNumber(cardNumber);
		
		CustomerBean customerBean = UpdateProfileManager.update(customer);
		
		if(customerBean != null) {
			System.out.println("Inside the customer bean not null block");
			getServletContext().getRequestDispatcher("/updateServlet").forward(req, res);
		}else {
			System.out.println("Do nothing for now");
			//getServletContext().getRequestDispatcher("/welcome").forward(req, res);
		}
	}
	
}
