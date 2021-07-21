package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class A01_JdbcConnection {

	/*
	
		# JDBC
		  - Java Database Connectivity. �ڹ� �����ͺ��̽� ����
		  - DB�� �������� �����Ͽ� �����ϰ� ����� �޾ƿ��� Java API
		  - �پ��� ������ DB�� ����� �� �ֵ��� ����Ǿ� �ִ�.
		  - Java�� �ҽ��ڵ�� � DB�� �����ϴ��� �׻� �����ϴ�.
		  - DB�� ������ �ʿ��� JDBC���� �䱸�ϴ� ���¿� ���缭 �ڹٿ��� ������
		    �����ϱ� ������ �ڹ� ���α׷��ӵ��� ���ο� DB�� ���� ����� �� �ִ�. 
		  - 
		  
		# OJDBC
		  - ����Ŭ �����ͺ��̽��� JDBC API�� �����ϱ� ���� ���� ���̺귯��
		  - ����Ŭ DB�� ��ġ�� ���� ���ο� ���ԵǾ� �ִ�.
		  - 
		  
	*/
	public static void main(String[] args) {
		
		// 1. Class.forName���� jdbc ����̹��� �ε��Ѵ�.
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
			
			/*
				3. ������ ������ ��ü�� �����ϰ��� �ϴ� �������� �Ǿ���´�
			  	  �� �������� ;�� ������ ������� �ʴ´�.
			
		 	*/
			String sql = "SELECT employee_id, last_name, salary, department_name "
					+ "FROM employees INNER JOIN departments USING(department_id)"
					+ " ORDER BY employee_id ASC";
			
			//PreparedStatement pstmt = conn.prepareStatement("select * from employees");
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			/* 
				4. �غ��س��� �������� �����Ѵ�.
				   SELECT���� executeQuery() �޼��带 ����ؾ� �ϰ� 
				   INSERT, UPDATE, DELETE�� executeUpdate() �޼��带 ����ؾ� �Ѵ�.
			
			*/
			
			ResultSet rs = pstmt.executeQuery();
			
			// 5. �޾ƿ� ���� ����� ����Ѵ�.
			while (rs.next()) {
				System.out.printf("%-10d\t %-10s \t %-8d %s\n", 
						rs.getInt("employee_id"), 
						rs.getString("last_name"), 
						rs.getInt("salary"),
						rs.getString("department_name"));
			}
			
			// 6. �� ����� ������ ���߿� �� ������� �ݾ��ش�
			rs.close();
			pstmt.close();
			conn.close();
			
		} catch (SQLException e) {
			System.out.println("getConnection �ϴٰ� ���� ����");
		}
		
		System.out.println("main ��");
		
		
	}
	
	
}






















