<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>free board</title>
	<style>
		#list {
			font-family: "Trebuchet MS", Arial, Helvetica, sans-serif;
			border-collapse: collapse;
			width: 100%;
		}
		#list td, #list th {
			border: 1px solid #ddd;
			padding: 8px;
			text-align:center;
		}
		#list tr:nth-child(even){background-color: #f2f2f2;}
		#list tr:hover {background-color: #ddd;}
		#list th {
			padding-top: 12px;
			padding-bottom: 12px;
			text-align: center;
			background-color: cadetblue;
			color: white;
		}
	</style>
	<script>
		function delete_ok(id){
			var a = confirm("정말로 삭제하겠습니까?");
			if(a) location.href='deleteok/' + id;
		}
	</script>
</head>
<body>
<h1>당신의 계획을 한 눈에</h1>
<table id="list" width="90%">
	<tr>
		<th>Id</th>
		<th>Category</th>
		<th>ProFessor</th>
		<th>Grade(P/F)</th>
		<th>Major</th>
		<th>Place</th>
		<th>Content</th>
		<th>Regdate</th>
		<th>Duedate</th>
		<th>Edit</th>
		<th>Delete</th>
	</tr>

	<c:forEach items = "${list}" var="u">
		<tr>
			<td>${u.seq}</td>
			<td>${u.category}</td>
			<td>${u.professor}</td>
			<td>${u.grade}</td>
			<td>${u.major}</td>
			<td>${u.place}</td>
			<td>${u.content}</td>
			<td>${u.regdate}</td>
			<td>${u.duedate}</td>
			<td><a href="editform/${u.seq}">Edit</a></td>
			<td><a href="javascript:delete_ok('${u.seq}')">Delete</a></td>
		</tr>
	</c:forEach>
</table>
<br/><button type="button" onclick="location.href='add'"> Add New Post </button>
</body>
</html>