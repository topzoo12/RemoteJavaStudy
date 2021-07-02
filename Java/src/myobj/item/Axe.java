package myobj.item;

public class Axe extends Item {
	/*
	public Axe(String name, int price) {
		super(name, price);
	}*/
	public Axe() {
		super("금도끼", 1000);
	}
	@Override
	public void use() {
		System.out.println(name + "의 사용하려면 " + price + "원을 지불하세요" );
	}
}

