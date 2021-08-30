package test;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import baseSettings.PosFrame;

public class Receipt_duck_2 extends PosFrame {
	
	static ArrayList<ArrayList<String>> list_data_default = new ArrayList<ArrayList<String>>();
	static ArrayList<ArrayList<String>> list_data_cash = new ArrayList<ArrayList<String>>();
	static ArrayList<ArrayList<String>> list_data_credit = new ArrayList<ArrayList<String>>();
	
	static String[] columnNames = null;
	
	static String Receipt_list = "select * from payment_view_2";
	static String Receipt_list_cash = Receipt_list + " where cash > 0";
	static String Receipt_list_credit = Receipt_list + " where credit > 0";
	
//	static String Receipt_list_cash = "select * from payment_view_1 where cash > 0";
//	static String Receipt_list_credit = "select * from payment_view_1 where credit > 0";
	
	static String refund_sql = "UPDATE history_payment SET state = 'cancel' WHERE receipt_no = ";
	static String cash_receipt_chk = "select cash, credit, receipt_chk from history_payment WHERE receipt_no = ";
	static String cash_receipt = "UPDATE history_payment SET receipt_chk = 'Y' WHERE receipt_no = ";
	static String cash_receipt_cancel = "UPDATE history_payment SET receipt_chk = 'N' WHERE receipt_no = ";
	
	static String[][] data_default = null;
	static String[][] data_cash = null;
	static String[][] data_credit = null;
	
	static int select_receipt_no = -1;
	static String select_receipt_no_string = "";
	
	static int w_size, h_size;
	static int cash_w_size, cash_h_size;
	static int credit_w_size, credit_h_size;
	
	static int no;				// 
	static String state_chk;	// ?��?��?�� 결제?��?��
	
