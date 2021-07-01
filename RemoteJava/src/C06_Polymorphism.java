
public class C06_Polymorphism {
	/*
	
		# ��ü�� ������
		
		 - ��ü�� �پ��� ���¸� ���� �� �ִ�.
		 - ����� ����̱⵵ �ϰ� �����̱⵵ �ϴ�.
		 - ������ ���������� ����� �ƴ� ���� �ִ�.
	*/
	public static void main(String[] args) {
		Fruit fruit01 = null;
		Pineapple pine01 = null;
		
		Fruit fruit = null;
		Pineapple pineapple = new Pineapple();
		
		fruit01 = fruit;
		fruit01 = pineapple;	// �ڽ� Ÿ���� �θ� Ÿ���� �� �� �ִ�. ( �� ĳ���� )
		
		pine01 = pineapple;
		// pine01 = fruit;
		// �θ� Ÿ���� ���� ����� ���Ƽ� �ڽ� Ÿ���� �� �� ����. ( �ٿ� ĳ���� )
		
		// # �ٿ� ĳ������ ������ ���
		//  - ���� �ڽ� Ÿ���̾��� �ν��Ͻ��� ��ĳ���õǾ� �ִ� ���, �ٽ� �ٿ�ĳ���� �� �� �ִ�.
		System.out.println(fruit01);
		
		//System.out.println((Pineapple)fruit01);
		pine01 = (Pineapple)fruit01;	// �ٿ� ĳ����
		
		// # ��ĳ���� �� �ν��Ͻ� ����غ���
		DragonFruit dragon = new DragonFruit();
		Fruit f3 = dragon;
		
		Fruit f = new Pineapple();
		Fruit f2 = new DragonFruit();
		
		// ��ĳ���� �� ���¿��� �θ� Ÿ�Կ��� �����ϴ� �޼��带 ����ϸ� �ڽ��� ����� ����Ѵ�.
		f.eat();
		
		// ��ĳ���� �� ���¿����� ���� Ŭ������ ���� �ִ� ����� ��� �ؾ������.
		// (��ĳ���� �� ���¿��� Pineapple���� �����ϴ� ����� ��� ����� �� ����.)
		// f.smash();
		
		// ���� ����� ����ϱ� ���ؼ��� �ٿ�ĳ������ �ʿ��ϴ�.
		// �� �����Ϸ��� �ٿ�ĳ���ý� �߻��ϴ� �������� ã������ ���Ѵ�.
		((Pineapple) f).smash();
		// ((Pineapple) f2).smash();
		
		System.out.println("============================================");
		System.out.println("Fruit f = new Pineapple() \n");
		// instanceof �����ڸ� ���� �ش� �ν��Ͻ��� Ư�� Ŭ������ �ν��Ͻ������� �˻��� �� �ִ�.
		System.out.println("f�� Fruit�� �� �� �ִ� �ν��Ͻ��ΰ���? " + (f instanceof Fruit));
		System.out.println("f�� Pineapple�� �� �� �ִ� �ν��Ͻ��ΰ���? " + (f instanceof Pineapple));
		System.out.println("f�� DragonFruit�� �� �� �ִ� �ν��Ͻ��ΰ���? " + (f instanceof DragonFruit));
		
		
		System.out.println("============================================");
		System.out.println("Fruit f2 = new DragonFruit() \n");
		System.out.println("f2�� Fruit�� �� �� �ִ� �ν��Ͻ��ΰ���? " + (f2 instanceof Fruit));
		System.out.println("f2�� Pineapple�� �� �� �ִ� �ν��Ͻ��ΰ���? " + (f2 instanceof Pineapple));
		System.out.println("f2�� DragonFruit�� �� �� �ִ� �ν��Ͻ��ΰ���? " + (f2 instanceof DragonFruit));
		/*
		if ( f2 instanceof Pineapple) {
			((Pineapple) f2).smash();
		}
		*/
	}
	
	
}

class Fruit{
	
	void eat() {
		System.out.println("������ �Ծ���ϴ�.");
	}
}

// Apple�� �ȵǴ� ����. ���� ��Ű�� ���ο��� ���� �̸��� Ŭ������ ������ �� ����.
//class Apple extends Fruit{}
class Pineapple extends Fruit{
	void eat() {
		System.out.println("[�������̵�] ���ξ����� �Ծ����ϴ�.");
	}
	
	void smash() {
		System.out.println("���ξ����� ���� �����ƽ��ϴ�.");
	}
	
}

class DragonFruit extends Fruit {
	
}













