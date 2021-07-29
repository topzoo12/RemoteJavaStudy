package gui;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JLabel;
import javax.swing.JTextArea;

public class S10_KeyEvent extends StudyFrame {
	
	
	public S10_KeyEvent() {
		super();
		
//		setLayout(null);
		JLabel status = new JLabel("stable");
		
		JTextArea ta = new JTextArea("�⺻��");
		ta.setBounds(20, 20, 220, 220);
		
		// KeyTyped�δ� � Ű���尡 ���ȴ��� �� �� ���� (VK_DEFINED)
		// � Ű�� ���ȴ��� �˱� ���ؼ��� KeyPressed �̺�Ʈ�� �̿��ؾ� �Ѵ�.
		
		// ��� keyTyped�� � ���� �ԷµǾ����� �� �� �ִ�.
		ta.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				System.out.println(e.getKeyChar() + " Value  Inputed");
			}
			
			@Override
			public void keyPressed(KeyEvent e) {
				status.setText(e.getKeyCode() + " Key Pressed");
				System.out.println(e.getKeyCode() + " Key Pressed");
			}
		});
//		ta.addKeyListener(new KeyListener() {
//			@Override
//			public void keyTyped(KeyEvent e) {
//				ta.setText(e.getKeyCode() + "Key Typed");
//			}
//			
//			@Override
//			public void keyReleased(KeyEvent e) {
//				ta.setText("Key Released");
//			}
//			
//			@Override
//			public void keyPressed(KeyEvent e) {
//				ta.setText("Key Pressed");
//			}
//		});
		
		add(ta, "Center");
		add(status, "North");
		
	}
	
	public static void main(String[] args) {
		
		// Ű���尡 ������ �� �߻��ϴ� �̺�Ʈ�� ������Ʈ�� �߰��� �� �ִ�.
		S10_KeyEvent frame = new S10_KeyEvent();
		frame.setDefaultOptions();
		
	}
	
}
























