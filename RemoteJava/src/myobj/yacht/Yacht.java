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
		
		// Arrays.fill() : �迭�� ���ϴ� ���ڷ� �ʱ�ȭ ���ִ� �޼���
		// �� Arrays Ŭ�������� �迭�� ���ϰ� �ٷ� �� �ִ� �پ��� ��ɵ��� ���ִ� ( JAVA API ���� )
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













