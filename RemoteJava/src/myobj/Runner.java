package myobj;

public class Runner implements Comparable<Runner> {
	
	public String name;
	public int height;
	public int weight;
	public double run_result;
	
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
	
	static int generateheight() {
		return (int)(Math.random() * 20 + 160);
	}
	
	static int generateweight() {
		return (int)(Math.random() * 37 + 50);
	}
	
	static double generaterun_result() {
		return Math.random() * 4 + 10;
	}
	
	public Runner() {
		name = generateRandomName();
		height = generateheight();
		weight = generateweight();
		run_result = generaterun_result();
	};
	
	@Override
	public String toString() {
		return String.format("[%s] 학생의 몸무게는 [%skg] 키는 [%scm] 기록은 %.2f 입니다.\n", name, weight, height, run_result);
	}
	
	@Override
	public int compareTo(Runner o) {
		
		return Double.compare(this.weight, o.weight) != 0 ?
			   Double.compare(this.weight, o.weight) : Double.compare(run_result, o.run_result);
	}
	

}
