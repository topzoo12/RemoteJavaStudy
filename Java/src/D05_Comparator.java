import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D05_Comparator {
	
	/*
	
		# Comparable
		
		 - 이 인터페이스를 구현한 클래스는 서로 크기가 비교 가능한 클래스가 된다.
		 - 이 인터페이스를 구현한 클래스는 Collections의 정렬 기능을 이용할 수 있다.
	
		# Comparator

		 - 이 인터페이스를 구현한 클래스는 비교의 기준으로 사용된다.
	
	*/
	
	public static void main(String[] args) {
		
		
		Snack s1 = new Snack("허니버터칩", "롯데", "허니버터맛", 600, 2000);
		Snack s2 = new Snack("프링글스", "한화", "양파맛", 800, 2500);
		Snack s3 = new Snack("칸쵸", "롯데", "초코", 250, 1000);
		Snack s4 = new Snack("홈런볼", "LG생활건강", "초코", 359, 1750);
		Snack s5 = new Snack("포스틱", "KG", "감자맛", 700, 1200);
		
		Snack s6 = new Snack("참크래커", "크라운", "고소한맛", 500, 2200);
		Snack s7 = new Snack("오뜨", "오리온", "치즈맛", 350, 2700);
		Snack s8 = new Snack("사또밥", "삼양", "옥수수맛", 200, 1300);
		

		ArrayList<Snack> snacks = new ArrayList<>();
		
		Collections.addAll(snacks, s1, s2, s3, s4, s5);
		System.out.println(snacks);
		Collections.addAll(snacks, s6, s7, s8);
		System.out.println(snacks);
		
//		Collections.sort(snacks, new 과자진열대());
//		System.out.println(snacks);
//		
//		Collections.sort(snacks, new 과자분류기());
//		System.out.println(snacks);
//		
//		Collections.sort(snacks, new 과자분류기_내림차순());
//		System.out.println(snacks);
//		
//		Comparator<Snack> reversed_과자분류기 = Collections.reverseOrder(new 과자분류기());
//		
//		Collections.sort(snacks, reversed_과자분류기);
//		System.out.println(snacks);
//		
//		System.out.println(s1 > s2);
		
		Collections.sort(snacks, new 과자분류기_오름차순());
		
		for (int i = 0; i < snacks.size(); i++) {
			System.out.println(snacks.get(i).company + "\t   " + snacks.get(i).name);
			//System.out.println(snacks.get(i));
		}
		
//		System.out.println(snacks.get(0).company);
//		System.out.println(snacks.get(1).company);
//		System.out.println(snacks.get(2).company);
//		System.out.println(snacks.get(3).company);
//		System.out.println(snacks.get(4).company);
//		System.out.println(snacks.get(5).company);
//		System.out.println(snacks.get(6).company);
	}

}


class Snack implements Comparable<Snack> {
	String name;
	String company;
	String taste;
	int calorie;
	int price;
	
	
	public Snack(String name, String company, String taste, int calorie, int price) {
		this.name = name;
		this.company = company;
		this.taste = taste;
		this.calorie = calorie;
		this.price = price;
	}
	
	@Override
	public String toString() {
		return String.format("%s/%s/%s/%dkal/%d원", name, company, taste, calorie, price);
	}
	
	@Override
	public int compareTo(Snack o) {
		if (this.price > o.price) {
			return 1;
		} else if (this.price < o.price) {
			return -1;
		} else {
			return this.name.compareTo(o.name);
		}
	}
}
class 과자분류기 implements Comparator<Snack> {
	
	@Override
	public int compare(Snack o1, Snack o2) {
		
		if (o1.calorie > o2.calorie) {
			return 1;
		} else if (o1.calorie < o2.calorie) {
			return -1;
		} else {
			return 0;
		}
	}
}


// ==============================================================================================
/*
	제조사 이름 기준 내림차순 정렬을 하되, 같은 제조사라면 과자의 이름으로 오름차순 정렬해보기 
	( 과자 3개만 더 추가해보기 )
	
*/

class 과자분류기_오름차순 implements Comparator<Snack> {
	
	@Override
	public int compare(Snack o1, Snack o2) {
		
//		System.out.println(o1.company);
//		System.out.print(o1.company);
//		System.out.print("\t");
//		System.out.print(o2.company);
//		System.out.print("\n");
//		System.out.println(o1.compareTo(o2));
		
		int return_check = (o1.company).compareTo(o2.company);
		
		if (return_check > 1) {
			return 1;
		} else if (return_check < 0) {
			return -1;
		} else {
			return (o1.name).compareTo(o2.name);
		}
//		System.out.print(o1.company + " / " + o2.company + " -- ");
//		System.out.println((o1.company).compareTo(o2.company)); 
		
//		return (o1.company).compareTo(o2.company);
	}
}
//==============================================================================================





class 과자분류기_내림차순 implements Comparator<Snack> {
	
	@Override
	public int compare(Snack o1, Snack o2) {
		
		if (o1.calorie > o2.calorie) {
			return -1;
		} else if (o1.calorie < o2.calorie) {
			return 1;
		} else {
			return 0;
		}
	}
}

class 과자진열대 implements Comparator<Snack>{
	
	/*
	 	
	   # compare 규칙
		
		두 값의 자리를 바꾸고 싶으면 1을 리턴
		두 값의 자리를 바꾸지 않고 싶으면 -1을 리턴
		두 값이 서로 같은 값이라면 0을 리턴
	
	*/
	
	
	@Override
	public int compare(Snack o1, Snack o2) {
		
		if (o1.price > o2.price) {
			return 1;
		} else if (o1.price < o2.price) {
			return -1;
		} else {
			return 0;
		}
		
	}
}















