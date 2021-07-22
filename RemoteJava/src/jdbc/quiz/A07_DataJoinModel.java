package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.DBConnector;
import jdbc.model.Coffee;
import jdbc.model.EMP_DEP_JOIN;

public class A07_DataJoinModel {
	
	/*
		employees와 departments를 조인하여 조회한 결과를 알맞은 모델에 담아보세요.
	*/
	
	public static void main(String[] args){
		
		ArrayList<EMP_DEP_JOIN> list = new ArrayList<>();
		
//		String sql = "select employee_id, last_name, salary, department_name FROM employees inner join departments using (department_id)";
		String sql1 = "select * FROM employees a, departments b where a.department_id = b.department_id order by employee_id";
	
		try (
				Connection conn = DBConnector.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql1);
				ResultSet rs = pstmt.executeQuery();
			){
			ResultSetMetaData meta = rs.getMetaData();
			int i = 1;
			while (rs.next()) {
				System.out.print(i + "\t\t");
				System.out.print(rs.getInt("employee_id")
						+ " / " + rs.getString("last_name")
						+ " / " + rs.getInt("salary") 
//						+ " / " + rs.getInt("department_id")
						+ " / " + rs.getString("department_name")
						);
				System.out.println();
				i++;
			};
	
//			while (rs.next()) {
//				list.add(new EMP_DEP_JOIN(
//						rs.getInt("employee_id"), 
//						rs.getString("last_name"), 
//						rs.getInt("salary"), 
//						rs.getInt("department_id"), 
//						rs.getString("department_name"))
//					);
//		}
				
	
	} catch (SQLException e) {
		e.printStackTrace();
	}
	}
}
















