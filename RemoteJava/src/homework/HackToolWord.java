package homework;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HackToolWord {
	
	static ArrayList<String> words = new ArrayList<>();
//	static ArrayList<Integer> word_cnt = new ArrayList<>();
//	static int[] word_cnt = new int[words.size()];
	

	public static void main(String[] args) {
		
		word("files/word.txt");
		check("files/frankenstein.txt");
		
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
		
		try(
				FileReader fin = new FileReader(target);
				BufferedReader in = new BufferedReader(fin);
			) {
				String line;
				int temp = 0;
				for (int i = 0; (line = in.readLine()) != null; i++) {
					if (i == 100) {
						break;
					}
//					check_text.add(line);
					
//					System.out.println(line.indexOf("eric"));
					System.out.println(i + " : " + line);
					for (int ii = 0; ii < words.size(); ii++) {
						
						if (line.indexOf(words.get(ii)) > 0 ) {
							System.out.println(line + " : 에서 포함 " + words.get(ii));
//							System.out.println(words.get(ii));							
							word_cnt[ii] += 1;
//							word_cnt.add(ii, (word_cnt.get(ii) + 1));
//							
						}
					}	
				}
				
			for (int i = 0; i < word_cnt.length-1; i++) {
				if (word_cnt[i] > 1) {
					System.out.print(words.get(i));
					System.out.print(" / ");
					System.out.println(word_cnt[i]);
				}
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
	}
	


