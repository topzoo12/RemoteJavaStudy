package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_SaveGame {

	/*
		
		������ ��ǻ�Ϳ��� ���������� ������ �ϳ� �����, ������ ���Ͽ� �����غ����� 
	
	*/
	
	/* 
	  ���� = 1 
	  ���� = 2
	  �� = 3
	*/
	
	public static void main(String[] args) throws FileNotFoundException {
		
		FileOutputStream out = new FileOutputStream("E01_SaveGame.txt", true);
		
		int p1, com = 0;
		String result = "";
		
		p1 = (int)(((Math.random() * 3) + 1));
		com = (int)(((Math.random() * 3) + 1));
		
//		System.out.println(p1);
//		System.out.println(com);
		
//		System.out.println(check);
		
		try {  
			if (p1 == com) {
				result = "�����ϴ�.";
			} else if (p1 == 1 && com == 3) {
				result = "p1 �� �̰���ϴ�."; 
			} else if (p1 == 2 && com == 1) {
				result = "p1 �� �̰���ϴ�."; 
			} else if (p1 == 3 && com == 2) {
				result = "p1 �� �̰���ϴ�."; 
			} else {
				result = "com �� �̰���ϴ�.";
			}
			
			result += "\n";
			
			out.write(result.getBytes());
			
			out.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	
}


















