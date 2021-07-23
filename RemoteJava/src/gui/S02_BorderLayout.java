package gui;

import java.awt.BorderLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S02_BorderLayout extends JFrame {
	
	
	public S02_BorderLayout() {
		super();
		
		setLayout(new BorderLayout(5, 5));
		
		add(new JButton("Button1"), BorderLayout.NORTH);
		add(new JButton("Button2"), BorderLayout.EAST);
		add(new JButton("Button3"), BorderLayout.WEST);
		add(new JButton("Button4"), BorderLayout.SOUTH);
		add(new JButton("Button5"), BorderLayout.CENTER);
		
		setSize(500, 500);
		setLocation(100 + 1920, 100);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	/*
		# BorderLayout
	 	 - �������ϰ� ����� �̷���� ���̾ƿ�
	 	 - ������Ʈ�� �߰��� �� ��ġ�� �Բ� ������ �� �ִ�.

	 */
	
	
	public static void main(String[] args) {
		
		S02_BorderLayout frame = new S02_BorderLayout();
		
		
		
		
		
	}
	
	
}





















