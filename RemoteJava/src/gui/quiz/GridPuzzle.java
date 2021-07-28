package gui.quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;
import java.util.HashSet;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import gui.StudyFrame;

public class GridPuzzle extends StudyFrame {
	
	int x_size = 4;
	boolean result = false;
	ArrayList<JButton> btns = new ArrayList<>();
	
	public GridPuzzle() {
		super();
		
//		ArrayList<JButton> btns = new ArrayList<>();
//		HashSet<JButton> btns = new HashSet<>();
		
		// 2개 이상의 레이아웃을 사용하고 싶다면 JPanel을 이용한다.
		setLayout(new BorderLayout());
		
		// JPanel은 레이아웃을 설정할 수 있는 새로운 판이다.
		JPanel center_panel = new JPanel();
//		JButton south_button = new JButton("Suffle");
		
		add(center_panel, "Center");
//		add(south_button, "South");
		
		center_panel.setLayout(new GridLayout(x_size, x_size-1));
		
		int temp = (x_size * x_size);
		
		int cc = 1;
		ArrayList<Integer> aa = new ArrayList<>();
		
		while (cc <= temp) {
			int ran_n = (int)(Math.random() * temp + 1);
						
//			System.out.println(ran_n);
			if (aa.contains(ran_n)) {
				
			} else {
				aa.add(ran_n);
				cc++;
//				System.out.print(ran_n + "\t");
			}	
		}
//		System.out.println("============================");
		for (int a = 0; a < aa.size(); a++) {
//			System.out.print(aa.get(a) + "\t");
			if (aa.get(a).equals(temp)) {
				JButton btn = new JButton();
				btns.add(btn);
				center_panel.add(btn);
//				btn.setBackground(new Color(0xFF0000));
				btn.setFont(new Font("Small Fonts", Font.BOLD, 60));
			} else {
				JButton btn = new JButton("" + aa.get(a));
				btns.add(btn);
				center_panel.add(btn);
				btn.setFont(new Font("Small Fonts", Font.BOLD, 60));
			} 
		}
		
		// ===========================================================================
//		btns.get(0).addActionListener(new gui.quiz.Puzzle.change(btns));
		// ===========================================================================
		btns.get(0).addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btns.get(1).getText().equals("")) {
					btns.get(1).setText(btns.get(0).getText());
					btns.get(0).setText("");
				} else if (btns.get(4).getText().equals("")){
					btns.get(4).setText(btns.get(0).getText());
					btns.get(0).setText("");
				}
				exitCheck(0);
			}
		});
		// ===========================================================================
		btns.get(1).addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
