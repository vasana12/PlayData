<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">

<html>
<head>
<title>ȸ������ �ý��� �α��� ������</title>
<style>
	table{
		margin : auto;
		width : 400px;
		border : 1px solid gray;
		text-align: center;
	}
	.td_title{
		font-weight: bold;
		font-size: x-large;
	}
</style>
</head>
<body>
<form name="loginform" action="loginProcess.jsp" method="post">
<table>
	<tr>
		<td colspan="2" class = "td_title">
			�α��� ������
		</td>
	</tr>
	<tr>
		<td><label for = "id">���̵� : </label></td>
		<td><input type="text" name="id" id = "id"/></td>
	</tr>
	<tr>
		<td><label for = "pass">��й�ȣ : </label></td>
		<td><input type="password" name="pass" id = "pass"/></td>
	</tr>
	<tr>
		<td colspan="2">
			<a href="javascript:loginform.submit()">�α���</a>&nbsp;&nbsp;
			<a href="joinForm.jsp">ȸ������</a>
		</td>
	</tr>
</table>
</form>
</body>
</html>
