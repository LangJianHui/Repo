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
    
    <title>My JSP 'index.jsp' starting page</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<style>
		.read{background:#999}
	</style>
  </head>
  
  <body>
    	<form action="house_update.action" method="post">
    		<p>编号：<input type="text" name="house.id" value="${info.id}" readonly class="read"/></p>
    		<p>标题：<input type="text" name="house.title" value="${info.title}"/></p>
    		<p>租金：<input type="text" name="house.price" value="${info.price}"/></p>
    		<p>信息类型：
    		<select name="house.housetype.id">
    			<c:forEach items="${types}" var="t">
    					<c:if test="${t.id==info.housetype.id}">
    						<option value="${t.id}" selected>${t.tname}</option>
    					</c:if>
    					<c:if test="${t.id!=info.housetype.id}">
    						<option value="${t.id}" >${t.tname}</option>
    					</c:if>
    			</c:forEach>
    		</select></p>
    		<p>联系电话：<input type="text" name="house.phone" value="${info.phone}"/></p>
    		<p>联系人：<input type="text" name="house.linkman" value="${info.linkman}"/></p>
    		<p><input type="submit" value="提交"/></p>
    	</form>
  </body>
</html>
