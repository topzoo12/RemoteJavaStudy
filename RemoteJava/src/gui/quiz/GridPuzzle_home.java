package gui.quiz;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gui.quiz.Puzzle.Numpad_home;

public class GridPuzzle_home extends JFrame {
	
		private ArrayList<JButton> num_pads;
		
		private ArrayList<Icon> s1;
		private ArrayList<BufferedImage> s2 = new ArrayList<>();
		private ArrayList<Icon> so1;
		
		private String image_path;
	
		public GridPuzzle_home() throws IOException {
			this(3);
		}
				 
		public GridPuzzle_home(int gameSize) throws IOException {
			super(String.format("º˝¿⁄∆€¡Ò∞‘¿” : %d x %d", gameSize, gameSize));
			
	      	JPanel num_panel = new JPanel(new GridLayout(gameSize, gameSize));
			JPanel menu_panel = new JPanel(new BorderLayout());
			
			image_path = "./image/peng/icon2.jpg";
			// ===========================================================================
				String my_image = "./image/peng/icon2.jpg";
				
				Image src = ImageIO.read(new File(my_image));
				int w_max = ImageIO.read(new File(my_image)).getWidth();
				int h_max = ImageIO.read(new File(my_image)).getWidth();
				int w = ImageIO.read(new File(my_image)).getWidth()/gameSize;
				int h = ImageIO.read(new File(my_image)).getWidth()/gameSize;
				
				int x = 0, y = 0;
				
//				BufferedImage dst = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
				BufferedImage dst = ImageIO.read(new File(my_image));
			// ===========================================================================
				
			so1 = new ArrayList<>();
			BufferedImage so_image = ImageIO.read(new File(my_image));
			
			for (int so_y = 0, len_W = w_max, len_H = w_max; so_y < gameSize; so_y++) {
				for (int so_x = 0; so_x < gameSize; so_x++) {
					so1.add(new ImageIcon((so_image.getSubimage(so_x * w, so_y * h, w, h)).getScaledInstance(w, h, Image.SCALE_SMOOTH)));
					System.out.println("\t so_x * w : " + so_x * w);
					System.out.println("\t so_y * h : " + so_y * h);
//					System.out.println("\t\tw : " + w);
//					System.out.println("\t\th : " + h);
					System.out.println("=============================");
				}
			}
						
			num_pads = new ArrayList<>();
			s1 = new ArrayList<>();
			for (int i = 0, len = gameSize * gameSize; i < len; i++) {
				if (x >= w_max) {
					y += h;
					x = 0;
				}
//				dst.getGraphics().drawImage(src, 0, 0, w, h, x, y, (x + w), (y + h), null);
				dst.getGraphics().drawImage(src, 0, 0, w, h, x, y, (x + w), (y + h), null);
				dst.getSubimage(x, y, w, h);
				s1.add(new ImageIcon(dst));
//				s2.add(dst);
//				ImageIO.write(dst, "png", new File("./image/peng/d/" + i + ".png" ));
				System.out.println("x : " + x);
				System.out.println("y : " + y);
				System.out.println("=============================");
				
				x += w; 
			} 
//			for (int i = 0; i < s1.size(); i++) {
//				System.out.println("s1 \t- " + i + " : " + s1.get(i));
//				System.out.println("so1 \t- " + i + " : " + so1.get(i));
//			}
			
			for (int i = 0, len = gameSize * gameSize; i < len; i++) {
//				System.out.println(ss.size());
				
				Numpad_home new_pad = new Numpad_home(i, gameSize, num_pads);
				if (i != len - 1) {
//					new_pad.setIcon(so1.get(i));
					new_pad.setIcon(s1.get(i));
				}
//				Numpad_home new_pad = new Numpad_home(i, gameSize, num_pads, s1.get(i));
//				Numpad new_pad = new Numpad(i, gameSize, num_pads, resizedBufferedImage());
				num_pads.add(new_pad);
				num_panel.add(new_pad);
				
			}
			
			add(num_panel, "Center");
			add(menu_panel, "East");
			
			
			
			
			shuffle();

//			setIconImage(ImageIO.read(new File("./image/GridNumberPuzzle.jpg")));
//			setFont(new Font("µ∏øÚ", Font.PLAIN, 20));
			setBounds(2820, 50, w_max, h_max);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
//			setSize(700,700);
		}
		
		private void shuffle() {
			
			for (int i = 0; i < 100; i++) {
				int ran_x = (int)(Math.random() * num_pads.size());
				int ran_y = (int)(Math.random() * num_pads.size());
				
				String tmep = num_pads.get(ran_x).getText();
				num_pads.get(ran_x).setText(num_pads.get(ran_y).getText());
				num_pads.get(ran_y).setText(tmep);
			}
			
		}

	
	
		
		public static void main(String[] args) {
			try {
				new GridPuzzle_home(4);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			GridPuzzle_teacher frame = new GridPuzzle_teacher();
//			frame.setDefaultOptions();
		}
}























