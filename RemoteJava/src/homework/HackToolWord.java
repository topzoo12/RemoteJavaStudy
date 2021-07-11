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

public class HackToolWord {
	
	static ArrayList<String> words = new ArrayList<>();
//	static ArrayList<Integer> word_cnt = new ArrayList<>();
//	static int[] word_cnt = new int[words.size()];
	

	public static void main(String[] args) {
		
		word("files/word.txt");
//		check("files/frankenstein_encrypted.txt");
		bruteforce("files/frankenstein_encrypted.txt");
		
//		System.out.println(words.size());
//		System.out.println(word_cnt.length);
		
//		for (int i = 0; i < word_cnt.length-1; i++) {
//			if (word_cnt[i] > 1) {
//				System.out.print(words.get(i));
//				System.out.print(" / ");
//				System.out.println(word_cnt[i]);
//			}
//		}
	}
	
	public static void check(String path) {
		
		File target = new File(path);
		
		int[] word_cnt = new int[words.size()];
//		System.out.println("word_cnt의 사이즈는 : " + word_cnt.length);
		
		try(
				FileReader fin = new FileReader(target);
				BufferedReader in = new BufferedReader(fin);
			) {
			
				Scanner sc = new Scanner(System.in);
				
				String line;
				int temp = 0;
				
				for (int i = 0; (line = in.readLine()) != null; i++) {
					
//					if (i == 100) {break;}
//					System.out.println(i + " : " + line);
//					check_text.add(line);
					
//					System.out.println(line.indexOf("eric"));
					for (int ii = 0; ii < words.size(); ii++) {
//						System.out.print(words.get(ii) + " ");
						
						String a, b;
						a = line.replaceAll(" ", "").toUpperCase();
						b = words.get(ii).replaceAll(" ", "").toUpperCase();
//						System.out.println(a + " / " + b);
						
						int found = -1;
						while ((found = a.indexOf(b, found + 1)) != -1 ) {
							System.out.println((i+1) + " -> " + line + " : 에서 포함 " + words.get(ii));
							word_cnt[ii] += 1;	
						}
						
//						if (a.indexOf(b) > -1 ) {
//							if (b.equals("Project".toUpperCase())) {
//								System.out.println((i+1) + " : " + line + " : 에서 포함 " + words.get(ii));
//							}
//						if (line.toUpperCase().indexOf(words.get(ii).toUpperCase()) > -1 ) {
//							System.out.println("    " + line + " : 에서 포함 " + words.get(ii));
//							word_cnt[ii] += 1;	
//						}
					}	
//					System.out.println();
				}
				
			for (int i = 0; i < word_cnt.length; i++) {
				if (word_cnt[i] > 0) {
					System.out.println((i+1) +  " -> '" + words.get(i) + "'은 " + word_cnt[i] + "번 포함");
				}
//				if (word_cnt[i] >= 1) {
//					System.out.print(words.get(i));
//					System.out.print(" / ");
//					System.out.println(word_cnt[i]);
//				}
			}
				
//				for (int x = 0; x < words.size(); x++) {
//					if (word_cnt.get(x) >= 1 ) {
//						System.out.print(words.get(x));
//						System.out.print(" / ");
//						System.out.println(word_cnt.get(x));
//					}
//				}
				
				
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
//				word_cnt[i] = 0;
//				word_cnt.add(0);
			} 
			
//			System.out.println(lines.size());
//			System.out.println(lines.get(10));
//			for (int i = 0; i < lines.size(); i++) {
//				System.out.println(i);
//				System.out.print(lines.get(i) + " / ");
//				if (i % 100 == 0) {
//					System.out.println();
//				}
//			}
//			System.out.println(lines.get(10));
			
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
			for (int i = 0; (line = in.readLine()) != null; i++) {
					lines.add(line);
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
//		Scanner sc = new Scanner(System.in);
		int temp= 0;
		
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
			
//			System.out.println("Press 'Enter' to continue ....");
//			String cmd = sc.nextLine();
			
//			if (cmd.toLowerCase().equals("d")) {
//				System.out.println("복호화를 진행합니다.");
//				break;
//			}
			
			System.out.println("프로그램 끝");
		}
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
	


