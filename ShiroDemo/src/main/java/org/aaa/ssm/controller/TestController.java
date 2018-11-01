package org.aaa.ssm.controller;



import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.http.HttpServletResponse;

import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.credential.DefaultPasswordService;
import org.apache.shiro.authz.annotation.RequiresRoles;
import org.apache.shiro.codec.Base64;
import org.apache.shiro.subject.Subject;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;



@Controller
public class TestController {
	
	@RequestMapping("/test1")
	public String test(HttpServletResponse res) throws IOException{
		String str = "hello";  
		String base64Encoded = Base64.encodeToString(str.getBytes()); 
		System.out.println(Base64.decodeToString(base64Encoded));
		res.getWriter().print(Base64.decodeToString(base64Encoded));
		//d1.encryptPassword(plaintext);
		return null;
	}
	@RequestMapping("/test2")
	@ResponseBody
	public List<String> test2(){
	
		List<String> list=new ArrayList<String>();
		list.add("张三");
		list.add("李四");
		list.add("王五");
		return list;
	}
	
	@RequestMapping("/test3")
	public String test3(HttpServletResponse res) throws IOException{
		Object obj=SecurityUtils.getSubject().getSession().getHost();
		res.getWriter().print(obj);
		return null;
	}
	
	
	
}
