package myobj.item;

public class Bomb extends Item {
	public Bomb() {
		super("����ź", 9999999);
	}
	@Override
	public void use() {
		System.out.println(name + "�� ���� �� ���� �����ǰ���!? �ٽ� �����غ�����");
	}
}
