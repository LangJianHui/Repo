<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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
	<script src="js/jquery-1.11.3.min.js"></script>
	<script>
	function doAjax(){
		$.ajax({
			url:"house_testJson.action",//提交地址
			type:"post",//
			dataType:"json",//返回的数据的类型
			success:function(data){
				for(var i=0;i<data.length;i++){
					var tr="<tr><td>"+data[i].id+"</td><td>"+data[i].title+"</td><td>"+data[i].tname+"</td></tr>";
					$("#tb1").append(tr);
				}
			}
		});
	}
	function doDel(){
		$("#tb1 tr:gt(0)").remove();
	}
	</script>
  </head>
  
  <body>
  	<a href="query.jsp">查询</a>||<a href="house_queryAll.action">全部数据</a>||
  	<a href="oneToMany.jsp">多条添加</a>||<a href="house_queryByPages.action">分页显示数据</a>
  	<hr/>
  	<input type="button" value="Ajax测试" onclick="doAjax()"/>
  	<input type="button" value="删除行" onclick="doDel()"/>
  	<hr/>
  	<table  id="tb1">
  		<tr>
  			<td>编号</td><td>标题</td><td>类型</td>
  		</tr>
  	</table>
  	<hr/>
  	<select id="types"></select>
    	<form action="house_save.action" method="post">
    		<p>标题：<input type="text" name="house.title"/></p>
    		<p>租金：<input type="text" name="house.price"/></p>
    		<p>信息类型：
    		<select name="house.housetype.id">
    			<option value="1">求租</option>
    			<option value="2">出租</option>
    			<option value="3">中介</option>
    		</select></p>
    		<p>联系电话：<input type="text" name="house.phone"/></p>
    		<p>联系人：<input type="text" name="house.linkman"/></p>
    		<p><input type="submit" value="提交"/></p>
    	</form>
  </body>
</html>
