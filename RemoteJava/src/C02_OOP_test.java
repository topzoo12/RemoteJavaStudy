
public class C02_OOP_test {

	public static void main(String[] args) {
		
		String flavor;				// String flavor = "ÃÊÄÚ" ;
			// String[] flavor = {"ÃÊÄÚ", "¹Ù´Ò¶ó", "µþ±â", "¹Ù´Ò¶ó", "¹Ù´Ò¶ó", "¸Á°í"}
		String color;				// String color = "¹ÎÆ®»ö";
			// String[] color = {"¹ÎÆ®»ö", "µþ±â»ö", "µþ±â»ö", "ÃÊ·Ï»ö", "°¥»ö", "¸Á°í»ö"}
		int price;					// int = 1500;
		int calorie;				// int = 800;
		String product;				// String = "³ó½É";
		String type;				// String = "ÄÜ"
		
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
	


