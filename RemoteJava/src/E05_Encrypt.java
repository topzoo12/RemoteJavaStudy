import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class E05_Encrypt {
	
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

	
	public static void main(String[] args) {
		
		encryption("files/frankenstein.txt", (int)(Math.random() * 26 + 1));
		
	}
	
	public static boolean encryption(String path, int key) {
		
		File file = new File(path);
		
		String fileName = file.getName();
		String realFileName = fileName.substring(0, fileName.indexOf("."));
		
		File dst = new File("files/" + realFileName + "_encrypted.txt");
		
		try (
				FileReader fin = new FileReader(file);
				BufferedReader in = new BufferedReader(fin);
				FileWriter fout = new FileWriter(dst);
				BufferedWriter out = new BufferedWriter(fout)
			) {
		
			String line;
			
			while ((line = in.readLine()) != null ) {				
//				System.out.println(line);
				
//				line = line + '\n';
				for (char ch : line.toCharArray()) {
					if (Character.isUpperCase(ch)) {
						ch = (char)((ch - 'A' + key) % 26 + 'A');
//						ch = (char)((ch + key) % 26 + 'A');
					} else if (Character.isLowerCase(ch)) {
						ch = (char)((ch - 'a' + key) % 26 + 'a');
//						ch = (char)((ch + key) % 26 + 'a');
					}
					out.append(ch);
				}
				out.append("\n");
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		 
		System.out.printf("��ȣȭ ����! [Ű : %d]\n", key);
		
		return true;
	}
	
}
