//				System.out.println(btns.get(1).getText());
//				if (btns.get(1).getText().equals("")) {
//					System.out.println("dddd");
//				}
				if (btns.get(0).getText().equals("")) {
					btns.get(0).setText(btns.get(1).getText());
					btns.get(1).setText("");
				} else if (btns.get(2).getText().equals("")){
					btns.get(2).setText(btns.get(1).getText());
					btns.get(1).setText("");
				} else if (btns.get(5).getText().equals("")) {
					btns.get(5).setText(btns.get(1).getText());
					btns.get(1).setText("");
				}
				exitCheck(1);
			}
		});
		// ===========================================================================
		btns.get(2).addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btns.get(1).getText().equals("")) {
					btns.get(1).setText(btns.get(2).getText());
					btns.get(2).setText("");
				} else if (btns.get(3).getText().equals("")){
					btns.get(3).setText(btns.get(2).getText());
					btns.get(2).setText("");
				} else if (btns.get(6).getText().equals("")) {
					btns.get(6).setText(btns.get(2).getText());
					btns.get(2).setText("");
				}
				exitCheck(2);
			}
		});
		// ===========================================================================
		btns.get(3).addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btns.get(2).getText().equals("")) {
					btns.get(2).setText(btns.get(3).getText());
					btns.get(3).setText("");
				} else if (btns.get(7).getText().equals("")){
					btns.get(7).setText(btns.get(3).getText());
					btns.get(3).setText("");
				}
				exitCheck(3);
			}
		});
		// ===========================================================================
		btns.get(4).addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btns.get(0).getText().equals("")) {
					btns.get(0).setText(btns.get(4).getText());
					btns.get(4).setText("");
				} else if (btns.get(5).getText().equals("")){
					btns.get(5).setText(btns.get(4).getText());
					btns.get(4).setText("");
				} else if (btns.get(8).getText().equals("")){
					btns.get(8).setText(btns.get(4).getText());
					btns.get(4).setText("");
				} 
				exitCheck(4);
			}
		});
		// ===========================================================================
		btns.get(5).addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btns.get(1).getText().equals("")) {
					btns.get(1).setText(btns.get(5).getText());
					btns.get(5).setText("");
				} else if (btns.get(4).getText().equals("")){
					btns.get(4).setText(btns.get(5).getText());
					btns.get(5).setText("");
				} else if (btns.get(6).getText().equals("")){
					btns.get(6).setText(btns.get(5).getText());
					btns.get(5).setText("");
				} else if (btns.get(9).getText().equals("")){
					btns.get(9).setText(btns.get(5).getText());
					btns.get(5).setText("");
				} 
				exitCheck(5);
			}
		});
		// ===========================================================================
		btns.get(6).addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btns.get(2).getText().equals("")) {
					btns.get(2).setText(btns.get(6).getText());
					btns.get(6).setText("");
				} else if (btns.get(5).getText().equals("")){
					btns.get(5).setText(btns.get(6).getText());
					btns.get(6).setText("");
				} else if (btns.get(7).getText().equals("")){
					btns.get(7).setText(btns.get(6).getText());
					btns.get(6).setText("");
				} else if (btns.get(10).getText().equals("")){
					btns.get(10).setText(btns.get(6).getText());
					btns.get(6).setText("");
				} 
				exitCheck(6);
			}
		});		
		// ===========================================================================
		btns.get(7).addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btns.get(3).getText().equals("")) {
					btns.get(3).setText(btns.get(7).getText());
					btns.get(7).setText("");
				} else if (btns.get(6).getText().equals("")){
					btns.get(6).setText(btns.get(7).getText());
					btns.get(7).setText("");
				} else if (btns.get(11).getText().equals("")){
					btns.get(11).setText(btns.get(7).getText());
					btns.get(7).setText("");
				} 
				exitCheck(7);
			}
		});		
		// ===========================================================================
		btns.get(8).addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btns.get(4).getText().equals("")) {
					btns.get(4).setText(btns.get(8).getText());
					btns.get(8).setText("");
				} else if (btns.get(9).getText().equals("")){
					btns.get(9).setText(btns.get(8).getText());
					btns.get(8).setText("");
				} else if (btns.get(12).getText().equals("")){
					btns.get(12).setText(btns.get(8).getText());
					btns.get(8).setText("");
				} 
				exitCheck(8);
			}
		});
		// ===========================================================================
		btns.get(9).addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btns.get(5).getText().equals("")) {
					btns.get(5).setText(btns.get(9).getText());
					btns.get(9).setText("");
				} else if (btns.get(8).getText().equals("")){
					btns.get(8).setText(btns.get(9).getText());
					btns.get(9).setText("");
				} else if (btns.get(10).getText().equals("")){
					btns.get(10).setText(btns.get(9).getText());
					btns.get(9).setText("");
				} else if (btns.get(13).getText().equals("")){
					btns.get(13).setText(btns.get(9).getText());
					btns.get(9).setText("");
				} 
				exitCheck(9);
			}
		});		
		// ===========================================================================
		btns.get(10).addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btns.get(6).getText().equals("")) {
					btns.get(6).setText(btns.get(10).getText());
					btns.get(10).setText("");
				} else if (btns.get(9).getText().equals("")){
					btns.get(9).setText(btns.get(10).getText());
					btns.get(10).setText("");
				} else if (btns.get(11).getText().equals("")){
					btns.get(11).setText(btns.get(10).getText());
					btns.get(10).setText("");
				} else if (btns.get(14).getText().equals("")){
					btns.get(14).setText(btns.get(10).getText());
					btns.get(10).setText("");
				} 
				exitCheck(10);
			}
		});		
		// ===========================================================================
		btns.get(11).addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btns.get(7).getText().equals("")) {
					btns.get(7).setText(btns.get(11).getText());
					btns.get(11).setText("");
				} else if (btns.get(10).getText().equals("")){
					btns.get(10).setText(btns.get(11).getText());
					btns.get(11).setText("");
				} else if (btns.get(15).getText().equals("")){
					btns.get(15).setText(btns.get(11).getText());
					btns.get(11).setText("");
				} 
				exitCheck(11);
			}
		});		
		// ===========================================================================
		btns.get(12).addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btns.get(8).getText().equals("")) {
					btns.get(8).setText(btns.get(12).getText());
					btns.get(12).setText("");
				} else if (btns.get(13).getText().equals("")){
					btns.get(13).setText(btns.get(12).getText());
					btns.get(12).setText("");
				} 
				exitCheck(12);
			}
		});		
		// ===========================================================================
		btns.get(13).addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btns.get(9).getText().equals("")) {
					btns.get(9).setText(btns.get(13).getText());
					btns.get(13).setText("");
				} else if (btns.get(12).getText().equals("")){
					btns.get(12).setText(btns.get(13).getText());
					btns.get(13).setText("");
				} else if (btns.get(14).getText().equals("")){
					btns.get(14).setText(btns.get(13).getText());
					btns.get(13).setText("");
				} 
				exitCheck(13);
			}
		});		
		// ===========================================================================
		btns.get(14).addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btns.get(10).getText().equals("")) {
					btns.get(10).setText(btns.get(14).getText());
					btns.get(14).setText("");
				} else if (btns.get(13).getText().equals("")){
					btns.get(13).setText(btns.get(14).getText());
					btns.get(14).setText("");
				} else if (btns.get(15).getText().equals("")){
					btns.get(15).setText(btns.get(14).getText());
					btns.get(14).setText("");
				} 
				exitCheck(14);
			}
		});		
		// ===========================================================================
		btns.get(15).addMouseListener(new MouseAdapter() {
			
			@Override
			public void mouseClicked(MouseEvent e) {
				if (btns.get(11).getText().equals("")) {
					btns.get(11).setText(btns.get(15).getText());
					btns.get(15).setText("");
				} else if (btns.get(14).getText().equals("")){
					btns.get(14).setText(btns.get(15).getText());
					btns.get(15).setText("");
				} 
				exitCheck(15);
			}
		});		
				
				
		// ===========================================================================
		// ===========================================================================
		// ===========================================================================
		class ChangeActionListener implements ActionListener {
			String lo;
			
			public ChangeActionListener(String path) {
				this.lo = path;
			}
			
			@Override
			public void actionPerformed(ActionEvent e) {
				for (int i = 0; i < btns.size(); i++) {
					if(btns.get(i).getText().equals(null)) {
						
					} else {
						System.out.println(btns.get(i).getText());
					}
				}		
			}
		}
		// ===========================================================================
		
//		south_button.addActionListener(new gui.quiz.Puzzle.change(btns));
//		south_button.doClick();	
	}
	public void exitCheck(int a){
		System.out.println("11");
		if (btns.get(btns.size()-1).getText().equals("")) {
			System.out.println("22");
			for (int i = 0; i < btns.size(); i++) {
				
				if ((btns.get(i).getText().equals(i+1)) && i != btns.size()) {
					System.out.println(btns.get(i).getText());
					result = true;
				} else {
					result = false;
				}
			}
			if (result == true) {
				System.out.println("게임 끝!!");
			}
		}
	}
	
	public void exitCheck(){
		if (btns.get(btns.size()-1).getText().equals("")) {
			for (int i = 0; i < btns.size(); i++) {
				
				if ((btns.get(i).getText().equals(i+1)) && i != btns.size()) {
					System.out.println(btns.get(i).getText());
					result = true;
				} else {
					result = false;
				}
			}
			if (result == true) {
				System.out.println("게임 끝!!");
			}
		}
	}
	
	
	public static void main(String[] args) {
		GridPuzzle frame = new GridPuzzle();
		frame.setDefaultOptions();
	}
	
}


















