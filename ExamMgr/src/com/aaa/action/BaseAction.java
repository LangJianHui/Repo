package com.aaa.action;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletResponse;

import org.apache.struts2.ServletActionContext;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;

public class BaseAction extends ActionSupport {
	
	/**
	 * 获取Map类型的request对象
	 * @return
	 */
	public Map getRequest(){
		return (Map) ActionContext.getContext().get("request");
	}
	/**
	 * 获取响应对象response
	 * @return
	 */
	public HttpServletResponse getResponse(){
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		return response;
	}
	
	/**
	 * 获取输出流对象
	 * @return
	 */
	public PrintWriter getPrintWriter(){
		HttpServletResponse response=getResponse();
		PrintWriter out=null;
		try {
			out=response.getWriter();
			return out;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return out;
	}
	
}
