package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A04_PrepareStatement {
	
	private static String driverName = "oracle.jdbc.driver.OracleDriver";
	private static String url = "jdbc:oracle:thin:@localhost:1521/XEPDB1";
	private static String user = "hr";
	private static String password = "1234";
	
	static {
		try {
			Class.forName(driverName);
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	
	
	public static void main(String[] args) {
		
		// ����� �������� �غ��� �� ������ ���� �ڸ����� ?�� �̿��Ѵ�.
//		String exploit = "a'; DELETE FROM employees; --";
		
		String user_input = "le";
		
		String keyword1 = String.format("%%%s%%", user_input.toLowerCase());
		
//		String sql = "SELECT * FROM employees WHERE first_name = '%" + keyword + "%'";
		// ? �� ���� SQL Injection�� ����� �� �ִ�.
		String sql = "SELECT * FROM employees WHERE lower(first_name) LIKE ?";
		
		try (
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = conn.prepareStatement(sql);
		){
			// pstmt�� ? �� ä���.
			pstmt.setString(1, keyword1);
			
			try (
				ResultSet rs = pstmt.executeQuery();
			){
				while (rs.next()) {
					System.out.printf("%-6d%-14s%-20s\n",
							rs.getInt("employee_id"),
							rs.getString("first_name"),
							rs.getString("job_id"));
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}

}














