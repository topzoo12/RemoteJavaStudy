import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class D03_Collections {
	
	/*
	
		# Collections Ŭ����
		
		 - �÷����� ���ϰ� �ٷ� �� �ִ� �پ��� ��ɵ��� ���ִ� Ŭ���� 

	*/
	
	
	
	
	public static void main(String[] args) {
		
		ArrayList<String> foods = new ArrayList<>();
		
		
		foods.add("�ܹ���");
		foods.add("���");
		foods.add("���θ�");
		foods.add("û����");
		foods.add("ī��ư�");
		foods.add("¥���");
		foods.add("��");
		foods.add("��");
		foods.add("��");
		foods.add("��");
		foods.add("�W");
		
		System.out.println(foods);
		
		// �ִ밪, �ּҰ�
		System.out.println("Max food : " + Collections.max(foods));
		System.out.println("Max food : " + Collections.min(foods));
		
		// ����
		Collections.sort(foods);
		System.out.println(foods);
		
		int[] arr = {1, 7, 3, 5, 13, 1};
		Arrays.sort(arr);
		
		System.out.println(Arrays.toString(arr));
		
		// �ڼ���
		Collections.shuffle(foods);
		System.out.println(foods);
		
		// �÷��ǿ� �ѹ��� ������ �߰��ϱ�
		Collections.addAll(foods, "����Ƣ��", "ġ�ƽ", "ġŲ�ʰ�", "��¡��Ƣ��", "����Ƣ��");
		System.out.println(foods);
		
//		System.out.println(Collections.binarySearch(foods, "����Ƣ��"));
		
		// �ش� ���� �� �� ����ִ����� ���� �˻��� �� �ִ�.
		System.out.println(Collections.frequency(foods, "��"));
		
		// �÷����� �����´�.
		Collections.reverse(foods);
		System.out.println(foods);
		
		// �÷��� ���� �� ���� ��ġ�� ��ȯ�Ѵ�.
		Collections.swap(foods, 0, 5);
		System.out.println(foods);
		
		// ���������� 5ĭ �̵� 
		Collections.rotate(foods, 5);
		System.out.println(foods);
		
		Collections.rotate(foods, -5);
		System.out.println(foods);
		
	}

}


















