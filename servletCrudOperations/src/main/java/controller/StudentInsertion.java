package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.StudentDto;

@WebServlet("/xyz")
public class StudentInsertion extends HttpServlet{
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String sid=req.getParameter("sid");
	String sname=req.getParameter("name");
	String phno=req.getParameter("phno");
	String gen=req.getParameter("gen");
	
	//converting String to interger type...
	int id=Integer.parseInt(sid);
	 Long pno=Long.parseLong(phno);
	
	//setting values to StudentDto class
	StudentDto dto=new StudentDto();
	dto.setSid(id);
	dto.setSname(sname);
	dto.setGender(gen);
	dto.setPhno(pno);
	
	//passing StudentDto clsss object to dao
	StudentDao dao=new StudentDao();
	String msg=dao.insertion(dto);
	
	resp.getWriter().print(msg);
}
}
