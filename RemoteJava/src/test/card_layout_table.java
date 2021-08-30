package test;

import java.awt.CardLayout;

import javax.swing.JButton;
import javax.swing.JPanel;

import gui.StudyFrame;
import gui.mypanel.ImagePanel;

public class card_layout_table extends StudyFrame  {
	
	
	
	public card_layout_table() {
		// TODO Auto-generated constructor stub
		JPanel card_panel = new JPanel(new CardLayout(10, 10));
		
		
		
		
//		new ImageIcon("./");
		
		JPanel panel1 = new JPanel();
//		JPanel panel1 = new ImagePanel(icons);
//		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
//		JPanel panel3 = new ImagePanel(icons3);
		JButton southBtn = new JButton("next card!");
		
		// 카드 레이아웃을 사용할 때는 name이 유용하게 사용된다.
		card_panel.add("card1", panel1);
//		card_panel.add("card2", panel2);
		card_panel.add("card3", panel3);
		
		add(card_panel, "Center");
		add(southBtn, "South");
		
		
		
	}
	
	
	public static void main(String[] args) {
		
	}
}










