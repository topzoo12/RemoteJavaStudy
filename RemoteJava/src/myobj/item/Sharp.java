package myobj.item;

public class Sharp extends Item {

	public Sharp() {
		super("����", 3000);
	}

	@Override
	public void use() {
		System.out.println("����������������������������");
	}
	
}
