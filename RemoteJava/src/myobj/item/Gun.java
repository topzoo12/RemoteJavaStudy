package myobj.item;

public class Gun extends Item {
	public Gun(String name, int price) {
		super(name, price);
	}
	@Override
	public void use() {
		System.out.println("≈¡! ≈¡! ≈¡!");
		System.out.println(name + "¿« ∞°∞›¿∫ " + price + " ¿‘¥œ¥Ÿ." );
	}
}
