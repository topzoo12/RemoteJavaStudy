package jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

public class A05_Metadata {
	
	public static void main(String[] args) {
		/*
			 SELECT������ ������ REsultSet���� ResultSetmetaData�� ���� �� �ְ�
			 ResultSetMetaData Ŭ������ ������ �����͵��� ��Ÿ�����͸� �� �� �ִ�.	
		*/
		
		String sql1 = "SELECT * FROM employees";
		String sql2 = "SELECT * FROM coffee";
		
		try (
			Connection conn = DBConnector.getConnection();
			PreparedStatement pstmt1 = conn.prepareStatement(sql1);
			PreparedStatement pstmt2 = conn.prepareStatement(sql2);
			ResultSet rs1 = pstmt1.executeQuery();
			ResultSet rs2 = pstmt2.executeQuery();
		){
			ResultSetMetaData meta1 = rs1.getMetaData();
			
			System.out.println("Employees ���̺��� ����");
			System.out.println("�÷��� ���� : " + meta1.getColumnCount());
			
			int MAX_COLUMN = meta1.getColumnCount();
			
			for (int col = 1; col <= MAX_COLUMN; col++) {
				System.out.printf("%-20s%-14s%-25s\n", 
							meta1.getColumnName(col), 
							meta1.getColumnTypeName(col), 
							meta1.getColumnClassName(col)
						);
			}
			
			System.out.println("==========================================================================================");
			
			// ==========================================================================================
			// ==========================================================================================
			
			ResultSetMetaData meta2 = rs2.getMetaData();
			
			System.out.println("coffee ���̺��� ����");
			System.out.println("�÷��� ���� : " + meta2.getColumnCount());
			
			int MAX_COLUMN2 = meta2.getColumnCount();
			
			for (int col = 1; col <= MAX_COLUMN2; col++) {
				System.out.printf("%-20s%-14s%-25s\n", 
							meta2.getColumnName(col), 
							meta2.getColumnTypeName(col), 
							meta2.getColumnClassName(col)
						);
			}			
		} catch (SQLException e) {
			e.printStackTrace();
		}
		
		
	}
	
}

























