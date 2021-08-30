package test;

import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;


public class new_test extends JDialog{
	
//    JLabel jlb = new JLabel("");
	JLabel label = new JLabel();
	JButton btn1 = new JButton();
	JButton btn2 = new JButton();
	JPanel new_s1 = new JPanel(); 
	JPanel new_s2 = new JPanel();
	JPanel new_textarea = new JPanel();
	
    
    public new_test(int receipt_no){
//      getContentPane().add(label);
        
	setLayout(null);
	
	new_s1.setBounds(10, 230, 210, 210);
	new_s2.setBounds(240, 230, 220, 210);
	new_textarea.setBounds(10, 10, 490, 350);
	
//	new_s1.setBackground(Color.black);
//	new_s2.setBackground(Color.black);
	
//	label.setLocation(150, 300);
//	label.setSize(new Dimension(200, 50));
	label.setBounds(280, 350, 490, 452);
	label.setBackground(Color.red);
	label.setText("<html><body><font size=6>현재 결제 정보는 xxxxxx 입니다<font></body></html>");
	
//	label.setIcon(new ImageIcon("image/cash.png"));
	
	
//      btn1.setText("현금결제");
      btn1.setFont(new Font("돋움", Font.PLAIN, 20));
      btn1.setIcon(new ImageIcon("image/cash.png"));
      btn1.setLocation(150, 150);
//      btn1.setSize(300, 300);
      btn1.setBackground(Color.black);
      
      System.out.println(btn1.getSize(getSize()));
      
      
//      btn2.setText("신용카드결제");
      btn2.setIcon(new ImageIcon("image/credit.png"));
      btn2.setLocation(150, 150);
//      btn2.setSize(300, 300);
      btn2.setBackground(Color.black);
      
      new_s1.add(btn1);
      new_s2.add(btn2);
      new_textarea.add(label);
      
      add(new_s1);
      add(new_s2);
      add(new_textarea);
      
//      jlb.setText(receipt_no.toString());
//      label.add(btn);
//      add(btn);
//      this.setSize(600,800);
      this.setBounds(250, 300, 500, 500);
		this.setModal(true);
      this.setVisible(true);
      this.setResizable(false);
      this.setBackground(Color.black);
    }
    
    public static void main(String[] args) {
    	new_test a = new new_test(33);
	}
    
    
}