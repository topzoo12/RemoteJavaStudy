package jdbc.model;

public class EMP_DEP_JOIN {
	
	private int employee_id;
	private String last_name;
	private int salary;
	private int department_id;
	private String department_name;
	
	public EMP_DEP_JOIN(int employee_id, String last_name, int salary, int department_id, String department_name) {
		this.employee_id = employee_id;
		this.last_name = last_name;
		this.salary = salary;		
		this.department_id = department_id;
		this.department_name = department_name;
	}
	
	public int getDepartment_id() {
		return department_id;
	}
	
	public String getDepartment_name() {
		return department_name;
	}
	
	public int getEmployee_id() {
		return employee_id;
	}
	
	public String getLast_name() {
		return last_name;
	}
	
	public int getSalary() {
		return salary;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
