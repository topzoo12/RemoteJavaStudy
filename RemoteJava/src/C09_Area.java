
public class C09_Area {
		
		/*
		
			# ������ �����ֱ� 
			
			 - ������ �ش� ������ ������ {}�� ����� �״´�. (������ �����ֱ�)
			 - ��Ȯ�ϰ� ��Ī���� ������ �⺻������ ���� ����� ��ġ�� ������ ����Ѵ�.
		
		*/
	// �ν��Ͻ� ���� (instance variable)
	//   a.k.a ���(member), �ʵ�(field), �Ӽ�(attribute), �Ӽ�(property)
	
	int a = 15;
	
	void methodA() {
		// ���� ���� (local variavle) : �޼��� ���ο��� ����� ���� 
		int a = 10;
		System.out.println(a);
	}
	
	void methodB() {
		System.out.println(a);
	}
	
	class Area2 {
		
		public Area2() {
			System.out.println(a);
		}
	}
	
	class Area3 {
		public Area3() {
			System.out.println(a);
		}
	}
	
	public static void main(String[] args) {
		
		new C09_Area().new Area2();
		
	}
	
	
}
