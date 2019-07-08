package com.software.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.software.entity.User;
import com.software.service.impl.UserServiceImpl;

@WebServlet("/doRegister")
public class RegisterServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserServiceImpl us = new UserServiceImpl();
		//获取页面提交的参数
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String idnumber = req.getParameter("idnumber");
		String tel = req.getParameter("tel");
		String email = req.getParameter("email");
		//把参数封装到对象中
		User user = new User(username, password, idnumber, tel, email);
		//调用service层方法注册
		int result = us.register(user);
		//根据返回值判断是否注册成功
		PrintWriter writer = resp.getWriter();
		if(result==-2) {
			writer.write("用户名已存在，注册失败！");
		}else if (result==0) {
			writer.write("注册失败，请联系管理员！");
		}else {//重定向到登陆界面
			resp.sendRedirect("SignIn.jsp");
		}
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
