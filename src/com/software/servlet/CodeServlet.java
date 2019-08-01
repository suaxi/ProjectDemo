package com.software.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import cn.dsna.util.images.ValidateCode;

@WebServlet("/doCode")
public class CodeServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		//设置验证码的参数
		ValidateCode vc = new ValidateCode(140, 45, 4, 18);
		//获取验证码
		String code = vc.getCode();
		//后台打印验证码
		System.out.println(vc.getCode());
		//获取对象的值
		HttpSession session = req.getSession();
		session.setAttribute("code", code);
		//输出字符流
		vc.write(resp.getOutputStream());
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		doGet(req, resp);
	}
}
