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
	
	// coffee ���̺� SQL Injection ������ �������Ѻ�����.
	// (�Ϻη� ?�� ������� �ʾƾ� ��)
	
	// ���α׷��� ���� ������ ���ϴ� ���ݴ��� Ŀ�Ǹ� �˻��ϴ� ����Դϴ�.
	
	public static void main(String[] args) {

		String exploit = "DELETE FROM coffee1";
		
		Scanner sc = new Scanner(System.in);
		System.out.println("�� �̻��� Ŀ�Ǹ� �˻��Ͻðڽ��ϱ�.");
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
