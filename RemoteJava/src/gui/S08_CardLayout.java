package gui;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JPanel;

import gui.mypanel.ImagePanel;

public class S08_CardLayout extends StudyFrame {
	
	public S08_CardLayout(){
		super();
		
		// setLayout(new BorderLayout());
		
		// CardLayout : 컴포넌트를 카드처럼 넘기면서 사용하는 레이아웃
		JPanel card_panel = new JPanel(new CardLayout(10, 10));
		
//		setLayout(new CardLayout(10, 10));
		
		ArrayList<ImageIcon> icons = new ArrayList<>();
		ArrayList<ImageIcon> icons3 = new ArrayList<>();
		
//		BufferedImage image = ImageIO.read(new File("./image/icon2.gif"));
		BufferedImage image;
		try {
			image = ImageIO.read(new File("./image/peng/icon.gif"));
		} catch (IOException e ) {
			e.printStackTrace();
			image = null;
		}
		
		icons.add(new ImageIcon(image.getScaledInstance(300, 300, image.SCALE_DEFAULT)));
//		icons.add(new ImageIcon(image.getScaledInstance(300, 300, image.SCALE_SMOOTH)));
		icons.add(new ImageIcon(image.getScaledInstance(350, 350, image.SCALE_SMOOTH)));
		icons.add(new ImageIcon(image.getScaledInstance(400, 400, image.SCALE_SMOOTH)));
//		icons.add(new ImageIcon(image.getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
		
		icons3.add(new ImageIcon("./image/peng/icon.gif"));
		icons3.add(new ImageIcon("./image/peng/icon2.jpg"));
		icons3.add(new ImageIcon("./image/peng/icon3.jpg"));
		icons3.add(new ImageIcon("./image/peng/icon4.jpg"));
		icons3.add(new ImageIcon("./image/peng/icon5.jpg"));
		
//		new ImageIcon("./");
		
//		JPanel panel1 = new JPanel();
		JPanel panel1 = new ImagePanel(icons);
//		JPanel panel2 = new JPanel();
//		JPanel panel3 = new JPanel();
		JPanel panel3 = new ImagePanel(icons3);
		JButton southBtn = new JButton("next card!");
		
		// 카드 레이아웃을 사용할 때는 name이 유용하게 사용된다.
		card_panel.add("card1", panel1);
//		card_panel.add("card2", panel2);
		card_panel.add("card3", panel3);
		
		add(card_panel, "Center");
		add(southBtn, "South");
//		add(new JButton("next card!"), "South");
		
		/*
			CardLayout.next(parent) 	: 다음 카드 보기
			CardLayout.previous(parent) : 이전 카드 보기 
			CardLayout.first(parent) 	: 맨 처음 카드 보기
			CardLayout.last(parent) 	: 마지막 카드 보기
		*/
		
		southBtn.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// 해당 패널 또는 프레임에 정의된 레이아웃을 꺼내서 사용할 수도 있다.
				CardLayout card_layout = ((CardLayout)card_panel.getLayout());
				card_layout.next(card_panel);
			}
			
		});
		
		
	}
	
	
	public static void main(String[] args) {
		
		S08_CardLayout frame = new S08_CardLayout();
		frame.setDefaultOptions();
		
	}
	
}












