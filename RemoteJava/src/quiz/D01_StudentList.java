package quiz;

import java.util.ArrayList;

import myobj.Student;

public class D01_StudentList {

	/*
	
		�л� Ŭ��������ҷ� ���� ArrayList�� �����ϰ� �л��� 30�� �߰��غ����� 
		
		1. �� �л��� ������ �������� ����
		
		2. ������ ��/��/��
		
		3. 30���� ��� ������ ���
		
		4. 30�� �� ���� ������ ���� �л��� ������ ��� 
	
	*/
	
	public static void main(String[] args) {
		/*
		//Students d = new Students();
		//d.getName();
		
		ArrayList<Students> std = new ArrayList<>();
		//System.out.println(std);
		
		for (int i = 0; i < 30; i++) {
			std.add(new Students());
		}
			
		int sum = 0;
		double best = std.get(0).getSum();
		
		for (int i = 0; i < std.size(); i++) {
			sum += std.get(i).getSum()/3;
		}
		
		for (int i = 1; i < std.size(); i++) {
			if (std.get(i).getAverage() > std.get(i-1).getAverage()) {
				best = std.get(i).getAverage();
			}
		}
		
		System.out.println("��� : " + (sum/std.size()));
		System.out.println("�ְ� ���� : " + best);
		*/
		
		ArrayList<Student> student_list = new ArrayList<>();
		
		for (int i = 0; i < 30; i++) {
			student_list.add(new Student());
		}
		
		for (Student student : student_list) {
			System.out.println(student);
		}
		
		System.out.println("���� ���� ���� : " + Student.best_avg);
		System.out.println("���� ���� ������ �л��� �й� : " + Student.best_avg_snum);
	}

	
	
}














