package com.software.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.software.entity.User;
import com.software.service.impl.QueryServiceImpl;
import com.software.service.impl.UserServiceImpl;

@WebServlet("/doGetTotalPrice")
public class GetTotalPriceServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		QueryServiceImpl qS = new QueryServiceImpl();
		//获取用户对象的值
		User user = (User)req.getSession().getAttribute("user");
		String userId = user.getId();
		//调用service层方法，通过用户id查询用户购物车中商品的总价
		Object totalPrice = qS.GetTotalPrice(Integer.parseInt(userId));
		resp.getWriter().write("共计"+totalPrice);
		/*	uS.changeCartStatus(CartId);*/
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
