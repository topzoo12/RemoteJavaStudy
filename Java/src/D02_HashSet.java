import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;

public class D02_HashSet {
	
	/*
	 	
	 	# Set
	 	
	 	 - 집합을 구현해놓은 클래스.
	 	 - 요소로 같은 값이 들어오는 것을 허용하지 않는다.
	 	 
		# Hash
		 
		 - 이름에 Hash가 붙어있는 클래스는 Hash 알고리즘을 사용한다.
		 - 같은 값을 넣으면 항상 일정한 값이 나오는 알고리즘
		 - 비슷한 다른 값을 넣더라도 전혀 에측 불가능한 값이 나와야 한다.
		 - Hash 알고리즘으로 구현된 클래스들은 순서가 존재하지 않는다.
		 - 중복 체크시에 뛰어난 성능을 보인다.  
	
	*/
	
	public static void main(String[] args) {
		HashSet<Integer> numbers = new HashSet<>();
		
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		numbers.add(50);
		numbers.add(50);
		numbers.add(50);
		numbers.add(60);
		
		System.out.println(numbers);
		
		// HashSet에는 index가 없기 때문에 값으로만 지울 수 있다.
		numbers.remove(50);
		
		System.out.println(numbers);
		
		// HashSet은 index가 없기 때문에 for-each만 사용할 수 있다.
		
		for (Integer number : numbers) {
			System.out.println(number);
		}
		
		// 컬렉션끼리는 변환이 자유롭다.
		ArrayList<Integer> number_List = new ArrayList<>(numbers);
		
		System.out.println(number_List);
		
		for (int i = 0; i < number_List.size(); i++) {
			System.out.println(number_List.get(i));
		}
		
		// 컬렉션은 아주 쉽게 크기순으로 정렬할 수 있다.
		Collections.sort(number_List);
		
		System.out.println("정렬 후 : " + number_List);
		
		
		// Collection.addAll(Collection) 컬렉션의 모든 내용을 다른 컬렉션에 추가하기
		HashSet<String> animals = new HashSet<>();
		ArrayList<String> animal_list = new ArrayList<>();
		
		animal_list.add("dog");
		animal_list.add("cad");
		animal_list.add("cow");
		animal_list.add("lion");
		animal_list.add("tiger");
		
		animals.add("lion");
		animals.add("tiger");
		animals.add("horse");
		animals.add("zebra");
		animals.add("giraffe");
		
		
		animal_list.addAll(animals);
		animals.addAll(animal_list);
		
		System.out.println(animal_list);
		System.out.println(animals);
		
		Collections.sort(animal_list);
		//animals.add("dddddd");
		// Collection.removeAll(Collection) : 전달한 컬렉션과 같은 내용을 모두 제거
//		System.out.println("animals     : " + animals);
//		System.out.println("animal_list : " + animal_list);
		animals.removeAll(animal_list);
		System.out.println(animals);
		
		// Collection.retainAll(Collection) : 두 컬렉션에 모두 존재하는 값만 남김
		HashSet<Double> avg = new HashSet<>();
		HashSet<Double> avg2 = new HashSet<>();
		
		avg.add(1.8);
		avg.add(1.9);
		avg.add(2.0);
		
		avg2.add(2.0);
		avg2.add(38.8);
		avg2.add(40.1);
		
		System.out.println(avg.retainAll(avg2));
		System.out.println(avg);
	}
	
	
	
}




















