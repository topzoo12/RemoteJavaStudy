package quiz;

public class B12_Array2Quiz {

	public static void main(String[] args) {
		
		int[][] numArr = new int[][] {
			{1, 1, 1, 1},
			{1, 1, 1, 1, 1, 1, 1},
			{1, 1, 1, 1, 1},
			{1, 1},
			{1, 1, 1, 1}
		};
		
		// 1. numArr�� ��� ���� 0 ~ 100 ������ ���� ������ �ٲ� ������.
		
		// 2. �������� �ٲ� numArr�� ��� ���� ����ϰ� ���հ� ���(�Ҽ��� ��° �ڸ�)�� ���ؼ� ����غ�����.
		
		// 3. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����.
		
		// 4. numArr�� �� ���� ���� ��� ���ؼ� ����غ�����.
		
		int sum = 0;
		double average = 0;
		int cnt = 0;
		int w_sum = 0;
		int h_sum = 0;
		int max_length = 0;
		
		 
		
		for (int i = 0; i < numArr.length; i++) { 
			for (int j = 0; j < numArr[i].length; j++) {
				
				numArr[i][j] = (int)(Math.random() * 101);
				System.out.printf("numArr[%d][%d]: %d", i, j, numArr[i][j]);
				System.out.print(" ");
				sum += numArr[i][j];
				cnt++;
				System.out.print("\t" + cnt + " ��°\n");
			}
			if (max_length <= numArr[i].length) { 
				max_length = numArr[i].length;
			}
			
		}
		
		int[] w_sum_arr = new int[numArr.length]; 
		int[] h_sum_arr = new int[max_length];
		
		average = sum/(double)cnt;
		
		
		//System.out.println("max : " + max_length);
		System.out.println("==============================");
		
		for (int i = 0; i < numArr.length; i++) {
			for (int j = 0; j < numArr[i].length; j++) {
				System.out.print(numArr[i][j] + "\t");
			}
			System.out.println();
		}
		
		System.out.println("==============================");
		for (int i = 0; i < numArr.length; i++) {
			w_sum = 0;
			for (int j = 0; j < numArr[i].length; j++) {
				w_sum += numArr[i][j];
			}
			w_sum_arr[i] = w_sum;
			System.out.println(i + " ���� ���� : " + w_sum);
		}
		System.out.println("==============================");
		//System.out.println(numArr[3][2]);
		for (int i = 0; i < max_length; i++) {
						
			h_sum = 0;
			
			for (int j = 0; j < numArr.length; j++) {
				if (i < numArr[j].length) {
					h_sum += numArr[j][i];
				}
			}
			h_sum_arr[i] = h_sum;
			System.out.println(i + " ���� ���� : " + h_sum);
		}
		System.out.println("==============================");
		
		
		System.out.println("�迭�� ��� ���� ������ : " + sum + "�Դϴ�.");
		System.out.println("�迭�� ��� ���� ����� : " + average + "�Դϴ�.");
		System.out.println("�迭�� ��� ���� ����� : " + (Math.round(average * 100) / 100.00) + "�Դϴ�.");
		
		System.out.println("==============================");
		
		for (int i = 0; i < w_sum_arr.length; i++) {
			System.out.print(w_sum_arr[i] + "\t");
			//System.out.println("�迭 ������ ���� - " + w_sum_arr[i]);
		}
		System.out.println();
		
		System.out.println("==============================");
		
		for (int i = 0; i < h_sum_arr.length; i++) {
			System.out.print(h_sum_arr[i] + "\t");
			//System.out.println("�迭 ������ ���� - " + h_sum_arr[i]);
		}		
		System.out.println();
	}

}
