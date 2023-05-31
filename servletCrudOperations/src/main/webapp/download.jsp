<%@page import="dto.StudentDto"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%List<StudentDto> list=(List<StudentDto>)request.getAttribute("studentlist"); %>
<table border="3px">
<tr>
<th>SID</th>
<th>SNAME</th>
<th>PHNO</th>
<th>GENDER</th>
<th>DELETE</th>
<th>UPDATE</th>
</tr>
<%for(StudentDto d:list){ %>
<tr>
<td><%=d.getSid() %></td>
<td><%=d.getSname()%></td>
<td><%=d.getPhno() %></td>
<td><%=d.getGender()%></td>
<td><a href="remov?sid=<%=d.getSid()%>">delete</a></td>
<td><a href="update.jsp?sid=<%=d.getSid()%>
&sname=<%=d.getSname()%>
&phno=<%=d.getPhno()%>
&gender=<%=d.getGender()%>">update</a></td>
</tr>
<%} %>
</table>
</body>
</html>