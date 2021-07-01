package myobj.school;

abstract public class Student {
	
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
	
	public Student() {
		name = generateRandomName();
		kor = generateRandomScore();
		eng = generateRandomScore();
	}
	
	abstract public void printGradeCard();
	
	public String getName() {
		return name;
	}
}











