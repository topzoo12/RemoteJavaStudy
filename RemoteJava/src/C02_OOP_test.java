
public class C02_OOP_test {

	public static void main(String[] args) {
		
		String flavor;				// String flavor = "����" ;
			// String[] flavor = {"����", "�ٴҶ�", "����", "�ٴҶ�", "�ٴҶ�", "����"}
		String color;				// String color = "��Ʈ��";
			// String[] color = {"��Ʈ��", "�����", "�����", "�ʷϻ�", "����", "�����"}
		int price;					// int = 1500;
		int calorie;				// int = 800;
		String product;				// String = "���";
		String type;				// String = "��"
		
		IceCream gugucon = new IceCream();
		
		System.out.println(gugucon.color);
		System.out.println(gugucon.flavor);
		
		
		
		doSomething(1, "2", 'a', 4, 5);
	}
	
	public static void doSomething(int a, String b, char c, float d, double e) {
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
	}
	
	public static void doSomething(Box box) {
		System.out.println(box.a);
		System.out.println(box.b);
		System.out.println(box.c);
		System.out.println(box.d);
		System.out.println(box.e);
	}
}	

class IceCream {
	String flavor;
	String color;
	int price;
	int calorie;
	String product;
	String type;
}


class Box {
	int a;
	String b;
	char c; 
	float d; 
	double e;
}
	


