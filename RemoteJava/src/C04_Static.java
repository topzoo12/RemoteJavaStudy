
public class C04_Static {
	
	/*
	
		# static ( ���� ����, Ŭ���� ���� <=> �ν��Ͻ� ���� )
		 
		 - static ������ ���� Ŭ������ ��� �ν��Ͻ��� �������� ����ϴ� �����̴�.
		 - �տ� static�� ���� �ڿ��� ���� Ŭ������ ������� ��� �ν��Ͻ���
		   �������� ����ϴ� �ڿ��� �ȴ�. 
		 - static ������ �ƹ��� �ν��Ͻ��� ���Ƶ� Ŭ������ �ϳ��ۿ� �������� �ʱ� ������
		   �޸𸮰� ����ȴ�.
		 - static ������ Ŭ������ �ϳ��̱� ������ Ŭ���� �̸��� .�� ��� �����ϴ� ���� �����ϴ�. (����)
		 - static�� ���� �ڿ��� �ν��Ͻ��� ����� ������ ȣ���� �� �ִ�.
		 - static �޼���� static �ڿ����� Ȱ���� �� �ִ� �޼����̴�. 
		 - �ν��Ͻ��� �ϳ��� �������� ���� ���� static �޼��尡 ��뵵�� ���ɼ��� �����ϱ� ������
		   static �޼��忡���� �ν��Ͻ� �ڿ��� ����� �� ����. 
		
	*/
	
	static int a = 10;
	int b = 10;
	
	
	public static void main(String[] args) {
		�ؾ �ؾ�1 = new �ؾ();
		�ؾ ��2 = new �ؾ();
		�ؾ �ؾ3 = new �ؾ();
		
		System.out.println(�ؾ�1.����);
		System.out.println(��2.����);
		System.out.println(�ؾ3.����);
		�ؾ�1.���� = 50;
		System.out.println(�ؾ.����);
		System.out.println(�ؾ.�Ϻ��ѱ���ð�);
		System.out.println(�ؾ�1.���Ǿ�);
		System.out.println(��2.���Ǿ�);
		System.out.println(�ؾ3.���Ǿ�);
		
		System.out.println(�ؾ.�Ϻ��ѱ���ð� + " ��");
		�ؾ.�Ϻ��ѽð������ϱ�(35);
		System.out.println(�ؾ.�Ϻ��ѱ���ð� + " ��");
		
		
		
		
	}

}

class �ؾ {
	static int �Ϻ��ѱ���ð� = 33;
	static int ���� = 100;
	static int ���� = 50;
	int ���Ǿ�;
	int ����ð�;
	
	static void �Ϻ��ѽð������ϱ�(int time) {
		�Ϻ��ѱ���ð� = time;
	}
	
}

















