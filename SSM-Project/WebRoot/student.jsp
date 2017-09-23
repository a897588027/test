<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<c:if test="${lsct == null || lsst == null}">
	<c:redirect url="doinit"></c:redirect>
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
	function del(value) {
		var msg = window.confirm("是否真的删除");
		if (msg) {
			window.location.href = "del_ById?index=" + value;
		}
	}
</script>

</head>

<body>
	<!-- *************************学生***************************** -->
	<div style="width: 100%;height: 100%;" align="center">
		<h1 align="center">学生管理</h1>
		<!-- *****************新增************************ -->
		<form action="save_Student" method="post">
			学生姓名:<input name="stuname" /><br /> 学生爱好:<input name="stuhobby" /><br />
			学生班级:<select id="ct.cid" name="ct.cid">
				<c:forEach items="${lsct }" var="ss">
					<option value="${ss.cid }">${ss.cname }</option>
				</c:forEach>
			</select> <br /> <br /> <input type="submit" value="新增" />

		</form>
		<hr/>

		<!-- *****************查询*********************** -->
		<table border="1" align="center" width="400px" align="center">
			<tr>
				<td>编号</td>
				<td>姓名</td>
				<td>爱好</td>
				<td>班级</td>
				<td>操作</td>
			</tr>

			<c:forEach items="${lsst }" var="stu">
				<tr>
					<td>${stu.stuid }</td>
					<td>${stu.stuname }</td>
					<td>${stu.stuhobby }</td>
					<td>${stu.ct.cname }</td>
					<td><a href="del_ById?index=${stu.stuid }">删除</a><a
						href="findById?index=${stu.stuid }">修改</a></td>
				</tr>
			</c:forEach>
		</table>
		<br /> <br />
		<hr/>
		<!-- *****************修改************************ -->
		<form action="update" method="post">
			<input name="stuid" value="${oldStu.stuid }" type="hidden" /> 学生姓名:<input
				name="stuname" value="${oldStu.stuname }" /><br /> 学生爱好:<input
				name="stuhobby" value="${oldStu.stuhobby }" /><br /> 学生班级:<select
				id="ct.cid" name="ct.cid">
				<c:forEach items="${lsct }" var="ss">
					<option value="${ss.cid }">${ss.cname }</option>
				</c:forEach>
			</select> <br /> <br /> <input type="submit" value="修改" />

		</form>




	</div>



</body>
</html>
