package test;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
class JListTest extends JFrame implements ListSelectionListener{
 
 private String [] fruitlist = {"��", "�ٳ���", "���", "����", "�޵�", "��"};
 private JList jlst = new JList(fruitlist);
 
	 private ImageIcon[] fruiticons = {
	   new ImageIcon("��.jpg"),
	   new ImageIcon("�ٳ���.jpg"),
	   new ImageIcon("���.jpg"),
	   new ImageIcon("����.jpg"),
	   new ImageIcon("�޵�.jpg"),
	   new ImageIcon("��.jpg"),
	 };
 
 private JLabel[] jlicon = new JLabel[6];
 
 
 public JListTest(){
  JPanel p = new JPanel();

  p.setLayout(new GridLayout(3,2,5,5));

  for(int i = 0; i<6; i++){
   p.add(jlicon[i] = new JLabel());
  }

  Container c = getContentPane();
  
  c.add(jlst, BorderLayout.WEST);
  c.add(p, BorderLayout.CENTER);
  
  jlst.addListSelectionListener(this);
  setTitle("JList Test1");
  setSize(300,300);
  setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
  setVisible(true);
 }


 public void valueChanged(ListSelectionEvent lse){
  for(int i=1; i<6; i++)
  {
   jlicon[i].setIcon(null);
  }
  int[] indices = jlst.getSelectedIndices();
  for(int j = 0; j<indices.length;j++)
  {
   jlicon[j].setIcon(fruiticons[indices[j]]);
  }
 }



}




public class JListTest {
	public static void main(String args[]) {
		new JListTest();
	}
}