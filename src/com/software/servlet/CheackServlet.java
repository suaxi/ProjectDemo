package com.software.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.software.entity.User;
import com.software.service.impl.UserServiceImpl;

/** 
* @author 作者 : 007
* @version 创建时间：2019年6月19日 下午2:39:14 
* 类说明 
*/
@WebServlet("/doCheack")
public class CheackServlet extends HttpServlet{

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取页面提交的参数
		String name = req.getParameter("username");
		//判断用户名是否为空
		if(name==null||"".equals(name)) {
			resp.getWriter().write(String.valueOf(0));
			return;
		}
		/*System.out.println(name);*/
		//把获取到的参数封装到对象中
		User user = new User(name);
		//调用service层方法查重
		UserServiceImpl us = new UserServiceImpl();
		int result = us.cheack(user);
		resp.getWriter().write(String.valueOf(result));//传到前端页面进行判断
		//req.setAttribute("result", result);
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
