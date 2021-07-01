import java.util.ArrayList;

public class D01_ArrayList {
	
	/*
	
		# Java Collections
		
		 - �ڹٿ��� �⺻������ �����ϴ� �ڷᱸ�� �������̽�
		 - collection �������̽��� ������ Ŭ������ List, Set ���� �ִ�.
		 
		# java.util.ArrayList
		
		 - �迭�� ���������� ũ�Ⱑ �ڵ����� �����Ǵ� �ڷᱸ�� Ŭ����
		 - �迭ó�� �����͸� ���������� �����Ѵ�.
		 - ���������� ��� �����Ϳ� �����ؾ� �� �� ���� �����ϴ�. 
	
	*/
	
	
	public static void main(String[] args) {
		
		/*
			
			# Ÿ���� �����ϸ� ArrayList �����ϱ�
			 - Ÿ���� ������ �� ����ϴ� <>�� ���׸�(Generic)�̶�� �θ���.
			 - �ش� Ŭ���� ������ ���� �������� ���� Ÿ���� �����ϴ� �����̴�.
			 - ���׸����� �⺻�� Ÿ���� ����� �� ����.
		
		*/
		
		ArrayList<String> fruits = new ArrayList<>();
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Character> chars = new ArrayList<>();
		
		System.out.println(fruits);
		
		
		chars.add('A');
		chars.add('B');
		chars.add('��');
		chars.add('��');
		
		
		System.out.println(chars);
		chars.removeAll(chars);
		chars.clear();
		
		// add(item) : ����Ʈ�� �� �ڿ� ���ϴ� �����͸� �߰��Ѵ�.
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("apple");
		fruits.add("banana");
		fruits.add("banana");
		
		// add(index, item) : ����Ʈ�� ���ϴ� ��ġ�� �����͸� �߰��Ѵ�.
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
		
		// get(index) : ����Ʈ���� �ش� �ε����� �����͸� �ϳ� ��ȯ�Ѵ�.
		System.out.println(fruits.get(3));
		System.out.println(fruits.get(0));
		
		// size() : �ش� �÷����� ũ�⸦ ��ȣ���Ѵ�.
		System.out.println("���� ����ִ� ���� ���� : " + fruits.size());
		
		// remove(index) : �ش� ��° �����͸� �����Ѵ�. ��� ���� �����͸� ��ȯ�Ѵ�.
//		try {
//			while (true) {
//				System.out.println(fruits.remove(0));
//			}
//		} catch (IndexOutOfBoundsException e) {
//			System.out.println("�� ���³׿�");
//		}
		
		// remove(item) : �ش� ���� �����Ѵ�. ���� ���� ���θ� ��ȯ�Ѵ�.
		System.out.println(fruits.remove("kiwi"));
		System.out.println(fruits.remove("banana"));
		
//		System.out.println(numbers.remove(77));
//		System.out.println(numbers.remove(new Integer(77)));
		
	}
	
	

}





























