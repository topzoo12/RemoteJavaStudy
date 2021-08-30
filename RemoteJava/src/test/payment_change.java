package receipt;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class payment_change extends JDialog {
	
	// =================================== ������� �г� ���� ===================================
	JPanel new_s1 = new JPanel(); 
	JPanel new_s2 = new JPanel();
	
	JPanel new_text_top = new JPanel();
	JPanel new_text_left = new JPanel();
	JPanel new_text_right = new JPanel();
	
	JPanel new_text_bottom = new JPanel();
	
	// =================================== ������� �г� ���� ===================================
	// =================================== ������� �� ���� ===================================
	JLabel label_payment_print_top = new JLabel();
  
	JLabel label_payment_left1 = new JLabel();	// ���� ���õ� OOO ���� OOO ������ ������ �κ�
	JLabel label_payment_left2 = new JLabel();	// ���� ���õ� OOO ���� OOO ������ ������ �κ�
	JLabel label_payment_left3 = new JLabel();	// ���� ���õ� OOO ���� OOO ������ ������ �κ�
	JLabel label_payment_left4 = new JLabel();	// ���� ���õ� OOO ���� OOO ������ ������ �κ�
	JLabel label_payment_left5 = new JLabel();	// ���� ���õ� OOO ���� OOO ������ ������ �κ�
	
	JLabel label_payment_right = new JLabel();	// 	�� ���� ���μ����� �����ϱ� ���ؼ� ��� �ؾ� �ϴ����� �ȳ��ϴ� �޽����� ������ �κ�
	
	JLabel label_change_who = new JLabel();		//	������ ���� ������ ���� �ִ� �� �˷��ֱ� ���� �޽����� ���� �� �κ� 
	JLabel label_bottom = new JLabel();			//	point ���� �ȳ� �޽���
	
	// =================================== ������� �� ���� ===================================
	// =================================== ������� ��ư ���� ===================================
	
	JButton btn1 = new JButton();	//	���� �� �ָӴ� �̹����� ������ ��ư ����
	JButton btn2 = new JButton();	//	������ �� �ָӴ� �̹����� ������ ��ư ����
	
	// =================================== ������� ��ư ���� ===================================
	// =================================== return_payment_change ������ ���� ===================================
	/*
				return_payment_change[0]	// ��������ȣ
				return_payment_change[1]	// ��������
				return_payment_change[2]	// ��ü�ݾ�
				return_payment_change[3]	// ī������ݾ�
				return_payment_change[4]	// ���ݰ����ݾ�
				return_payment_change[5]	// ����ȣ
				return_payment_change[6]	// �������Ʈ
				return_payment_change[7]	// ��������Ʈ
				return_payment_change[8]	// ��������
				return_payment_change[9]	// ���ݿ����� ����
				return_payment_change[10]	// ���̸�
				return_payment_change[11]	// ��ȭ��ȣ
				return_payment_change[12]	// ����Ʈ
	 */	
	// =================================== return_payment_change ������ ���� ===================================
	
	String[] columnNames;
    String[] columnData;
	
	String[] return_payment_change;
	
	  public payment_change(int receipt_no){
//	    getContentPane().add(label);
		  
		return_payment_change = dbcheck(receipt_no);
		
		payment_check(return_payment_change);
		
//		System.out.println(payment_check(return_payment_change));
//		for (int i = 0; i < return_payment_change.length; i++) {
//			System.out.println(i + " ��° �� : " + return_payment_change[i]);
//		}
	      
		setLayout(null);
		
		new_s1.setBounds(10, 220, 210, 210);
		new_s2.setBounds(250, 220, 220, 210);
		
		new_text_top.setBounds(10, 10, 460, 50);
		new_text_left.setBounds(10, 60, 230, 160);
		new_text_right.setBounds(240, 60, 230, 160);
		
//		new_text.setBounds(10, 10, 460, 200);
		
//		System.out.println();
//		System.out.println(receipt_no);
//		new_s1.setBackground(Color.black);
//		new_s2.setBackground(Color.black);
		
		label_change_who.setBounds(280, 550, 260, 452);

		label_payment_left1.setBounds(280, 65, 120, 22);
		label_payment_left2.setBounds(280, 87, 120, 22);
		label_payment_left3.setBounds(280, 109, 120, 22);
		label_payment_left4.setBounds(280, 131, 120, 22);
		label_payment_left5.setBounds(280, 153, 120, 22);
		
		label_payment_right.setBounds(280, 153, 120, 22);
		
		label_payment_left1.setForeground(Color.white);
		label_payment_left2.setForeground(Color.white);
		label_payment_left3.setForeground(Color.white);
		label_payment_left4.setForeground(Color.white);
		label_payment_left5.setForeground(Color.white);
		
		label_payment_right.setForeground(Color.yellow);
		
		label_change_who.setForeground(Color.white);
		
		new_text_top.setBackground(Color.black);
		new_text_left.setBackground(Color.black);
		new_text_right.setBackground(Color.black);
		
		
//		label.setText("<html><body><font size=6>���� ���� ������ xxxxxx �Դϴ�<font></body></html>");
		
//		label.setIcon(new ImageIcon("image/cash.png"));
		
		
//	    btn1.setText("���ݰ���");
	    btn1.setFont(new Font("����", Font.PLAIN, 20));
	    btn1.setIcon(new ImageIcon("image/cash.png"));
	    btn1.setLocation(150, 150);
//	    btn1.setSize(300, 300);
	    btn1.setBackground(Color.black);
	    
//	    System.out.println(btn1.getSize(getSize()));
	    
	    
//	    btn2.setText("�ſ�ī�����");
	    
	    btn2.setIcon(new ImageIcon("image/credit.png"));
	    btn2.setLocation(150, 150);
//	    btn2.setSize(300, 300);
	    btn2.setBackground(Color.black);
	    
	    new_s1.add(btn1);
	    new_s2.add(btn2);
	    
	    label_change_who.setFont(new Font("Small Fonts", Font.BOLD, 20));
	    
	    label_payment_left1.setFont(new Font("Small Fonts", Font.BOLD, 16));
	    label_payment_left2.setFont(new Font("Small Fonts", Font.BOLD, 16));
	    label_payment_left3.setFont(new Font("Small Fonts", Font.BOLD, 16));
	    label_payment_left4.setFont(new Font("Small Fonts", Font.BOLD, 16));
	    label_payment_left5.setFont(new Font("Small Fonts", Font.BOLD, 16));
	    
	    label_payment_right.setFont(new Font("Small Fonts", Font.BOLD, 17));
	    
	    new_text_top.add(label_change_who);
	    
	    new_text_left.add(label_payment_left1);
	    new_text_left.add(label_payment_left2);
	    new_text_left.add(label_payment_left3);
	    new_text_left.add(label_payment_left4);
	    new_text_left.add(label_payment_left5);
	    
	    new_text_right.add(label_payment_right);
	    
	    add(new_s1);
	    add(new_s2);
	    
	    add(new_text_left);
	    add(new_text_right);
	    add(new_text_top);	// �߰��ϴ� ������ �����ϼ��� ��ġ�� �������� �Ʒ��ʿ� ��ġ�ȴ�. �������ٵ� ���ʿ� ��ġ�ϰ� �ʹٸ� ���� ���� add �� ��
	    add(new_text_bottom); 
	    
	    
	    int cash = Integer.parseInt(return_payment_change[4]);
		int credit = Integer.parseInt(return_payment_change[3]);
		int save_point = Integer.parseInt(return_payment_change[7]);
		int use_point = Integer.parseInt(return_payment_change[6]);
		int cus_point = Integer.parseInt(return_payment_change[12]);
	    
	    // ��ư1 (���� �� ī��� �����ݾ� ���� ���� �׼�) 
		btn1.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				
				String sql = "UPDATE history_payment SET cash = 0, credit = "+ (credit+cash) +", RECEIPT_CHK = 'N' WHERE receipt_no = " + return_payment_change[0];
				
				
//				System.out.println(sql);
				if ( cash == 0 ) {				// ���� ���� ������ ���� ���_( ���ݡ�ī�� �� �ٲ��ִ� ���μ��� �̹Ƿ� �ƹ��� ������ ���� )
					JOptionPane.showMessageDialog(null, "�� �Ӹ� �� !!  ���� ���� ���µ�???? �ٽ� Ȯ���غ� !! ");
				} else if ( cash > 0 ) { 			// ���� ���� ������ ����Ʈ ��� ������ �ִ� ���
					
					int yes_or_no = JOptionPane.showConfirmDialog(null, "�� ���� " + cash + " �̸�ŭ �´µ� �̰� ī�� ����Ұž�??. ", "ī������� ������.........", JOptionPane.YES_NO_OPTION);
					
					
					if (yes_or_no == JOptionPane.CLOSED_OPTION) {
	     				// �� �ƴϿ� ���þ��� â ������� yes_or_no = 2
	     					System.out.println("�׳� �ݾҳ�?");
	     				} else if (yes_or_no == JOptionPane.YES_OPTION) {
	     				// ����ڰ� ���� �����Ѱ�� yes_or_no = 0
	     					data_update(sql);
//	     					System.out.println("���ݿ�����ó��");
	     					JOptionPane.showMessageDialog(null, "���ݿ������� ó�� �Ͽ����ϴ�.");
	     				} else {
	     				// ����ڰ� �ƴϿ��� �����Ѱ�� yes_or_no = 1
	     					JOptionPane.showMessageDialog(null, "�׷��׷�~~ �� �����߾� ~ ");
//	     					System.out.println("���ݿ����� ó�� ����");
	     				}
				}
			}
			
		});
		
		// ��ư2 (ī�� �� �������� �����ݾ� ���� ���� �׼�)
		btn2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				
				String sql = "UPDATE history_payment SET cash = " + (credit+cash) + ", credit = 0, RECEIPT_CHK = 'Y' WHERE receipt_no = " + return_payment_change[0];
				
