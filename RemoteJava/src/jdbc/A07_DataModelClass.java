package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.model.Coffee;

public class A07_DataModelClass {

	public static void main(String[] args) {
		
		// DB���� ������ �����ʹ� ������ �� Ŭ������ �־� �δ� ���� ����.
		
		// A06_HikariCP�� ������ ���� ���� �� �ִ� 
		// getConnecion() �޼��带 ������ �� coffee ���̺��� ���� �ֿܼ� ��� ����غ�����
		String sql = "SELECT * FROM COFFEE";
		
		// ������ Ŭ������ ���׸����� Ȱ���� �پ��� �÷����� ���� �̿��� �� �ִ�.
		ArrayList<Coffee> list = new ArrayList<>();
		
		try (
			Connection conn = (Connection) A06_HikariCP.getConnection();
			PreparedStatement pstmt = conn.prepareStatement(sql);
			ResultSet rs = pstmt.executeQuery();
		) {
			
			ResultSetMetaData meta = rs.getMetaData();
			
			// 1. �켱 �÷� �̸����� ã�´�.
//			Class<?> coffee_class = Class.forName("jdbc.model.coffee");
//			
//			coffee_class.getMethod("setName").invoke(coffee_class, null);
			
			// 2. ������ Ŭ������ �÷� �̸��� ��ġ�ϴ� �ʵ忡 ���� ä�� �ִ´�.
			while (rs.next()) {
				list.add(new Coffee(rs.getInt("id"), rs.getString("name"), rs.getInt("price")));
				
			}
			
//			int COLOUMN_SIZR = meta.getColumnCount();
//			
//			while (rs.next()) {
//				for (int i = 1; i <= COLOUMN_SIZR; i++) {
//					System.out.printf("%-20s\t", rs.getObject(i));
//				}
//				System.out.println();
//			}
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		} 
		
	}
	
	
}















