package gui;

import java.awt.BorderLayout;
import java.awt.Graphics2D;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.RenderingHints;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import gui.quiz.Puzzle.Numpad;

public class GridPuzzle_teacher extends JFrame {
	
		private ArrayList<JButton> num_pads;
		
		private ArrayList<ImageIcon> ss = new ArrayList<>();
		
		private String image_path;
	
		public GridPuzzle_teacher() throws IOException {
			this(3);
		}
//		final BufferedImage source = ImageIO.read(new File("./image/peng/icon3.jpg"));
		
//		int idx = 0;
//		for (int y = 0; y < source.getHeight(); y += 32) {
//		    ImageIO.write(source.getSubimage(0, y, 32, 32), "png", new File("<sourceDir>/1fby-6t-555d_" + idx++ + ".png"));
//		};
		
		
		public GridPuzzle_teacher(int gameSize) throws IOException {
			super(String.format("¼ýÀÚÆÛÁñ°ÔÀÓ : %d x %d", gameSize, gameSize));
			
			image_path = "./image/peng/icon2.jpg";
			
			
			
			JPanel num_panel = new JPanel(new GridLayout(gameSize, gameSize));
			JPanel menu_panel = new JPanel(new BorderLayout());
			
			num_pads = new ArrayList<>();
			// ===========================================================================
			// ===========================================================================
			
			Image src = ImageIO.read(new File("./image/peng/icon2.jpg"));
			int w_max = ImageIO.read(new File("./image/peng/icon2.jpg")).getWidth();
			int h_max = ImageIO.read(new File("./image/peng/icon2.jpg")).getWidth();
			int w = ImageIO.read(new File("./image/peng/icon2.jpg")).getWidth()/gameSize;
			int h = ImageIO.read(new File("./image/peng/icon2.jpg")).getWidth()/gameSize;
			
			int x = 0, y = 0;
//			int x = 0, y = 0, w = 700/gameSize, h = 700/gameSize;

			BufferedImage dst = new BufferedImage(w, h, BufferedImage.TYPE_INT_ARGB);
//			for (int i = 0; i < (gameSize * gameSize); i++) {
//				if (x >= w_max) {
//					y += h;
//					x = 0;
//				}
//				dst.getGraphics().drawImage(src, 0, 0, w, h, x, y, x + w, y + h, null);
//				ImageIO.write(dst, "png", new File("./image/peng/d/image_" + i + ".png" ));
//				x += w;
//			}
					
			// ===========================================================================
			// ===========================================================================
			
//			for (int y = 0; y < source.getHeight(); y += w) {
//			    ImageIO.write(source.getSubimage(0, y, w, w), "png", new File("./image/peng/d/image_" + y + ".png"));
//			}
			
			for (int i = 0, len = gameSize * gameSize; i < len; i++) {
				
//				Numpad new_pad = new Numpad(i, gameSize, num_pads);
				Numpad new_pad = new Numpad(i, gameSize, num_pads, resizedBufferedImage());
				num_pads.add(new_pad);
				num_panel.add(new_pad);
				
				if (x >= w_max) {
					y += h;
					x = 0;
				}
				dst.getGraphics().drawImage(src, 0, 0, w, h, x, y, (x + w), (y + h), null);
				
//				new_pad.setIcon(new ImageIcon(dst));
//				System.out.print(ss.size());
//				ss.add(i, new ImageIcon(dst));
				ss.add(new ImageIcon(dst));
//				System.out.println(ss.size());
				
//				new_pad.setIcon(new ImageIcon(shit.get(i)));
				ImageIO.write(dst, "png", new File("./image/peng/d/image_" + i + ".png" ));
				
//				num_pads.get(i).setIcon(new ImageIcon(dst));
				num_pads.get(i).setIcon(ss.get(i));
				x += w;
				
//				new_pad.setIcon(new ImageIcon("./image/peng/icon3.jpg"));
//				numPads.add(new Numpad(i, gameSize, numPads));
			}
			
//			int idx = 0;
//			for (int y = 0; y < source.getHeight(); y += 32) {
//			    ImageIO.write(source.getSubimage(0, y, 32, 32), "png", new File("<sourceDir>/1fby-6t-555d_" + idx++ + ".png"));
//			};
			
			add(num_panel, "Center");
			add(menu_panel, "East");
			
			shuffle();
//			setLayout(new GridLayout());
			
			setIconImage(ImageIO.read(new File("./image/GridNumberPuzzle.jpg")));
//			setFont(new Font("µ¸¿ò", Font.PLAIN, 20));
			setBounds(220, 50, 1000, 1000);
			setVisible(true);
			setDefaultCloseOperation(EXIT_ON_CLOSE);
//			setSize(700,700);
		}
		
		private BufferedImage resizedBufferedImage() throws IOException {
			BufferedImage img = ImageIO.read(new File(image_path));
			int oriW = img.getWidth();
			int oriH = img.getWidth();
			int newW = 700;
			int newH = 700;
			
			BufferedImage dimg = new BufferedImage(newW, newH, img.getType());
			Graphics2D g = dimg.createGraphics();
			g.setRenderingHint(RenderingHints.KEY_INTERPOLATION, RenderingHints.VALUE_INTERPOLATION_BILINEAR);
			g.drawImage(img, 0, 0, newW, newH, 0, 0, oriW, oriH, null);
			g.dispose();
			
			return dimg;
			
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
				new GridPuzzle_teacher(4);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			GridPuzzle_teacher frame = new GridPuzzle_teacher();
//			frame.setDefaultOptions();
		}
}























