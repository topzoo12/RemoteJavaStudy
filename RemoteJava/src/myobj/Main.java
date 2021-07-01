package myobj;

public class Main {
	
	public static void main(String[] args) {
		
		Barrack b1 = new Barrack();
		/*
		b1.createSheep();
		b1.createSheep();
		b1.createSheep();
		b1.createCow();
		b1.createCow();
		b1.createCow();
		
		System.out.println(b1.queue[0].name);
		System.out.println(b1.queue[0].attack);
		System.out.println(b1.queue[1].name);
		System.out.println(b1.queue[2].name);
		System.out.println(b1.queue[3].name);
		System.out.println(b1.queue[4].name);

		*/
		
		Order cc = new Order();
		cc.Americano();
		cc.Americano();
		cc.Americano();
		cc.Americano();
		cc.iceTea();
		cc.iceTea();
		cc.iceTea();
		cc.iceTea();
		cc.Americano();
		cc.Americano();
		cc.Americano();
		
		
		System.out.println(cc.order_size[0].price);
		
		
	}
}
