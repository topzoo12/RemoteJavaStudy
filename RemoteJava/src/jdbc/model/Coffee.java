package jdbc.model;

// 프로그램을 운영하기 위한 데이터를 보관하기 위해 만들어놓은 코드를 모델이라고 한다.
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
