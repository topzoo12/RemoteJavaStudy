
public class C10_ForEach {
	
	public static void main(String[] args) {
	
		
		int[] numbers = {10, 20, 30, 40, 50, 60};
		
		// for each
		for (int number : numbers ) {
			System.out.println("숫자를 하나씩 꺼내 사용 : " + number);
		}
		
		for (int number : new int[] {100, 90, 88, 77, 66, 55, 44, 33, 22, 11}) {
			System.out.println("숫자를 하나씩 꺼내 사용2 : " + number);
		}
		
		boolean[] examResult = {true, false, true, true, false, true};
		
		for (boolean complete : examResult ) {
			if (complete) {
				System.out.println("통과");
			}else {
				System.out.println("불합격");
			}
		}
		
		
		
		
	}
}
