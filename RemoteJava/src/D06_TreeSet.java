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
		
		 - ������ �ִ� Set (������ ���� ���� Hash�� Ư¡)
		 - �ߺ��� ������� �ʴ´� (Set�� Ư¡)
		 - �����͸� �߰��� �� ���� �����ؼ� �ֱ� ������ HashSet�� ���� ���� �ӵ��� ������
		 - �̸� ������ �Ǿ� �ֱ� ������ ���ĵ� ������ ���� ������ ���ϴ�.
		 - �ش� Ʈ���� �ν��Ͻ����� ����� Comparator�� ������ �� �ִ�.
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
//		// TreeSet�� ���ϴ� Comparator�� ����ϱ� ( ���� �������� )
		TreeSet<Integer> numbers2 = new TreeSet<>(new Comparator<Integer>() {
			
			@Override
			public int compare(Integer o1, Integer o2) {
				/*
				  	�ڸ��� �ٲٰ� �ʹٸ� ��� ����
					�ڸ��� �ٲٱ� ������ ���� ����
					�� ���� ���� ���̸� 0 ����
				*/
				return o2 - o1;
			}
			
		});
//		
//		numbers2.addAll(numbers);
//		
//		System.out.println(numbers2);
//		
//		// * TreeSet�� Set�� �Ϻκ��� �����ϴµ��� Ưȭ�� ����� ����.
//		SortedSet<Integer> head = numbers.headSet(44);
//		System.out.println(head);
//		
//		SortedSet<Integer> tail = numbers.tailSet(44);
//		System.out.println(tail);
//		
//		System.out.println("desc ���� �� : " + numbers);
//		// �̸� �����س��� ����� �ݴ� ������ Set �ν��Ͻ��� ��ȯ�Ѵ�
//		NavigableSet<Integer> desc = numbers.descendingSet();
//		System.out.println("desc ���� �� : " + desc);
//		
//		System.out.println("first? : " + numbers.first());
//		System.out.println("last? : " + numbers.last());
//		System.out.println("pollFirst? : " + numbers.pollFirst());
//		System.out.println(numbers);
//		System.out.println("pollLast? : " + numbers.pollLast());
//		System.out.println(numbers);
//		
//		// numbers.subSet(a, b) : a���� b ������ ��
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
//		// �Ʒ��� �ڵ尡 true�� �������� Null�� �ٸ� ������ �ٲ㺸���� ( 3���� �̻� )
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
		
		
		// �л� �ν��Ͻ��� 100�� �����, Ʈ���¿� ��� ���� ������ ������ ��
		// ��� ������ 50�� ~ 70�� ������ �л��� ��� ������� �������
		
		
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
//				System.out.println("No\t�̸�\t����\t���" );
//				System.out.println("====================================");
//			}
//			System.out.print((i+1)+"\t");
//			System.out.print(list.get(i).getName() + "\t");
//			System.out.print(list.get(i).getSum() + "\t");
//			System.out.println(list.get(i).getAverage());
			
		}
		System.out.println(students);
		System.out.println("�л��� �� " + students.size() + "�� �Դϴ�.");
		
		Student from = new Student();
		Student to = new Student();
		
		from.avg = 50.0;
		to.avg = 70.0;
		
		System.out.println(students.subSet(from, to));
		System.out.println(students.subSet(from, to).size());

//		System.out.println(students.size());
		
	}
	
	
}




















