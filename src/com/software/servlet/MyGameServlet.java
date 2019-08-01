package com.software.servlet;

import java.io.IOException;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.software.entity.User;
import com.software.service.impl.QueryServiceImpl;
@WebServlet("/doMyGame")
public class MyGameServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		QueryServiceImpl qS = new QueryServiceImpl();
		//获取对象的属性
		User user = (User)req.getSession().getAttribute("user");
		String UserId = user.getId();
		//调用service层方法，通过用户id查询当前用户的游戏库信息存入list表中
		List<Map<String, Object>> list = qS.QueryMyGame(Integer.parseInt(UserId));
		//System.out.println(UserId);
		req.getSession().setAttribute("list", list);
		//请求转发到我的游戏库界面并显示查询出来的信息
		req.getRequestDispatcher("indexMyGameEL.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
