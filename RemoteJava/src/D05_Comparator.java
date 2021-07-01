import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class D05_Comparator {
	
	/*
	
		# Comparable
		
		 - �� �������̽��� ������ Ŭ������ ���� ũ�Ⱑ �� ������ Ŭ������ �ȴ�.
		 - �� �������̽��� ������ Ŭ������ Collections�� ���� ����� �̿��� �� �ִ�.
	
		# Comparator

		 - �� �������̽��� ������ Ŭ������ ���� �������� ���ȴ�.
	
	*/
	
	public static void main(String[] args) {
		
		
		Snack s1 = new Snack("��Ϲ���Ĩ", "�Ե�", "��Ϲ��͸�", 600, 2000);
		Snack s2 = new Snack("�����۽�", "��ȭ", "���ĸ�", 800, 2500);
		Snack s3 = new Snack("ĭ��", "�Ե�", "����", 250, 1000);
		Snack s4 = new Snack("Ȩ����", "LG��Ȱ�ǰ�", "����", 359, 1750);
		Snack s5 = new Snack("����ƽ", "KG", "���ڸ�", 700, 1200);
		
		Snack s6 = new Snack("��ũ��Ŀ", "ũ���", "����Ѹ�", 500, 2200);
		Snack s7 = new Snack("����", "������", "ġ���", 350, 2700);
		Snack s8 = new Snack("��ǹ�", "���", "��������", 200, 1300);
		

		ArrayList<Snack> snacks = new ArrayList<>();
		
		Collections.addAll(snacks, s1, s2, s3, s4, s5);
		System.out.println(snacks);
		Collections.addAll(snacks, s6, s7, s8);
		System.out.println(snacks);
		
//		Collections.sort(snacks, new ����������());
//		System.out.println(snacks);
//		
//		Collections.sort(snacks, new ���ںз���());
//		System.out.println(snacks);
//		
//		Collections.sort(snacks, new ���ںз���_��������());
//		System.out.println(snacks);
//		
//		Comparator<Snack> reversed_���ںз��� = Collections.reverseOrder(new ���ںз���());
//		
//		Collections.sort(snacks, reversed_���ںз���);
//		System.out.println(snacks);
//		
//		System.out.println(s1 > s2);
		
		Collections.sort(snacks, new ���ںз���_��������());
		
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
		return String.format("%s/%s/%s/%dkal/%d��", name, company, taste, calorie, price);
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
class ���ںз��� implements Comparator<Snack> {
	
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
	������ �̸� ���� �������� ������ �ϵ�, ���� �������� ������ �̸����� �������� �����غ��� 
	( ���� 3���� �� �߰��غ��� )
	
*/

class ���ںз���_�������� implements Comparator<Snack> {
	
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





class ���ںз���_�������� implements Comparator<Snack> {
	
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

class ���������� implements Comparator<Snack>{
	
	/*
	 	
	   # compare ��Ģ
		
		�� ���� �ڸ��� �ٲٰ� ������ 1�� ����
		�� ���� �ڸ��� �ٲ��� �ʰ� ������ -1�� ����
		�� ���� ���� ���� ���̶�� 0�� ����
	
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















