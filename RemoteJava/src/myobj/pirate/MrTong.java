package myobj.pirate;

import java.lang.reflect.Array;

public class MrTong {
	
	// true  : �ش� ������ ���� ����
	// false : �ش� ������ ���� ���� ����
	boolean[] stabbed;
	boolean[] launch;
	int[] launch__;
	
	// launched�� true�� ��������� �߻�� ����
	public boolean launched;
	
	public MrTong(int size) {
		stabbed = new boolean[size];
		launch = new boolean[size];
		
		// ������ �켱 1 ~ 4�� ����
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
	
	// �̹� �� ���̶�� return false, �ƴ϶�� ��� �� �񷶴ٸ� return true
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




