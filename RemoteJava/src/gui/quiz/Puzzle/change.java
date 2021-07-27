package gui.quiz.Puzzle;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class change implements ActionListener {
	
	ArrayList<JButton> btns;
	
	public change(ArrayList<? extends JButton> btns) {
		this.btns = (ArrayList<JButton>) btns;
	}
	
//	private void generateColor() {
//		for (JButton btn : btns) {
//			btn.setBackground(new Color((int)(Math.random() * 0xFFFFFF)));
//		}
//	}
	
	private void suffle() {
		/*
		System.out.println(btns.size());
		for (int i = 0; i < btns.size(); i++) {
			int x = (int)(Math.random() * btns.size());
			int y = (int)(Math.random() * btns.size());
			
			
			JButton temp = btns.get(x);
			btns.get(x).setText(btns.get(y).getText());
//			cards[x] = cards[y];
			btns.get(y).setText(temp.getText());
//			cards[y] = temp;
		}
		for (JButton btn : btns) {
			
		}
		*/
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
//		generateColor();
		suffle();
	}
}







