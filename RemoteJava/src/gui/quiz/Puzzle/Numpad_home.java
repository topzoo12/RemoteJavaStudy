package gui.quiz.Puzzle;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.util.List;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;

public class Numpad_home extends JButton implements ActionListener {
	
	List<JButton> numPads;
	BufferedImage image;
	int index;
	int gameSize;
	
	int left;
	int right;
	int top;
	int bottom;
	
	public Numpad_home(int index, int gameSize, List<JButton> numPads) {
		this.gameSize = gameSize;
		this.numPads = numPads;
		this.index = index;
		this.top 	= index - gameSize >= 0 ? index - gameSize : -1;
		this.bottom = index + gameSize < gameSize * gameSize ? index + gameSize : -1;
		this.left 	= index % gameSize != 0 ? index - 1 : -1;
		this.right	= index % gameSize != gameSize - 1 ? index + 1 : -1;
		
		if (index == (gameSize * gameSize - 1)) {
//			setText("");
		} else {
//			setText("" + (index + 1));	
		}
		
//		setIcon(new ImageIcon("./image/peng/icon2.jpg"));
		
		
		this.setFont(new Font("µ¸¿ò", Font.ITALIC | Font.BOLD, 35));
		addActionListener(this);
		
		this.image = image;
//		this.image = image.getScaledInstance(700, 700, image.SCALE_SMOOTH);
		

	}
	public Numpad_home(int index, int gameSize, List<JButton> numPads, Icon resize_image) {
		this.gameSize = gameSize;
		this.numPads = numPads;
		this.index = index;
		this.top 	= index - gameSize >= 0 ? index - gameSize : -1;
		this.bottom = index + gameSize < gameSize * gameSize ? index + gameSize : -1;
		this.left 	= index % gameSize != 0 ? index - 1 : -1;
		this.right	= index % gameSize != gameSize - 1 ? index + 1 : -1;
		
		if (index == (gameSize * gameSize - 1)) {
//			setText("");
//			setIcon(resize_image);
			setIcon(new ImageIcon(""));
		} else {
//			setText("" + (index + 1));
//			setIcon(resize_image);
		}
//		System.out.println(resize_image);
		
//		setIcon(new ImageIcon("./image/peng/icon2.jpg"));
		
		
		setIcon(resize_image);
		
		this.setFont(new Font("µ¸¿ò", Font.ITALIC | Font.BOLD, 35));
		addActionListener(this);
		
		this.image = image;
//		this.image = image.getScaledInstance(700, 700, image.SCALE_SMOOTH);
		

	}
	
	private BufferedImage getNumPadImage() {
		int x = index % gameSize;
		int y = index / gameSize;
		int width = 700 / gameSize;
		int height = 700 / gameSize;
		
		return image.getSubimage(x * 700 / width, y * height, width, height);
		
//		image.getSubimage(index, index, bottom, right);
	}
	 
	
	
	private boolean isBlank(int index) {
		return numPads.get(index).getText().equals("");
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (top != -1 && isBlank(top)) {
			numPads.get(top).setText(this.getText());
			this.setText("");
		} else if (bottom != -1 && isBlank(bottom)) {
			numPads.get(bottom).setText(this.getText());
			this.setText("");
		} else if (left != -1 && isBlank(left)) {
			numPads.get(left).setText(this.getText());
			this.setText("");
		} else if (right != -1 && isBlank(right)) {
			numPads.get(right).setText(this.getText());
			this.setText("");
		}
		
		
		if (numPads.get(numPads.size()-1).getText().equals("")) {
			boolean win = true;
			
			for (int i = 1, size = numPads.size(); i < size; i++) {
				if (!numPads.get(i-1).getText().equals("" + (i))) {
					win = false;
					break;
				}
			}
			System.out.println("win : " + win);
		}
		
	}
	
	
	

}
