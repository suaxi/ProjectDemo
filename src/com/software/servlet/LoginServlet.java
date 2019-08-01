package com.software.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.software.entity.User;
import com.software.service.impl.UserServiceImpl;



/** 
* @author 作者 : dyb
* @version 创建时间：2019年6月5日 上午10:37:30 
* 类说明 
*/

@WebServlet("/doLogin")
public class LoginServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8"); 
		//获取页面提交的参数
		String username = req.getParameter("username");
		String password = req.getParameter("password");
		String code = req.getParameter("code");
		//把参数封装到对象中
		User user = new User(username, password);
		//调用service层方法登录
		User result = new UserServiceImpl().login(user);
		//获取验证码
		Object obj = req.getSession().getAttribute("code");
		if(result!=null&&obj.equals(code)) {//登陆成功后重定向到主界面
			req.getSession().setAttribute("user", result);
			//根据当前用户类型进行判断，0：普通用户，1：管理员
			User user1 = (User)req.getSession().getAttribute("user");
			if(Integer.parseInt(user1.getType())==0) {
				resp.sendRedirect("index.jsp");	
			}else if(Integer.parseInt(user1.getType())==1) {
				resp.sendRedirect("adminindex.jsp");	
			}
		}else {//登陆失败
			resp.getWriter().write("登陆失败！");
		}
		
		
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
