package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S01_JavaSwing {
	
	/*
		# Java Swing
		 - javax.swing ��Ű���� ����ִ� Ŭ������� Windows GUI ���α׷��� ���� �� �ִ�. 
	
		# Container
		 - ���� ������Ʈ���� ��ġ�� �� �ִ� ��
		 - JFrame, JPanel, JDialog ... ��
		 - �����̳ʸ��� ���̾ƿ��� ������ �� �ִ�.
		 
		# Component
		 - �����̳� ���� ��ġ�� �� �ִ� ��ǰ
		 - ��ư, ǥ, �����̴�, �޴� ... ���
		 
		 
	*/
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		// �� ������Ʈ �ν��Ͻ� ���� �����ϴ� ������� �ش� ������Ʈ�� �ڼ��� ������ �� �ִ�.
		JButton btn1 = new JButton("This is button1");
		
		btn1.setLocation(100, 100);
		btn1.setSize(150, 80);
		
		JButton btn2 = new JButton("This is button2");
		
		btn2.setLocation(-10, -10);
		btn2.setSize(150, 80);
		
		// �������� ����� ������ ���� ���𰡸� ���̸鼭 ���α׷��� ����� ����̴�.
		frame.add(btn1);
		frame.add(btn2);
		frame.add(new JButton("button 3") {
			{
				setLocation(300,30);
				setSize(150, 80);
			}
		});
		
		
		// ���̾ƿ� ����
		frame.setLayout(null);
		
		// X��ư ������ ���� ������ ����
//		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// ������ ũ�� ����
		frame.setSize(500, 500);
		
		// ������ ��� �������� ���̰� �Ѵ�. ( ȭ�鿡 �׸��� ȿ���� �ִ� ) �� �������� �δ°� ����
		frame.setVisible(true);
		
		
		
	}
}






















