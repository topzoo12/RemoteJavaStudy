package quiz;

import myobj.school.MachineRunningStudent;
import myobj.school.NetworkStudent;
import myobj.school.ProgrammingStudent;
import myobj.school.Student;

public class C07_School {
	
	/* 
	 	1. 각 반의 정원은 30명이다.
	 	
	 	2-1. 프로그래밍 반 학생들은 각자의 수학, 프로그래밍 언어, 알고리즘, 자료구조 점수가 있다.
	 	
	 	2-2. 네트워크 반 학생들은 각자의 리눅스, 네트워크, CCNA 점수가 있다.
	 	
	 	2-3. 머신러닝 반 학생들은 각자의 수학, 통계학, 프로그래밍 언어 점수가 있다.
	 	
	 	3. 모든 학생의 과목별 점수와 이름을 랜덤으로 생성한다.
	 	   학번은 중복업이 순차적으로 생성되어야 한다. (또는 중복없이 랜덤도 가능)
	 	
	 	4. 각 학생의 성적표 메서드를 통해 각 학생의 이름/총점/평균점수를 볼 수 있어야 한다.
	 
	 */
	

	/*
	=======================================================================================
	//	 String name, int score,int people_Number, String class_name
	public static void main(String[] args) {
		
		C07_ProgramingClass p = new C07_ProgramingClass();
		p.math();
		
		// C07_Students s = new C07_Students("dddme", 23, 32342, "과목");
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














