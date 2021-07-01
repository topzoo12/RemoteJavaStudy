package quiz;

import myobj.school.MachineRunningStudent;
import myobj.school.NetworkStudent;
import myobj.school.ProgrammingStudent;
import myobj.school.Student;

public class C07_School {
	
	/* 
	 	1. �� ���� ������ 30���̴�.
	 	
	 	2-1. ���α׷��� �� �л����� ������ ����, ���α׷��� ���, �˰���, �ڷᱸ�� ������ �ִ�.
	 	
	 	2-2. ��Ʈ��ũ �� �л����� ������ ������, ��Ʈ��ũ, CCNA ������ �ִ�.
	 	
	 	2-3. �ӽŷ��� �� �л����� ������ ����, �����, ���α׷��� ��� ������ �ִ�.
	 	
	 	3. ��� �л��� ���� ������ �̸��� �������� �����Ѵ�.
	 	   �й��� �ߺ����� ���������� �����Ǿ�� �Ѵ�. (�Ǵ� �ߺ����� ������ ����)
	 	
	 	4. �� �л��� ����ǥ �޼��带 ���� �� �л��� �̸�/����/��������� �� �� �־�� �Ѵ�.
	 
	 */
	

	/*
	=======================================================================================
	//	 String name, int score,int people_Number, String class_name
	public static void main(String[] args) {
		
		C07_ProgramingClass p = new C07_ProgramingClass();
		p.math();
		
		// C07_Students s = new C07_Students("dddme", 23, 32342, "����");
		// s.report();
	}
	=======================================================================================
	*/
	public static void main(String[] args) {
		//ProgrammingStudent pro = new ProgrammingStudent();
		//NetworkStudent net = new NetworkStudent();
		//MachineRunningStudent machin = new MachineRunningStudent();
		
		// System.out.println(pro.getName());
		
		Student[] programming = new Student[29];
		Student[] network = new Student[29];
		Student[] mach = new Student[29];
		
		for (int i = 0; i < programming.length; i++) {
			programming[i] = new ProgrammingStudent();
			programming[i].printGradeCard();
		}
		
		System.out.println("======================================================================");
		System.out.println("======================================================================");
		System.out.println("======================================================================");
		
		for (int i = 0; i < network.length; i++) {
			network[i] = new NetworkStudent();
			network[i].printGradeCard();
		}
		
		System.out.println("======================================================================");
		System.out.println("======================================================================");
		System.out.println("======================================================================");
		
		for (int i = 0; i < mach.length; i++) {
			mach[i] = new MachineRunningStudent();
			mach[i].printGradeCard();
		}
		/*
		for (int i = 0; i < school.length; i++) {
			System.out.println(school[i]);
		}*/
		//pro.printGradeCard();
		
	}
	
	

}














