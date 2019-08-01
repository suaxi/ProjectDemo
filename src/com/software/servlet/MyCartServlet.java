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
@WebServlet("/doMyCart")
public class MyCartServlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	QueryServiceImpl qS = new QueryServiceImpl();
	//获取对象的值
	User user = (User)req.getSession().getAttribute("user");
	String userId = user.getId();
	//调用service层方法，通过获取的用户id查询当前用户的购物车信息存入list表中
	List<Map<String, Object>> list = qS.QueryCart(Integer.parseInt(userId));
	req.getSession().setAttribute("list", list);
	//请求转发到我的购物车界面并显示出所查询出来的信息
	req.getRequestDispatcher("indexMyCartEL.jsp").forward(req, resp);
	//调用service层方法，通过用户id查询当前购物车中商品的总价
	Object totalPrice = qS.GetTotalPrice(Integer.parseInt(userId));
	//后台打印
	System.out.println(totalPrice);
	resp.getWriter().write("共计"+totalPrice);
}

@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
