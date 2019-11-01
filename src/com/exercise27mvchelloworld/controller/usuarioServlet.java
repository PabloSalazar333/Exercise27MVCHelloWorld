package com.exercise27mvchelloworld.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.exercise27mvchelloworld.model.usuarioModel;


@WebServlet("/usuarioServlet")
public class usuarioServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String sid="";
		int iid=0;
		String sname="";
		short shage=0;
		
		iid = Integer.parseInt(request.getParameter("txtId"));
		sname = request.getParameter("txtName");
		shage = Short.parseShort(request.getParameter("txtAge"));
		
		usuarioModel myUser1 = new usuarioModel();
		myUser1.setAge(shage);
		myUser1.setId(iid);
		myUser1.setName(sname);
		
		
		response.getWriter().append("The id input myUser1 is:"+myUser1.getId());
		response.getWriter().append("The name input myUser1 is:"+myUser1.getName());
		response.getWriter().append("The age input myUser1 is:"+myUser1.getAge());
		
	}
	
	

}