	static String[] cash_receipt_result;
	
	
	public void total() {
		try {
            Connection conn = DriverManager.getConnection(
            		"jdbc:oracle:thin:@database-1.cxc98ia1oha4.us-east-2.rds.amazonaws.com:1521/ORCL",
            		"cafe",
            		"!!22Qorthdud");
            
        // ================================================================================================
        // ================================================================================================
            	
            	// 기본 ?��?��?�� 리스?�� 
            	PreparedStatement pstmt_Receipt_list = conn.prepareStatement(Receipt_list);
            	PreparedStatement pstmt_Receipt_list_cash = conn.prepareStatement(Receipt_list_cash);
            	PreparedStatement pstmt_Receipt_list_credit = conn.prepareStatement(Receipt_list_credit);
            	
            	ResultSet rs_list = pstmt_Receipt_list.executeQuery();
            	ResultSet rs_list_cash = pstmt_Receipt_list_cash.executeQuery();
            	ResultSet rs_list_credit = pstmt_Receipt_list_credit.executeQuery();
            	
            	// 컬럼 명을 불러?���? ?��?�� ?��?��?�� 처리
            	ResultSetMetaData md = rs_list.getMetaData();
            	
            	// ?��?�� ?��?���? ?��?��즈�?? 구성?���? ?��?�� �??��?�� 컬럼?�� ?��?�� ???��
            	int column_size = md.getColumnCount();
            	
            	// 구한 컬럼 ?��?��+1?�� ?��?��?�� 컬럼 ?��?��?�� 첫번�? col ?��?�� ?��?��?��?�� ?���? ?��???��기위?�� No ?�� 추�??���? ?��?��
            	columnNames = new String[column_size+1];
            	
            	// 컬럼명을 배열?�� 문자?���? ???��
            	for(int i = 0; i < columnNames.length; i++) {
            		if (i == 0) {
            			columnNames[i] = "No";
            		} else {
            			columnNames[i] = md.getColumnName(i);
            		}
                }
            	
            	// 기존?�� ?��겨있?�� ?��?��?���? 비�?
            	list_data_default.clear();
            	
            	
            	// �??��?�� ?��?��?���? list_data_default(ArrayList) ?�� ???��
            	while (rs_list.next()) {
            		ArrayList<String> data_total = new ArrayList<>();
            		data_total.clear();
            		for (int i = 0; i < columnNames.length; i++) {
            			if (i == 0) {
            				data_total.add("" + i);
            			} else {
            				data_total.add(rs_list.getString(columnNames[i]));
            			}
            		}
            		list_data_default.add(data_total);
            	}
            	
            	// 기존?�� ?��겨있?�� ?��?��?���? 비�?
            	list_data_cash.clear();
            	
            	// �??��?�� ?��?��?���? list_data_cash(ArrayList) ?�� ???��
            	while (rs_list_cash.next()) {
            		
            		ArrayList<String> data_cash = new ArrayList<>();
            		data_cash.clear();
            		for (int i = 0; i < columnNames.length; i++) {
            			if (i == 0) {
            				data_cash.add("" + i);
            			} else {
            				data_cash.add(rs_list_cash.getString(columnNames[i]));
            			}
            		}
            		list_data_cash.add(data_cash);
            	}
            	
            	// 기존?�� ?��겨있?�� ?��?��?���? 비�?
            	list_data_credit.clear();
            	
            	// �??��?�� ?��?��?���? list_data_credit(ArrayList) ?�� ???��
            	while (rs_list_credit.next()) {
            		ArrayList<String> data = new ArrayList<>();
            		data.clear();
            		for (int i = 0; i < columnNames.length; i++) {
            			if (i == 0) {
            				data.add("" + i);
            			} else {
            				data.add(rs_list_credit.getString(columnNames[i]));
            			}
            		}
            		list_data_credit.add(data);
            	}
            	
            	// ?��?�� ?��?�� �? 리소?��?�� 종료 
            	rs_list.close();
            	rs_list_cash.close();
            	rs_list_credit.close();
            	
            	pstmt_Receipt_list.close();
            	pstmt_Receipt_list_cash.close();
            	pstmt_Receipt_list_credit.close();
            	
            	conn.close();
            
            // ================================================================================================
        	// ================================================================================================
//            	System.out.println("w_size : " + w_size);
//            	System.out.println("cash_w_size : " + cash_w_size);
//            	System.out.println("credit_w_size : " + credit_w_size);
            	// JTable?�� ?���? ?��?��?��?�� ?��?��즈�?? ?��?��?���? ?��?�� �? ?��?��?��?�� ?��?���? 구하�?
            	w_size = list_data_default.size();
            	h_size = list_data_default.get(0).size();
            	cash_w_size = list_data_cash.size();
            	cash_h_size = list_data_cash.get(0).size();
            	credit_w_size = list_data_credit.size();
            	credit_h_size = list_data_credit.get(0).size();
//            	
//            	System.out.println("w_size : " + w_size);
//            	System.out.println("cash_w_size : " + cash_w_size);
//            	System.out.println("credit_w_size : " + credit_w_size);
//            	
            	// 구한 �? ?��?��?��?�� ?��?��즈�?? �?�?�? JTable?�� ?���? ?��?��
             	data_default = new String[w_size][h_size];
             	data_cash = new String[cash_w_size][cash_h_size];
             	data_credit = new String[credit_w_size][credit_h_size];
             	
             	// ?���?(total) ?��?��?���? JTable?�� ?��?��?�� 배열?�� ???��
             	for (int i = 0; i < w_size; i++) {
            		for (int x = 0; x < h_size; x++) {
            			if (x == 0) {
            				data_default[i][x] = "" + (i+1);
            			}else {
            				data_default[i][x] = list_data_default.get(i).get(x);
            			}
            		}
            	}
             	
             	// ?���?(Cash) ?��?��?���? JTable?�� ?��?��?�� 배열?�� ???��
             	for (int i = 0; i < cash_w_size; i++) {
            		for (int x = 0; x < cash_h_size; x++) {
            			if (x == 0) {
            				data_cash[i][x] = "" + (i+1);
            			}else {
            				data_cash[i][x] = list_data_cash.get(i).get(x);
            			}
            		}
            	}
             	
             	// 카드(Credit) ?��?��?���? JTable?�� ?��?��?�� 배열?�� ???��
             	for (int i = 0; i < credit_w_size; i++) {
            		for (int x = 0; x < credit_h_size; x++) {
            			if (x == 0) {
            				data_credit[i][x] = "" + (i+1);
            			}else {
        	    			data_credit[i][x] = list_data_credit.get(i).get(x);
            			}
            		}
            	}
             	
            
		} catch (SQLException e) {
            System.out.println("getConnection ?��?���? 문제 ?���?");
        }
		
	}
	
