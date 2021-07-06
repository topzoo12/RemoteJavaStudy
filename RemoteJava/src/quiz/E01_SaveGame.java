package quiz;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class E01_SaveGame {

	/*
		
		간단한 컴퓨터와의 가위바위보 게임을 하나 만들고, 전적을 파일에 저장해보세요 
	
	*/
	
	/* 
	  가위 = 1 
	  바위 = 2
	  보 = 3
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
				result = "비겼습니다.";
			} else if (p1 == 1 && com == 3) {
				result = "p1 이 이겼습니다."; 
			} else if (p1 == 2 && com == 1) {
				result = "p1 이 이겼습니다."; 
			} else if (p1 == 3 && com == 2) {
				result = "p1 이 이겼습니다."; 
			} else {
				result = "com 이 이겼습니다.";
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


















