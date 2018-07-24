<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%@ page import = "board.BoardDBBean" %>
<%@ page import = "board.BoardDataBean" %>
<%@ page import = "java.text.SimpleDateFormat" %>
<%@ include file = "color.jsp" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>Post board</title>
</head>
<%
	int num = Integer.parseInt(request.getParameter("num"));
	String pageNum = request.getParameter("pageNum");
	int number = Integer.parseInt(request.getParameter("number"));
	
	SimpleDateFormat sdf = new SimpleDateFormat("yyyy-mm-dd HH:mm");
	
	try{
		BoardDBBean dbPro = BoardDBBean.getInstance();
		BoardDataBean article = dbPro.getArticle(num);
		
		int ref = article.getRef();
		int re_step = article.getRe_step();
		int re_level = article.getRe_level();
%>
<body bgcolor="<%=bodyback_c%>">
	<center>
		<b>�� ���� ����</b><br>
		<form>
			<table width = "555" border = "1" cellspacing="0" cellpadding="0" bgcolor="<%=bodyback_c%>" align="center">
				<tr bgcolor="30" align="center" width = "125">
					<td bgcolor="<%=value_c%>">�� ��ȣ </td>
					<td><%=number%></td>
					<td bgcolor="<%=value_c%>">��ȸ��</td>
					<td width ="180"><%=article.getReadcount()%></td>
				</tr>
				<tr height="30" align="center" width ="125">
					<td bgcolor="<%=value_c%>">�ۼ���</td>
					<td><%=article.getWriter()%></td>
					<td bgcolor="<%=value_c%>">�ۼ���</td>
					<td width ="180"><%=sdf.format(article.getReg_date())%></td>
				</tr>
				<tr height="30">
					<td align="center" width="125" bgcolor="<%=value_c%>">������ </td>
					<td align="left" colspan="3">&nbsp;<%=article.getSubject() %>
				</tr>		
				<tr>
					<td align="center" width="125" bgcolor="<%=value_c%>">�۳���</td>
					<td align="left" colspan="3">
						<pre><%=article.getContent()%></pre>
				</tr>
				<tr>
					<td colspan="4" bgcolor="<%=value_c %>" align="center">
						<input type="button" value="�ۼ���" onclick="document.location.href='updateForm.jsp?num=<%=article.getNum()%>&pageNum=<%=pageNum%>'">
						&nbsp;&nbsp;
						<input type = "button" value="�ۻ���" onclick="document.location.href='deleteForm.jsp?num=<%=article.getNum()%>&pageNum=<%=pageNum%>'">
						&nbsp;&nbsp;
						<input type = "button" value="��۾���" onclick="document.location.href='writeForm.jsp?num=<%=num%>&ref=<%=ref%>&re_step=<%=re_step%>&re_level=<%=re_level%>'">
						&nbsp;&nbsp;
						<input type = "button" value="�۸��" onclick="document.location.href='list.jsp?pageNum=<%=pageNum%>'">
				</tr>
			</table>
		</form>
	</center>
</body>
<%
	}catch(Exception e){
		
	}
 %>

</html>