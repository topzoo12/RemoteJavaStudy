package gui.mycomponent;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class MyJButton extends JButton {
	
		int value;

		public MyJButton() {
			super();
			
			setText("" + value);
			
			addActionListener(new ActionListener() {
				@Override
				public void actionPerformed(ActionEvent e) {
					// 이벤트 발생시 ActionEvent 인스턴스에 해당 이벤트 정보가 넘어온다 
					System.out.println("정보1 : " + e.getID());
					System.out.println("정보2 : " + e.getModifiers());
					System.out.println("정보3 : " + e.getWhen());
					System.out.println("정보4 : " + e.getActionCommand());
					System.out.println("정보5 : " + e.getSource());
					
					((MyJButton) e.getSource()).setText("" + ++value);
				}
			});
			
		}
		
		
	
}



