package controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.StudentDto;

@WebServlet("/updateht")
public class StudentUpdate extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doGet(req, resp);
	String sid=req.getParameter("sid");
	System.out.println(sid);
	String name= req.getParameter("name");
	String phno=req.getParameter("phno");
	String gender=req.getParameter("gender");
	

	int id=Integer.parseInt(sid);
	Long ph=Long.parseLong(phno);
	
	StudentDto dto=new StudentDto();
	dto.setSid(id);
	dto.setSname(name);
	dto.setGender(gender);
	dto.setPhno(ph);
	
	StudentDao dao=new StudentDao();
   String msg=dao.update(dto);
    
    List<StudentDto> list=dao.fetchAll();
	
	
	req.setAttribute("studentlist",list);
	
	resp.getWriter().print(msg);
	RequestDispatcher dispatcher=req.getRequestDispatcher("download.jsp");
	dispatcher.include(req, resp);

	
	
}
}
