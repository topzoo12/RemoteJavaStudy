package quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E02_LoadGame {
	
	/*
		아까 저장해둔 가위바위보 세이브 파일로부터 전적 정보를 읽어들인 후
		게임이 진행되도록 만들어 보세요 (다시 저장도 되어야 함)
	
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
					System.out.println("\n파일의 끝까지 읽었습니다.");
					
//					out.write("지난 게임 이후\n".getBytes());
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

























