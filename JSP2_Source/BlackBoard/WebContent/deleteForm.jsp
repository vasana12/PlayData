<%@page import="sun.awt.image.PixelConverter.Bgrx"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
 <%@ include file = "color.jsp" %>
 
 <%
 	int num = Integer.parseInt(request.getParameter("num"));
 	String pageNum = request.getParameter("pageNum");
 %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Post board</title>
<script language="javascript">
	/* function deleteSave() {
		if(document.delForm.passwd.valuee==""){
			alert("��й�ȣ�Է�");
			document.delForm.passwd.focus();
			return true;
		}
	} */
</script>
</head>
<body bgcolor="<%=bodyback_c%>">
	<center>
		<b>�ۻ���</b><br>
		<form method="post" name = "delForm" action="deletePro.jsp?pageNum=<%=pageNum %>" onsubmit="return deleteSave()">
			<table>
				<tr height="30">
					<td align="center" bgcolor="<%=value_c %>">
					<b>��й�ȣ �Է�.</b>
					</td>
				</tr>
				<tr height="30">
					<td align="center">��й�ȣ :
					<input type = "password" name = "passwd" size ="8" maxlength="12">
					<input type = "hidden" name = "num" value="<%=num%>">
					</td>
				</tr>
				<tr height="30">
               		<td align="center" bgcolor="<%=value_c%>">
               		   <input type="submit" value="�ۻ���">
                  	   <input type="button" value="�۸��" onclick="document.Location.href='list.jsp?pageNum=<%=pageNum%>'">
               		</td>
               </tr>
			</table>
 	</center>
</body>
</html>