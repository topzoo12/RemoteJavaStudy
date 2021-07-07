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
		  image ���� ������ ��� ������ image_copy ���� ���η� �����غ�����
	
		  EASY : �׳� ���۸� �ϸ� ���� 
		  HARD : ���߿� ���� ������ ���� �̸��� ���ϴ��� �ùٸ��� �����ϸ� ����
		  
		// list() : �ش� ���丮 ������ ���� �̸����� String[]�� �迭�� �����´�
		// listFiles() : �ش� ���丮 ������ ��� ���ϵ��� File[]�� �����´�
		System.out.println("f3 ������ ���� �̸��� : " + Arrays.toString(f3.list()));
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
			System.out.println("���� ������.");
		} else {
			System.out.println("�̹� �����ؼ� �������� ����.");
		}
	}
	
	
	
	
}















