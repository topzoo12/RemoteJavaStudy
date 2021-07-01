package quiz;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class D02_Lotto {
	
	/*
	
		1. 1 ~ 45의 중복없는 랜덤 숫자를 6개 또는 7개를 생성하는 메서드를 작성해보세요. 
		   (당첨번호는 7개, 손님이 고르는 번호는 6개)
		
		2. 프로그램이 시작되면 당첨번호를 하나 지정하고 (숫자 7개)
		   당첨번호와 일치하는 6개의 숫자가 나올 때 까지 번호를 계속 뽑아보세요
		
		3. 1등 또는 2등에 당첨될때까지 돈을 얼마나 썼는지 계산해보세요 ( 숫자 7개 뽑을 때마다 천원 )
	
	*/
	
	public static void main(String[] args) {
		
		ArrayList<Integer> guest = new ArrayList<>();
		ArrayList<Integer> win = new ArrayList<>();
		ArrayList<Integer> win1 = new ArrayList<>();
		ArrayList<Integer> firstWinner = new ArrayList<>();
		ArrayList<Integer> secondWinner = new ArrayList<>();
		
		boolean me = true;
		long price = 0;
		int bonus;
		
		winNum(win);
		secondWinner.addAll(win);
		
		System.out.println("win : " + win);
		
		win.remove(6);
		secondWinner.remove(5);
		win1.addAll(secondWinner);
		
		bonus = win.get(5);
		System.out.println("win          : " + win);
		System.out.println("secondWinner : " + secondWinner);
		
		while(me) {
			guestNum(guest);
			//System.out.println("게스트 : " + guest);
			price += 1000;
			
			//System.out.println(price + " 원을 사용했습니다.");
			
			//System.out.println(check);
			//System.out.println(guest);
			// firstWinner.addAll(guest);
			
			
//			System.out.println("check : " + firstWinner.size());
//			System.out.println("guest : " + guest.size());
			
//			System.out.println(win);
//			System.out.println(guest);
//			System.out.println(check);

//			if (firstWinner.get(0) == guest.get(0) &&
//				firstWinner.get(1) == guest.get(1) &&
//				firstWinner.get(2) == guest.get(2) &&
//				firstWinner.get(3) == guest.get(3) &&
//				firstWinner.get(4) == guest.get(4) &&
//				firstWinner.get(5) == guest.get(5) &&
//				firstWinner.get(6) == guest.get(6) ) {
//				System.out.println("1등입니다 !!");
//				break;
//			} 
			
//			if (firstWinner.retainAll(guest)) {
//				System.out.println("2등입니다.");
//			}
			
			
			
			firstWinner.retainAll(guest);
			secondWinner.retainAll(guest);
			
//			System.out.println("removeAll g : " + guest);
//			System.out.println("removeAll s : " + secondWinner);
//			System.out.println("게스트 : " + guest);
//			System.out.println(secondWinner);
//			System.out.print(secondWinner.get(0) + " / " + bonus + "\n");
			
			if (firstWinner.size() == 6) {
				System.out.println("1등입니다 !!");
				System.out.println("당첨 번호는 : " + firstWinner);
				System.out.println(price + "원을 사용하여 당첨되었습니다.");
				me = false;
			} else if (secondWinner.size() == 6) {
				System.out.println("2등 입니다.");
				System.out.println("당첨 번호는 : " + secondWinner);
				System.out.println(price + "원을 사용하여 당첨되었습니다.");
				me = false;
			}
			
			
			firstWinner.clear();
			secondWinner.clear();
			guest.clear();
			
			firstWinner.addAll(win);
			secondWinner.addAll(win1);
			
//			if (price > 10000) {
//				break;
//			}
			

		}
		
		
//		System.out.println(guest);
//		System.out.println(price + "원을 사용하여 당첨되었습니다.");
//		System.out.println(win);
		
		
	}
	
	
	public static ArrayList<Integer> guestNum(ArrayList<Integer> a) {
		
		HashSet<Integer> b = new HashSet<>();
		
		boolean cc = true;
		int size_check;
		
		while (cc) {
			
			b.add((int)((Math.random() * 45) + 1));
			
			size_check = b.size();
			
			if (size_check == 6) {
				cc = false;
			}
		}
		
		
		//System.out.println("bbbbb : " + b);
		
		a.addAll(b);
		Collections.sort(a);
		//System.out.println("aaaaa : " + a);
		
		return a;
	}
	
	public static ArrayList<Integer> winNum(ArrayList<Integer> a) {
		
		HashSet<Integer> b = new HashSet<>();
		
		boolean cc = true;
		int size_check;
		
//		for (int i = 0; i < 7; i++) {
//			b.add((int)((Math.random() * 46) + 1));
//		}
		
		// 5 7 13 1 40 35 25
		
		// [5]
		// [7, 5, 13, 1, 40, 35]
		
		while (cc) {			
			b.add((int)((Math.random() * 45) + 1));
			
			if (b.size() == 6) {
				cc = false;
			}
		}
		

		a.addAll(b);
		Collections.sort(a);
		
		
		cc = true;
		
		// [1, 2, 3, 4, 5, 6] + 6
		while (cc) {
			b.add((int)((Math.random() * 45) + 1));
			
			if (b.size() == 7) {
				cc = false;
			}
			
			
		}
		
		System.out.println("a - " + a);
		System.out.println("b1 - " + b);
		b.removeAll(a);
		System.out.println("b - " + b);
		
		a.addAll(b);
		
		
		
		
		
		
		System.out.println("a: " + a);
		
		return a;
	}
	
	
	
	
}



