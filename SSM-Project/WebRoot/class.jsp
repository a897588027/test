<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${lsct == null }">
	<c:redirect url="findAll_Classtable"></c:redirect>
</c:if>



<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://"
			+ request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
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
<script type="text/javascript">
		function del(value){
			var msg = window.confirm("是否真的删除");
			if(msg){
				window.location.href = "delct?index="+value;
			}
		}
	
	</script>

</head>

<body>
	
	<!-- *****************新增************************ -->
		<form action="save_Class" method="post">
			班级名称:<input name="cname" /><br /> 
			<input type="submit" value="新增" />

		</form>

	<!-- *************************班级***************************** -->
	<div style="width: 50%;height: 100%;float:left;">
		<h1 align="center">班级管理</h1>
		<table border="1" align="center" width="400px">
			<tr>
				<td>编号</td>
				<td>名称</td>
				<td>操作</td>
			</tr>

			<c:forEach items="${lsct }" var="ct">
				<tr>
					<td>${ct.cid }</td>
					<td>${ct.cname }</td>
					<td><a onclick="del(${ct.cid})">删除</a>
					</td>
				</tr>
			</c:forEach>
		</table>
	</div>
	
	<!-- *************************根据id查询班级***************************** -->
	根据班级id查询,班级和对应的学生信息
	<form action="findByCidInStudnet" method="post">
		<input name="cid" type="text"/>
		<input type="submit"/>
	</form>
	
	<hr/>
	班级信息:${ctt.cid } /  ${ctt.cname }<br/>
	<c:forEach items="${ctt.lsst }" var="s">
		<span>${s.stuname }</span> / 
		<span>${s.stuhobby }</span>
		<br/>
	</c:forEach>
	 
	
</body>
</html>
