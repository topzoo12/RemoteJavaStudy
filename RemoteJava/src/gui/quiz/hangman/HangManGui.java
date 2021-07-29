package gui.quiz.hangman;

import java.awt.Color;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;

import gui.StudyFrame;

public class HangManGui extends StudyFrame {
	
	/*
		����� ��������
		
		1. � �ܾ ���ΰ�� �ش� �ܾ��� ���̸�ŭ _�� ������ش�.
			ex) apple�� ���ΰ�� _ _ _ _ _ �� ���
		2. ����ڰ� ���ĺ��� �ϳ��� �Է��ϴ� ��� �ش� ���ĺ��� ���ԵǾ� �ִٸ� _�� ���ĺ����� �ٲ۴�
			ex) ����ڰ� p�� �Է��ߴٸ� _ p p _ _ �� ���
		3. ����ڰ� ��� _ �� �����ϸ� �� ������ ������� ������ּ���
		4. �ܾ�� �ܾ���� �����ִ� ���Ͽ��� �ϳ��� �������� �̾��ּ���
		
		=======================================================================
		
	*/
	
	
	static ArrayList<String> words = new ArrayList<>();
	static ArrayList<String> quiz_word = new ArrayList<>();
	static ArrayList<String> quiz_word_result = new ArrayList<>();
	
	static boolean end = true;
	
	static int count_num = 0;
	static int count_num1 = 0;
	static String dd = "";
	static String image_path = "./image/peng/icon2.jpg";
	
	static ArrayList<String> image_list = new ArrayList<>();
	
	static int death_count = 0;
	
	
	// =======================================================================
	// =======================================================================
	public HangManGui() {
		super();
		
		JLabel label = new JLabel();
		
		label.setIcon(new ImageIcon("image/hang/1.png"));
//		label.setIcon(new ImageIcon("image/hang/" + image_list.get(death_count)));
//		JLabel label = new JLabel(new ImageIcon("image/hang/1.png"));
//		JLabel label = new JLabel(image_list.get(cnt));
		
		String goal_word = "";
		
		for (int i = 0; i < quiz_word.size(); i++) {
			goal_word += "_ ";
		}
		
		JLabel status = new JLabel(goal_word);
		
		JTextArea ta = new JTextArea();
		JTextArea ta1 = new JTextArea("'" + image_list.size() + "' ���� ���");
		
		ta.setBounds(20, 20, 700, 700);
		ta1.setBounds(60, 60, 700, 700);
		
		
		ta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
//				System.out.println(e.getKeyChar() + " Value  Inputed");
//				
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
//				status.setText(e.getKeyCode() + " Key Pressed");
				dd = "";
//				System.out.println(image_list.get(death_count));
				play(Character.toString(e.getKeyChar()));
				

				if (death_count > image_list.size()) {
					label.setIcon(new ImageIcon("image/peng/icon3.jpg"));
				} else {
					label.setIcon(new ImageIcon("image/hang/" + death_count + ".png"));
				}
				
				
				
//				ta1.setText("'" + count_num1++ + "' ��° ��ȸ");
				ta1.setText("'" + death_count + "' ���� ���");
				for (int i = 0; i < quiz_word_result.size(); i++) {
					dd += (quiz_word_result.get(i) + " ");
				}
				
				if (dd.contains("_") == false) {
//					ta.setText("" + count_num1 + " ���� ��ȸ�� ����Ͽ� ����");
				}
//				System.out.println(status.getText().length());
//				System.out.println(dd.length());
//				System.out.println(death_count);
				status.setText(dd);
//				System.out.println(e.getKeyCode() + " Key Pressed");
			}
		});
		
		add(ta, "East");
		add(label, "Center");
		add(ta1, "South");
		add(status, "North");
		
	}
	
	// =======================================================================
	
	
	public static void play(String alpha) {


		String a, b;

		alpha.toString().toLowerCase();
		
		alpha = alpha.toLowerCase();
		
		for (int i = 0; i < quiz_word.size(); i++) {
			
			a = quiz_word_result.get(i).toLowerCase();
			b = quiz_word.get(i).toLowerCase();
//			System.out.println(death_count);
			if (a.equals("_") && b.equals(alpha)) {
				quiz_word_result.set(i, "" + quiz_word.get(i));
			} else if (!quiz_word_result.get(i).equals("_")) {
			} else {
				quiz_word_result.set(i, "_");
//				System.out.println(death_count);
			}
			
		}
		death_count++;
	}
	
	
	// =======================================================================
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
	
	public static void main(String[] args) {
		
		File f3 = new File("image/hang");
		String a = Arrays.toString(f3.list());
		String[] bb = a.replaceFirst(" ", "").split(",");
		
		for (int i = 0; i < bb.length; i++) {
			image_list.add(bb[i]);
		}
		
		
		String word_list = "hang/1.txt";
		
		String input_text;
		
		setting(word_list);
		
		HangManGui frame = new HangManGui();
		frame.setDefaultOptions();

//		play(words.get((int)(Math.random() * words.size())));

//		for(int i = 0; i < words.size(); i++) {
//			System.out.println(words.get(i));
//		}
		for (int i = 0; i < quiz_word.size(); i++) {
			System.out.print("_ ");
		}
//		System.out.println();
//		System.out.println("����� �� �ܾ��� �����Դϴ�. ���ĺ��� �Է��Ͽ� �ܾ �ϼ��ϼ���");
		
		Scanner sc = new Scanner(System.in);
		
		int end_len = quiz_word_result.size();
		
		while (end) {
			count_num++;
//			System.out.println(count_num + " ��° ����");
			input_text = sc.nextLine();
			boolean aa = Character.isAlphabetic((input_text.charAt(0)));
			
			if (input_text.length() != 1) {
				System.out.println("1������ ���ĺ��� �Է����ּ���");
			} else if(aa == false) {
				System.out.println("�����ڸ� �Է����ּ���");
			} else {
//				play(input_text);
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














