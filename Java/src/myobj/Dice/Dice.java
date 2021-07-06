package myobj.Dice;

import java.lang.reflect.Array;
import java.util.Arrays;

public class Dice {
	
	int[] dice = new int[5];
	int a;
	int b;
	int temp;
		
	boolean small_s = false;
	boolean large_s = false;
	
	int check;
	int fullhouse_count;
	int large = 0;
	
	int dice5 = 0;
	int dice4 = 0;
	String print_result;
	
	//int[] score = new int[5];
	String s_text = "";
	String text = "";
	
	
	public void dice_throw() {
		/*
		for (int i = 0; i < dice.length; i++)  {
			dice[i] = (int)((Math.random() * 6) + 1);
			System.out.print(dice[i] + " ");
		}*/
		
		dice[0] = 1;
		dice[1] = 2;
		dice[2] = 3;
		dice[3] = 4;
		dice[4] = 5;
		
		for (int i = 0; i < dice.length-1; i++) {
			//System.out.println(dice[i] + " / " + dice[i+1]);
			for (int x = i; x < dice.length; x++) {
				//System.out.println(dice[i] + " / " + dice[i+1]);
				if (dice[i] > dice[x]) {
					temp = dice[i]; 
					dice[i] = dice[x];
					dice[x] = temp;
				}
			}
		}
		
		System.out.println();
		System.out.println(Arrays.toString(dice));
					
	}
	
	public void calc() {
		
		int[] fullhouse = new int[6];
		String text1 = "";
		
		for (int i = 0; i < dice.length; i++) {
			for (int x = i; x < dice.length; x++) {
				if (dice[i] == x) {
					System.out.println("다이스 : " + dice[i]);
					fullhouse[dice[i]]++;
				}
			}
			text += dice[i];
		}
		for (int i = 0; i < fullhouse.length; i++) {
			text1 += fullhouse[i];
		}
		
		int cc = 0;
				
		System.out.println(text1);
		//System.out.println(Arrays.toString(fullhouse));
		
		for (int i = 0; i < fullhouse.length; i++ ) {
			if (fullhouse[i] > 0) {
				cc++;
			} 
		}
		
		System.out.println("cc : " + cc);
		
//		System.out.println(Arrays.toString(fullhouse));
		
		/*
		if (text.equals("12345") || text.equals("23456")) {
			s_text = "라지 스트레이트";
		} else if (text.indexOf("1234") > -1 || text.indexOf("2345") > -1 || text.indexOf("3456") > -1)  {
			s_text = "스몰 스트레이트";
		} else if (text1.indexOf("32") > -1 || text1.indexOf("23") > -1) {
			s_text = "풀 하우스";
		}
		*/
		
		
		for (int i = 0; i < fullhouse.length; i++) {
			if (fullhouse[i] == 5) {
				print_result = "5 다이스";
			} else if (fullhouse[i] == 4) {
				print_result = "4 다이스";
			}
		}
		
		if ( (fullhouse[0] == 0 && cc == 5) || (fullhouse[5] == 0 && cc == 5) ) {
			// 라지 스트레이트 
			print_result = "라지 스트레이트"; 
		} else if ((fullhouse[0] == 0 && cc == 4) || (fullhouse[5] == 0 && cc == 4)) {
			// 스몰 스트레이트
			print_result = "스몰 스트레이트";
		} 
		
		System.out.println(Arrays.toString(fullhouse));
		System.out.println(print_result);
		
		
		
	}
	
	
}
