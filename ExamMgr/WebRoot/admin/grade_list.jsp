<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jstl/core_rt"  prefix="c"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>年级列表</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    

	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/bootstrap/css/bootstrap-theme.min.css">
	<script src="${pageContext.request.contextPath}/bootstrap/jquery-1.11.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
	


  </head>
  
  <body>
  <div class="container">
  <div class="row">
  	<div class="col-md-12">
  		<a href="admin/grade_save.jsp" class="btn btn-primary" style="width:100%">录入年级</a>
  	</div>
  </div>
  	<table class="table table-bordered table-hover">
    		<tr>
    			<td>年级编号</td><td>年级名称</td><td>操作</td>
    		</tr>
    		<c:forEach items="${pager.list}" var="g">
    		<tr>
    			<td>${g.tabGradeId}</td><td>${g.gradeName}</td><td>
    				<a href="grade_findById.action?grade.tabGradeId=${g.tabGradeId}"  class="btn btn-primary">修改</a>
    			</td>
    		</tr>
    		</c:forEach>
    	</table>
    <ul class="pager">
    	<li><span>当前页:${pager.curPage}/总页数:${pager.totalPages}</span></li>
    	<li><a href="grade_findAll.action?pager.curPage=1">首页</a></li>
    	<li><a href="grade_findAll.action?pager.curPage=${pager.prev}">上页</a></li>
    	<li><a href="grade_findAll.action?pager.curPage=${pager.next}">下页</a></li>
    	<li><a href="grade_findAll.action?pager.curPage=${pager.last}">尾页</a></li>
    </ul>
  </div>
    	
  </body>
</html>
