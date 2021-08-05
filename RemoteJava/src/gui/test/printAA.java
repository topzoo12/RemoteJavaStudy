import java.awt.Container;
import java.awt.Dimension;
import java.awt.Font;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import baseSettings.PosFrame;

public class printAA extends PosFrame {
	

	public printAA() {
		
		Container con = getContentPane();
		String c1 = "메뉴", c2 = "타입", c3 = "가격";
		
		String[] columnNames = {c1, c2, c3};
		
		ArrayList<String> name = new ArrayList<>();
		ArrayList<Integer> id = new ArrayList<>();
		ArrayList<String> type = new ArrayList<>();
		ArrayList<Integer> price = new ArrayList<>();
		ArrayList<ArrayList<String>> datas = new ArrayList<>();
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 이름 틀림");
			System.out.println("해당 라이브러리를 찾을 수 없음");
		}
		
		
		try {
			Connection conn = DriverManager.getConnection("jdbc:oracle:thin:@database-1.cxc98ia1oha4.us-east-2.rds.amazonaws.com:1521/ORCL", "cafe", "!!22Qorthdud");

//			String sql = "select * from menu";
			String sql = "select * from coffee";
			
			PreparedStatement pstmt = conn.prepareStatement(sql);
			
			ResultSet rs = pstmt.executeQuery();
			
			int count = 0;
			
//			System.out.println("ID\tNAME\t\tPRICE");
//			System.out.println("=====================");
			
			while (rs.next()) {
//				name.add(rs.getString("MNAME"));
//				price.add(rs.getInt("PRICE"));
//				type.add(rs.getString("TYPE"));
				id.add(rs.getInt("id"));
				name.add(rs.getString("name"));
				price.add(rs.getInt("price"));
				
//				System.out.print(rs.getString("MNAME") + "\t");
//				System.out.print(rs.getInt("PRICE") + "\t\t");
//				System.out.print(rs.getString("Type"));
//				System.out.println();
				
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
		
//		String[][] data = {};
//		Container con = getContentPane();
//		System.out.println(name.get(5));
		
//		String[] columnNames = {"ID", "NAME", "JOB", "DEPT"};
//		String[][] data = {
//				{name.get(0).toString(), price.get(0).toString(), type.get(0).toString()},
//				{name.get(1).toString(), price.get(1).toString(), type.get(1).toString()},
//				{name.get(2).toString(), price.get(2).toString(), type.get(2).toString()},
//				{name.get(3).toString(), price.get(3).toString(), type.get(3).toString()},
//				{name.get(4).toString(), price.get(4).toString(), type.get(4).toString()},
//				{name.get(5).toString(), price.get(5).toString(), type.get(5).toString()},
//				{name.get(6).toString(), price.get(6).toString(), type.get(6).toString()},
//				{name.get(7).toString(), price.get(7).toString(), type.get(7).toString()},
//				{name.get(8).toString(), price.get(8).toString(), type.get(8).toString()},
//				{name.get(9).toString(), price.get(9).toString(), type.get(9).toString()},
//				{name.get(10).toString(), price.get(10).toString(), type.get(10).toString()},
//				{name.get(11).toString(), price.get(11).toString(), type.get(11).toString()}
//		};
		String[][] data = {
				{id.get(0).toString(), name.get(0), price.get(0).toString()},
				{id.get(1).toString(), name.get(1), price.get(1).toString()},
				{id.get(2).toString(), name.get(2), price.get(2).toString()},
				{id.get(3).toString(), name.get(3), price.get(3).toString()},
				{id.get(4).toString(), name.get(4), price.get(4).toString()},
				{id.get(5).toString(), name.get(5), price.get(5).toString()},
				{id.get(6).toString(), name.get(6), price.get(6).toString()},
				{id.get(7).toString(), name.get(7), price.get(7).toString()},
				{id.get(8).toString(), name.get(8), price.get(8).toString()},
				{id.get(9).toString(), name.get(9), price.get(9).toString()},
				{id.get(10).toString(), name.get(10), price.get(10).toString()},
				{id.get(11).toString(), name.get(11), price.get(11).toString()}
		};
		
//		String[][] data = {
//				{"1", "Smith", "IT_PROG", "IT"},
//				{"2", "Allen", "IT_PROG", "IT"},
//				{"3", "Ki", "IT_PROG", "IT"},
//				{"4", "Zoey", "IT_PROG", "IT"},
//				{"5", "Warren", "IT_PROG", "IT"},
//				{"6", "Smith", "IT_PROG", "IT"},
//				{"6", "Smith", "IT_PROG", "IT"},
//				{"6", "Smith", "IT_PROG", "IT"},
//				{"6", "Smith", "IT_PROG", "IT"}
//		};
		
		JTable table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		
		table.getTableHeader().setPreferredSize(new Dimension(scrollPane.getWidth(), 50));
		table.getTableHeader().setFont(new Font("Small Fonts", Font.BOLD, 22));
		
		table.setCellSelectionEnabled(rootPaneCheckingEnabled);
		table.setRowHeight(50);
//		table.setAlignmentY(JTable.BOTTOM_ALIGNMENT);
		table.setAlignmentY(JTable.TOP_ALIGNMENT);
//		table.setSize(500, 500);
		table.setShowGrid(true);
		table.setFont(new Font("Consolas", Font.PLAIN, 20));
		table.setRowSelectionAllowed(true);
		table.setColumnSelectionAllowed(true);
		
		
		add(scrollPane, "Center");
		add(new JLabel("Employees"), "North");
		
	}
	
	
	
	
	
	
	public static void main(String[] args) {
		printAA frame = new printAA();
		frame.setDefaultOptions();
	}
	
}







