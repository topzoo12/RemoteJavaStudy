package gui.quiz;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MapleStory extends JFrame {
	
	/*
		������! ��ư�� ������ �ɼ��� �������� 3�� �����Ǵ� ���α׷��� ��������.
		
		�� ���� +1 ~ +7
		���� ���� +1 ~ +7
		��ø ���� +1 ~ +7
		��� ���� +1 ~ +7
		���ݷ� ���� +1 ~ +3
	
	*/
	static String[] avility = {"��", "����", "��ø", "���", "���ݷ�"};
	static int price = 0;
	
	public MapleStory() {
		super();
		
//		setLayout(new BorderLayout());
		setLayout(null);
		
		JButton[] btns = new JButton[5];
//		String[] directions = {"East", "West", "Center", "South"};
		
		btns[0] = new JButton("1");
		btns[1] = new JButton("2");
		btns[2] = new JButton("3");
		btns[3] = new JButton("������!");
//		btns[3] = new gui.quiz.Maple_Button();
		btns[4] = new JButton("������� : " + price);
		btns[3].addActionListener(new ActionListener() {
			
					@Override
					public void actionPerformed(ActionEvent e) {
//						int power = (int)(Math.random() * 7 + 1);
//						int power1 = (int)(Math.random() * 3 + 1);
						
						int avility1 = (int)(Math.random() * avility.length);
						int avility2 = (int)(Math.random() * avility.length);
						int avility3 = (int)(Math.random() * avility.length);
						
						String a1 = "";
						String a2 = "";
						String a3 = "";
						
						if (avility1 != 4) {
							a1 += avility[avility1] + (int)(Math.random() * 7 + 1);
						} else {
							a1 += avility[avility1] + (int)(Math.random() * 3 + 1);
						}
						
						if (avility2 != 4) {
							a2 += avility[avility2] + (int)(Math.random() * 7 + 1);
						} else {
							a2 += avility[avility2] + (int)(Math.random() * 3 + 1);
						}
						if (avility3 != 4) {
							a3 += avility[avility3] + (int)(Math.random() * 7 + 1);
						} else {
							a3 += avility[avility3] + (int)(Math.random() * 3 + 1);
						}
						
						
						btns[0].setText(a1);
						btns[1].setText(a2);
						btns[2].setText(a3);
						btns[4].setText("������� : " + price);
						price += 3000;
					}
		});
		
		add(btns[0], "West");
		add(btns[1], "Center");
		add(btns[2], "East");
		add(btns[3], "South");
		add(btns[4]);
		
//		btns[3].add(new gui.quiz.Maple_Button(), "South");

		btns[0].setSize(150, 100);
		btns[1].setSize(150, 100);
		btns[2].setSize(150, 100);
		btns[3].setSize(150, 100);
		btns[4].setSize(150, 100);
		
		btns[0].setLocation(0, 50);
		btns[1].setLocation(200, 50);
		btns[2].setLocation(400, 50);
		btns[3].setLocation(200, 180);
		btns[4].setLocation(400, 180);
		
		
		btns[3].setBackground(new Color(66, 189, 255));
		
		setLocation(100 + 1920, 100);
		setSize(570, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MapleStory();
	}

}




















