package com.software.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.software.entity.Record;
import com.software.entity.User;
import com.software.service.impl.UserServiceImpl;

@WebServlet("/doBuy")
public class BuyServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		UserServiceImpl uS = new UserServiceImpl();
		HttpSession session = req.getSession();
		//获取对象中的值
		User user = (User)req.getSession().getAttribute("user");
		//获取用户id
		String userId = user.getId();
		//获取提交的参数
		String gameId = req.getParameter("gameId");
		String price = req.getParameter("price");
		/*System.out.println(userId);
		System.out.println(gameId);
		System.out.println(price);*/
		//把获取到的参数封装到对象中
		Record record = new Record(Integer.parseInt(userId), Integer.parseInt(gameId), Double.parseDouble(price));
		//调用service层方法购买游戏
		int reslutR = uS.buyGame(record);
		//调用service层方法增加游戏销售数量
		int reslutC = uS.addCount(gameId);
		//根据返回值判断是否购买成功
		if(reslutR>0&&reslutC>0) {//重定向到购买成功界面
			resp.sendRedirect("indexSuccess.jsp");
		}else {
			resp.getWriter().write("购买失败！");

		}
		
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
