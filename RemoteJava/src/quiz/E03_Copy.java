package quiz;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Arrays;

public class E03_Copy {
		/* 
		 * 
		  image 폴더 내부의 모든 내용을 image_copy 폴더 내부로 복사해보세요
	
		  EASY : 그냥 동작만 하면 정답 
		  HARD : 나중에 폴더 구조나 파일 이름이 변하더라도 올바르게 동작하면 정답
		  
		// list() : 해당 디렉토리 내부의 파일 이름들을 String[]로 배열로 가져온다
		// listFiles() : 해당 디렉토리 내부의 모든 파일들을 File[]로 가져온다
		System.out.println("f3 내부의 파일 이름들 : " + Arrays.toString(f3.list()));
		System.out.println(f3.listFiles());
		
		*/
	public static void main(String[] args) {
		
		File image = new File("image/flower");
	
//		System.out.println(image.getAbsolutePath());
		
		String image_lo = image.getAbsolutePath();
		
		File copy = new File("image_copy");
		
		newFolder(copy);
		
//		System.out.println(Arrays.toString(image.list()));
//		System.out.println(Arrays.toString(image.listFiles()));
//		System.out.println(image.list());
		
		int ch = -1;
		String aa = "";
		
		try {
			String[] file_list = new String(Arrays.toString(image.list())).split(",");
			
			for(int i = 0; i < file_list.length; i++) {
				System.out.println(file_list[i]);
				
				aa = image + file_list[i];
			}
			
			FileInputStream in = new FileInputStream("image/flower/flower.jpg");
			FileOutputStream out = new FileOutputStream("flower.jpg", true);
			
			while (in.read() != -1) {
				out.write(in.read());
			}
			
			in.close();
			out.close();
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
	}
	
	public static void newFolder(File folder) {
		
			if (!folder.exists()) {
				folder.mkdirs();	
			System.out.println("새로 생성함.");
		} else {
			System.out.println("이미 존재해서 생성하지 않음.");
		}
	}
	
	
	
	
}















