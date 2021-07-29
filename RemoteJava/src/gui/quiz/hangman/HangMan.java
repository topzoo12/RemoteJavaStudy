package gui.quiz.hangman;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class HangMan {
	
	/*
		����� ��������
		
		1. � �ܾ ���ΰ�� �ش� �ܾ��� ���̸�ŭ _�� ������ش�.
		
		ex) apple�� ���ΰ�� _ _ _ _ _ �� ���
		
		2. ����ڰ� ���ĺ��� �ϳ��� �Է��ϴ� ��� �ش� ���ĺ��� ���ԵǾ� �ִٸ� _�� ���ĺ����� �ٲ۴�
		
		ex) ����ڰ� p�� �Է��ߴٸ� _ p p _ _ �� ���
		
		3. ����ڰ� ��� _ �� �����ϸ� �� ������ ������� ������ּ���
		
		4. �ܾ�� �ܾ���� �����ִ� ���Ͽ��� �ϳ��� �������� �̾��ּ���
		
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
		System.out.println("����� �� �ܾ��� �����Դϴ�. ���ĺ��� �Է��Ͽ� �ܾ �ϼ��ϼ���");
		
		Scanner sc = new Scanner(System.in);
		
		int end_len = quiz_word_result.size();
		
		while (end) {
			count_num++;
			System.out.println(count_num + " ��° ����");
			input_text = sc.nextLine();
			boolean aa = Character.isAlphabetic((input_text.charAt(0)));
			
			if (input_text.length() != 1) {
				System.out.println("1������ ���ĺ��� �Է����ּ���");
			} else if(aa == false) {
				System.out.println("�����ڸ� �Է����ּ���");
			} else {
				play(input_text);
			}
			
			for (int x = 0; x < quiz_word_result.size(); x++) {

				end_len = quiz_word_result.indexOf("_");
				System.out.print(" " + quiz_word_result.get(x));
			}
			
			if (end_len < 0) {
				end = false;
				System.out.println("'" + count_num + "' ���� Ƚ���� ����Ͽ� ������ �������ϴ�.");
				break;
			}
			
		}
		
		
	}		
}














