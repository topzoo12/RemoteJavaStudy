package myobj;

public class Order {

	final int MAX_ORDER = 10;
	
	int volume;
	String drink;
	int cnt_index = 0;
	
	DataCheck[] order_size;
	
	Order() {
		order_size = new DataCheck[MAX_ORDER];
	}
	
	void Check() {
		/*
		for (int i = 0; i > order_size.length; i++) {
			if (order_size[i] != null) {
				order_size[i]
			} 
		}
		*/
		return;
	}
	
	
	
	void Americano() {
		System.out.println(cnt_index);
		/*if (Check()) {
			
		}*/
		order_size[cnt_index++] = new DataCheck(1, "아메리카노", 2500);

		// return;
	}
	
	void iceTea() {
		order_size[cnt_index++] = new DataCheck(2, "iceTea", 2000);
	}
	void bye() {
		
	}
	
}




