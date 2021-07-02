package quiz;

import java.util.Scanner;

public class B11_CountRandomFruit {
	
			/*
			  
			 사용자로부터 숫자를 입력받으면 해당 개수 만큼의 랜덤 과일을 선택한다.
			 (랜덤으로 등장하는 과일 - apple, banana, kiwi, orange, grape, peach)
			 
			 그 후 각 과일이 몇 번 등장했는지 모두 기록하고 출력한다.
	
			*/

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("총 과일 개수를 입력해주세요 > ");
		int aa = sc.nextInt();
		//int aa = 10;
		
		int total_fruit = 0;
		
		String[] fruit = {"apple", "banana", "kiwi", "orange", "grape", "peach"};
		int fruit_range = fruit.length;
		
		int[] fruit_cnt = new int[fruit_range];
		
		int max_cnt = (int)(Math.random() * aa + 1);
		
		for (int i = 0; i < aa; i++) {
			int any_fruit = (int)(Math.random() * fruit_range);
			System.out.println((i+1) + " 번째 과일은 \t: " + (fruit[any_fruit]) + " 입니다.");
			fruit_cnt[any_fruit]++;
			total_fruit++;
		}
		System.out.println("");
		
		for (int i = 0; i < fruit_cnt.length; i++) {
			System.out.println(fruit[i] + "의 개수는 \t: " +fruit_cnt[i] + " 개 입니다.");
		}
		System.out.println("=======================================");
		System.out.println("총 과일의 개수는 \t: " + total_fruit + " 개 입니다.");
		
		

	}

}








