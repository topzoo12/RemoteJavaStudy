package myobj.item;

public class Axe extends Item {
	/*
	public Axe(String name, int price) {
		super(name, price);
	}*/
	public Axe() {
		super("�ݵ���", 1000);
	}
	@Override
	public void use() {
		System.out.println(name + "�� ����Ϸ��� " + price + "���� �����ϼ���" );
	}
}

