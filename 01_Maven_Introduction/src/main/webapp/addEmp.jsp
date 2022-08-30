<%@page import="com.mindgate.pojo.Employee"%>
<%@page import="java.util.List"%>
<%@page import="com.mindgate.repository.EmployeeRepository"%>
<%@page import="com.mindgate.repository.EmployeeRepositoryInterface"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h3>Add New Employee Details</h3>
	<br>


	<form action="AddNewEmployeeServlet" method="post">
		Employee Id : <input type="text" name="employeeid">
		 <br> <br>
		Name :<input type="text" name="name"> 
		<br> <br> 
		Salary : <input type="text" name="salary"> 
		<br> <br> 
		<input type="submit" value="Add Employee"> <br> <br>
	</form>

</body>
</html>