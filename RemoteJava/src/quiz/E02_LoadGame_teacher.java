package quiz;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E02_LoadGame_teacher {
	
	
	static int[] score = {0, 0, 0};
	static String savePath = "files/game.sav";
	
	public static void main(String[] args) {
		
		// 0 : 컴퓨터 승리
		// 1 : 유저 승리
		// 2 : 무승부
		loadGame();
		
		for (int i = 0; i < 1000; i++) {
			int result = myGame();
			score[result]++;
		}
		
		System.out.println("1000번 테스트 후 전적 : " + Arrays.toString(score));
		
		saveGame();
		
	}
	public static void loadGame() {
		try {
			FileInputStream in = new FileInputStream(savePath);
			
			
			byte[] buffer = new byte[1024];
			
			int len = in.read(buffer);
			
			String[] score_list = new String(buffer, 0, len).split("/");
			
			score[0] = Integer.parseInt(score_list[0]);
			score[1] = Integer.parseInt(score_list[1]);
			score[2] = Integer.parseInt(score_list[2]);
			
			System.out.println(new String(buffer, 0, len));
			
			in.close();
			
		} catch (FileNotFoundException e ) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void saveGame() {
		try {
			FileOutputStream out = new FileOutputStream(savePath);
			
			String str = score[0] + "/" + score[1] + "/" + score[2];
			
			out.write(str.getBytes());
			
			out.close();
			
		} catch (FileNotFoundException e ) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static int myGame() {
		return (int)(Math.random() * 3);
	}
	
	
}
