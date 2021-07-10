package homework;

import java.util.TreeSet;

public class Car_number {
	
	public static void main(String[] args) {
		
		
		
		TreeSet<Integer> car_list = new TreeSet<>();
		
		String car_num = "";
		
		for (int x = 0; x < 10; x++) {
			car_list.add((int)((Math.random() * 9000) + 1000));
//			System.out.println(x);
		}
		System.out.println(car_list);
				
	}
	
}
