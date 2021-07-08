import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class E05_HackTool {

	/*
		
		�츮�� ����� ��ȣ ����� Ű ���� 25���ۿ� ���� ������ ��ȣȭ ����Դϴ�.
		
		��ǥ ������ �� �� �κ� 10���� 1 ~ 25�� Ű�� ��� ��ȣȭ�ؼ� �ֿܼ� ����غ�����.
	
	*/
	
	
	public static void main(String[] args) {
		
//		for (int i = 1; i <= 26; i++ ){
//			System.out.println("==================================================================");
//			System.out.println("\t\t\t��ȣȭ �õ� " + i + "��°");
//			System.out.println("==================================================================");
//			System.out.print("��ȣȭ �õ� " + i + "��° : ");
//			printDecryption("files/frankenstein_encrypted.txt", i);
//			System.out.println("==================================================================");
//		}
		bruteforce("files/frankenstein_encrypted.txt");
//		decryption("files/frankenstein_encrypted.txt", 1);
	}
	
	public static void bruteforce(String path) {
		ArrayList<String> lines = new ArrayList<>();
		File target = new File(path);
		
		try(
			FileReader fin = new FileReader(target);
			BufferedReader in = new BufferedReader(fin);
		) {
			String line;
			for (int i = 0;i < 10 && (line = in.readLine()) != null; i++) {
				// ���� ����ְų� ���ڰ� 5���� �ȵǴ� ���� �Ⱥ��ɷ� ġ�ڴ�.
				if (line.trim().equals("") || line.length() < 5) {
					--i;
				}else {				
					lines.add(line);
				}
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scanner sc = new Scanner(System.in);
		
		for (int key = 1; key <= 26; key++) {
			System.out.printf("------------- key : %d -------------- \n", key);
			for (String line : lines) {
				
				for (char ch : line.toCharArray()) {
					if (Character.isUpperCase(ch)) {
						ch = (char)(ch - key < 'A' ? ch - key + 26 : ch - key);
					} else if (Character.isLowerCase(ch)) {
						ch = (char)(ch - key < 'a' ? ch - key + 26 : ch - key);
					}
					System.out.print(ch);
				}
				System.out.println();
			}
			System.out.println();
			
			System.out.println("Press 'Enter' to continue ....");
			String cmd = sc.nextLine();
			
			if (cmd.toLowerCase().equals("d")) {
				System.out.println("��ȣȭ�� �����մϴ�.");
				break;
			}
			
			System.out.println("���α׷� ��");
		}
	}
	
	public static boolean printDecryption(String path, int key) {
		
		File file = new File(path);
		
		String fileName = file.getName();
		
		try (
				FileReader fin = new FileReader(file);
				BufferedReader in = new BufferedReader(fin);
			) {
		
			String line;
			int cnt = 1;
			
			while ((line = in.readLine()) != null ) {
				for (char ch : line.toCharArray()) {
					if (Character.isUpperCase(ch)) {
						ch = (char)((ch - 'A' + key) % 26 + 'A');
					} else if (Character.isLowerCase(ch)) {
						ch = (char)((ch - 'a' + key) % 26 + 'a');
					}
					System.out.print(ch);
				}
				System.out.print("\n");
				cnt++;
				if (cnt == 2) {
					break;
				}
			}
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return true;
	}
	
	
	
	public static boolean decryption(String path, int key) {
		
		File file = new File(path);
		
		String fileName = file.getName();
		String realFileName = fileName.substring(0, fileName.indexOf("."));
		
		File dst = new File("files/" + realFileName + "_decrypted" + key + ".txt");
		
		try (
				FileReader fin = new FileReader(file);
				BufferedReader in = new BufferedReader(fin);
				FileWriter fout = new FileWriter(dst);
				BufferedWriter out = new BufferedWriter(fout)
			) {
		
			String line;
			int cnt = 1;
			
			while ((line = in.readLine()) != null ) {				

				for (char ch : line.toCharArray()) {
					if (Character.isUpperCase(ch)) {
						ch = (char)((ch - 'A' + key) % 26 + 'A');
					} else if (Character.isLowerCase(ch)) {
						ch = (char)((ch - 'a' + key) % 26 + 'a');
					}
//					out.append(ch);
				}
				in.read();
//				out.append("\n");
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














