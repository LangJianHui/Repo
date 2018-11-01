<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib prefix="shiro" uri="http://shiro.apache.org/tags" %>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'user.jsp' starting page</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->

  </head>
  
  <body>
  	${successMsg } Welcome!  <shiro:principal/> 
  	<a href="test/logout">注销</a>
  	<br/>
  	<a href="jsp/addUser.jsp">新增用户</a>
  	<shiro:hasAnyRoles name="user">  
        <a href="jsp/user.jsp">User Page</a>  
    </shiro:hasAnyRoles>  
      
    <br><br>  
      
    <shiro:hasAnyRoles name="admin">  
        <a href="jsp/admin.jsp">Admin Page</a>  
    </shiro:hasAnyRoles>  
    
  </body>
</html>
