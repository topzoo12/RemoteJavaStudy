package gui;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JPanel;

import gui.mypanel.ImagePanel;

public class S09_MenuBar extends StudyFrame {
	
	public S09_MenuBar() {
		super();
		
		JMenuBar bar = new JMenuBar();
		
		JMenu main = new JMenu("Main Menu");
		JMenu sub = new JMenu("Sub Menu");
		
		JMenuItem main_item1 = new JMenuItem("New");
		JMenuItem main_item2 = new JMenuItem("Load");
		JMenuItem main_item3 = new JMenuItem("Save");
		
		JMenuItem sub_item1 = new JMenuItem("Update");
		JMenuItem sub_item2 = new JMenuItem("Delete");
		
		JLabel label = new JLabel();
		add(label);
		
		class MenuItemListener implements ActionListener {
			String path;
			
			public MenuItemListener(String path) {
				this.path = path;
			}
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(new ImageIcon(path));
			}
		}
		
		main_item1.addActionListener(new MenuItemListener("./image/peng/icon.gif"));
		main_item2.addActionListener(new MenuItemListener("./image/peng/icon2.jpg"));
		main_item3.addActionListener(new MenuItemListener("./image/peng/icon3.jpg"));
		sub_item1.addActionListener(new MenuItemListener("./image/peng/icon4.jpg"));
		sub_item2.addActionListener(new MenuItemListener("./image/peng/icon5.jpg"));
		
		// =========================================================================================================
		// =========================================================================================================
		
		/*
		main_item1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(new ImageIcon("./image/peng/icon.gif"));
			}
		});
		
		main_item2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(new ImageIcon("./image/peng/icon2.jpg"));
			}
		});
		
		main_item3.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(new ImageIcon("./image/peng/icon3.jpg"));
			}
		});
		
		sub_item1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				label.setIcon(new ImageIcon("./image/peng/icon4.jpg"));
			}
		});
		
		*/
		// =========================================================================================================
		// =========================================================================================================
		
		main.add(main_item1);
		main.add(main_item2);
		main.add(main_item3);
		
		main.add(sub);
		
		sub.add(sub_item1);
		sub.add(sub_item2);
		
		bar.add(main);
//		bar.add(sub);
		
		setJMenuBar(bar);
	}
	
	
	public static void main(String[] args) {
			S09_MenuBar frame = new S09_MenuBar();
			frame.setDefaultOptions();
	}

}

















