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


@WebServlet("/doReset")
public class ResetPasswordServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserServiceImpl us = new UserServiceImpl();
		//获取页面提交的参数
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String id_number = req.getParameter("idnumber");
		//把参数封装到对象中
		User user = new User(username, password, id_number);
		//调用service层方法，重置密码
		int result = us.resetPassword(user);
	   //根据返回值判断是否修改成功
		PrintWriter writer = resp.getWriter();
		if(result>0) {//修改成功
			writer.write("1");
		}else {//修改失败
			writer.write("2");
		}
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