	// 반품 처리
	public void refund(int receipt_no) {
		try {
            Connection conn = DriverManager.getConnection(
            		"jdbc:oracle:thin:@database-1.cxc98ia1oha4.us-east-2.rds.amazonaws.com:1521/ORCL",
            		"cafe",
            		"!!22Qorthdud");
            refund_sql += ("" + receipt_no);
//            System.out.println(refund_sql);
            
            PreparedStatement refund = conn.prepareStatement(refund_sql);
            
			int row = refund.executeUpdate();
			
//			System.out.println(row + "row(s) changed.");
			
			refund.close();
			conn.close();
			total();
            
		} catch (SQLException e) {
            System.out.println("getConnection ?��?���? 문제 ?���?");
        }
	}
	
	// ?��금영?���? ?��?��?�� ?���? ?��?��
		public String[] cash_receipt(int receipt_no) {
			try {
	            Connection conn = DriverManager.getConnection(
	            		"jdbc:oracle:thin:@database-1.cxc98ia1oha4.us-east-2.rds.amazonaws.com:1521/ORCL",
	            		"cafe",
	            		"!!22Qorthdud");
	            cash_receipt_chk += ("" + receipt_no);
	            System.out.println(cash_receipt_chk);
	            
	            PreparedStatement cash_receipt_yn = conn.prepareStatement(cash_receipt_chk);
	            ResultSet rs_cash_receipt_yn = cash_receipt_yn.executeQuery();
	            
	            cash_receipt_result = new String[3];
	            
	            while (rs_cash_receipt_yn.next()) {
//	            	System.out.println(rs_cash_receipt_yn.getString("receipt_chk"));
	            	cash_receipt_result[0] = rs_cash_receipt_yn.getString("cash");
	            	cash_receipt_result[1] = rs_cash_receipt_yn.getString("credit");
	            	cash_receipt_result[2] = rs_cash_receipt_yn.getString("receipt_chk");
            	}
	            
				cash_receipt_yn.close();
				conn.close();
				total();
	            
			} catch (SQLException e) {
	            System.out.println("getConnection ?��?���? 문제 ?���?");
	        }
			
			return cash_receipt_result;
		}
		
