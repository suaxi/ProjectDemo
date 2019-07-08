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
		HttpSession session = req.getSession();
		User user = (User)req.getSession().getAttribute("user");
		String UserId = user.getId();
		List<Cart> list = qS.QueryGameIdPriceCount(Integer.parseInt(UserId));
		for (Cart cart : list) {
			int gameId = cart.getGame_id();
			double price = cart.getPrice();
			Record record = new  Record(Integer.parseInt(UserId), gameId, price);
			int i = cart.getCount();
			for(;i>0;i--) {
				uS.buyGame(record);
			}
			int result = uS.changeCartStatus(cart.getId());
			uS.DeleteCart(cart.getId());	
		}
					resp.sendRedirect("indexSuccess.jsp");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
