import java.util.Arrays;

public class C03_Constructor {
	
	/*
	
		# Ŭ������ ������ (Constructor)
		
		  - Ŭ������ �̸��� �Ȱ��� �̸��� �޼���
		  - �޼������� ���� Ÿ���� �������� �ʴ´�. 
		  - �ν��Ͻ��� ������ �� new�� �Բ� ���ȴ�.
		  - �ν��Ͻ� ������ ���� ���� ȣ��Ǳ� ������ �ַ� �ν��Ͻ� �ʱ�ȭ�� ���ȴ�.
		  - �����ڸ� �ϳ��� �������� ���� Ŭ�������� �ڵ����� ������ �⺻ �����ڰ� �����Ѵ�.
		    (�ƹ��ϵ� ���� ����)
		  - ���� ������ �����ڰ� �����ϴ� Ŭ������ �⺻�����ڸ� �ڵ����� �������� �ʴ´�.
		    (�⺻ �����ڸ� ����ϰ� �ʹٸ� �⺻ �����ڸ� �߰��� �����ؾ� �Ѵ�)  

	 */
	public static void main(String[] args) {
		
		Window w1 = new Window();
		Apple a1 = new Apple();
		Orange o1 = new Orange();
		Peach p1 = new Peach("��ȫ��");
		
		Peach peach01 = new Peach("����ȫ��");
		Peach peach02 = new Peach("��������");
		Peach peach03 = new Peach();
		
		System.out.println(p1.color);
		
		System.out.println("================================================");
		System.out.println(peach03.color);
		System.out.println(peach03.size);
		
		System.out.println("================================================");
		
		
		String str = String.format("%d:%d:%d", 10, 20, 30);
		System.out.println(str);
		
		System.out.println(o1.sweet);
		System.out.println(o1.address);
		System.out.println(Arrays.toString(o1.color));
		
		System.out.println("�ν��Ͻ� ������ �迭ó�� �ʱ�ȭ�� �̸� �Ǿ��ִ�.");
		System.out.println(a1.color);
		System.out.println(a1.calorie);
		System.out.println(w1.open);
		System.out.println(w1.lock);
		
	}

}

class Peach {
	
	String color;
	int size;
	
	// this : �� �ν��Ͻ����� �ڱ� �ڽ��� ����Ų��.
	Peach(String color) {
		this.color = color;
	}
	
	Peach(int size) {
		this.size = size;
		this.color = "default color";
	}
	
	// ������ �����ε�
	Peach(){
		this.color = "�⺻��"; 
	}
}


class Orange {
	
	int[] color;
	double sweet;
	String address;
	
	Orange() {
		color = new int[] {255, 255, 0};
		sweet = 10.0;
		address = "���ֵ�";
	}
	
	
}
















