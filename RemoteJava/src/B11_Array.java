import java.util.Scanner;

public class B11_Array {
	
			/*
			
				# �迭 (Array )
				
				 - ���� Ÿ�� ������ �ѹ��� ������ �����ϴ� ���
				 - ���� �̸����� ������ ������ ������ �� �ε����� �����Ѵ�.
				 - �迭�� �ε���(�� ��ȣ)�� 0���� ��ü ���� -1���� �ִ�.
				 - �迭�� �ѹ� ũ�Ⱑ �������� ũ�⸦ ������ �� ����.
				 - �����ʹ� �ٸ��� �迭�� ������ ���ÿ� ��� ���� �ʱ�ȭ �Ǿ� �ִ�.
				   (���� : 0, �Ǽ�: 0.0, boolean: false, ������: null)
				 - ��� Ÿ���� �迭�� �ѹ��� ������ ������ �� �ִ�.
				 
			
			*/

	public static void main(String[] args) {
		
		Scanner[] scanners = new Scanner[10];
		
		scanners[0] = new Scanner(System.in);
		scanners[1] = new Scanner(System.in);
		scanners[2] = new Scanner(System.in);
		
		System.out.println("ù ��° ��ĳ��: " + scanners[0]);
		System.out.println("�� ��° ��ĳ��: " + scanners[1]);
		System.out.println("�� ��° ��ĳ��: " + scanners[2]);
		System.out.println("�� ��° ��ĳ��: " + scanners[3]);
		
		
		int[] randomNumbers = new int[100];
		
		randomNumbers[5] = 17;
		
		System.out.println(randomNumbers[0]);
		System.out.println(randomNumbers[1]);
		System.out.println(randomNumbers[2]);
		System.out.println(randomNumbers[3]);
		System.out.println(randomNumbers[4]);
		System.out.println(randomNumbers[5]);
		System.out.println(randomNumbers[6]);
		System.out.println(randomNumbers[7]);
		
		// �迭.length�� ���� �迭�� ��ü ���̸� �� �� �ִ�.
		System.out.println("randomNumbers�� ���� : " + randomNumbers.length);
		System.out.println("randomNumbers�� ������ �ε��� ��ȣ : " + (randomNumbers.length-1));
		System.out.println("scanners�� ���� : " + scanners.length);
		System.out.println("scanners�� ������ �ε��� ��ȣ : " + (scanners.length-1));
		
		
		/*
		
			# �迭 ���� ��� 
			
			 1. Ÿ��[] ������ = new Ÿ��[ũ��];
			 2. Ÿ��[] ������ = {��1, ��2, ��3, ��4, ��5 ....};
			 3. Ÿ��[] ������ = new Ÿ��[] { ��1, ��2, ��3, ��4, ��5 .... }; 
			 
		
		*/
		
		int[] numbers = new int[10];
		char[] blacklist = {'#', '@', '&', '^', '\\', 99, 111};
		boolean[] passExam = new boolean[] {true, false, false, true};
		
		int[] units = {
				365 * 24 * 60 * 60,
				24 * 60 * 60,
				60 * 60,
				60
				};
		
		// �迭�� �ݺ����� �Բ� ������ ����Ǿ� �ִ�.
		for (int i = 0; i < blacklist.length; i++) {
			System.out.println(blacklist[i]);
		}
		
		// String�� char[]�� ��ȯ�� �� �ִ�.
		String message = "Hello, woooorld!!";
		
		char[] hello = "Hello, World!".toCharArray();
		
		for (int i = 0; i < hello.length; i++) {
			System.out.printf("hello[%d] : %c\n", i, hello[i]);
		}
		
		
		
		
		

	}

}















