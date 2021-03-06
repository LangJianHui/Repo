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
    
    <title>My JSP 'success.jsp' starting page</title>
    
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
  <a href="index.jsp">首页</a>
    <c:choose>
    	<c:when test="${pager==null}">没有数据</c:when>
    	<c:otherwise>
    		<c:forEach var="h" items="${pager.datas}">
    			<p>${h.id}---${h.title}---${h.linkman}------${h.phone}---
    			<a href="house_delete.action?house.id=${h.id}" onclick="return confirm('确认要删除吗？')">删除</a>
    			<a href="house_select.action?house.id=${h.id}">修改</a></p>
    		</c:forEach>
    	</c:otherwise>
    </c:choose>
    <div>
    	<a href="house_queryByPages.action?curPage=1">首页</a>
    	<a href="house_queryByPages.action?curPage=${pager.prevPage}">前页</a>
    	<a href="house_queryByPages.action?curPage=${pager.nextPage}">下页</a>
    	<a href="house_queryByPages.action?curPage=${pager.lastPage}">尾页</a>
    </div>
  </body>
</html>
