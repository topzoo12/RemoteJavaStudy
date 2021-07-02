package quiz;

import java.util.Scanner;

public class B09_ConvertSecond2 {

	public static void main(String[] args) {
		
		
		System.out.println("초 > ");
		int second = new Scanner(System.in).nextInt();
		
		int[] converted = new int[4];
		int[] seconds = new int[4];
		String[] units = {"년", "일", "시간", "분"};   
		
		seconds[0] = 365 * 24 * 60 * 60; 
		seconds[1] = 24 * 60 * 60;
		seconds[2] = 60 * 60;
		seconds[3] = 60;
		
		for (int i = 0; i < converted.length; i++) {
			converted[i] = second / seconds[i];
			second %= seconds[i];
		}
		
		boolean exist = false;
		
		for (int i = 0; i < converted.length; i++) {
			if (converted[i] != 0 || exist) {
				System.out.printf("%d%s ", converted[i], units[i]);
				exist = true;
			}
		}
		System.out.printf("%d초", second);
		System.out.println();
		

	}

}
