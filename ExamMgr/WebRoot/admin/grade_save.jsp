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
    
    <title>年级录入</title>
    
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
  	<form action="grade_save.action" method="post" class="form-horizontal">
  			<div class="form-group">
				<label for="g.gradeName" class="col-md-2 control-label">年级名称</label>
				<div class="col-md-4">
					<input type="text" class="form-control" name="grade.gradeName"  required  placeholder="请输入年级名称" >
				</div>
			</div>
  			<div class="form-group">
				<div class="col-md-offset-2 col-md-4">
					<input type="submit" class="btn btn-primary" value="保存"  >
				</div>
			</div>
  		</form>
  </div>
    	
  </body>
</html>
