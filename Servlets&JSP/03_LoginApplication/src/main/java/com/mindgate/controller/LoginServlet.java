package com.mindgate.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class LoginServlet
 */
@WebServlet("/LoginServlet")
public class LoginServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String userId, Password;
		userId = request.getParameter("id");
		Password = request.getParameter("pwd");

		if (userId.equals("admin") && Password.equals("Bahubali")) {
//			response.sendRedirect("home.html");

		} else {
//			response.sendRedirect("invalid.html");
		}

	}

}
