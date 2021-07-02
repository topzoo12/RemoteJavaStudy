package myobj.school;

public class MachineRunningStudent extends Student {
	// 국어, 영어, 수학, 통계학, 프로그래밍 언어 점수
	
	int kor;
	int eng;
	int math;
	int stats;
	int pl;
	
	public MachineRunningStudent() {
		super();	// 생략가능
		kor = generateRandomScore();
		eng = generateRandomScore();
		math = generateRandomScore();
		stats = generateRandomScore();
		pl = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + math + stats + pl); 
	}
	
	
	double getAverage() {
		return getSum() / 5.0;
		//return (kor + eng + math + stats + pl) / 5.0;
	}
	
	@Override
	public void printGradeCard() {
		// 현재 클래스에 name 변수가 따로 없으므로 부모 클래스의 name을 사용(super.name)
		System.out.println("┌───────────────────────────────────────────────┐");
		System.out.println("│ 이름 : " + name + " │ 총점: " + getSum() + "  평균 : " + getAverage() + "\t\t\t│");
		System.out.println("│ 국어\t영어\t수학\t통계학\tPL" + "  \t\t│");
		System.out.printf( "│ %d\t%d\t%d\t%d\t%d\t\t│\n", kor, eng, math, stats, pl);
		System.out.println("└───────────────────────────────────────────────┘");
	}

}
