package gui;

import java.awt.Font;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S04_ActionListener extends JFrame {
	
	int count = 0;
	
	public S04_ActionListener() {
		super();
		
		ArrayList<JButton> btns = new ArrayList<>(); 
		
		btns.add(new JButton());
//		btns.add(new gui.mycomponent.MyJButton());
		btns.add(new JButton());
		
//		int count = 0;
		
		btns.get(1).addMouseWheelListener(new MouseWheelListener() {
			
			@Override
			public void mouseWheelMoved(MouseWheelEvent e) {
				btns.get(1).setText("" + count++);
			}
		});
		
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

















