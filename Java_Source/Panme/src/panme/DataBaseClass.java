package panme;

import java.io.BufferedReader;
import java.io.InputStreamReader;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

import oracle.jdbc.OracleTypes;

public class DataBaseClass {
	
	private String driver = "oracle.jdbc.driver.OracleDriver";
	private String url = "jdbc:oracle:thin:@127.0.0.1:1521:orcl";
	private Connection con = null;
	private CallableStatement cstmt = null;
	private BufferedReader br =null;
	private ResultSet rs =null;
	
	private String code, name; 
	private int num, cost;
	
	public void insert() {
		try {
			br = new BufferedReader(new InputStreamReader (System.in));
			System.out.println("테이블 데이터 삽입");
		
			System.out.println("제품 코드 입력 : ");
			code = br.readLine();
			System.out.println("제품 이름 입력 : ");
			name = br.readLine();
			System.out.println("제품 수량 입력 : ");
			num = Integer.parseInt(br.readLine());
			System.out.println("제품 가격 입력 : ");
			cost = Integer.parseInt(br.readLine());
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, "SCOTT", "123456");
			
			cstmt = con.prepareCall("{call call_insert(?,?,?,?)}");
			cstmt.setString(1, code);
			cstmt.setString(2, name);
			cstmt.setInt(3, num);
			cstmt.setInt(4, cost);
	
			cstmt.executeUpdate();
			System.out.println("데이터베이스 연결성공!");
			
			}catch(Exception e) {
				System.out.println("데이터 베이스 연결 실패 = "+ e.getMessage());
			}
		
			finally {
				try{
					if(con != null) con.close();
					if(cstmt != null) cstmt.close();
				}
				catch(Exception e) {
					System.out.println(e.getMessage());
				}
			}
	}
	public void delete() {
		try {
			br = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Member 테이블 값 삭제하기.....");
			System.out.println("제품 코드 입력 : ");
			code = br.readLine();
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, "scott", "123456");
			cstmt = con.prepareCall("{call call_delete(?)}");
			cstmt.setString(1, code);
			cstmt.executeUpdate();
			
			
		}catch(Exception e) {
			System.out.println("데이터 베이스 연결 실패 " + e.getMessage());
		}
		finally {
			try {
				if(cstmt != null) cstmt.close();
				if(con != null) con.close();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}

		
	}
	public void update() {
		try {
			br = new BufferedReader (new InputStreamReader(System.in));
			System.out.println("Memeber 테이블에 값 갱신하기 .....");
			
			System.out.println("갱신할 제품 코드 입력");
			code = br.readLine();
			System.out.println("갱신할 제품 이름 입력 : ");
			name = br.readLine();
			System.out.println("갱신할 제품 수량 입력 : ");
			num = Integer.parseInt(br.readLine());
			System.out.println("갱신할 제품 가격 입력 : ");
			cost = Integer.parseInt(br.readLine());
			
			Class.forName(driver);
			con = DriverManager.getConnection(url, "SCOTT", "123456");
			cstmt = con.prepareCall("{call call_update(?,?,?)}");
			cstmt.setString(1,name);
			cstmt.setInt(2,num);
			cstmt.setInt(3,cost);
			cstmt.executeUpdate();

			System.out.println("데이터 베이스 내용 갱신 성공!");
			
		}catch( Exception e) {
			System.out.println("데이터베이스 연결 실패!" + e.getMessage());
		}
		finally {
			try {
				if(cstmt != null) cstmt.close();
				if(con != null) con.close();
			}
			catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
		
	}
	public void selectAll() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "SCOTT", "123456");
			
			cstmt = con.prepareCall("{call call_select(?)}");
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			cstmt.executeQuery();
			
			rs = (ResultSet)cstmt.getObject(1);
			
			System.out.println("code\tname\tnum\tcost\ttotal");
			System.out.println("--------------------------------------");
			while(rs.next()) {
				System.out.println(rs.getString("code") + "\t");
				System.out.println(rs.getString("name") + "\t");
				System.out.println(rs.getString("num") + "\t");
				System.out.println(rs.getString("cost") + "\t");
				System.out.println(rs.getString("tot") + "\n");
			}
		}catch(Exception e) {
			System.out.println("데이터베이스 연결 실패!");
			e.printStackTrace();
		}
		finally {
			try {
				if(con != null) con.close();
				if( cstmt != null) cstmt.close();
				if(rs != null)rs.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public void select() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, "SCOTT", "123456");
			
			cstmt = con.prepareCall("{call call_select(?)}");
			cstmt.registerOutParameter(1, OracleTypes.CURSOR);
			cstmt.executeQuery();
			
			rs = (ResultSet)cstmt.getObject(1);
			
			System.out.println("code\tname\tnum\tcost\ttotal");
			System.out.println("--------------------------------------");
			while(rs.next()) {
				System.out.println(rs.getString("code") + "\t");
				System.out.println(rs.getString("name") + "\t");
				System.out.println(rs.getString("num") + "\t");
				System.out.println(rs.getString("cost") + "\t");
				System.out.println(rs.getString("tot") + "\n");
			}
		}catch(Exception e) {
			System.out.println("데이터베이스 연결 실패!");
			e.printStackTrace();
		}
		finally {
			try {
				if(con != null) con.close();
				if( cstmt != null) cstmt.close();
				if(rs != null)rs.close();
			}catch(Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}

}
