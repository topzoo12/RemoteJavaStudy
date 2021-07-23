package jdbc.quiz;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

import jdbc.DBConnector;
import jdbc.model.Department;
import jdbc.model.Employee;

public class A07_DataJoinModel_teacher {


	public static void main(String[] args) {
		
//			String sql = "SELECT * FROM employees INNER JOIN departments USING (department_id)";
			String sql = "select e.*, d.*, e.manager_id AS mid1, d.manager_id AS mid2 FROM employees e, departments d where e.department_id = d.department_id order by employee_id";
			
			ArrayList<Employee> employee_list = new ArrayList<>();
		
			try (
				Connection conn = DBConnector.getConnection();
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
			){
				
					ResultSetMetaData meta = rs.getMetaData();
					
					for (int i = 1, len = meta.getColumnCount(); i <= len; i++) {
						System.out.print(meta.getColumnLabel(i) + "\t\t");
						if (i % 5 == 0) {
							System.out.println();
						}
						
					}
				System.out.println();
				System.out.println("====================================================================================");
				System.out.println("====================================================================================");
				
				while (rs.next()) {
					employee_list.add(new Employee(
										rs.getInt("employee_id"),
										rs.getString("first_name"),
										rs.getString("last_name"),
										rs.getString("email"),
										rs.getString("phone_number"),
										rs.getDate("hire_date"),
										rs.getString("job_id"),
										rs.getDouble("salary"),
										rs.getDouble("commission_pct"),
										rs.getInt("mid1"),
										rs.getInt("e.department_id"),
										new Department(
												rs.getInt("d.department_id"),
												rs.getString("department_id"),
												rs.getInt("mid2"),
												rs.getInt("location_id")
												)
										
							));
				}
				
				
//				int i = 1;
//				while (rs.next()) {
//					System.out.print(i + "\t\t");
//					System.out.print(rs.getInt("employee_id")
//							+ " / " + rs.getString("last_name")
//							+ " / " + rs.getInt("salary") 
//							+ " / " + rs.getInt("department_id")
//							+ " / " + rs.getString("department_name")
//							);
//					System.out.println();
//					i++;
//				}
				
				
			} catch (SQLException e) {
				e.printStackTrace();
			}
		
		
		
		
	}

}













