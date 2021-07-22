package jdbc.model;

// ���α׷��� ��ϱ� ���� �����͸� �����ϱ� ���� �������� �ڵ带 ���̶�� �Ѵ�.
public class Coffee {
	
	private int id;
	private String name;
	private int price;

	public Coffee(int id, String name, int price) {
		this.id = id;
		this.name = name;
		this.price = price;
	}
	
	public int getId() {
		return id;
	}
	
	public String getName() {
		return name;
	}
	
	public int getPrice() {
		return price;
	}
	
	@Override
	public String toString() {
		return String.format("%d/%s/%d", id, name, price);
	}
	
	
	
	
	
	
	
}
