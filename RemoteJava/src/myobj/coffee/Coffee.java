package myobj.coffee;


	
	/**
	  # ������ ��ȣ
	  
	   1. �ѱ�
	   2. �ݷҺ��
	   3. �����
	   4. ��Ƽ���Ǿ�

	*/
	public class Coffee {
		
		String name;
		Origin origin;
		
		public Coffee(String name, Origin origin) {
			this.name = name;
			this.origin = origin;
			
		}
		
		public static void main(String[] args) {
			new Coffee("�Ƹ޸�ī��", Origin.BRAZIL);
			new Coffee("�Ƹ޸�ī��", Origin.SOUTH_KOREA);
		}
		
		
		
		
	}















