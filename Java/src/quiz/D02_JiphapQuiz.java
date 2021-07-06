package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_JiphapQuiz<T> {
	
	/*
	
		1. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 합집합을 Set으로 반환하는 메서드
		
		2. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 교집합을 Set으로 반환하는 메서드
		
		3. 두 컬렉션을 매개변수로 전달 받으면 두 컬렉션의 차집합을 Set으로 반환하는 메서드 
		
		를 만들고 테스트 해보세요
	
	*/
	
	static class Fruit {}
	
	static class Apple extends Fruit {}
	static class Banana extends Fruit {}
	static class Carrot {}
	
	public static void main(String[] args) {
		
		D02_JiphapQuiz<String> jiphap = new D02_JiphapQuiz<>();
		
		D02_JiphapQuiz<Fruit> jiphap2 = new D02_JiphapQuiz<>();
		
		List<Apple> apple_list = new ArrayList<>();
		Set<Apple> apple_set = new HashSet<>();
		
		// jiphap2.union(apple_list, apple_set);
		
		List<String> A = new ArrayList<>();
		Set<String> B = new HashSet<>();
		
		A.add("Americano");
		A.add("Americano");
		A.add("Cold Brew");
		A.add("Latte");
		
		B.add("d");
		
		
		
		
		ArrayList<String> a = new ArrayList<>();
		ArrayList<String> b = new ArrayList<>();
		ArrayList<String> c = new ArrayList<>();
		
		a.add("청국장");
		a.add("된장");
		a.add("김치찌개");
		a.add("불고기");
		a.add("찜닭");
		a.add("돼지고기");
		a.add("소고기");
		a.add("닭고기");
		
		System.out.println(a);
		
		b.add("돼지고기");
		b.add("소고기");
		b.add("닭고기");
		b.add("탕수육");
		b.add("동파육");
		b.add("팔보채");
		b.add("양장피");
		
		System.out.println(b);
		
		
		c.add("돼지고기");
		c.add("소고기");
		c.add("쥐고기");
		c.add("토끼고기");
		c.add("양고기");
		c.add("말고기");
		
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println();
		
		cha(a, c);
		
		System.out.println("a와 c의 차집합 : " + a);
		System.out.println();
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println();
		
		kyo(b, c);
		
		System.out.println("b와 c의 교집합 : " + b);
		System.out.println();
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println();
		
		hap(a, b);
		
		System.out.println("a와 b의 합집합 : " + a);
		System.out.println();
		
	}
	// ===================================================================================
	// 합집합
	public static HashSet<Integer> union(Collection<Integer> A, Collection<Integer> B) {
		HashSet<Integer> union = new HashSet<>();
		
		union.addAll(A);
		union.addAll(B);
	
		return union;
	}
	
	
	
	
	// ===================================================================================
	// 교집합
	public static HashSet<Integer> intersection(Collection<Integer> A, Collection<Integer> B) {
		HashSet<Integer> inter = new HashSet<>();
		
		inter.addAll(A);
		inter.retainAll(B);
	
		return inter;
	}
	
	// ===================================================================================
	// 차집합
	
	public static HashSet<Integer> diff(Collection<Integer> A, Collection<Integer> B) {
		HashSet<Integer> diff = new HashSet<>();
		
		diff.addAll(A);
		diff.removeAll(B);
	
		return diff;
	}
	/*
	public HashSet<? extends T> diff(Collection<? extends T> A, Collection<? extends T> B) {
		HashSet<Integer> diff = new HashSet<>();
		
		diff.addAll(A);
		diff.removeAll(B);
	
		return diff;
	}*/
	// ===================================================================================
	
	
	
	
	
	
	
	// ===================================================================================
	
	public static HashSet hap(Collection a, Collection b) {
		
		//HashSet<String> ab = new HashSet<>();
		HashSet ab = new HashSet();
		
		a.addAll(b);
		
		return ab;
	}
	
	private static HashSet kyo(Collection a, Collection b) {
		
		//HashSet<String> ab = new HashSet<>();
		HashSet ab = new HashSet();
		
		a.retainAll(b);
		
		return ab;
	}
	
	private static HashSet cha(Collection a, Collection b) {
		
		//HashSet<String> ab = new HashSet<>();
		HashSet ab = new HashSet();
		
		a.removeAll(b);
		
		return ab;
	}
	
	// ===================================================================================
	// ===================================================================================
	
	
}









