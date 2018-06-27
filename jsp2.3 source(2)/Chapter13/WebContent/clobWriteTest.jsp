<%@ page language="java" contentType="text/html; charset=UTF-8"%>
<%@ page import="java.sql.*"%>
<%@ page import="javax.sql.*" %>
<%@ page import="javax.naming.*" %>
<%
 	Connection conn = null; 
 	PreparedStatement pstmt = null;
	StringBuffer sb=null;
	try {
  		Context init = new InitialContext();
  		DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/OracleDB");
  		conn = ds.getConnection();
	    String sql="INSERT INTO clobtable (num,content) VALUES (1,?)";	    
		sb=new StringBuffer();
		
		for(int i=0;i<10000;i++){
			sb.append("홍길동");
		}
		pstmt=conn.prepareStatement(sql);
		pstmt.setString(1, sb.toString());
  		pstmt.executeUpdate();
  	  	out.println("데이타를 저장했습니다.");
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		try{
			pstmt.close();
			conn.close();
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
%>
