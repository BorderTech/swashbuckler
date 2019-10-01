package com.github.bordertech.swagger.cors;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Sample CORS Servlet filter.
 */
public class SampleCorsServletFilter implements Filter {

	@Override
	public void doFilter(final ServletRequest request, final ServletResponse response, final FilterChain chain) throws IOException, ServletException {
		HttpServletResponse res = (HttpServletResponse) response;
		res.addHeader("Access-Control-Allow-Origin", "*");
		res.addHeader("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
		res.addHeader("Access-Control-Allow-Headers", "origin, content-type, accept, authorization");
		chain.doFilter(request, response);
	}

	@Override
	public void destroy() {
		// Do nothing
	}

	@Override
	public void init(final FilterConfig filterConfig) throws ServletException {
		// Do nothing
	}
}
