package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S03_JButton extends JFrame {

	public S03_JButton() {
		super("How to make JButton?");
		
		super.setTitle("dddddddddddddddddddddddddd");
		
		setLayout(new BorderLayout());
		
		JButton[] btns = new JButton[5];
		String[] directions = {"East", "West", "South", "North", "Center"};
		
		for (int i = 0, len = btns.length; i < len; i++) {
			btns[i] = new JButton("Button" + i);
			add(btns[i], directions[i]);
		}
		
		// 1. 버튼의 배경색을 바꾸 수도 있다.
		btns[2].setBackground(new Color(66, 189, 255));
//		btns[2].setBackground(new Color(0x42bdff));
		
		// 1. 버튼의 글꼴을 바꿀 수도 있다.
//		btns[1].setFont(new Font("궁서체", Font.BOLD, 50));
		btns[1].setFont(new Font("MV Boli", Font.BOLD, 50));
		
		// 2. 버튼에는 이벤트도 추가할 수 있다.
		btns[0].addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				int random = (int)(Math.random() * 8 + 2);
				for (int i = 1; i < random; i++) {
					System.err.print("왜 눌러? ");
				}
				System.err.println();
			}
		});
		
		// 4. 버튼 비활성화
		btns[0].setEnabled(false);
		
		
		
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLocation(100 + 1920, 100);
		setSize(500, 500);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new S03_JButton();
	}
}















