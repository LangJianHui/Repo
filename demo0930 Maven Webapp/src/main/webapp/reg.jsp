<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>注册</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script src="resources/jquery-1.11.3.min.js"></script>
	<script src="resources/jquery.serialize.js"></script>
  </head>
  
  <body>

    	<form action="person/save" method="post" id="form1">
    		<table>
    			<tr>
    				<td>名字</td>
    				<td><input type="text" name="name" value="张三"/></td>
    			</tr>
    			<tr>
    				<td>性别</td>
    				<td><input type="text" name="sex" value="男"/></td>
    			</tr>
    			<tr>
    				<td>出生日期</td>
    				<td><input type="text" name="birthday" value="1992-01-01"/></td>
    			</tr>
    			<tr>
    				<td>类别</td>
    				<td><input type="text" name="cate.id" value="1"/></td>
    			</tr>
    			<tr>
    				<td>类别</td>
    				<td><input type="text" name="cate.name" value="学生"/></td>
    			</tr>
    			<tr>
    				<td colspan="2"><input type="button" value="提交" onclick="send()"/></td>
    			</tr>
    		</table>
    	</form>
  </body>
</html>
<script>
function send(){
	var str=$("#form1").serialize();
	alert(str);
	$.ajax({
    	url : "person/save1",
    	type : "post",
    	async : true,
    	data : $("#form1").serialize(),
   	 	dataType : 'text',
    	success : function(data) {
    		alert(data);
    	}
		});
}



function send1(){
	/* var obj=$("#form1").serializeObject();
	alert(JSON.stringify(obj)); */
	
	var obj1={
	"name":"张三",
	"sex":"男",
	"birthday":"2006-10-16",
	"cate":{
		"id":"1",
		"name":"李四"
		}
	};
	$.ajax({
    	url : "person/save",
    	type : "post",
    	async : true,
    	data : JSON.stringify(obj1),
    	contentType: "application/json; charset=utf-8",
   	 	dataType : 'text',
    	success : function(data) {
    		alert(data);
    	}
		});
}
</script>

