<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>My JSP 'oneToMany.jsp' starting page</title>
    
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
	<form action="house_addMany.action" method="post">
		<c:forEach var="i" begin="0" step="1" end="5">
			<p>标题：<input type="text" name="houseList[${i}].title"/></p>
    		<p>租金：<input type="text" name="houseList[${i}].price"/></p>
    		<p>信息类型：
    		<select name="houseList[${i}].housetype.id">
    			<option value="1">求租</option>
    			<option value="2">出租</option>
    			<option value="3">中介</option>
    		</select></p>
    		<p>联系电话：<input type="text" name="houseList[${i}].phone"/></p>
    		<p>联系人：<input type="text" name="houseList[${i}].linkman"/></p>
    		<hr/>
		</c:forEach>
		
    	
    		
    		
    		
    		<p><input type="submit" value="提交"/></p>
    	</form>
  </body>
</html>