		// ?��금영?���? 처리 ?��?��
		public void cash_receipt_executive(int receipt_no, String receipt_chk) {
			try {
	            Connection conn = DriverManager.getConnection(
	            		"jdbc:oracle:thin:@database-1.cxc98ia1oha4.us-east-2.rds.amazonaws.com:1521/ORCL",
	            		"cafe",
	            		"!!22Qorthdud");
	            
		            
	            if (receipt_chk.equals("N")) {
	            	
	            	cash_receipt += ("" + receipt_no);
	            	PreparedStatement cash_receipt_executive = conn.prepareStatement(cash_receipt);
	            	cash_receipt_executive.executeUpdate();
	            	cash_receipt_executive.close();
	            	
	            } else if (receipt_chk.equals("Y")) {
	            	
	            	cash_receipt_cancel += ("" + receipt_no);
	            	PreparedStatement cash_receipt_executive = conn.prepareStatement(cash_receipt_cancel);
	            	cash_receipt_executive.executeUpdate();
	            	cash_receipt_executive.close();
	            	
	            }
	            
	            
				conn.close();
				total();
	            
			} catch (SQLException e) {
	            System.out.println("getConnection ?��?���? 문제 ?���?");
	        }
			
			
		}
	
	
	
	
	public Receipt_duck_2() {
		super();
		super.setTitle("?��?���? �?�?");
		try {
            Connection conn = DriverManager.getConnection(
            		"jdbc:oracle:thin:@database-1.cxc98ia1oha4.us-east-2.rds.amazonaws.com:1521/ORCL",
            		"cafe",
            		"!!22Qorthdud");

            String sql = "select * from PAYMENT_VIEW WHERE RECEIPT_NO = 24" + "";
//            
//            
//            PreparedStatement pstmt = conn.prepareStatement(sql);
//
//            ResultSet rs = pstmt.executeQuery();

//            while (rs.next()) {
//                System.out.print(rs.getString("MENU"));
//                System.out.print(rs.getInt("PRICE"));
//                System.out.println();
//            }

            // 6. ?�� ?��?��?�� ?��결을 ?��중에 ?�� ?��?��??�? ?��?���??��
//            rs.close();
//            pstmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("getConnection ?��?���? 문제 ?���?");
        }
		
		setLayout(null);
		
		// ?��간을 문자?���? �?경하�?
		DateTimeFormatter my_date_format = 
				DateTimeFormatter.ofPattern("y?�� M?�� d?��");
		
		String message = my_date_format.format(LocalDate.now());

		JButton date = new JButton(message);
		String product = "";
		
		String string = // ?��?���? ?���? ?��?�� 
				"<html><center>-------------------------------------------------------------------"
				+ "<br>*?���?방침?�� ?��?�� 교환/?��불�? 반드?�� ?��?��증을"
				+ "<br>�?참하?��?�� ?���?, 카드결제?�� 30?��(09?��08?��)"
				+ "<br>?��?�� 카드?? ?��?���? �?�? ?�� �??��?��?��?��."
				+ "<br>-------------------------------------------------------------------"
				+ "</center>"
				
				+ "<table style='width:100%;'>"
				+ "<tr>"
				+ "<td>?���?</td>"
				+ "<td style='text-align:center;'>?���?</td>"
				+ "<td style='text-align:center;'>?��?��</td>"
				+ "<td style='text-align:right;'>금액</td>"
				+ "</tr>"
				+ "</table>"
				+ "-------------------------------------------------------------------"
				+ "<table style='width:100%;'>"
				+ "<tr>"
				+ "<td>과세매출</td>"
				+ "<td style='text-align:right;'>3000?��</td>"
				+ "</tr>"
				+ "</table>"
				
				+ "<table style='width:100%;'>"
				+ "<tr>"
				+ "<td>�?�??��</td>"
				+ "<td style='text-align:right;'>3000?��</td>"
				+ "</tr>"
				+ "</table>"
				
				+ "<table style='width:100%;'>"
				+ "<tr>"
				+ "<td>?��&emsp�?</td>"
				+ "<td style='text-align:right;'>3000?��</td>"
				+ "</tr>"
				+ "</table>"
				
				+ "<table style='width:100%;'>"
				+ "<tr>"
				+ "<td>?��&emsp�?</td>"
				+ "<td style='text-align:right;'>3000?��</td>"
				+ "</tr>"
				+ "</table>"
				
				+ "<table style='width:100%;'>"
				+ "<tr>"
				+ "<td>?��&emsp�?</td>"
				+ "<td style='text-align:right;'>3000?��</td>"
				+ "</tr>"
				+ "</table>"
				
				+ "<table style='width:100%;'>"
				+ "<tr>"
				+ "<td>?��&emsp�?</td>"
				+ "<td style='text-align:right;'>3000?��</td>"
				+ "</tr>"
				+ "</table>"
				
				+ "</html>";
		
		
		
		
		
		// &nbsp ?��?��?���? &emsp ?���? ?��?��?���?
		// <html> +  + <br> + + <p>  + + </html> �? 바꾸?�� �?
		
		JPanel frame = new JPanel();
		
		JLabel receipt = new JLabel(string);
		
		
		
		ArrayList<JButton> buttons = new ArrayList<>();
		
		
		
		buttons.add(new JButton("?��?��반품")); // 0 
		buttons.add(new JButton("?��?��?��"));
		buttons.add(new JButton("?��금영?���?"));
		
		
		buttons.add(new JButton("결제�?�?"));
		buttons.add(new JButton("?���?"));
		buttons.add(new JButton("?���?"));
		buttons.add(new JButton("?��?��카드")); // 6
		
		// 버튼 ?���? 조정
		buttons.get(0).setBounds(20, 30, 150, 80);
		buttons.get(1).setBounds(190, 30, 150, 80);
		buttons.get(2).setBounds(360, 30, 150, 80);
		buttons.get(3).setBounds(530, 30, 150, 80);
		
		buttons.get(4).setBounds(870, 30, 120, 80);
		buttons.get(5).setBounds(1010, 30, 120, 80);
		buttons.get(6).setBounds(1150, 30, 120, 80);
		
		for (int i = 0; i < buttons.size(); ++i) {
			buttons.get(i).setFont(new Font("MV Bold", Font.BOLD, 20));
		}
		
		date.setBounds(730, 30, 120, 80);
		date.setBackground(new Color(0xffffff));
		
		receipt.setFont(new Font("MV Bold", Font.BOLD, 20));
		receipt.setOpaque(true); // 백그?��?��?�� ?��?�� ?��?��
		receipt.setHorizontalAlignment(JLabel.CENTER); // ?��?�� �??��?�� ?��?�� ?��?��
		receipt.setVerticalAlignment(JLabel.NORTH);; // ?���? �??��?�� ?��?�� ?��?��
		receipt.setBackground(new Color(0xffffff));// ?���? 배경?��
//		receipt.setBounds(730, 140, 540, 2000);
//		frame.setBackground(new Color(0xffffff)); // ?��?�� 배경?��
		frame.setBounds(730, 140, 540, 500);
		receipt.setAutoscrolls(true);
		JScrollPane scrollPane = new JScrollPane( // ?��?��증에 ?���? ?��?��롤바 추�?
				receipt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(new Dimension(540, 500)); // ?��?��롤바 ?��기조?��
		
		frame.add(scrollPane);
		
		// 좌측 ?�� 버튼 추�?
		add(buttons.get(0));
		add(buttons.get(1));
		add(buttons.get(2));
		add(buttons.get(3));
		
		add(date); // ?���? 출력
		
		// ?���? ?�� 버튼
		add(buttons.get(4));
		add(buttons.get(5));
		add(buttons.get(6));
		
        add(frame);
        

     // ================================================================================================
     // ================================================================================================
        
        total();
//        cash_list();
//        credit_list();

        JPanel receipt_panel = new JPanel();        
        
     	receipt_panel.setBackground(Color.black);
     	receipt_panel.setLocation(20, 140);
     	receipt_panel.setSize(660, 500);

//     	JPanel a = new JPanel();
//     	a.setSize(20,20);
     	
     	
     	DefaultTableModel model = new DefaultTableModel(data_default, columnNames);
//     	JTable table = new JTable(data_default, columnNames);
		JTable table = new JTable(model);
     	
     	JScrollPane scrollPane1 = new JScrollPane(table);
     	scrollPane1.setBorder(BorderFactory.createEmptyBorder());
//     	scrollPane1.setBounds(20, 120, 6600, 4700);
     	
//     	scrollPane1.setBackground(Color.pink);
     	
//     	table.setPreferredSize(new Dimension(660, 1500));
//     	table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
     	
     	table.getTableHeader().setPreferredSize(new Dimension(scrollPane1.getWidth(), 50));
     	
     	scrollPane1.setPreferredSize(new Dimension(658, 495));
//     	scrollPane1.setPreferredSize(660, 1500);
//     	scrollPane1.setSize(6600, 1500);
     	
     	table.setRowSelectionAllowed(true);
     	table.setColumnSelectionAllowed(false);
//     	System.out.println(scrollPane1.getSize(getPreferredSize()));
     	
//     	table.setShowGrid(true);
     	
//     	a.add(scrollPane1);
     	receipt_panel.add(scrollPane1);
     	add(receipt_panel);
     	
		// ================================================================================================
     	// ?��?���? ?��?�� ?��?�� ?��?�� ?��?��?��?��?�� �? ?��?��?��?�� ?��?���? 번호�? �??��?���? ?��?�� ?��?�� 
		// ================================================================================================
     	
     	ListSelectionModel selection = table.getSelectionModel();
     	
     	selection.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				if (e.getValueIsAdjusting()) {
					
					try {
//						System.out.println("w_size : " + w_size + "\tcash_w_size : " + cash_w_size + "\tcredit_w_size : " + credit_w_size);
//						System.out.println("model.getColumnCount() : " + model.getValueAt(table.getSelectedRow(), 2));
						
						no = table.getSelectedRow();
						select_receipt_no_string = "" + table.getValueAt(table.getSelectedRow(), 2);
						
						state_chk = "" + table.getValueAt(table.getSelectedRow(), 1);
//						System.out.println("ddf : " + state_chk);
						
						select_receipt_no = Integer.parseInt(select_receipt_no_string);
						
					} catch (Exception a) {
						a.printStackTrace();
					}
					
				}
			}
		});
     	
     	// ================================================================================================
        // '?��?��반품' 버튼?�� ?��???��?��?�� ?��?��
		// ================================================================================================
     	
     	buttons.get(0).addActionListener(new ActionListener() {
     		
     		@Override
     		public void actionPerformed(ActionEvent e) {
     			
     			String a = "" + table.getValueAt(table.getSelectedRow(), 3);
     			
     			// JOptionPane.showConfirmDialog?�� 결과�? ?��?���? 반환?��?��.
     			// X ?���? ?��?�� ?��?? 경우 = -1
     			// ?�� = 0
     			// ?��?��?�� = 1
     			int yes_or_no = JOptionPane.showConfirmDialog(null, a + "?�� 결제?��?��?��?��?��. 반품 ?��?��겠습?���??", "반품", JOptionPane.YES_NO_OPTION);
     			
     			if (state_chk.equals("complete")) {
     				if (yes_or_no == JOptionPane.CLOSED_OPTION) {
     				// ?�� ?��?��?�� ?��?��?��?�� �? ?��??경우
     					System.out.println(yes_or_no);
     					System.out.println("그냥 ?��?��?��?");
     				} else if (yes_or_no == JOptionPane.YES_OPTION) {
     				// ?��?��?���? ?���? ?��?��?��경우
//     					refund(select_receipt_no);
     					System.out.println(yes_or_no);
     					System.out.println("반품?��?��?��..");
     				} else {
     				// ?��?��?���? ?��?��?���? ?��?��?��경우
     					System.out.println(yes_or_no);
     					System.out.println("?�� ?��줘도 ?��?��~!~!");
     				}	
     			}
     			
     		}
     	});
     	
     	// ================================================================================================
        // '?��금영?���?' 버튼?�� ?��???��?��?�� ?��?��
		// ================================================================================================
     	
     	buttons.get(2).addActionListener(new ActionListener() {
     		
     		@Override
     		public void actionPerformed(ActionEvent e) {
     			
     			String a = "" + table.getValueAt(table.getSelectedRow(), 3);
     			
     			// JOptionPane.showConfirmDialog?�� 결과�? ?��?���? 반환?��?��.
     			// X ?���? ?��?�� ?��?? 경우 = -1
     			// ?�� = 0
     			// ?��?��?�� = 1
     			
     			String[] check;
     			
     			// ?��금결?��금액�? 카드결제금액, ?��금영?��증처�? ?��무�?? 받아?���? 
     			check = cash_receipt(select_receipt_no);
     			
//     			for (int i = 0; i < check.length; i++) {
//     				System.out.print(check[i]);
//     			}
     			// check[0] = ?��금결?��금액		
     			// check[1] = 카드결제금액		
     			// check[2] = ?��금영?��증처�? ?���?
     			
     			int yes_or_no;
     			
     			if (check[2].equals("Y")) {
     				
     				yes_or_no = JOptionPane.showConfirmDialog(null, "?���? ?��금영?���? 처리�? ?�� ?��?��?��?��?��. 취소?��?��겠습?���??", "?��금영?���? 취소", JOptionPane.YES_NO_OPTION);
     				
     				if (yes_or_no == JOptionPane.CLOSED_OPTION) {	// ?�� ?��?��?�� ?��?��?��?�� �? ?��??경우
     				
     					System.out.println(yes_or_no);
     					System.out.println("그냥 ?��?��?��?");
     					
     				} else if (yes_or_no == JOptionPane.YES_OPTION) {	// ?��?��?���? ?���? ?��?��?��경우
     				
     					cash_receipt_executive(select_receipt_no, "Y");
     					System.out.println(yes_or_no); 
//     					System.out.println("?��금영?��증취?��");
     					JOptionPane.showMessageDialog(null, "?��금영?��증을 취소처리 ?��???��?��?��.");
     					
     				} else {	// ?��?��?���? ?��?��?���? ?��?��?��경우
     				
     					System.out.println(yes_or_no);
     					System.out.println("?��금영?���? 취소 ?��?��");
     				}
     				
     			} else if (check[2].equals("N") && check[0].equals("0") && !check[1].equals("0")) {
     				// ?���? 결제금액 ?��?�� 카드 결제금액�? ?��?�� 경우 
     				JOptionPane.showMessageDialog(null, "카드 결제�? " + check[1] + "?�� 결제 ?��?��?��?��?��.");
     				
     			} else if (check[2].equals("N") && !check[1].equals("0")) {
     				
     				// 카드 결제금액?�� ?��무�? ?���??��?�� ?���? 결제 금액?�� ?��?���? ?��금영?���? 처리�? ?���? 물어�?
     				
     				yes_or_no = JOptionPane.showConfirmDialog(null, "?��금으�? " + check[1] + "?�� 결제?��?��?��?��?��. ?��금영?���? 처리�? ?��?��겠습?���??", "?��금영?���? 처리", JOptionPane.YES_NO_OPTION);
     				
     				if (yes_or_no == JOptionPane.CLOSED_OPTION) {
     				// ?�� ?��?��?�� ?��?��?��?�� �? ?��??경우
     					System.out.println(yes_or_no);
     					System.out.println("그냥 ?��?��?��?");
     				} else if (yes_or_no == JOptionPane.YES_OPTION) {
     				// ?��?��?���? ?���? ?��?��?��경우
     					cash_receipt_executive(select_receipt_no, "N");
     					System.out.println(yes_or_no);
     					System.out.println("?��금영?��증처�?");
     					JOptionPane.showMessageDialog(null, "?��금영?��증을 처리 ?��???��?��?��.");
     				} else {
     				// ?��?��?���? ?��?��?���? ?��?��?��경우
     					System.out.println(yes_or_no);
     					System.out.println("?��금영?���? 처리 ?��?��");
     				}	
         			
     				
     			}
     			
     			
     		}
     	});
     	
     	// ================================================================================================
        // '결제�?�?' 버튼?�� ?��???��?��?�� ?��?��
		// ================================================================================================     	
           
           buttons.get(3).addActionListener(new ActionListener() {
        	    
        	   
        	   
        		@Override
        		public void actionPerformed(ActionEvent e) {
        			
        			payment_change a = new payment_change(select_receipt_no);

        		}
        		
        	});
     	
		// ================================================================================================
        // '?���?' 버튼?�� ?��???��?��?�� ?��?��
		// ================================================================================================     	
           
           buttons.get(4).addActionListener(new ActionListener() {
        	   
        		@Override
        		public void actionPerformed(ActionEvent e) {
        			
//        			total();

        			DefaultTableModel model = new DefaultTableModel(data_default, columnNames);
        			table.setModel(model);
//        			JTable table = new JTable(model);

        			model.fireTableDataChanged();
        		}
        		
        	});
		// ================================================================================================
        // '?���?' 버튼?�� ?��???��?��?�� ?��?��
		// ================================================================================================
           
           buttons.get(5).addActionListener(new ActionListener() {
        	   
        		@Override
        		public void actionPerformed(ActionEvent e) {

//        			cash_list();

        			DefaultTableModel model = new DefaultTableModel(data_cash, columnNames);
        			
        			table.setModel(model);
//        			JTable table = new JTable(model);
        			
        			model.fireTableDataChanged();
        			
        		}
        		
        	});
       // ================================================================================================
       // '?��?��카드' 버튼?�� ?��???��?��?�� ?��?��
       // ================================================================================================
              
              buttons.get(6).addActionListener(new ActionListener() {
           	   
           		@Override
           		public void actionPerformed(ActionEvent e) {
           			
//           	        credit_list();
           	        
           			DefaultTableModel model = new DefaultTableModel(data_credit, columnNames);
           			table.setModel(model);
//           		JTable table = new JTable(model);
           			
           			model.fireTableDataChanged();
           		}
           		
           	});  

           
     // ================================================================================================
     // ================================================================================================

	}
	
	public static void main(String[] args) {
		 Receipt_duck_2 frame = new Receipt_duck_2();	
		 frame.setDefaultOptions();
	}
}

