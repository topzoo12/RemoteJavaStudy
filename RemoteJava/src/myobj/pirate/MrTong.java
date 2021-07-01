package myobj.pirate;

import java.lang.reflect.Array;

public class MrTong {
	
	// true  : 해당 구멍은 찔린적 있음
	// false : 해당 구멍은 아직 찔린적 없음
	boolean[] stabbed;
	boolean[] launch;
	int[] launch__;
	
	// launched가 true면 통아저씨가 발사된 상태
	public boolean launched;
	
	public MrTong(int size) {
		stabbed = new boolean[size];
		launch = new boolean[size];
		
		// 정답을 우선 1 ~ 4개 생성
		for (int i = 0; i < 4; i++) {
			launch[(int)(Math.random() * 4)] = true;
		}
		
		/* 
		launch = new int[(int)(Math.random() * 4 + 1)];
		
		
		int index = 0;
		while (index < launch.length) {
			
			int newNum = (int)(Math.random() * size);
			launch[index] = newNum;
			
			for (int i = 0; i < index; i++) {
			}
			
		}
//		for (int i = 0, len = launch.length; i < len; i++) {
//			launch[i] = (int)(Math.random() * size);
//		}
		*/
	}
	
	// 이미 찔린 곳이라면 return false, 아니라면 찌르고 잘 찔렀다면 return true
	public boolean stab(int index) {
		if (stabbed[index]) {
			return false;
		} else {
			stabbed[index] = true;
			launched = launch[index];
			return true;
			
//			for (int answer : launch) {
//				if (answer == index) {
//					launched = true;
//					return true;
//				}
//			}
//			
			
		}
	}
	
	
	public boolean[] getStabbed() {
		return stabbed;
	}
	
	
	
	/*
	public int[] notyet() {
		int count = 0;
		
		for (boolean stab : stabbed ) {
			if (stab) {
				count++;
			}
		}
		
		return null;
	}
	*/
	
	
}




