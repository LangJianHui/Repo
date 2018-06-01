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
	 * ��ȡMap���͵�request����
	 * @return
	 */
	public Map getRequest(){
		return (Map) ActionContext.getContext().get("request");
	}
	/**
	 * ��ȡ��Ӧ����response
	 * @return
	 */
	public HttpServletResponse getResponse(){
		HttpServletResponse response=ServletActionContext.getResponse();
		response.setContentType("text/html;charset=utf-8");
		return response;
	}
	
	/**
	 * ��ȡ���������
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
