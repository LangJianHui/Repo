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
	<script src="${pageContext.request.contextPath}/resources/jquery-1.11.3.min.js"></script>
	<script src="${pageContext.request.contextPath}/resources/jquery.serialize.js"></script>
	<script src="${pageContext.request.contextPath}/resources/jquery.form.js"></script>
  </head>
  
  <body>

    	<form action="upload" method="post" id="form1" enctype="multipart/form-data">
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
    				<td>头像</td>
    				<td>
    				<input type="file" name="files"/>
    				<input type="file" name="files"/>
    				</td>
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
	$("#form1").ajaxSubmit({
    	url : "upload",
    	type : "post",
		contentType : "application/x-www-form-urlencoded; charset=utf-8",
   	 	dataType : 'text',
    	success : function(data) {
    		alert(data);
    	}
});
}




</script>

