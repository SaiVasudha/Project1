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
@WebServlet("/remov")
public class StudentRemove extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
    	// TODO Auto-generated method stub
    	//super.doGet(req, resp);
    	String sid=req.getParameter("sid");
    	
    	//converting String to int...
    	int id=Integer.parseInt(sid);
    	
    	
    	//sending received  primary key to dao..
    	StudentDao dao=new StudentDao();
        String msg=dao.remove(id);
    	
        List<StudentDto> list=dao.fetchAll();
        
        req.setAttribute("studentlist",list);
        
    	resp.getWriter().print(msg);
    	
    	RequestDispatcher dispatcher=req.getRequestDispatcher("download.jsp");
    	dispatcher.include(req, resp);
    	
    }
}
