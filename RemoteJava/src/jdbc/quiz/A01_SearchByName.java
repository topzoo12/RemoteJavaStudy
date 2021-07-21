package jdbc.quiz;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class A01_SearchByName {
	
	/*
	 	# ����ڷκ��� ���ڿ��� �Է¹����� �ش� ���ڿ��� �̸��� ���Ե� 
	 	  ��� ����� ��ȸ�غ�����. 
	  
	 */

	public static void main(String[] args) {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("����̹� �̸� Ʋ��");
			System.out.println("�ش� ���̺귯���� ã�� �� ����");
		}
		
		// ============================================================================================================
		// ============================================================================================================
		
		// 2. DriverManager Ŭ������ ���� DB�� �����Ѵ�.
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521/XEPDB1", "hr", "1234");
			
			String name = "";
			
			Scanner sc = new Scanner(System.in);
			System.out.println("ã�� ����� �̸��� �Է����ּ���");
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
			System.out.println("getConnection �ϴٰ� ���� ����");
		}
		
		System.out.println("main ��");
	}
	
	
	
}












