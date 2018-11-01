package org.aaa.ssm.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.aaa.ssm.model.User;
import org.aaa.ssm.service.UserServiceImpl;
import org.apache.shiro.SecurityUtils;
import org.apache.shiro.authc.AuthenticationException;
import org.apache.shiro.authc.ExcessiveAttemptsException;
import org.apache.shiro.authc.IncorrectCredentialsException;
import org.apache.shiro.authc.UnknownAccountException;
import org.apache.shiro.authc.UsernamePasswordToken;
import org.apache.shiro.subject.Subject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/login")
public class LoginController {
	@Autowired
	private UserServiceImpl userService;

	@RequestMapping("/dologin") // url
	public String dologin(User user, Model model) {
		String info = loginUser(user);
		if (!"SUCC".equals(info)) {
			model.addAttribute("failMsg", info);//记录错误消息
			return "fail";
		} else {
			model.addAttribute("successMsg", "登陆成功！");// 返回到页面说夹带的参数
			model.addAttribute("name", user.getUsername());
			return "success";// 返回的页面
		}
	}

	@RequestMapping("/logout")
	public String logout(HttpServletRequest request, HttpServletResponse response) throws IOException {
		System.out.println("hello");
		Subject subject = SecurityUtils.getSubject();
		try {
			subject.logout();
		} catch (Exception ex) {
			ex.printStackTrace();
		}
		return "login";
	}

	/**
	 * 登录方法
	 * 
	 * @param user
	 * @return
	 */
	private String loginUser(User user) {
		if (isRelogin(user))
			return "SUCC"; // 如果已经登陆，无需重新登录
		return shiroLogin(user); // 调用shiro的登陆验证
	}

	/**
	 * 判断是否是重新登录
	 * 
	 * @param user
	 * @return
	 */
	private boolean isRelogin(User user) {
		Subject us = SecurityUtils.getSubject();
		if (us.isAuthenticated()) {
			return true; // 参数未改变，无需重新登录，默认为已经登录成功
		}
		return false; // 需要重新登陆
	}

	/**
	 * 登录方法
	 * 
	 * @param user
	 * @return
	 */
	private String shiroLogin(User user) {
		// 组装token，包括客户公司名称、简称、客户编号、用户名称；密码
		UsernamePasswordToken token = new UsernamePasswordToken(user.getUsername(), user.getPassword().toCharArray(),
				null);
		token.setRememberMe(true);

		// shiro登陆验证
		try {
			SecurityUtils.getSubject().login(token);
		} catch (UnknownAccountException ex) {
			return "用户不存在！";
		} catch (IncorrectCredentialsException ex) {
			return "密码错误！";
		} catch (ExcessiveAttemptsException e) {
			// TODO: handle exception
			return "登录失败多次，账户锁定10分钟";
		} catch (AuthenticationException ex) {
			return ex.getMessage(); // 自定义报错信息
		} catch (Exception ex) {
			ex.printStackTrace();
			return "内部错误，请重试！";
		}
		return "SUCC";
	}
}