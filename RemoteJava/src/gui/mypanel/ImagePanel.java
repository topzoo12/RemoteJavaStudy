package gui.mypanel;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class ImagePanel extends JPanel implements ActionListener {
	
	JLabel label;
	JButton prev, next;
	
	ImageIcon[] icons;
	int index;
	
	private static ImageIcon[] makeImageIconArray(String[] image_paths) {
		
		ImageIcon[] icons = new ImageIcon[image_paths.length];
		
		int i = 0;
		for (String path : image_paths ) {
			icons[i++] = new ImageIcon(path);
		}
		
		return icons;
	}
//	public ImagePanel(List<? extends ImageIcon> images){
//		this((ImageIcon[]) images.toArray());
//	}
	
	public ImagePanel(List<ImageIcon> images){
		this(images.toArray(new ImageIcon[images.size()]));
	}
	
	
	public ImagePanel(String[] image_paths) {
		this(makeImageIconArray(image_paths));
	}
	
	

	public ImagePanel(ImageIcon[] icons) {
		
		super(new BorderLayout());
		
		this.icons = icons;
		
		label = new JLabel(icons[index]);
		prev = new JButton("<");
		next = new JButton(">");
		
		prev.addActionListener(this);
		next.addActionListener(this);
		
		add(label, "Center");
		add(prev, "West");
		add(prev, "East");
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
		if (prev == e.getSource()) {
			System.out.println("이전 버튼이 눌렸습니다.");
			label.setIcon(icons[--index < 0 ? index += icons.length : index]);
		} else if (next == e.getSource()) {
			System.out.println("다음 버튼이 눌렸습니다.");
			label.setIcon(icons[index = ++index % icons.length]);
		}
 
	}
	
	
	
	
	
	
}













