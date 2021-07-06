package quiz;

//import java.lang.reflect.Array;

public class C08_Setting {
	
	static int trap;
	static int hole_size;
	static int player_size;
	
	//boolean[] hole = new boolean[20];
	boolean[] hole;
	
	public void Setting(int size) {
		hole_size = size;
		//trap = (int)(Math.random() * hole.length);
		
		hole = new boolean[size];

		System.out.println(trapHole());
		/*	
		System.out.println("랜덤으로 함정 구멍 정하기 전 - " + trap);
		
		System.out.println("trapHole 실행 후 - " + trap);
		System.out.println("함정은?? - " + hole[trap]);
		System.out.println(hole.length);
		*/
	}
	
	int trapHole() {
		trap = (int)(Math.random() * (hole.length - 1));
		System.out.println("함정은 : " + trap);
		// trap = 3;
		hole[trap] = true;
		return trap;
	}
	
	public void prick(int num) {
			
		if (num == trap) {
			System.out.println("퓽!! ");
			System.out.println("◇◆◇◆◇◆◇◆◇◆당신이 졌습니다.◇◆◇◆◇◆◇◆◇◆");
			System.out.println();
		} else if (hole[num] == true) {
			System.out.println("이미 칼이 꽂힌 칸입니다.");
			return;
		} else {
			hole[num] = true;
			System.out.println("통과");
		}
		
	}
	
	
	
	

}
