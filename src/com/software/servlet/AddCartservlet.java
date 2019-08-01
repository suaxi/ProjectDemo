package com.software.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.software.entity.Cart;
import com.software.entity.User;
import com.software.service.impl.UserServiceImpl;

@WebServlet("/doAddCart")
public class AddCartservlet extends HttpServlet{
@Override
protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	UserServiceImpl uS = new UserServiceImpl();
	//在页面获取用户
	User user = (User)req.getSession().getAttribute("user");
	//获取页面提交的参数
	String user_id = user.getId();
	String gameId = req.getParameter("gameId");
	String price = req.getParameter("price");
	//把获取到的参数封装到对象中
	Cart cart = new Cart(Integer.parseInt(user_id), Integer.parseInt(gameId), Double.parseDouble(price));
	//调用service层方法添加购物车
	int result = uS.addCart(cart);
	//根据返回值判断是否添加成功成功
	PrintWriter writer = resp.getWriter();
	if(result>0) {//成功重定向到添加成功界面
		resp.sendRedirect("indexAddCartSuccess.jsp");
	}
}
@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
