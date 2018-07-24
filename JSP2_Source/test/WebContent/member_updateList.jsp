<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Insert title here</title>

<%
	String id=null;
	
	if ((session.getAttribute("id")==null) || 
	  (!((String)session.getAttribute("id")).equals("admin"))) {
		out.println("<script>");
		out.println("location.href='loginForm.jsp'");
		out.println("</script>");
	}
	
	Connection conn=null;
	PreparedStatement pstmt=null;
	ResultSet rs=null;
	
	id =(String)session.getAttribute("id");
	try {
			Context init = new InitialContext();
			DataSource ds = 
				(DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
			conn = ds.getConnection();
			
			pstmt=conn.prepareStatement("SELECT * FROM member where id = ?");
			pstmt.setString(1, id);
			rs=pstmt.executeQuery();
			rs.next();
	}catch(Exception e){
		e.printStackTrace();
	}

%>
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
<form name="member_updateList" action="member_update.jsp" method="post">
<table border=1>
	<tr>
		<td colspan="2" class = "td_title">
			ȸ������ ������
		</td>
	</tr>
	<tr>
		<td><label for = "id">���̵� :</label></td>
		<td> <%=rs.getString("id") %></td>
		<td><input type = "hidden" name ="id" value = <%=rs.getString("id") %> ></td>
	</tr>
	<tr>
		<td><label for = "pass">��й�ȣ : </label></td>
		<td><input type="password" name="pass" id = "pass" value = <%=rs.getString("password") %>></td>
	</tr>
	<tr>
		<td><label for = "name">�̸� : </label></td>
		<td><input type="text" name="name" id = "name" value = <%=rs.getString("name") %>></td>
	</tr>
	<tr>
		<td><label for = "age">���� : </label></td>
		<td><input type="text" name="age" id = "age" value = <%=rs.getInt("age") %>>
		</td>
	</tr>
	<tr>
		<td><label for = "gender1"></label>���� : </td>
		<td>
			<input type="radio" name="gender" value="male" checked id = "gender1">����
			<input type="radio" name="gender" value="female" id = "gender2"/>����
		</td>
	</tr>
	<tr>
		<td><label for = "email">�̸��� �ּ� : </label></td>
		<td><input type="text" name="email" id = "email" value = <%=rs.getString("email") %>></td>
	</tr>
	<tr>
		<td colspan="2">
			<a href="javascript:member_updateList.submit()">��������</a>&nbsp;&nbsp;
			<%	System.out.println("��������");  %>
			<a href="javascript:member_updateList.reset()">�ٽ��ۼ�</a>
		</td>
	</tr>
</table>
</form>
</body>
</html>