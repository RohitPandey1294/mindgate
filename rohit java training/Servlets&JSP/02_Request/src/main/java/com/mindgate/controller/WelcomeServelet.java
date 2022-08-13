package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class WelcomeServelet
 */
@WebServlet("/WelcomeServelet")
public class WelcomeServelet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String name= request.getParameter("Username");
		PrintWriter out= response.getWriter();
		out.println("hello "+name.toUpperCase() ); 
	}
	

}
