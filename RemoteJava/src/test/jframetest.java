package test;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import gui.StudyFrame;

public class jframetest extends StudyFrame {
	
	public jframetest() {
		
		setLayout(null);
		/*
		Container con = getContentPane();
		
		con.setBackground(Color.green);
		
		
		String[] columnNames = {"ID", "NAME", "JOB", "DEPT"};
		String[][] data = {
				{"1", "Smith", "IT_PROG", "IT"},
				{"2", "Allen", "IT_PROG", "IT"},           
				{"3", "Ki", "IT_PROG", "IT"},
				{"4", "Zoey", "IT_PROG", "IT"},
				{"5", "Warren", "IT_PROG", "IT"},
				{"6", "Smith", "IT_PROG", "IT"},
				{"6", "Smith", "IT_PROG", "IT"},
				{"6", "Smith", "IT_PROG", "IT"},
//				{"6", "Smith", "IT_PROG", "IT"}
		};
		
		JTable table = new JTable(data, columnNames);
		JScrollPane scrollPane = new JScrollPane(table);
		
		table.setBackground(Color.orange);
		scrollPane.setBackground(Color.pink);
		
		table.getTableHeader().setPreferredSize(new Dimension(scrollPane.getWidth(), 50));
		
		add(scrollPane, "Center");
		add(new JLabel("Employees"), "North");
		*/
		
		
//		JLabel label1 = new JLabel();
		
		int a = 10;
		
		JButton[][] button = new JButton[a][a];
		
		
//		add(label1);
//		label1.setSize(100, 100);
////		label1.setLocation(100, 50);
//		label1.setBackground(Color.pink);
//		label1.setText("라벨1은 여기다"); 
		
		for (int i = 0; i < 5; i++) {
			for (int x = 0; x < a; x++) {
				button[i][x] = new JButton();
				button[i][x].setSize(100, 100);
				button[i][x].setLocation(100 + (x*110), 100 + (i*110));
//				button[i][x].setLocation((0 + (i * 100)), (50 + (i * 100)));
				button[i][x].setBackground(new Color((111111 + ((i*(x+500))))));
				add(button[i][x]);
				button[i][x].setText("<html>'<font size=10>" + i + "</font>' <font size=4>줄</font> <br>'<font size=10>" + x + "</font>'번째</html>");
			}
		}
		
		
		setLocation(2320-1400, 100);
		setSize(1300, 800);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] args) {
		new jframetest();
//		jframetest frame = new jframetest();
//		frame.setDefaultOptions();
	}
}









