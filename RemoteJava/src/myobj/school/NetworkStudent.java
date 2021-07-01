package myobj.school;

public class NetworkStudent extends Student {

	// 국어, 영어, 리눅스, 네트워크, CCNA 점수
	
	int kor;
	int eng;
	int linux;
	int nt;
	int ccna;
	
	public NetworkStudent() {
		super();	// 생략가능
		kor = generateRandomScore();
		eng = generateRandomScore();
		linux = generateRandomScore();
		nt = generateRandomScore();
		ccna = generateRandomScore();
	}
	
	int getSum() {
		return (kor + eng + linux + nt + ccna); 
	}
	
	
	double getAverage() {
		return getSum() / 5.0;
		//return (kor + eng + linux + nt + ccna) / 5.0;
	}
	
	@Override
	public void printGradeCard() {
		// 현재 클래스에 name 변수가 따로 없으므로 부모 클래스의 name을 사용(super.name)
		System.out.println("┌───────────────────────────────────────────────┐");
		System.out.println("│ 이름 : " + name + " │ 총점: " + getSum() + "  평균 : " + getAverage() + "\t\t\t│");
		System.out.println("│ 국어\t영어\tLinux\tNetwork\tCCNA" + "  \t\t│");
		System.out.printf( "│ %d\t%d\t%d\t%d\t%d\t\t│\n", kor, eng, linux, nt, ccna);
		System.out.println("└───────────────────────────────────────────────┘");
	}


}
