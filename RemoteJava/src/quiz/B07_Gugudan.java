package quiz;

public class B07_Gugudan {
	
		/*
			
			1. �������� ������ ���� ���η� ����غ�����
			
			  2��: 2x1=2 2x2=4 2x3=6 ...
			  3��: 3x1=3 3x2=6 3x3=9 ...
			  4��: 4x1=2
			
			2. �������� ������ ���� ���η� ����غ�����
			
			  2��		3��		4��
			  2x1=2		2x1=2	2x1=2	....
			  2x2=4		2x1=2	2x1=2	....
			  2x3=6		2x1=2	2x1=2	....
	
		*/

	public static void main(String[] args) {
		
		for (int x=2; x<=9; x++) {
			System.out.print(x + "��: ");	
			for (int y=1; y<=9; y++) {
				//System.out.print(x + "x" + y + "=" + x*y +"\t");
				System.out.printf("%dx%d=%-2d ", x, y, x*y);
			}
			System.out.print("\n");
		}
		
		System.out.print("=======================================================\n");
		
		for (int x=0; x<=9; x++) {
			for (int y=2; y<=9; y++) {
				if (x==0) {
					System.out.print(y + "��\t");
				}else {
					System.out.print(y + "x" + x + "=" + x*y +"\t");
				}
			}
			System.out.print("\n");
		}
		
		

	}

}
