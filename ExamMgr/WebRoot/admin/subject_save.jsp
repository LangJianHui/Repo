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
	<script src="${pageContext.request.contextPath}/js/jquery-1.11.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/bootstrap/js/bootstrap.min.js"></script>
	
	
	<script>
		//页面加载事件
		$(function(){
			$.ajax({
				   type: "post",//提交数据的方式
				   url: "${pageContext.request.contextPath}/grade_findGrade.action",//请求的action的地址
				   data: {},//需要向action中提交的参数
				   dataType:"json",//返回的数据的类型
				   success: function(data){//成功后执行的回调函数
					   
					   for(var i=0;i<data.length;i++){
						   $("#grade").append("<option value='"+data[i].tabGradeId+"'>"+data[i].gradeName+"</option>");//追加子节点
					   }
					   
				   	/* 	$.each(data,function(i,n){
				   			$("#grade").append("<option value='"+n.tabGradeId+"'>"+n.gradeName+"</option>");//追加子节点
				   		}); */
				   }
				});
			
		});
	
	</script>

  </head>
  
  <body>
  <div class="container">
  	<form action="subject_save.action" method="post" class="form-horizontal">
  			<div class="form-group">
				<label for="g.gradeName" class="col-md-2 control-label">年级</label>
				<div class="col-md-4">
					<!-- 	实体.属性（实体）.属性 -->
					<select name="subject.tabGrade.tabGradeId" id="grade" class="form-control">
					</select>
				</div>
			</div>
				<div class="form-group">
				<label for="g.gradeName" class="col-md-2 control-label">科目名称</label>
				<div class="col-md-4">
					<input type="text" class="form-control" name="subject.subjectName"  required  placeholder="请输入科目名称" >
				</div>
			</div>
				<div class="form-group">
				<label for="g.gradeName" class="col-md-2 control-label">科目简介</label>
				<div class="col-md-4">
					<input type="text" class="form-control" name="subject.subjectInfo"    placeholder="请输入科目简介" >
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
