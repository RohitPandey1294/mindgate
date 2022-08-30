package com.mindgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NumberServlet
 */
@WebServlet("/NumberServlet")
public class NumberServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int num1 = Integer.parseInt(request.getParameter("number1"));
		int num2 = Integer.parseInt(request.getParameter("number2"));
		int num3 = num1 + num2;
		int num4 = num1 - num2;
		int num5 = num1 * num2;
		int num6 = num1 / num2;
		PrintWriter out = response.getWriter();
		String choice = request.getParameter("operation");
		switch (choice) {
		case "add":
			out.println("add " + num3);
			break;
		case "sub":
			out.println("sub " + num4);
			break;
		case "multiply":
			out.println("multiply " + num5);
			break;
		case "divide":
			out.println("divide " + num6);
			break;
		}

	}

}
