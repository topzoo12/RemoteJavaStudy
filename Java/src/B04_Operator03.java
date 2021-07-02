
public class B04_Operator03 {
	
		/*
		  # 대입 연산자
		   
		   = : 왼쪽의 변수에 오른쪽의 값을 대입한다.
		   
		  # 복합 대입 연산자
		   
		   - 변수에 결과를 누적시키는 연산을 줄여서 표현한다.
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
		  # 단항 연산자
		   
		   - 1씩 누적시키는 연산을 더 줄여서 표현한 연산
		   - ++, --의 위치에 따라서 결과가 달라진다
		   
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
		
		// ++, --를 뒤에 붙이면 해당 줄의 모든 명령을 실행한 후에 값을 변화시킨다.
		num1 = 30;
		System.out.println(num1++);

		// ++, --를 앞에 붙이면 해당 줄의 모든 명령을 실행하기 전에 값을 변화시킨다.
		num1 = 30;
		System.out.println(++num1);
		

	}

}





























