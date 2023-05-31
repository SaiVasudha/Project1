package controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.StudentDao;
import dto.StudentDto;

@WebServlet("/fetchbyid")
public class StudentFetchById extends HttpServlet {
@Override
protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	// TODO Auto-generated method stub
	//super.doPost(req, resp);
	String id=req.getParameter("sid");
	int sid=Integer.parseInt(id);
	
	StudentDao dao=new StudentDao();
	StudentDto dto= dao.fetchById(sid);
	
	resp.getWriter().print(dto);
}
}
