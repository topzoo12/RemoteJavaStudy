package quiz;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E05_Decrypt {
		
	/*
	
		사용자로부터 파일명과 열쇠값을 입력받으면  
		해당 열쇠값으로 복호화 한 결과물을 생성하는 프로그램을 만들어 보세요 
		
		Test. 암호화 되어있는 Frankenstein_encrypted.txt를 복호화 해보세요 
	
	
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


















