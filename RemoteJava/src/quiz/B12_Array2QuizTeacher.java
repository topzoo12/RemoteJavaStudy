package quiz;

public class B12_Array2QuizTeacher {

	public static void main(String[] args) {
		
		int[][] numArr = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1},
			{1, 1},
			{1, 1, 1, 1}
		};
		
		// ==============================================================================
		// 1. numArr�� ��� ���� 0 ~ 100 ������ ���� ������ �ٲ� ������.
		for (int row = 0; row < numArr.length; row++) {
			for (int column = 0; column < numArr[row].length; column++) {
				numArr[row][column] = (int)(Math.random() * 101);
			}
		}
		
		// ==============================================================================
		// 2. �������� �ٲ� numArr�� ��� ���� ����ϰ� ���հ� ���(�Ҽ��� ��° �ڸ�)�� ���ؼ� ����غ�����.
		int sum = 0;
		int count = 0;
		
		for (int row = 0; row < numArr.length; row++) {
			
			int len = numArr[row].length;
			count += len;
					
			for (int column = 0; column < numArr[row].length; column++) {
				System.out.print(numArr[row][column] + "\t");
				sum += numArr[row][column];
			}
			System.out.println();
		}
		System.out.println("===================================");
		System.out.printf("����: %d, ���: %.2f\n", sum, sum / (double)count);
		System.out.println("===================================");
		
		// ==============================================================================
		// 3. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����.
		int[] rowSum = new int[numArr.length];
		
		for (int row = 0; row < numArr.length; row++) {
			for (int column = 0; column < numArr[row].length; column++) {
				rowSum[row] += numArr[row][column]; 
			}
			System.out.println(rowSum[row]);
		}
		System.out.println("===================================");
		
		// ==============================================================================
		// 4. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����.
		int max_len = 0; 
		
		for (int row = 0; row < numArr.length; row++) {
			max_len = Math.max(max_len, numArr[row].length);
		}
		
		int[] colSum = new int[max_len];
		
		for (int row = 0; row < numArr.length; row++) {
			for (int column = 0; column < numArr[row].length; column++) {
				 colSum[column] += numArr[row][column];
			}
		}
		
		// �迭�� ���ϰ� ���ڿ��� ��ȯ�ϱ�
		System.out.println("���� �� : " + java.util.Arrays.toString(rowSum));
		System.out.println("���� �� : " + java.util.Arrays.toString(colSum));
		

	}

}
