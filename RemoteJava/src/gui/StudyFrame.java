package gui;

import java.awt.Dimension;
import java.awt.Point;

import javax.swing.JFrame;

public class StudyFrame extends JFrame {
	
	public void setDefaultOptions() {
		setDefaultCloseOperation(EXIT_ON_CLOSE);
//		setLocation(new Point(2020, 100));
		setLocation(new Point(1220, 100));
		setSize(new Dimension(800, 800));
		setVisible(true);
	}
}