//				System.out.println(sql);
				if ( credit == 0 ) {				// ���� ���� ������ ���� ���_( ���ݡ�ī�� �� �ٲ��ִ� ���μ��� �̹Ƿ� �ƹ��� ������ ���� )
					JOptionPane.showMessageDialog(null, "�� �Ӹ� �� !!  ī�� �Ƚ��!?!? �ٽ� Ȯ���غ� !! ");
				} else if ( credit > 0 ) { 			// ���� ���� ������ ����Ʈ ��� ������ �ִ� ���
					
					int yes_or_no = JOptionPane.showConfirmDialog(null, "�� ī��� " + credit + " �̸�ŭ ����߾�", "���ݿ����� ������ϳ�.....", JOptionPane.YES_NO_OPTION);
					
					
					if (yes_or_no == JOptionPane.CLOSED_OPTION) {
	     				// �� �ƴϿ� ���þ��� â ������� yes_or_no = 2
	     					System.out.println("�׳� �ݾҳ�?");
	     				} else if (yes_or_no == JOptionPane.YES_OPTION) {
	     				// ����ڰ� ���� �����Ѱ�� yes_or_no = 0
	     					data_update(sql);
//	     					System.out.println("���ݿ�����ó��");
	     					JOptionPane.showMessageDialog(null, "���ݿ������� ó�� �Ͽ����ϴ�.");
	     				} else {
	     				// ����ڰ� �ƴϿ��� �����Ѱ�� yes_or_no = 1
	     					JOptionPane.showMessageDialog(null, "�׷��׷�~~ �� �����߾� ~ ");
//	     					System.out.println("���ݿ����� ó�� ����");
	     				}
				}
				
			}
		});
		
	    
