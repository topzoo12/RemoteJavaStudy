package gui.quiz.maple;

import java.util.Random;

import javax.swing.JButton;

public class RandomButton extends JButton {
	
	static String[] stat_Labels = {"Èû", "¹ÎÃ¸", "Áö´É", "Çà¿î", "°ø°Ý·Â"};
	static int[] max_stats = {7, 7, 7, 7, 3};
	
	Random ran;
	
	public RandomButton() {
		super("None");
		ran = new Random();
	}
	
	void roll(){
		int value = ran.nextInt(stat_Labels.length);
		setText(stat_Labels[value] + " " + ran.nextInt(max_stats[value]+ 1));
	}
	
	
}
