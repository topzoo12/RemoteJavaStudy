package myobj.item;

/*
		이 클래스를 상속받아 3가지 아이템을 만들어 보세요
		※ 단 Item 클래스는 수정하지 말 것
*/
abstract public class Item {

	String name;
	int price;

	public Item(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	// final을 붙인 메서드는 자식 클래스에서 오버라이드를 금지시킨다.
	final public void info ( ) {
		System.out.println("이름 : " + name);
		System.out.println("가격 : " + price + "원");
	}
	
	abstract public void use();
}



















