package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class A04_SQlInjection {
	
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
	
	// coffee 테이블에 SQL Injection 공격을 성공시켜보세요.
	// (일부러 ?를 사용하지 않아야 함)
	
	// 프로그램의 원래 동작은 원하는 가격대의 커피를 검색하는 기능입니다.
	
	public static void main(String[] args) {

		String exploit = "DELETE FROM coffee1";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("얼마 이상의 커피를 검색하시겠습니까.");
		String max_price = sc.nextLine(); 
		
//		max_price += exploit;
		
		String sql = "SELECT * FROM coffee1 WHERE price >= " + max_price;
		String sql_del = "DELETE FROM coffee1 WHERE price >= " + max_price;
		
//		System.out.println(sql);
//		sql = "SELECT * FROM coffee1 WHERE price >= 100; DELETE FROM coffee1;";
		try (
			Connection conn = DriverManager.getConnection(url, user, password);
			PreparedStatement pstmt = conn.prepareStatement(sql_del);
		){
			try (
				ResultSet rs = pstmt.executeQuery();
			){
				pstmt.executeUpdate();
//				while (rs.next()) {
//					System.out.print(rs.getInt("id") + "\t\t");
//					System.out.print(rs.getString("name") + "\t\t");
//					System.out.print(rs.getInt("price") + "\n");
//				}
				pstmt.close();
				rs.close();
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
}
