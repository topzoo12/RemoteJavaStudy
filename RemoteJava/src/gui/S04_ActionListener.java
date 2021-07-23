package gui;

import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S04_ActionListener extends JFrame {
	
	public S04_ActionListener() {
		super();
		
		ArrayList<JButton> btns = new ArrayList<>(); 
		
		btns.add(new JButton());
		btns.add(new gui.mycomponent.MyJButton());
		
		btns.get(0).setText("æ»≥Á«œººø‰");
		btns.get(0).setFont(new Font("±√º≠√º", Font.PLAIN, 35));
		
		add(btns.get(0), "Center");
		add(btns.get(1), "East");
		
		setLocation(100 + 1920, 100);
		setSize(500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	public static void main(String[] args) {
		new S04_ActionListener();
	}
	
	
}

















