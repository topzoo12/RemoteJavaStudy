package myobj.school;

public class ProgrammingStudent extends Student {
	
	// 수학, 프로그래밍 언어, 알고리즘, 자료구조 점수
	
	int math;
	int pl;
	int al;
	int ds;
	
	public ProgrammingStudent() {
		super();	// 생략가능
		math = generateRandomScore();
		pl = generateRandomScore();
		al = generateRandomScore();
		ds = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + math + pl + al + ds); 
	}
	
	double getAverage() {
		return getSum() / 6.0;
		//return (kor + eng + math + pl + al + ds) / 6.0;
	}
	
	@Override
	public void printGradeCard() {
		// 현재 클래스에 name 변수가 따로 없으므로 부모 클래스의 name을 사용(super.name)
		System.out.println("┌───────────────────────────────────────────────┐");
		System.out.println("│ 이름 : " + name + " │ 총점: " + getSum() + "평균 : " + getAverage() + "\t\t\t│");
		System.out.println("│ 국어\t영어\t수학\tPL\tAL\tDS" + "  \t│");
		System.out.printf( "│ %d\t%d\t%d\t%d\t%d\t%d\t│\n", kor, eng, math, pl, al, ds);
		System.out.println("└───────────────────────────────────────────────┘");
	}
}
