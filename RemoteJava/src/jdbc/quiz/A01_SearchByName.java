package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class A01_SearchByName {
	
	/*
	 	# 사용자로부터 문자열을 입력받으면 해당 문자열이 이름에 포함된 
	 	  모든 사원을 조회해보세요. 
	  
	 */

	public static void main(String[] args) {
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
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "1234");
			
			String name = "";
			
			Scanner sc = new Scanner(System.in);
			System.out.println("찾을 사람의 이름을 입력해주세요");
			name = sc.nextLine(); 
			name = name.toUpperCase();
			
			String sql = "SELECT * FROM employees where upper(first_name) like '%" + name + "%'";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			System.out.println("First_name\tLast_name");
			System.out.println("===================================");
			while (rs.next()) {
				System.out.print(rs.getString("first_name"));
				System.out.print("\t\t");
				System.out.print(rs.getString("last_name"));
				System.out.println();
			}

			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("getConnection 하다가 문제 생김");
		}
		
		System.out.println("main 끝");
	}
	
	
	
}












