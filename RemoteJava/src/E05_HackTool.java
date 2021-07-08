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
		
		우리가 사용한 암호 방식은 키 값이 25개밖에 없는 허접한 암호화 방식입니다.
		
		목표 파일의 맨 앞 부분 10줄을 1 ~ 25의 키로 모두 복호화해서 콘솔에 출력해보세요.
	
	*/
	
	
	public static void main(String[] args) {
		
//		for (int i = 1; i <= 26; i++ ){
//			System.out.println("==================================================================");
//			System.out.println("\t\t\t복호화 시도 " + i + "번째");
//			System.out.println("==================================================================");
//			System.out.print("복호화 시도 " + i + "번째 : ");
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
				// 줄이 비어있거나 문자가 5개도 안되는 줄은 안본걸로 치겠다.
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
				System.out.println("복호화를 진행합니다.");
				break;
			}
			
			System.out.println("프로그램 끝");
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
		 
		System.out.printf("복호화 성공! [키 : %d]\n", key);
		
		return true;
	}
	
	
}














