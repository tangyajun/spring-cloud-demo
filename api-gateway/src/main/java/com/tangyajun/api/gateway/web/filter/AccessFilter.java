package com.tangyajun.api.gateway.web.filter;

import com.netflix.zuul.ZuulFilter;
import com.netflix.zuul.context.RequestContext;
import com.netflix.zuul.exception.ZuulException;

import javax.servlet.http.HttpServletRequest;

/**
 * @author tangyajun
 * @Description TO DO
 * @create 2019-05-08-7:17
 **/
public class AccessFilter extends ZuulFilter {
	@Override
	public String filterType() {
		return "pre";
	}

	@Override
	public int filterOrder() {
		return 0;
	}

	public boolean shouldFilter() {
		return true;
	}

	public Object run() throws ZuulException {
		return null;
	}
}
