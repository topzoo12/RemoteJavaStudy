package gui.quiz;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

import gui.mycomponent.MyJButton;

public class Maple_Button extends JButton {

	public Maple_Button() {
		super();
		
		setText("������!");
		setSize(600, HEIGHT);
		
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// �̺�Ʈ �߻��� ActionEvent �ν��Ͻ��� �ش� �̺�Ʈ ������ �Ѿ�´� 
				System.out.println("����1 : " + e.getID());
				System.out.println("����2 : " + e.getModifiers());
				System.out.println("����3 : " + e.getWhen());
				System.out.println("����4 : " + e.getActionCommand());
				System.out.println("����5 : " + e.getSource());
				
				((MyJButton) e.getSource()).setText("" );
			}
		});
	}
	
	
	
}
