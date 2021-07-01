package quiz;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_JiphapQuiz<T> {
	
	/*
	
		1. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
		
		2. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼���
		
		3. �� �÷����� �Ű������� ���� ������ �� �÷����� �������� Set���� ��ȯ�ϴ� �޼��� 
		
		�� ����� �׽�Ʈ �غ�����
	
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
		
		a.add("û����");
		a.add("����");
		a.add("��ġ�");
		a.add("�Ұ��");
		a.add("���");
		a.add("�������");
		a.add("�Ұ��");
		a.add("�߰��");
		
		System.out.println(a);
		
		b.add("�������");
		b.add("�Ұ��");
		b.add("�߰��");
		b.add("������");
		b.add("������");
		b.add("�Ⱥ�ä");
		b.add("������");
		
		System.out.println(b);
		
		
		c.add("�������");
		c.add("�Ұ��");
		c.add("����");
		c.add("�䳢���");
		c.add("����");
		c.add("�����");
		
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println();
		
		cha(a, c);
		
		System.out.println("a�� c�� ������ : " + a);
		System.out.println();
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println();
		
		kyo(b, c);
		
		System.out.println("b�� c�� ������ : " + b);
		System.out.println();
		
		System.out.println("a : " + a);
		System.out.println("b : " + b);
		System.out.println("c : " + c);
		System.out.println();
		
		hap(a, b);
		
		System.out.println("a�� b�� ������ : " + a);
		System.out.println();
		
	}
	// ===================================================================================
	// ������
	public static HashSet<Integer> union(Collection<Integer> A, Collection<Integer> B) {
		HashSet<Integer> union = new HashSet<>();
		
		union.addAll(A);
		union.addAll(B);
	
		return union;
	}
	
	
	
	
	// ===================================================================================
	// ������
	public static HashSet<Integer> intersection(Collection<Integer> A, Collection<Integer> B) {
		HashSet<Integer> inter = new HashSet<>();
		
		inter.addAll(A);
		inter.retainAll(B);
	
		return inter;
	}
	
	// ===================================================================================
	// ������
	
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









