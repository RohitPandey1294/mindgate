package com.momdgate.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.mindgate.pojo.Employee;
import com.mindgate.repository.EmployeeRepository;
import com.mindgate.repository.EmployeeRepositoryInterface;
import com.mindgate.service.EmployeeService;
import com.mindgate.service.EmployeeServiceInterface;

/**
 * Servlet implementation class AddNewEmployeeServlet
 */
@WebServlet("/AddNewEmployeeServlet")
public class AddNewEmployeeServlet extends HttpServlet {

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		int employeeId;
		String name;
		double salary;

		employeeId = Integer.parseInt(request.getParameter("employeeid"));
		name = request.getParameter("name");
		salary = Double.parseDouble(request.getParameter("salary"));

		Employee employee = new Employee(employeeId, name, salary);
		EmployeeServiceInterface employeeServiceInterface = new EmployeeService();

		boolean result = employeeServiceInterface.addNewEmployee(employee);
		if (result) {
			response.sendRedirect("index.jsp");
		} else {

			PrintWriter out = response.getWriter();
			out.println("Invalid Entry");
		}

//
//		PrintWriter out = response.getWriter();
//		out.println("EmployeeID:" + employeeId);
//		out.println("name:" + name);
//		out.println("Salary:" + salary);
//		
//		
//		l

//		String htmlRespone = "<html>";
//		htmlRespone += "<form action=\"addEmp.jsp\">";
//		htmlRespone += "<input type = \"submit\" value=\"Add New Employee\">";
//		htmlRespone += "</form>";
//		htmlRespone += "</html>";
//
//		out.println(htmlRespone);
	}

}
