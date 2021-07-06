import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.NavigableSet;
import java.util.SortedSet;
import java.util.TreeSet;

import myobj.Student;
import myobj.Students;

public class D06_TreeSet {

	/*
	
		# TreeSet
		
		 - 순서가 있는 Set (순서가 업는 것은 Hash의 특징)
		 - 중복은 허용하지 않는다 (Set의 특징)
		 - 데이터를 추가할 때 값을 정렬해서 넣기 때문에 HashSet에 비해 저장 속도가 느리다
		 - 미리 정렬이 되어 있기 때문에 정렬된 순서로 값을 꺼내기 편리하다.
		 - 해당 트리셋 인스턴스에서 사용할 Comparator를 지정할 수 있다.
		 - 
	
	*/
	
	public static void main(String[] args) {
//		
		TreeSet<Integer> numbers = new TreeSet<>();
		
		numbers.add(10);
		numbers.add(99);
		numbers.add(86);
		numbers.add(41);
		numbers.add(50);
		numbers.add(13);
		numbers.add(50);
//		numbers.add(50);
//		numbers.add(50);
//		
//		System.out.println(numbers);
//		
//		// TreeSet에 원하는 Comparator를 사용하기 ( 정수 내림차순 )
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				/*
				  	자리를 바꾸고 싶다면 양수 리턴
					자리를 바꾸기 싫으면 음수 리턴
					두 값이 같은 값이면 0 리턴
				*/
				return o2 - o1;
			}
			
		});
//		
//		numbers2.addAll(numbers);
//		
//		System.out.println(numbers2);
//		
//		// * TreeSet은 Set의 일부분을 리턴하는데에 특화된 기능이 많다.
//		SortedSet<Integer> head = numbers.headSet(44);
//		System.out.println(head);
//		
//		SortedSet<Integer> tail = numbers.tailSet(44);
//		System.out.println(tail);
//		
//		System.out.println("desc 실행 전 : " + numbers);
//		// 미리 정렬해놓은 방향과 반대 방향인 Set 인스턴스를 반환한다
//		NavigableSet<Integer> desc = numbers.descendingSet();
//		System.out.println("desc 실행 후 : " + desc);
//		
//		System.out.println("first? : " + numbers.first());
//		System.out.println("last? : " + numbers.last());
//		System.out.println("pollFirst? : " + numbers.pollFirst());
//		System.out.println(numbers);
//		System.out.println("pollLast? : " + numbers.pollLast());
//		System.out.println(numbers);
//		
//		// numbers.subSet(a, b) : a부터 b 사이의 값
//		System.out.println("subSet? : " + numbers.subSet(30, 70));
//		
//		System.out.println("comparator? : " + numbers.comparator());
//		System.out.println("comparator? : " + numbers2.comparator());
//		
//		TreeSet<Integer> number3 = new TreeSet<>(numbers.comparator());
//		
		List<Integer> list = new ArrayList<>(numbers);
		Collections.sort(list, numbers.comparator());
		
		System.out.println("list : " + list);
		
		System.out.println("contains 41 ? : " + numbers2.contains(41));
		System.out.println("contains 42 ? : " + list.contains(41));
//		
//		System.out.println("===========================================");
//		// 아래의 코드가 true가 나오도록 Null을 다른 것으로 바꿔보세요 ( 3가지 이상 )
//		
//		//System.out.println(list.containsAll(null));
//		System.out.println("list - " + list);
//		System.out.println("numbers - " + numbers);
//		System.out.println("===========================================");
//		
//		System.out.print("numbers : " + numbers + "\t\t");
//		System.out.println(list.containsAll(numbers));
//		
//		System.out.print("numbers.subSet(30, 70) : " + numbers.subSet(30, 70) + "\t");
//		System.out.println(list.containsAll(numbers.subSet(30, 70)));
//		
//		System.out.print("head : " + head + "\t\t\t\t");
//		System.out.println(list.containsAll(head));
//		
//		System.out.print("tail : " + tail + "\t\t\t\t");
//		System.out.println(list.containsAll(tail));
//		
//		System.out.print("list : " + list + "\t\t\t");
//		System.out.println(list.containsAll(list));
//		//System.out.println(list.containsAll());
		
		
		// 학생 인스턴스를 100개 만들고, 트리셋에 평균 점수 순으로 저장한 후
		// 평균 점수가 50점 ~ 70점 사이인 학생이 모두 몇명인지 세어보세요
		
		
		TreeSet<Student> students = new TreeSet<Student>();
		
//		List<Students> list = new ArrayList<>();
//		Students[] sss = new Students[100];
		
//		System.out.println(students);
//		System.out.println(sss);
		
		for (int i = 0; i < 10; i++) {
			students.add(new Student());
			
//			sss[i] = new Students();
			
//			students.add(new Students());
//			students.add(new Students());
//			students.add(sss[i]);
			
//			System.out.println(sss[i]);
			
//			list.add(new Students());
//			
//			if (i == 0) {
//				System.out.println("No\t이름\t총점\t평균" );
//				System.out.println("====================================");
//			}
//			System.out.print((i+1)+"\t");
//			System.out.print(list.get(i).getName() + "\t");
//			System.out.print(list.get(i).getSum() + "\t");
//			System.out.println(list.get(i).getAverage());
			
		}
		System.out.println(students);
		System.out.println("학생은 총 " + students.size() + "명 입니다.");
		
		Student from = new Student();
		Student to = new Student();
		
		from.avg = 50.0;
		to.avg = 70.0;
		
		System.out.println(students.subSet(from, to));
		System.out.println(students.subSet(from, to).size());

//		System.out.println(students.size());
		
	}
	
	
}




















