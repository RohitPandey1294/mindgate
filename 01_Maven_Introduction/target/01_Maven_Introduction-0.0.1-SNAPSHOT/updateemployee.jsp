<%@page import="javax.websocket.Session"%>
<%@page import="com.mindgate.pojo.Employee"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update Employee</title>
</head>
<body>
	<h3>Update employee</h3>
	<%
	Employee employee = (Employee) session.getAttribute("emp");
	%>
	<form action="UpdateEmployeeServelet" method="post">
		Employee Id : <input type="text" name="employeeid" readonly="true"
			value="<%=employee.getEmployeeId()%>"> <br> <br>
		Name :<input type="text" name="name" value="<%=employee.getName()%>">
		<br> <br> Salary : <input type="text" name="salary"
			value="<%=employee.getSalary()%>"> <br> <br> <input
			type="submit" value="Update Employee"> <br> <br>
	</form>

</body>
</html>