package myobj.item;

public class Bomb extends Item {
	public Bomb() {
		super("핵폭탄", 9999999);
	}
	@Override
	public void use() {
		System.out.println(name + "을 쓰고 다 같이 죽을건가요!? 다시 생각해보세요");
	}
}
