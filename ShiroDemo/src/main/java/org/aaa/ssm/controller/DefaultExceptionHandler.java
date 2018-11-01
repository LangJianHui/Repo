package org.aaa.ssm.controller;
import javax.servlet.http.HttpServletRequest;

import org.apache.shiro.authz.UnauthorizedException;
import org.springframework.http.HttpStatus;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

/**
 * <p>User: Zhang Kaitao
 * <p>Date: 14-2-12
 * <p>Version: 1.0
 */

@ControllerAdvice
public class DefaultExceptionHandler {
    /**
     * 没有权限 异常
     * <p/>
     * 后续根据不同的需求定制即可
     */
 @ExceptionHandler({UnauthorizedException.class})
   @ResponseStatus(HttpStatus.UNAUTHORIZED)
    public ModelAndView processUnauthenticatedException(NativeWebRequest request, UnauthorizedException e) {
        ModelAndView mv = new ModelAndView();
        mv.addObject("exception", e);
        mv.setViewName("unauthorized");
        return mv;
    }
   
 //处理某一类型的异常
 	@ExceptionHandler(Exception.class)
 	//@ResponseStatus(value=HttpStatus.BAD_REQUEST,reason="发生错误了")
 	public ModelAndView handlerException(Exception e){
 		ModelAndView mv = new ModelAndView();
        mv.addObject("exception", e);
        mv.setViewName("unauthorized");
 		//LOGGER.error("错误");//记录到日志文件中
 		//req.getSession(true).setAttribute(MESSAGE, e.getMessage());//存入session
 		return mv;
 	}
}