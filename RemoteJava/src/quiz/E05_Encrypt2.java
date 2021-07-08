package quiz;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E05_Encrypt2 {
	
	
	/*
	
	  Frankenstein.txt�� ��ȣȭ�� ���� Frankenstein_encrypted.txt�� ����� ������
	  �� ���谪�� ���������� ������ ���� ����� ���ͼ��� �ȵ�
	
	  # ��ȣ ���谪�� 2�� ���
	  	    +2
		C  -->  D
		A  -->  B
		R  -->  S
		
		CAR  -->  ECT
		ZOO  -->  BQQ
	  
	 */
	
//	public static String pw = "abcdeefghijklmnopqrstuvwxyz";
//	public static String pw1 = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	
	public static void main(String[] args) {
		
		try {
			File readFile = new File("files/Frankenstein.txt");
			File saveFile = new File("files/Frankenstein_encrypted.txt");
			Charset charset = Charset.forName("UTF-8");
			
			FileReader in = new FileReader(readFile, charset);
			FileWriter out = new FileWriter(saveFile, charset);
			
			char[] buffer = new char[1];
			
			int key = 2;
			
			int len = -1;
			String temp = "";
			
			int temp_num;
			
			while ((len = in.read(buffer)) != -1) {
				
				temp = new String(buffer);
				char ch = buffer[0];
				
				temp_num = (int)ch + key;
				
				if (ch >= 'a' && ch <= 'z') {
					if (temp_num > 'z') {
						out.write((char)(temp_num - 26));
					} else { 
						out.write((char)(temp_num));
					}
				} else if (ch >= 'A' && ch <= 'Z') {
					if (temp_num > 'Z') {
						out.write((char)(temp_num - 26));
					} else { 
						out.write((char)(temp_num));
					}
				} else {
					out.write(ch);
				}
				
//				out.write(ch);
				
			};
			
			out.close();
			in.close();
			
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
























