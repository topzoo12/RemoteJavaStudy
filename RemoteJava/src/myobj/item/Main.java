package myobj.item;

public class Main {
	
	int money;
	
	public Main() {
		money = 10000;
	}
	public static void main(String[] args) {
		/*
			Bomb b = new Bomb();
			b.info();
			
			b.name = "������ź";
			b.use();
			
			Axe a = new Axe();
			a.name = "�û罺 ������";
			a.price = 99999999;
			
			a.info();
			
			a.use();
			a.name = "�ѹ� ����� " + a.name;
			a.price = 80000;
			System.out.println(a.name + "�� �ѹ� ����Ͽ� ������ " + a.price + "���� ���������ϴ�.");
			
			a.info();
			b.info();
		*/
		
		Main m = new Main();
		
		m.purchace(new Axe());
		m.purchace(new Sharp());
		m.purchace(new Bomb());
			
	}
	public void purchace(Item item) {
		this.money -= item.price;
		System.out.println(item.name + "�� ���" + this.money + "���� ���ҽ��ϴ�.");
	}
		
	
}
