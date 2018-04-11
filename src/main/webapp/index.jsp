<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<%@ taglib uri="/struts-tags" prefix="s" %>
<html>
  <head>
    
    <title>ssh测试demo</title>
    
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<meta http-equiv="Content-Type" content="text/html; charset-UTF-8">
	<!--
	<link rel="stylesheet" type="text/css" href="styles.css">
	-->
	<script type="text/javascript">
		window.onload = function(){
			alert("获取数据完毕，项目已启动！")
		}
	</script>
  </head>
  
  <body>
  	<div>
  		<h3>客户信息：</h3>
  		<ul>
  			<li><font color="blue" strong>姓名</font>：<s:property value="custName"/></li>
  			<li><font color="blue" strong>地址</font>：<s:property value="address"/></li>
  		</ul>
  	</div>
  </body>
</html>
