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

@WebServlet("/dogetUserRecode")
public class getUserRecodeServlet extends HttpServlet{
	QueryServiceImpl qS = new QueryServiceImpl(); 
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//获取用户对象的值
		User user = (User)req.getSession().getAttribute("user");
		//调用service层方法，通过用户id查询用户已购买的商品信息存入list表中
		List<Map<String, Object>> list = qS.getUserRecode(user.getId());
		//设置对象的属性
		req.getSession().setAttribute("list", list);
		//转发到我的游戏库界面并显示详细信息
		req.getRequestDispatcher("indexMyRecodeEL.jsp").forward(req, resp);	
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
	
}
