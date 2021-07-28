package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JPanel;

import gui.myhandler.GenerateColorHandler;

public class S07_GridLayout extends StudyFrame {
	
	
	
	
	public S07_GridLayout() {
		super();
		
		ArrayList<JButton> btns = new ArrayList<>();
		
		// 2�� �̻��� ���̾ƿ��� ����ϰ� �ʹٸ� JPanel�� �̿��Ѵ�.
		setLayout(new BorderLayout());
		
		// JPanel�� ���̾ƿ��� ������ �� �ִ� ���ο� ���̴�.
		JPanel center_panel = new JPanel();
		JButton south_button = new JButton("Generate Color!");
		
		add(center_panel, "Center");
		add(south_button, "South");
		
		center_panel.setLayout(new GridLayout(3, 5));
		
		for (int i = 0; i < 15; i++) {
			
			JButton btn = new JButton("Button" + i);
			btns.add(btn);
			center_panel.add(btn);
			
//			btn.setBackground(new Color((int)(Math.random() * 0xFFFFFF)));
//			center_panel.add(btn.add());
//			add(btn);
//			add(new JButton("Button" + i));
		}
//		generateColor();
		
		// ȭ���� �����ϴ� �ڵ�� ������ ó���ϴ� �ڵ�� �и��ϴ� ���� ����.
//		south_button.addAncestorListener(new GenerateColorHandler(btns));
		south_button.addActionListener(new GenerateColorHandler(btns));
		south_button.doClick();	
	}
	
//	private void generateColor() {
//		for (JButton btn : btns) {
//			btn.setBackground(new Color((int)(Math.random() * 0xFFFFFF)));
//		}
//	}
	
	
	public static void main(String[] args) {
		S07_GridLayout frame = new S07_GridLayout();
		frame.setDefaultOptions();
	}
	
}
