package test;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;

import gui.StudyFrame;

public class jframetest extends StudyFrame {
	
	public jframetest() {
		
		setLayout(null);
		
		JLabel label1 = new JLabel();
		
		int a = 10;
		
		JButton[][] button = new JButton[a][a];
		
		
		add(label1);
		label1.setSize(100, 100);
		label1.setBackground(new Color(000000));
		label1.setText("라벨1은 여기다"); 
		for (int i = 0; i < 2; i++) {
			for (int x = 0; x < a; x++) {
				button[i][x] = new JButton();
				button[i][x].setSize(100, 100);
				button[i][x].setLocation(10 + (x*100), (i*100)+100);
//				button[i][x].setLocation((0 + (i * 100)), (50 + (i * 100)));
				button[i][x].setBackground(new Color((111111 + ((i*(x+500))))));
				add(button[i][x]);
				button[i][x].setText("<html>'" + i + "' 줄 '<br>" + x + "'번째<html>");
			}
		}//ddddddddddddddddddddddddddddddddddd
		
		
		setLocation(820, 100);
		setSize(1600, 1000);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new jframetest();
//		jframetest frame = new jframetest();
//		frame.setDefaultOptions();
	}
}









