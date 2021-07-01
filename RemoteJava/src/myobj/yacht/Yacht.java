package myobj.yacht;

import java.util.Arrays;
import java.util.Random;

public class Yacht {
	
final static int DICE_SIZE = 5;
	
	int[] dices;
	
	Random ran;
	
	public Yacht() {
		ran = new Random();
		dices = new int[DICE_SIZE];
		
		// Arrays.fill() : 배열을 원하는 숫자로 초기화 해주는 메서드
		// ※ Arrays 클래스에는 배열을 편하게 다룰 수 있는 다양한 기능들이 모여있다 ( JAVA API 참조 )
		Arrays.fill(dices, 1);
	}
	
	public void roll() {
		for (int i = 0; i < DICE_SIZE; i++) {
			dices[i] = ran.nextInt(6) + 1;
		}
	}
	
	public void printDice() {
		System.out.println(Arrays.toString(dices));
	}
	
	private String available() {
		String result = "";
		
		return result;
	}
	
	
	
}













