package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A01_JdbcConnection {

	/*
	
		# JDBC
		  - Java Database Connectivity. 자바 데이터베이스 연결
		  - DB에 쿼리문을 전달하여 실행하고 결과를 받아오는 Java API
		  - 다양한 종류의 DB와 연결될 수 있도록 설계되어 있다.
		  - Java쪽 소스코드는 어떤 DB와 연결하더라도 항상 일정하다.
		  - DB를 제작한 쪽에서 JDBC에서 요구하는 형태에 맞춰서 자바와의 연결을
		    구현하기 때문에 자바 프로그래머들은 새로운 DB도 쉽게 사용할 수 있다. 
		  - 
		  
		# OJDBC
		  - 오라클 데이터베이스가 JDBC API와 소통하기 위해 만든 라이브러리
		  - 오라클 DB가 설치된 폴더 내부에 포함되어 있다.
		  - 
		  
	*/
	public static void main(String[] args) {
		
		// 1. Class.forName으로 jdbc 드라이버를 로드한다.
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 이름 틀림");
			System.out.println("해당 라이브러리를 찾을 수 없음");
		}
		
		// ============================================================================================================
		// ============================================================================================================
		
		// 2. DriverManager 클래스를 통해 DB에 연결한다.
		try {
//			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "1234");
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@database-1.cxc98ia1oha4.us-east-2.rds.amazonaws.com:1521/ORCL", "cafe", "!!22Qorthdud");

			String sql = "select * from coffee";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			System.out.println("ID\tNAME\t\tPRICE");
			System.out.println("=====================");
			while (rs.next()) {
				System.out.print(rs.getInt("ID") + "\t");
				System.out.print(rs.getString("NAME") + "\t\t");
				System.out.print(rs.getInt("PRICE"));
				System.out.println();
			}
			
			// 6. 다 사용한 연결을 나중에 연 순서대로 닫아준다
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("getConnection 하다가 문제 생김");
		}
		
//		System.out.println("main 끝");
		
		
	}
	
	
}






















