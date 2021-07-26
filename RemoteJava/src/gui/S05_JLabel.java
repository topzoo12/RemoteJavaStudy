package gui;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;

import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;

public class S05_JLabel extends StudyFrame {
	/*
		# JLabel
		 - �ؽ�Ʈ�� ���� �뵵�� ���Ǵ� ������Ʈ
		 
		# Icon���� �̹��� �ֱ�
		 -
	*/
	int cnt;
	
	public S05_JLabel() {
		super();
		

		File f3 = new File("image");
		
		System.out.println(Arrays.toString(f3.list()));
		
		String a = Arrays.toString(f3.list());
		String[] aa = a.replaceFirst(" ", "").split(",");
		
		ArrayList<String> image_list = new ArrayList<>();
		
		for (int i = 0; i < aa.length; i++) {
			if (aa[i].contains(".jpg") || aa[i].contains(".gif") || aa[i].contains(".jpeg")) {
				image_list.add(aa[i]);
			}
		}
		
		String[] abc;
		
//			image_list.add(getName())
		
//		Icon[] icons = {
//				new ImageIcon("./image/icon.gif"),
//				new ImageIcon("./image/icon2.jpg"),
//				new ImageIcon("./image/flower2.jpg")
//		};
		
		Icon[] icons = {
				new ImageIcon("./image/icon.gif"),
				new ImageIcon("./image/icon2.jpg"),
				new ImageIcon("./image/flower2.jpg")
		};
		
		
//		for (int i = 0; i < image_list.size(); i++) {
//			Icon[] icons = {
//					new ImageIcon(image_list.get(cnt))
//			};
//		}
		
//		cnt = icons.length - 1;
		
		JButton btn = new JButton();
//		JLabel label = new JLabel(new ImageIcon("./image/icon.gif"));
//		JLabel label = new JLabel(icons[cnt]);
		JLabel label = new JLabel(image_list.get(cnt));
		
		btn.setText("Button");
		label.setText("Label");
		
		add(btn, "South");
		add(label, "Center");
		
		
		
		// �������� : ��ư�� ������ �ٸ� �׸����� �ٲ�� �������� ( �׸��� ��� ��ȯ�Ǿ�� �� )
		
		btn.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(icons[++cnt % icons.length]);
//				int temp = ++cnt % image_list.size();
//				label.setIcon(image_list.get(temp));
			}
		});
		
	}
	
	
	public static void main(String[] args) {

		S05_JLabel frame = new S05_JLabel();
		frame.setDefaultOptions();
	}

	
}






