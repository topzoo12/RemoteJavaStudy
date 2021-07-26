package gui.quiz.maple;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;

public class RollButton extends JButton{
	
	private ArrayList<RandomButton> ranBtns;
	
	public RollButton() {
		ranBtns = new ArrayList<>();
		
		RandomButton stat1 = new RandomButton();
		RandomButton stat2 = new RandomButton();
		RandomButton stat3 = new RandomButton();
		
//		ranBtns.add(new RandomButton());
//		ranBtns.add(new RandomButton());
		
		stat1.setText("-");
		stat1.setLocation(10, 160);
		stat1.setSize(200, 120);
		
		stat2.setText("-");
		stat2.setLocation(220, 160);
		stat2.setSize(200, 120);
		
		stat3.setText("-");
		stat3.setLocation(430, 160);
		stat3.setSize(200, 120);
		
		ranBtns.add(stat1);
		ranBtns.add(stat1);
		ranBtns.add(stat1);
		
		setText("Roll!!");
		
		setLocation(10, 300);
		setSize(620, 120);
				
		addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				for (RandomButton btn : ranBtns) {
					btn.roll();
				}
			}
		});		
	}
	
	public ArrayList<RandomButton> getRanBtns(){
		return ranBtns;
	}
	
}
