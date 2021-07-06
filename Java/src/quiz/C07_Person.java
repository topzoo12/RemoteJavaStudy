package quiz;

abstract public class C07_Person {

	String name;
	String class_name;
	String subject;
	int score;
	int people_Number;
	
	C07_ProgramingClass[] p_list = new C07_ProgramingClass[29];
	C07_MachineRunningClass[] m_list = new C07_MachineRunningClass[29];
	
	C07_Person(String name, int score, int people_Number, String class_name, String subject) {
		this.name = name;
		this.score = score;
		this.subject = subject;
		this.class_name = class_name;
	}
	
	void report() {
		System.out.println(" 학생 '" + name + "'씨의" + subject + "과목의 점수는 '" + score + "'점 입니다.");
	}
	
}












