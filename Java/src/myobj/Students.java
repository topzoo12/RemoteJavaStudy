package myobj;

public class Students {
	
	final static int MAX_SCORE = 100;
	
	static String[] lastNameArray = {"강", "고", "구", "권", "김", "나", "박", "이",
			"최", "남궁", "제갈", "배", "서", "현", "안", "임", "유",
			"백", "오", "신", "양", "진", "독고"
			};
	
	static String[] firstNameArray = {
		"수환", "의성", "종윤", "지수", "천혁", "소영", "은철", "승모", 
		"수빈", "승민", "수영", "덕중",	"지호", "한나", "소윤", "두식", 
		"웅빈", "진호" 
		};
	
	static String generateRandomName() {
		
		return lastNameArray[(int)(Math.random() * lastNameArray.length)]
				+ firstNameArray[(int)(Math.random() * firstNameArray.length)];
	}
	
	static int generateRandomScore() {
		return (int)(Math.random() * (MAX_SCORE + 1));
	}

	String name;
	int kor;
	int eng;
	int math;
	double avg; 
	
	public Students() {
		this.name = generateRandomName();
		this.kor = generateRandomScore();
		this.eng = generateRandomScore();
		this.math = generateRandomScore();
		
		/*
		name = generateRandomName();
		kor = generateRandomScore();
		eng = generateRandomScore();
		math = generateRandomScore();
		*/
		
		// System.out.println("이름 : " + name + " 총점: " + getSum() + " 평균 : " + getAverage());
		// System.out.println("국어 : " + kor + " 영어 : " + eng + " 수학 : " + math);
		// System.out.printf( "%d\t%d\t%d\t│\n", kor, eng, math);
	}
	
	public int getSum() {
		return (kor + eng + math); 
	}
	
	public double getAverage() {
		return getSum() / 3.0;
		//return (kor + eng + math + pl + al + ds) / 6.0;
	}
	
	public String getName() {
		return name;
	}
	public int getKor() {
		return kor;
	}
	public int getEng() {
		return eng;
	}
	public int getMath() {
		return math;
	}
	
}
	
	
