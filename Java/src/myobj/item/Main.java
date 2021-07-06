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
			
			b.name = "수소폭탄";
			b.use();
			
			Axe a = new Axe();
			a.name = "택사스 전기톱";
			a.price = 99999999;
			
			a.info();
			
			a.use();
			a.name = "한번 사용한 " + a.name;
			a.price = 80000;
			System.out.println(a.name + "을 한번 사용하여 가격이 " + a.price + "까지 떨어졌습니다.");
			
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
		System.out.println(item.name + "을 사고" + this.money + "원이 남았습니다.");
	}
		
	
}
