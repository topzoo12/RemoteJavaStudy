
public class B04_Operator03 {
	
		/*
		  # ���� ������
		   
		   = : ������ ������ �������� ���� �����Ѵ�.
		   
		  # ���� ���� ������
		   
		   - ������ ����� ������Ű�� ������ �ٿ��� ǥ���Ѵ�.
		     +=, -=, *=, /= ....
		  
		   
		 */

	public static void main(String[] args) {
		
		int num = 10;
		
		num = num + 15;
		num += 15;
		
		num = 20;
		//System.out.println("num = "+ num);
		System.out.println(num += 5);	// num = num + 5;
		//num = 20;
		//System.out.println("num = "+ num);
		System.out.println(num -= 3);	// num = num - 3;
		//num = 20;
		//System.out.println("num = "+ num);
		System.out.println(num *= 2);	// num = num * 2;
		//num = 20;
		//System.out.println("num = "+ num);
		System.out.println(num /= 7);	// num = num / 7;
		//num = 20;
		//System.out.println("num = "+ num);
		System.out.println(num %= 10);	// num = num % 10;
		
		System.out.println("===============================");
		
		/*
		  # ���� ������
		   
		   - 1�� ������Ű�� ������ �� �ٿ��� ǥ���� ����
		   - ++, --�� ��ġ�� ���� ����� �޶�����
		   
		 */
		
		int num1 = 20;
		
		num1 = 20;
		System.out.println("num1 \t= "+ num1);
		System.out.println("num1++ \t= "+ ++num1);
		System.out.println("num1 \t= "+ num1 + "\n");
		
		num1 = 20;
		System.out.println("num1 \t= "+ num1);
		System.out.println("++num1 \t= "+ num1++);
		System.out.println("num1 \t= "+ num1 + "\n");
		
		num1 = 20;
		System.out.println("num1 \t= "+ num1);
		System.out.println("num1-- \t= "+ num1--);
		System.out.println("num1 \t= "+ num1 + "\n");
		
		num1 = 20;
		System.out.println("num1 \t= "+ num1);
		System.out.println("--num1 \t= "+ --num1);
		System.out.println("num1 \t= "+ num1 + "\n");
		
		// ++, --�� �ڿ� ���̸� �ش� ���� ��� ����� ������ �Ŀ� ���� ��ȭ��Ų��.
		num1 = 30;
		System.out.println(num1++);

		// ++, --�� �տ� ���̸� �ش� ���� ��� ����� �����ϱ� ���� ���� ��ȭ��Ų��.
		num1 = 30;
		System.out.println(++num1);
		

	}

}





























