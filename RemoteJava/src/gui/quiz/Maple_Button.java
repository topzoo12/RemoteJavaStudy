package gui.quiz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.mycomponent.MyJButton;

public class Maple_Button extends JButton {

	public Maple_Button() {
		super();
		
		setText("굴리기!");
		setSize(600, HEIGHT);
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 이벤트 발생시 ActionEvent 인스턴스에 해당 이벤트 정보가 넘어온다 
				System.out.println("정보1 : " + e.getID());
				System.out.println("정보2 : " + e.getModifiers());
				System.out.println("정보3 : " + e.getWhen());
				System.out.println("정보4 : " + e.getActionCommand());
				System.out.println("정보5 : " + e.getSource());
				
				((MyJButton) e.getSource()).setText("" );
			}
		});
	}
	
	
	
}
