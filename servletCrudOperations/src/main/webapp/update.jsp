<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="updateht">
SID: <input type="number" name="sid" value="<%=request.getParameter("sid")%>" readonly="readonly"><br><br>
SNAME: <input type="text" name="name" value="<%=request.getParameter("sname")%>"><br><br>
PHNO: <input type="number" name="phno" value="<%=request.getParameter("phno")%>"><br><br>
<% if(request.getParameter("gender").equals("male")) {%>
Male<input type="radio" name="gender" value="male" checked="checked">
Female<input type="radio" name="gender" value="female"><br><br>
<%}else{ %>
Male<input type="radio" name="gender" value="male" >
Female<input type="radio" name="gender" value="female" checked="checked"><br><br>
<%} %>

<button type="submit">update</button>
</form>
</body>
</html>

























