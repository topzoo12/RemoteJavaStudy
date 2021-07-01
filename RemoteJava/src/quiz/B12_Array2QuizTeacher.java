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
		// 1. numArr의 모든 값을 0 ~ 100 사이의 랜덤 정수로 바꿔 보세요.
		for (int row = 0; row < numArr.length; row++) {
			for (int column = 0; column < numArr[row].length; column++) {
				numArr[row][column] = (int)(Math.random() * 101);
			}
		}
		
		// ==============================================================================
		// 2. 랜덤으로 바뀐 numArr의 모든 값을 출력하고 총합과 평균(소수점 둘째 자리)을 구해서 출력해보세요.
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
		System.out.printf("총합: %d, 평균: %.2f\n", sum, sum / (double)count);
		System.out.println("===================================");
		
		// ==============================================================================
		// 3. numArr의 각 행의 합을 모두 구해서 출력해보세요.
		int[] rowSum = new int[numArr.length];
		
		for (int row = 0; row < numArr.length; row++) {
			for (int column = 0; column < numArr[row].length; column++) {
				rowSum[row] += numArr[row][column]; 
			}
			System.out.println(rowSum[row]);
		}
		System.out.println("===================================");
		
		// ==============================================================================
		// 4. numArr의 각 열의 합을 모두 구해서 출력해보세요.
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
		
		// 배열을 편리하게 문자열로 변환하기
		System.out.println("행의 합 : " + java.util.Arrays.toString(rowSum));
		System.out.println("열의 합 : " + java.util.Arrays.toString(colSum));
		

	}

}
