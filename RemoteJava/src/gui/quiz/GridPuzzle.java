package gui.quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.JButton;
import javax.swing.JPanel;

import gui.StudyFrame;

public class GridPuzzle extends StudyFrame {
	
	int x_size = 4;
	
	public GridPuzzle() {
		super();
		
		ArrayList<JButton> btns = new ArrayList<>();
//		HashSet<JButton> btns = new HashSet<>();
		
		// 2개 이상의 레이아웃을 사용하고 싶다면 JPanel을 이용한다.
		setLayout(new BorderLayout());
		
		// JPanel은 레이아웃을 설정할 수 있는 새로운 판이다.
		JPanel center_panel = new JPanel();
		JButton south_button = new JButton("Suffle");
		
		add(center_panel, "Center");
		add(south_button, "South");
		
		center_panel.setLayout(new GridLayout(x_size, x_size-1));
		
		int temp = (x_size * x_size);
		
		int cc = 1;
		ArrayList<Integer> aa = new ArrayList<>();
		
		while (cc < 16) {
			int ran_n = (int)(Math.random() * temp + 1);
			
//			System.out.println(ran_n);
			if (aa.contains(ran_n)) {
				
			} else {
				aa.add(ran_n);
				cc++;
				System.out.println(ran_n);
			}	
		}
		System.out.println("============================");
		for (int a = 0; a < aa.size(); a++) {
			System.out.println(aa.get(a));
		}

		for (int i = 1; i <= temp; i++) {
			if (i == temp) {
				JButton btn = new JButton();
				btns.add(btn);
				center_panel.add(btn);
				btn.setBackground(new Color(0xFF0000));
			} else {
				JButton btn = new JButton("" + i);
				btns.add(btn);
				center_panel.add(btn);
			}	
		}
//		for (int i = 0; i < btns.size(); i++) {
//			if (btns.get(i).getText().equals(null)) {
//			} else {
//				btn.setBackground(new Color(0xFF0000));
//			}
//		}
//		for (int ii = 0; ii < btns.size(); ii++) {
//			int x = (int)(Math.random() * btns.size());
//			int y = (int)(Math.random() * btns.size());	
//			Card temp = cards[x];
//			cards[x] = cards[y];
//			cards[y] = temp;
//		}
		
		
		south_button.addActionListener(new gui.quiz.Puzzle.change(btns));
//		south_button.doClick();	
	}
	
	
	public static void main(String[] args) {
		GridPuzzle frame = new GridPuzzle();
		frame.setDefaultOptions();
	}
	
}


















