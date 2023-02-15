package vinay;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.Tester2;
import dto.Student;
@WebServlet("/dk")
public class Demo extends HttpServlet {
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
		String s1=req.getParameter("stdid");
		int stdid = Integer.parseInt(s1);
		String stdname=req.getParameter("stdname");
//		String dob=req.getParameter("dob");
//		String gender=req.getParameter("gender");
//	String state=	req.getParameter("state");
//	String stdph=req.getParameter("stdph");
		Student std=new Student();
//		std.setStdid(stdid);
//		std.setStdname(stdname);
//		std.setStdph(stdname);
//		std.setDob(dob);
//		std.setGender(gender);
//		std.setState(state);
//		std.setStdph(stdph);
//		
		Tester2 t=new Tester2();
//		t.insert(std);
		t.update(stdid, stdname);
	}

}
