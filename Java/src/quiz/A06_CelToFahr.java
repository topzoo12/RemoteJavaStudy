package quiz;
import java.util.Scanner;

public class A06_CelToFahr {
		
		/*
		  
		  사용자로부터 섭씨 온도를 입력받으면 화씨 온도로 변환하여 출력해주는 프로그램을 만들어보세요
		  (변환 공식은 검색 허용, 출력은 소수 첫째 자리까지)
		   
		   (0°C × 9/5) + 32 = 32°F
			섭씨 - Celsius
			화씨 - Fahrenheit
			
		 */
	
	
		public static void main(String[] args) {
		
			Scanner sc = new Scanner(System.in);
			
			System.out.println("현재 온도는 몇도 입니까?_(섭씨)");
			
			double ce = sc.nextDouble();
			
			System.out.println("현재의 온도는 " + ce + "도 입니다.");
			
			double fffa = (double)(ce * 9 / 5) + 32;
			
			System.out.println(fffa);
			System.out.printf("%.1f°C는 %.1f°F입니다.", ce, fffa);

			//double Fahrenheit = Math.round( ((Celsius*9/5) + 32));

			//System.out.println("현재의 온도를 화씨로 변환하면 " + fffa + "도 입니다.");
			
			//int Fahrenheit = sc.nextInt();
			
			// ---------------------------------------------------------------------
			/*
			double cel, fahr;
			
			Scanner sc1 = new Scanner(System.in);
			cel = sc1.nextDouble();
			
			System.out.println("");
			cel = sc.nextDouble();
			fahr = (cel * 9 / 5) + 32;
			System.out.printf("%.1f°C는 %.1f°F입니다.", cel, fahr);
			
			*/
			
		}
	
}
