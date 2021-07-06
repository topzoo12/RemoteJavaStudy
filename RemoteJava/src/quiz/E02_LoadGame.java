package quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E02_LoadGame {
	
	/*
		�Ʊ� �����ص� ���������� ���̺� ���Ϸκ��� ���� ������ �о���� ��
		������ ����ǵ��� ����� ������ (�ٽ� ���嵵 �Ǿ�� ��)
	
	*/
	
	public static void main(String[] args) {
		E01_SaveGame d = new E01_SaveGame();
		byte[] buffer = new byte[3];
		
		try {  
			
			FileInputStream in = new FileInputStream("E01_SaveGame.txt");
			FileOutputStream out = new FileOutputStream("E01_SaveGame.txt", true);
			
			while (true) {
				int ch = in.read();
				
				if (ch == -1) {
					System.out.println("\n������ ������ �о����ϴ�.");
					
//					out.write("���� ���� ����\n".getBytes());
					out.close();
					break;
				} else {
					System.out.print(new String(buffer));
					System.out.print((char)ch);
				}	
			}
			
			System.out.println((char)in.read());
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
}

























