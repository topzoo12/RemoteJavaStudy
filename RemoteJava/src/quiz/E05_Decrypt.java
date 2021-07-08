package quiz;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E05_Decrypt {
		
	/*
	
		����ڷκ��� ���ϸ�� ���谪�� �Է¹�����  
		�ش� ���谪���� ��ȣȭ �� ������� �����ϴ� ���α׷��� ����� ������ 
		
		Test. ��ȣȭ �Ǿ��ִ� Frankenstein_encrypted.txt�� ��ȣȭ �غ����� 
	
	
	*/

	public static void main(String[] args) {
		
		try {
			File readFile = new File("files/Frankenstein_encrypted.txt");
			File saveFile = new File("files/Frankenstein_encrypted1.txt");
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
				
				temp_num = (int)ch - key;
				
				if (ch >= 'a' && ch <= 'z') {
					if (temp_num < 'a') {
						out.write((char)(temp_num + 26));
					} else { 
						out.write((char)(temp_num));
					}
				} else if (ch >= 'A' && ch <= 'Z') {
					if (temp_num < 'A') {
						out.write((char)(temp_num + 26));
					} else { 
						out.write((char)(temp_num));
					}
				} else {
					out.write(ch);
				}
			}
			
			out.close();
			in.close();
			
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
		
	}
	
	
	
}


















