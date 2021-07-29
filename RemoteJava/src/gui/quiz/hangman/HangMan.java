package gui.quiz.hangman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HangMan {
	
	/*
		행맨을 만들어보세요
		
		1. 어떤 단어가 답인경우 해당 단어의 길이만큼 _를 출력해준다.
		
		ex) apple이 답인경우 _ _ _ _ _ 를 출력
		
		2. 사용자가 알파벳을 하나씩 입력하는 경우 해당 알파벳이 포함되어 있다면 _를 알파벳으로 바꾼다
		
		ex) 사용자가 p를 입력했다면 _ p p _ _ 를 출력
		
		3. 사용자가 모든 _ 를 제거하면 몇 번만에 맞췄는지 출력해주세요
		
		4. 단어는 단어들이 적혀있는 파일에서 하나를 랜덤으로 뽑아주세요
		
	*/
	
	static ArrayList<String> words = new ArrayList<>();
	static ArrayList<String> quiz_word = new ArrayList<>();
	static ArrayList<String> quiz_word_result = new ArrayList<>();
	
	static boolean end = true;
	
	static int count_num = 0;
	
	
	
	public static void setting(String file) {
		
		String temp; 
		
		try (
				FileReader fin = new FileReader(file);
				BufferedReader in = new BufferedReader(fin);
			) {
		
			String line;
			
			while ((line = in.readLine()) != null ) {
				words.add(line);
			}
			
			temp = words.get((int)(Math.random() * words.size()));
			System.out.println(temp);
			for (int i = 0; i < temp.length(); i++) {
				quiz_word.add("" + temp.charAt(i));
				quiz_word_result.add("_");
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	public static void play(String alpha) {

//		System.out.println(alpha);
		String a, b;
		
		alpha = alpha.toLowerCase();
		
		for (int i = 0; i < quiz_word.size(); i++) {
			
			a = quiz_word_result.get(i).toLowerCase();
			b = quiz_word.get(i).toLowerCase();
			
			if (a.equals("_") && b.equals(alpha)) {
				quiz_word_result.set(i, "" + quiz_word.get(i));
			} else if (!quiz_word_result.get(i).equals("_")) {
			} else {
				quiz_word_result.set(i, "_");
			}
			
		}
		
	}
	
	public static void main(String[] args) {
		
		String word_list = "hang/1.txt";
		
		String input_text;
		
		setting(word_list);

//		play(words.get((int)(Math.random() * words.size())));

//		for(int i = 0; i < words.size(); i++) {
//			System.out.println(words.get(i));
//		}
		for (int i = 0; i < quiz_word.size(); i++) {
			System.out.print("_ ");
		}
		System.out.println();
		System.out.println("맞춰야 할 단어의 길이입니다. 알파벳을 입력하여 단어를 완성하세요");
		
		Scanner sc = new Scanner(System.in);
		
		int end_len = quiz_word_result.size();
		
		while (end) {
			count_num++;
			System.out.println(count_num + " 번째 도전");
			input_text = sc.nextLine();
			boolean aa = Character.isAlphabetic((input_text.charAt(0)));
			
			if (input_text.length() != 1) {
				System.out.println("1글자의 알파벳만 입력해주세요");
			} else if(aa == false) {
				System.out.println("영문자만 입력해주세요");
			} else {
				play(input_text);
			}
			
			for (int x = 0; x < quiz_word_result.size(); x++) {

				end_len = quiz_word_result.indexOf("_");
				System.out.print(" " + quiz_word_result.get(x));
			}
			
			if (end_len < 0) {
				end = false;
				System.out.println("'" + count_num + "' 번의 횟수를 사용하여 게임이 끝났습니다.");
				break;
			}
			
		}
		
		
	}		
}














