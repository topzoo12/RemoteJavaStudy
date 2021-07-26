package gui;

import java.awt.CardLayout;
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
		
		// CardLayout : ������Ʈ�� ī��ó�� �ѱ�鼭 ����ϴ� ���̾ƿ�
		JPanel card_panel = new JPanel(new CardLayout(10, 10));
		
//		setLayout(new CardLayout(10, 10));
//		String paths = {};
		ArrayList<ImageIcon> icons = new ArrayList<>();
		
//		BufferedImage image = ImageIO.read(new File("./image/icon2.gif"));
		BufferedImage image;
		try {
			image = ImageIO.read(new File("./image/icon.gif"));
		} catch (IOException e ) {
			e.printStackTrace();
			image = null;
		}
		
		icons.add(new ImageIcon(image.getScaledInstance(300, 300, image.SCALE_SMOOTH)));
		icons.add(new ImageIcon(image.getScaledInstance(350, 350, image.SCALE_SMOOTH)));
		icons.add(new ImageIcon(image.getScaledInstance(400, 400, image.SCALE_SMOOTH)));
//		icons.add(new ImageIcon(image.getScaledInstance(300, 300, Image.SCALE_SMOOTH)));
		setLayout(new CardLayout(10, 10));
		
//		new ImageIcon("./");
		
//		JPanel panel1 = new JPanel();
		JPanel panel1 = new ImagePanel(icons);
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
		
		// ī�� ���̾ƿ��� ����� ���� name�� �����ϰ� ���ȴ�.
		add("card1", panel1);
		add("card2", panel2);
		add("card3", panel3);
		
		add(card_panel, "Center");
		add(new JButton("next card!"), "South");
		
	}
	
	
	public static void main(String[] args) {
		
		S08_CardLayout frame = new S08_CardLayout();
		frame.setDefaultOptions();
		
	}
	
}












