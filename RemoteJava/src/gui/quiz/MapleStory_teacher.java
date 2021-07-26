package gui.quiz;

import javax.swing.JFrame;

import gui.quiz.maple.RollButton;

public class MapleStory_teacher extends JFrame{
	
	
	public MapleStory_teacher() {
		super("´ÜÇ³ ÀÌ¾ß±â");
		setLayout(null);
		
		RollButton rollBtn = new RollButton();
		add("rollBtn", rollBtn);
		
		
		add("stat1", rollBtn.getRanBtns().get(0));
		add("stat1", rollBtn.getRanBtns().get(1));
		add("stat1", rollBtn.getRanBtns().get(2));
		
		setLocation(100 + 1920, 100);
		setSize(700, 700);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new MapleStory_teacher();
	}

}
