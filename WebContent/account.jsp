<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
   <%@page import ="com.user.Customer" %>
   <%@page import ="com.user.Balance" %>
    <%Customer customer=(Customer)session.getAttribute("customer"); %>
 <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" integrity="sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u" crossorigin="anonymous">
    
   
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<h1>Welcome <% out.print(customer.getUserName()); %>!</h1>
<input id="inp" type="button" value="Balance" onclick="location.href='Balance.jsp';" />
<input id="inp" type="button" value="Statements" onclick="location.href='Statements.jsp';"/>
<% Balance balance = new Balance();
session.setAttribute("balance", balance); %>

</body>
</html>