package quiz;

public class C07_Students {
	
	String name;
	String class_name;
	int score;
	int people_Number;
	
	public C07_Students(String name, int score,int people_Number, String class_name) {
		this.name = name;
		this.score = score;
		this.class_name = class_name;
		this.people_Number = people_Number;
	}
	
	final public void report() {
		System.out.print(class_name + "반 ");
		System.out.print(name + " 학생의 ");
	}
	
}
