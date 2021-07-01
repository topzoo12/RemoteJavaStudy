package quiz;

import java.util.Arrays;

public class C01_FunctionQuiz2 {
	/*
  	
  	# ������ �Լ��� �����ϰ� �ùٸ��� �����ϴ��� �׽�Ʈ �غ�����2
  	 
   	  1. �ִ밪�� �Ű������� ���޹����� 
   	     0���� �ִ밪 �̸��� ��� ���� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
   	     range �Լ��� ��������.
   	     
   	     ex) range(10)�� ��� -> [0, 1, 2, 3, 4, 5, 6, 7, 8, 9] 
   	  
  	  2. �ּҰ��� �ִ밪�� �Ű������� ���޹����� 
  	     �ּҰ����� �ִ밪 �̸��� ��� �������� �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
  	     range �Լ��� ����� ������
  	      
  	     ex) range(5, 10)�� ��� -> [5, 6, 7, 8, 9]
  	  
  	  3. �ּҰ��� �ִ밪�� �������� �Ű������� ���޹�����
  	     �ּҰ����� �ִ밪 �̸����� ��������ŭ �����ϴ� int �迭�� �����Ͽ� ��ȯ�ϴ�
  	     range �Լ��� ����� ������
  	     
  	     ex) range(40, 50, 3)�� ��� -> [40, 43, 46, 49]
  	         range(40, 45, 5)�� ��� -> [40]
  	         
 */
	
	/* 
	   # �Լ� �����ε� (overloading)
	    - �Ű������� ���� �Ǵ� Ÿ���� �ٸ��� �Ȱ��� �Լ����� ����� �� �ִ�.
	  
	*/
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(range(40)));
		System.out.println(Arrays.toString(range(40, 50)));
		System.out.println(Arrays.toString(range(40, 45, 5)));

	}
	public static int[] range(float num) {
		
		// println()���� �پ��� Ÿ�Ե��� �����ε��� �����Ѵ�.
		System.out.println();
		System.out.println(123);
		System.out.println("123");
		System.out.println('A');
		
		
		return null;
	}
	
	
	
	// 1. ====================================================================
	public static int[] range(int max) {
		
		int[] array = new int[max];
		
		for (int i = 0; i < max; i++) {
			array[i] = i;
		}
		return array;
	}
	// 1. ====================================================================
	// 2. ====================================================================
	public static int[] range(int start, int end) {
		/*
		int size = max - min;
		int index = 0;
		
		int[] array = new int[size];
		
		for (int i = min; i < max; i++) {
			array[index] = i;
			index++;
		}
		
		return array;
		*/
				
		int increase =  start > end ? -1 : 1;
		int[] arr = new int[increase < 0 ? start - end : end - start];
		
		for (int value = start, index = 0; value != end; value += increase) {
			arr[index++] = value;
		}
		return arr;
		
		
		
	}
	// 2. ====================================================================
	// 3. ====================================================================
	
	/**
	  
	  ����ȭ �ּ� ( �� ��ɿ� ���� ������ �� �� �ִ�)
	  
	  @start
	   	�����ϴ� ���� ��������
	  @end
	  	������ ���� �������� 
	  @return
	  	�߸��� ���� �Է��ϸ� null�� ������, ����� ������ int[]�� ���ɴϴ�.
	  
	 */
	public static int[] range(int start, int end, int increase) {
		/*
		int size;
		
		if ((end - start) % increase == 0) {
			size = (end - start) / increase ;
		} else {
		  size = ((end - start) / increase) + 1;  
		}
		
		int[] array = new int[size];
		int index = 0;
		
		for (int i = start; i < end; i += increase) {
			//System.out.println(i);
			array[index] = i;
			index++;
			//i += (increase-1);
		}
		
		return array;
		*/
		if (increase < 0 && start <= end) {
			return null;
		} else if (increase > 0 && start >= end) {
			return null;
		} else if (increase == 0) {
			return null;
		}
		int size;
		
		if (increase > 0) {
			int range = end - start;
			size = range % increase == 0 ? range / increase : range / increase + 1; 
		} else { 
			int range = end - start;
			size = range % (increase * 1) == 0 ? range / (increase * -1) : (increase * -1) + 1;
		}
		
		int[] arr = new int[size];
		
		for (int value = start, index = 0; increase > 0 ? value < end : value > end; value += increase) {
			if (increase > 0 && value > end) {
				break;
			} else if (increase < 0 && value < end) {
				break;
			}
			
			arr[index++] = value;
		}
		
		return arr;
	}
	// 3. ====================================================================

}
