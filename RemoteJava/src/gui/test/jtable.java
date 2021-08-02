package gui.test;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import gui.StudyFrame;

public class jtable extends StudyFrame {
	
	
	public jtable() {
		
		
		
		Container con = getContentPane();
		
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
		
		table.getTableHeader().setPreferredSize(new Dimension(scrollPane.getWidth(), 50));
		
		add(scrollPane, "Center");
		add(new JLabel("Employees"), "North");
		
		
	}
	
	
	
	public static void main(String[] args) {
		jtable frame = new jtable();
		frame.setDefaultOptions();
	}

}