//	    jlb.setText(receipt_no.toString());
//	    label.add(btn);
//	    add(btn);
//	    this.setSize(600,800);
	    this.setBounds(250, 300, 500, 480);
	    this.setModal(true);
	    this.setVisible(true);
	    this.setResizable(false);
	    this.setBackground(Color.black);
	    this.setForeground(Color.black);
	}
	
	  // 
	public void payment_check(String[] data_list) {
		
//		for (int i = 0; i < data_list.length; i++) {
//			System.out.println(i + " ��° �� : " + data_list[i]);
//		}
		
		/*
				return_payment_change[0]	// ��������ȣ
				return_payment_change[1]	// ��������
				return_payment_change[2]	// ��ü�ݾ�
				return_payment_change[3]	// ī������ݾ�
				return_payment_change[4]	// ���ݰ����ݾ�
				return_payment_change[5]	// ����ȣ
				return_payment_change[6]	// �������Ʈ
				return_payment_change[7]	// ��������Ʈ
				return_payment_change[8]	// ��������
				return_payment_change[9]	// ���ݿ����� ����
				return_payment_change[10]	// ���̸�
				return_payment_change[11]	// ��ȭ��ȣ
				return_payment_change[12]	// ����Ʈ
		*/	
		
		label_change_who.setText(return_payment_change[10] + " ���� �� ���� �ݾ� ���� " + return_payment_change[2] + " ��.");
		
		label_payment_left1.setText("ī������ݾ� : " + return_payment_change[3]);
		label_payment_left2.setText("���ݰ����ݾ� : " + return_payment_change[4]);
		label_payment_left3.setText("���������Ʈ : " + return_payment_change[6]);
		label_payment_left4.setText("���ݿ����� ���� : " + return_payment_change[9]);
		label_payment_left5.setText("������ ����Ʈ : " + return_payment_change[7]);
		
		label_payment_right.setText("<html><center>"
								  + "���� �� ī��<br> �����ָӴ� ��ư��"
								  + "<hr>"
								  + "ī�� �� ����<br> ������ ī�� ��ư��<br>"
								  + "<hr>"
								  + "���Ͻô� ��ư�� �����ּ���"
								  + "</center></html>");	
	}
	 
	// ������Ʈ 
	public void data_update(String sql) {
		
		try {
            Connection conn = DriverManager.getConnection(
            		"jdbc:oracle:thin:@database-1.cxc98ia1oha4.us-east-2.rds.amazonaws.com:1521/ORCL",
            		"cafe",
            		"!!22Qorthdud");
            System.out.println(sql);
            PreparedStatement cash_to_credit = conn.prepareStatement(sql);
			
            cash_to_credit.executeUpdate();
			
            cash_to_credit.close();
			conn.close();
			
		} catch (SQLException e) {
            System.out.println("getConnection �ϴٰ� ���� ����");
        }
		
	}
	  
	  
	public String[] dbcheck(int receipt_no) {
		
		try {
	            Connection conn = DriverManager.getConnection(
	            		"jdbc:oracle:thin:@database-1.cxc98ia1oha4.us-east-2.rds.amazonaws.com:1521/ORCL",
	            		"cafe",
	            		"!!22Qorthdud");
	            
	            String sql = "select "
						+ "a.RECEIPT_NO,"		// ������ ��ȣ
						+ "a.DATETIME,"			// �����ð�
						+ "a.TOTAL,"			// �� ���� �ݾ�
						+ "a.CREDIT,"			// ī������ݾ� 
						+ "a.CASH,"				// ���ݰ����ݾ�
						+ "a.CUS_NO,"			// ����ȣ
						+ "a.POINT_USED,"		// �������Ʈ
						+ "a.POINT_SAVED,"		// ��������Ʈ
						+ "a.STATE,"			// ��������
						+ "a.RECEIPT_CHK,"		// ���ݿ����� ����
						+ "b.NAME,"				// �� �̸�
						+ "b.TEL,"				// �� ��ȭ��ȣ
						+ "b.POINT"				// ���� ����Ʈ
				+ " from history_payment a, customer_info b "
				+ "where a.cus_no = b.cus_no and RECEIPT_NO = ";
	
				sql += "" + receipt_no;
				
	            PreparedStatement pstmt_payment_change = conn.prepareStatement(sql);
	            
	            ResultSet rs_list = pstmt_payment_change.executeQuery();
	            
	            ResultSetMetaData md = rs_list.getMetaData();
	            
	            int column_size = md.getColumnCount();
	            
	            columnNames = new String[column_size];
	            columnData = new String[column_size];
	            
	            for(int i = 0; i < columnNames.length; i++) {
	            	columnNames[i] = md.getColumnName(i+1);
//            		System.out.print(columnNames[i] + "\t\t");
                };
//                System.out.println("\n========================================================================================================================================================================================");
                
                while (rs_list.next()) {
            		
            		for (int i = 0; i < columnNames.length; i++) {
        				columnData[i] = rs_list.getString(columnNames[i]);
//        				System.out.print(columnData[i] + "\t\t");
            		}
            		
            	}
                pstmt_payment_change.close();
				conn.close();
				
				
			} catch (SQLException e) {
	            System.out.println("getConnection �ϴٰ� ���� ����");
	        }
			
			return columnData;
		
	}
	  
	
	
}

