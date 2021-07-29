package gui.quiz.Puzzle;

import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class NumPad extends JButton {
	
	List<JButton> numPads;
	BufferedImage image;
	int index;
	int gameSize;
	

	 
	public NumPad(int index, int gameSize, List<JButton> numPads, BufferedImage image) {
		this.gameSize = gameSize;
		this.numPads = numPads;
		this.index = index;
		
		
		if (index == (gameSize * gameSize - 1)) {
			setText("E");
		} else {
//			setText("" + (index + 1));
			addActionListener(new ImageNumPadAction(this));
		}
		
		
		this.setFont(new Font("µ¸¿ò", Font.ITALIC | Font.BOLD, 35));
//		addActionListener(new TextNumPadAction());
		
//		this.image = image;
//		this.image = image.getScaledInstance(700, 700, image.SCALE_SMOOTH);
		

	}
	
	private BufferedImage getNumPadImage() {
		int x = index % gameSize;
		int y = index / gameSize;
		int width = 700 / gameSize;
		int height = 700 / gameSize;
		
		return image.getSubimage(x * width, y * height, width, height);
	}
	
	
	
	
	

}
