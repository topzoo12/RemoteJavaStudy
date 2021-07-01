import java.util.ArrayList;

public class D01_ArrayList {
	
	/*
	
		# Java Collections
		
		 - 자바에서 기본적으로 제공하는 자료구조 인터페이스
		 - collection 인터페이스를 구현한 클래스는 List, Set 등이 있다.
		 
		# java.util.ArrayList
		
		 - 배열과 유사하지만 크기가 자동으로 조절되는 자료구조 클래스
		 - 배열처럼 데이터를 순차적으로 저장한다.
		 - 순차적으로 모든 데이터에 접근해야 할 때 가장 유리하다. 
	
	*/
	
	
	public static void main(String[] args) {
		
		/*
			
			# 타입을 지정하며 ArrayList 생성하기
			 - 타입을 지정할 때 사용하는 <>를 제네릭(Generic)이라고 부른다.
			 - 해당 클래스 내부의 아직 지정되지 않은 타입을 지정하는 문법이다.
			 - 제네릭에는 기본형 타입을 사용할 수 없다.
		
		*/
		
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Character> chars = new ArrayList<>();
		
		System.out.println(fruits);
		
		
		chars.add('A');
		chars.add('B');
		chars.add('한');
		chars.add('뙗');
		
		
		System.out.println(chars);
		chars.removeAll(chars);
		chars.clear();
		
		// add(item) : 리스트의 맨 뒤에 원하는 데이터를 추가한다.
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("banana");
		
		// add(index, item) : 리스트의 원하는 위치에 데이터를 추가한다.
		numbers.add(0, 10);
		numbers.add(0, 20);
		numbers.add(0, 99);
		numbers.add(0, 40);
		numbers.add(0, 0);
		numbers.add(0, 60);
		numbers.add(0, 60);
		numbers.add(numbers.size(), 77);
		
		
		System.out.println(fruits);
		System.out.println(numbers);
		
		// get(index) : 리스트에서 해당 인덱스의 데이터를 하나 반환한다.
		System.out.println(fruits.get(3));
		System.out.println(fruits.get(0));
		
		// size() : 해당 컬렉션의 크기를 반호나한다.
		System.out.println("현재 들어있는 과일 개수 : " + fruits.size());
		
		// remove(index) : 해당 번째 데이터를 삭제한다. 방금 지운 데이터를 반환한다.
//		try {
//			while (true) {
//				System.out.println(fruits.remove(0));
//			}
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("다 꺼냈네요");
//		}
		
		// remove(item) : 해당 값을 삭제한다. 삭제 성공 여부를 반환한다.
		System.out.println(fruits.remove("kiwi"));
		System.out.println(fruits.remove("banana"));
		
//		System.out.println(numbers.remove(77));
//		System.out.println(numbers.remove(new Integer(77)));
		
	}
	
	

}





























