package com.software.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.software.entity.Cart;
import com.software.entity.Record;
import com.software.entity.User;
import com.software.service.impl.QueryServiceImpl;
import com.software.service.impl.UserServiceImpl;
@WebServlet("/doCleanCart")
public class CleanCartServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		QueryServiceImpl qS = new QueryServiceImpl();
		UserServiceImpl uS = new UserServiceImpl();
		User user = (User)req.getSession().getAttribute("user");
		//获取用户id
		String UserId = user.getId();
		//根据用户id查询出游戏的数量和价格
		List<Cart> list = qS.QueryGameIdPriceCount(Integer.parseInt(UserId));
		for (Cart cart : list) {
			//遍历已经添加的游戏信息
			int gameId = cart.getGame_id();
			double price = cart.getPrice();
			//把参数封装到对象中（记录表）
			Record record = new  Record(Integer.parseInt(UserId), gameId, price);
			int i = cart.getCount();
			for(;i>0;i--) {//调用service层方法每当执行一次购买，记录表里的数据+1
				uS.buyGame(record);
			}
			//执行购买之后调用service层方法将购物车里的游戏信息的status改为1
			uS.changeCartStatus(cart.getId());
			//执行购买之后调用service层方将cart实体类中status为1的信息删除
			uS.DeleteCart(cart.getId());	
		}
		resp.sendRedirect("indexSuccess.jsp");//重定向到购买成功界面
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
