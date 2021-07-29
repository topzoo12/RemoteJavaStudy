package gui.quiz.Puzzle;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TextNumPadAction implements ActionListener {
	
	NumPad pad;
	
	public TextNumPadAction(NumPad pad) {
		this.pad = pad;
	}
	/*
	@Override
	public void actionPerformed(ActionEvent e) {

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if (top != -1 && isBlank(top)) {
				numPads.get(top).setText(this.getText());
				this.setText("");
			} else if (bottom != -1 && isBlank(bottom)) {
				numPads.get(bottom).setText(this.getText());
				this.setText("");
			} else if (left != -1 && isBlank(left)) {
				numPads.get(left).setText(this.getText());
				this.setText("");
			} else if (right != -1 && isBlank(right)) {
				numPads.get(right).setText(this.getText());
				this.setText("");
			}
			
			
			if (numPads.get(numPads.size()-1).getText().equals("")) {
				boolean win = true;
				
				for (int i = 1, size = numPads.size(); i < size; i++) {
					if (!numPads.get(i-1).getText().equals("" + (i))) {
						win = false;
						break;
					}
				}
				System.out.println("win : " + win);
			}
			
		}
		
	}
	*/

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}
}
