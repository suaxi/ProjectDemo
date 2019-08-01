package com.software.filter;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;

/** 
* @author 作者 : dyb
* @version 创建时间：2019年6月14日 下午3:47:09 
* 过滤器 设置字符类型为utf-8
*/
@WebFilter(urlPatterns="/*")
public class EncodingFilter implements Filter{

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain)
			throws IOException, ServletException {
		req.setCharacterEncoding("utf-8");
		resp.setContentType("text/html;charset=utf-8");
		chain.doFilter(req, resp);		
	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

}
