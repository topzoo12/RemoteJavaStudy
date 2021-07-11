package homework;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HackToolWord1 {
	
	static ArrayList<String> words = new ArrayList<>();
	static ArrayList<String> check_temp = new ArrayList<>();
//	static ArrayList<Integer> word_cnt = new ArrayList<>();
//	static int[] word_cnt = new int[words.size()];
	static int[] accuracy = new int[26];
	

	public static void main(String[] args) {
		
		word("files/word.txt");
//		check("files/frankenstein_encrypted.txt");
//		bruteforce("files/frankenstein.txt");
		bruteforce("files/frankenstein_encrypted.txt");

	}
	
	public static void check(String path) {
		
		File target = new File(path);
		
		int[] word_cnt = new int[words.size()];
//		System.out.println("word_cnt의 사이즈는 : " + word_cnt.length);
		
		try(
				FileReader fin = new FileReader(target);
				BufferedReader in = new BufferedReader(fin);
			) {
			
				String line;
				int temp = 0;
				
				for (int i = 0; (line = in.readLine()) != null; i++) {
					
					for (int ii = 0; ii < words.size(); ii++) {
						
						String a, b;
						a = line.replaceAll(" ", "").toUpperCase();
						b = words.get(ii).replaceAll(" ", "").toUpperCase();
						
						int found = -1;
						while ((found = a.indexOf(b, found + 1)) != -1 ) {
							System.out.println((i+1) + " -> " + line + " : 에서 포함 " + words.get(ii));
							word_cnt[ii] += 1;	
						}
					}	
				}
				
				for (int i = 0; i < word_cnt.length; i++) {
					if (word_cnt[i] > 0) {
						System.out.println((i+1) +  " -> '" + words.get(i) + "'은 " + word_cnt[i] + "번 포함");
					}
				}
			
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} catch (IOException e) {
				e.printStackTrace();
			}
	}
	
	
	public static void word(String path) {
//		ArrayList<String> lines = new ArrayList<>();
		File target = new File(path);
//		System.out.println(target.getAbsolutePath());
		
		try(
			FileReader fin = new FileReader(target);
			BufferedReader in = new BufferedReader(fin);
		) {
			String line;
			for (int i = 0; (line = in.readLine()) != null; i++) {
				words.add(line);
			} 
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

			
//			System.out.println("프로그램 끝");
		}
	
	public static void bruteforce(String path) {
		ArrayList<String> lines = new ArrayList<>();
		File target = new File(path);
		
		try(
			FileReader fin = new FileReader(target);
			BufferedReader in = new BufferedReader(fin);
		) {
			String line;
//			for (int i = 0; (line = in.readLine()) != null; i++) {
//					lines.add(line);
//			}
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
		
		int temp= 0;
		String txt_temp = "";
		
		for (int key = 1; key <= 26; key++) {
			temp = 1;
//			System.out.printf("------------- key : %d -------------- \n", key);
			for (String line : lines) {
				for (char ch : line.toCharArray()) {

					if (Character.isUpperCase(ch)) {
						ch = (char)(ch - key < 'A' ? ch - key + 26 : ch - key);
					} else if (Character.isLowerCase(ch)) {
						ch = (char)(ch - key < 'a' ? ch - key + 26 : ch - key);
					}
//					System.out.print(ch);
					txt_temp += ch;
				}
//				System.out.println();
				
				for (int x = 0; x < words.size(); x++) {
//					for (int x = 0; x < 1; x++) {
//					System.out.println(words.size() + "     in     " + words.get(x));
//					System.out.println(txt_temp);
					String a = txt_temp.replaceAll(" " , "").toUpperCase();
					String b = words.get(x).replaceAll(" ", "").toUpperCase();
//					b = "Project".replaceAll(" ", "").toUpperCase();
//					b = "electronic".replaceAll(" ", "").toUpperCase();
//					b = "Frankenstein".replaceAll(" ", "").toUpperCase();
//					b = "gutenberg".replaceAll(" ", "").toUpperCase();
					
					if (a.indexOf(b) > -1) {
//					if (txt_temp.replaceAll(" " , "").toUpperCase().indexOf(words.get(x).replaceAll(" ", "").toUpperCase()) > -1) {
//						System.out.println(words.get(x));
//						System.out.println(txt_temp.replaceAll(" " , "").toUpperCase().indexOf(words.get(x).replaceAll(" ", "").toUpperCase()));
//						System.out.println(temp + " : " + a);
						temp += 1;
						accuracy[key-1] += 1;
					}
				}
				txt_temp ="";
			}
//			System.out.println("  " + txt_temp);
//			System.out.println();
			
//			System.out.println("Press 'Enter' to continue ....");
//			String cmd = sc.nextLine();
			
//			if (cmd.toLowerCase().equals("d")) {
//				System.out.println("복호화를 진행합니다.");
//				break;
//			}
		}
		for (int i = 0; i < accuracy.length; i++) {
			System.out.println((i+1) + "의 단어 포함 수 -> " + accuracy[i]);
		}
		
		System.out.println("프로그램 끝");
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
	


