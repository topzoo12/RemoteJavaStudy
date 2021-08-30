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
	static String state_chk;	// ?˜„?¬?˜ ê²°ì œ?ƒ?ƒœ
	
	static String[] cash_receipt_result;
	
	
	public void total() {
		try {
            Connection conn = DriverManager.getConnection(
            		"jdbc:oracle:thin:@database-1.cxc98ia1oha4.us-east-2.rds.amazonaws.com:1521/ORCL",
            		"cafe",
            		"!!22Qorthdud");
            
        // ================================================================================================
        // ================================================================================================
            	
            	// ê¸°ë³¸ ?””?´?Š¸ ë¦¬ìŠ¤?Š¸ 
            	PreparedStatement pstmt_Receipt_list = conn.prepareStatement(Receipt_list);
            	PreparedStatement pstmt_Receipt_list_cash = conn.prepareStatement(Receipt_list_cash);
            	PreparedStatement pstmt_Receipt_list_credit = conn.prepareStatement(Receipt_list_credit);
            	
            	ResultSet rs_list = pstmt_Receipt_list.executeQuery();
            	ResultSet rs_list_cash = pstmt_Receipt_list_cash.executeQuery();
            	ResultSet rs_list_credit = pstmt_Receipt_list_credit.executeQuery();
            	
            	// ì»¬ëŸ¼ ëª…ì„ ë¶ˆëŸ¬?˜¤ê¸? ?œ„?•œ ?°?´?„° ì²˜ë¦¬
            	ResultSetMetaData md = rs_list.getMetaData();
            	
            	// ?´?›„ ?…Œ?´ë¸? ?‚¬?´ì¦ˆë?? êµ¬ì„±?•˜ê¸? ?œ„?•œ ê°?? ¸?˜¨ ì»¬ëŸ¼?˜ ?ˆ«? ???¥
            	int column_size = md.getColumnCount();
            	
            	// êµ¬í•œ ì»¬ëŸ¼ ?ˆ«?+1?˜ ?´?œ ?Š” ì»¬ëŸ¼ ?´?™¸?— ì²«ë²ˆì§? col ?—?Š” ?°?´?„°?˜ ?ˆ˜ë¥? ?‚˜???‚´ê¸°ìœ„?•œ No ?„ ì¶”ê??•˜ê¸? ?œ„?•¨
            	columnNames = new String[column_size+1];
            	
            	// ì»¬ëŸ¼ëª…ì„ ë°°ì—´?— ë¬¸ì?—´ë¡? ???¥
            	for(int i = 0; i < columnNames.length; i++) {
            		if (i == 0) {
            			columnNames[i] = "No";
            		} else {
            			columnNames[i] = md.getColumnName(i);
            		}
                }
            	
            	// ê¸°ì¡´?— ?‹´ê²¨ìˆ?˜ ?°?´?„°ë¥? ë¹„ì?
            	list_data_default.clear();
            	
            	
            	// ê°?? ¸?˜¨ ?°?´?„°ë¥? list_data_default(ArrayList) ?— ???¥
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
            	
            	// ê¸°ì¡´?— ?‹´ê²¨ìˆ?˜ ?°?´?„°ë¥? ë¹„ì?
            	list_data_cash.clear();
            	
            	// ê°?? ¸?˜¨ ?°?´?„°ë¥? list_data_cash(ArrayList) ?— ???¥
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
            	
            	// ê¸°ì¡´?— ?‹´ê²¨ìˆ?˜ ?°?´?„°ë¥? ë¹„ì?
            	list_data_credit.clear();
            	
            	// ê°?? ¸?˜¨ ?°?´?„°ë¥? list_data_credit(ArrayList) ?— ???¥
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
            	
            	// ?˜¤?”ˆ ?–ˆ?˜ ê°? ë¦¬ì†Œ?Š¤?“¤ ì¢…ë£Œ 
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
            	// JTable?— ?‹´ê¸? ?°?´?„°?˜ ?‚¬?´ì¦ˆë?? ?„¤? •?•˜ê¸? ?œ„?•œ ê°? ?°?´?„°?˜ ?‚¬?´ì¦? êµ¬í•˜ê¸?
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
            	// êµ¬í•œ ê°? ?°?´?„°?˜ ?‚¬?´ì¦ˆë?? ê°?ì§?ê³? JTable?˜ ?¬ê¸? ?„¤? •
             	data_default = new String[w_size][h_size];
             	data_cash = new String[cash_w_size][cash_h_size];
             	data_credit = new String[credit_w_size][credit_h_size];
             	
             	// ? „ì²?(total) ?°?´?„°ë¥? JTable?— ? ?š©?•  ë°°ì—´?— ???¥
             	for (int i = 0; i < w_size; i++) {
            		for (int x = 0; x < h_size; x++) {
            			if (x == 0) {
            				data_default[i][x] = "" + (i+1);
            			}else {
            				data_default[i][x] = list_data_default.get(i).get(x);
            			}
            		}
            	}
             	
             	// ?˜„ê¸?(Cash) ?°?´?„°ë¥? JTable?— ? ?š©?•  ë°°ì—´?— ???¥
             	for (int i = 0; i < cash_w_size; i++) {
            		for (int x = 0; x < cash_h_size; x++) {
            			if (x == 0) {
            				data_cash[i][x] = "" + (i+1);
            			}else {
            				data_cash[i][x] = list_data_cash.get(i).get(x);
            			}
            		}
            	}
             	
             	// ì¹´ë“œ(Credit) ?°?´?„°ë¥? JTable?— ? ?š©?•  ë°°ì—´?— ???¥
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
            System.out.println("getConnection ?•˜?‹¤ê°? ë¬¸ì œ ?ƒê¹?");
        }
		
	}
	
	// ë°˜í’ˆ ì²˜ë¦¬
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
            System.out.println("getConnection ?•˜?‹¤ê°? ë¬¸ì œ ?ƒê¹?");
        }
	}
	
	// ?˜„ê¸ˆì˜?ˆ˜ì¦? ?˜„?¬?˜ ?œ ë¬? ?™•?¸
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
	            System.out.println("getConnection ?•˜?‹¤ê°? ë¬¸ì œ ?ƒê¹?");
	        }
			
			return cash_receipt_result;
		}
		
		// ?˜„ê¸ˆì˜?ˆ˜ì¦? ì²˜ë¦¬ ?‹¤?–‰
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
	            System.out.println("getConnection ?•˜?‹¤ê°? ë¬¸ì œ ?ƒê¹?");
	        }
			
			
		}
	
	
	
	
	public Receipt_duck_2() {
		super();
		super.setTitle("?˜?ˆ˜ì¦? ê´?ë¦?");
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

            // 6. ?‹¤ ?‚¬?š©?•œ ?—°ê²°ì„ ?‚˜ì¤‘ì— ?—° ?ˆœ?„œ??ë¡? ?‹«?•„ì¤??‹¤
//            rs.close();
//            pstmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("getConnection ?•˜?‹¤ê°? ë¬¸ì œ ?ƒê¹?");
        }
		
		setLayout(null);
		
		// ?‹œê°„ì„ ë¬¸ì?—´ë¡? ë³?ê²½í•˜ê¸?
		DateTimeFormatter my_date_format = 
				DateTimeFormatter.ofPattern("y?…„ M?›” d?¼");
		
		String message = my_date_format.format(LocalDate.now());

		JButton date = new JButton(message);
		String product = "";
		
		String string = // ?˜?ˆ˜ì¦? ? „ì²? ?‚´?š© 
				"<html><center>-------------------------------------------------------------------"
				+ "<br>*? •ë¶?ë°©ì¹¨?— ?˜?•´ êµí™˜/?™˜ë¶ˆì? ë°˜ë“œ?‹œ ?˜?ˆ˜ì¦ì„"
				+ "<br>ì§?ì°¸í•˜?…”?•¼ ?•˜ë©?, ì¹´ë“œê²°ì œ?Š” 30?¼(09?›”08?¼)"
				+ "<br>?´?‚´ ì¹´ë“œ?? ?˜?ˆ˜ì¦? ì§?ì°? ?‹œ ê°??Š¥?•©?‹ˆ?‹¤."
				+ "<br>-------------------------------------------------------------------"
				+ "</center>"
				
				+ "<table style='width:100%;'>"
				+ "<tr>"
				+ "<td>?’ˆëª?</td>"
				+ "<td style='text-align:center;'>?‹¨ê°?</td>"
				+ "<td style='text-align:center;'>?ˆ˜?Ÿ‰</td>"
				+ "<td style='text-align:right;'>ê¸ˆì•¡</td>"
				+ "</tr>"
				+ "</table>"
				+ "-------------------------------------------------------------------"
				+ "<table style='width:100%;'>"
				+ "<tr>"
				+ "<td>ê³¼ì„¸ë§¤ì¶œ</td>"
				+ "<td style='text-align:right;'>3000?›</td>"
				+ "</tr>"
				+ "</table>"
				
				+ "<table style='width:100%;'>"
				+ "<tr>"
				+ "<td>ë¶?ê°??„¸</td>"
				+ "<td style='text-align:right;'>3000?›</td>"
				+ "</tr>"
				+ "</table>"
				
				+ "<table style='width:100%;'>"
				+ "<tr>"
				+ "<td>?•©&emspê³?</td>"
				+ "<td style='text-align:right;'>3000?›</td>"
				+ "</tr>"
				+ "</table>"
				
				+ "<table style='width:100%;'>"
				+ "<tr>"
				+ "<td>?˜„&emspê¸?</td>"
				+ "<td style='text-align:right;'>3000?›</td>"
				+ "</tr>"
				+ "</table>"
				
				+ "<table style='width:100%;'>"
				+ "<tr>"
				+ "<td>?˜„&emspê¸?</td>"
				+ "<td style='text-align:right;'>3000?›</td>"
				+ "</tr>"
				+ "</table>"
				
				+ "<table style='width:100%;'>"
				+ "<tr>"
				+ "<td>?˜„&emspê¸?</td>"
				+ "<td style='text-align:right;'>3000?›</td>"
				+ "</tr>"
				+ "</table>"
				
				+ "</html>";
		
		
		
		
		
		// &nbsp ?„?–´?“°ê¸? &emsp ?¬ê²? ?„?–´?“°ê¸?
		// <html> +  + <br> + + <p>  + + </html> ì¤? ë°”ê¾¸?Š” ë²?
		
		JPanel frame = new JPanel();
		
		JLabel receipt = new JLabel(string);
		
		
		
		ArrayList<JButton> buttons = new ArrayList<>();
		
		
		
		buttons.add(new JButton("? „?‘œë°˜í’ˆ")); // 0 
		buttons.add(new JButton("?¬?¸?‡„"));
		buttons.add(new JButton("?˜„ê¸ˆì˜?ˆ˜ì¦?"));
		
		
		buttons.add(new JButton("ê²°ì œë³?ê²?"));
		buttons.add(new JButton("? „ì²?"));
		buttons.add(new JButton("?˜„ê¸?"));
		buttons.add(new JButton("?‹ ?š©ì¹´ë“œ")); // 6
		
		// ë²„íŠ¼ ?œ„ì¹? ì¡°ì •
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
		receipt.setOpaque(true); // ë°±ê·¸?¼?š´?“œ ?ƒ‰?ƒ ?—ˆ?š©
		receipt.setHorizontalAlignment(JLabel.CENTER); // ?ˆ˜?‰ ê°??š´?° ?‘œ?‹œ ?„¤? •
		receipt.setVerticalAlignment(JLabel.NORTH);; // ?„¸ë¡? ê°??š´?° ?‘œ?‹œ ?„¤? •
		receipt.setBackground(new Color(0xffffff));// ?¼ë²? ë°°ê²½?ƒ‰
//		receipt.setBounds(730, 140, 540, 2000);
//		frame.setBackground(new Color(0xffffff)); // ?Œ¨?„ ë°°ê²½?ƒ‰
		frame.setBounds(730, 140, 540, 500);
		receipt.setAutoscrolls(true);
		JScrollPane scrollPane = new JScrollPane( // ?˜?ˆ˜ì¦ì— ?ˆ˜ì§? ?Š¤?¬ë¡¤ë°” ì¶”ê?
				receipt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(new Dimension(540, 500)); // ?Š¤?¬ë¡¤ë°” ?¬ê¸°ì¡°? •
		
		frame.add(scrollPane);
		
		// ì¢Œì¸¡ ?œ„ ë²„íŠ¼ ì¶”ê?
		add(buttons.get(0));
		add(buttons.get(1));
		add(buttons.get(2));
		add(buttons.get(3));
		
		add(date); // ?‚ ì§? ì¶œë ¥
		
		// ?š°ì¸? ?œ„ ë²„íŠ¼
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
     	// ?…Œ?´ë¸? ?‚´?— ?–´?–¤ ?–‰?„ ?„ ?ƒ?–ˆ?„?•Œ ê·? ?°?´?„°?˜ ?˜?ˆ˜ì¦? ë²ˆí˜¸ë¥? ê°?? ¸?˜¤ê¸? ?œ„?•œ ?•¡?…˜ 
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
        // '? „?‘œë°˜í’ˆ' ë²„íŠ¼?„ ?ˆŒ???„?•Œ?˜ ?•¡?…˜
		// ================================================================================================
     	
     	buttons.get(0).addActionListener(new ActionListener() {
     		
     		@Override
     		public void actionPerformed(ActionEvent e) {
     			
     			String a = "" + table.getValueAt(table.getSelectedRow(), 3);
     			
     			// JOptionPane.showConfirmDialog?˜ ê²°ê³¼ê°? ?ˆ«?ë¡? ë°˜í™˜?œ?‹¤.
     			// X ?‘œë¥? ?ˆŒ?Ÿ¬ ?‹«?? ê²½ìš° = -1
     			// ?˜ˆ = 0
     			// ?•„?‹ˆ?˜¤ = 1
     			int yes_or_no = JOptionPane.showConfirmDialog(null, a + "?› ê²°ì œ?•˜?…¨?Šµ?‹ˆ?‹¤. ë°˜í’ˆ ?•˜?‹œê² ìŠµ?‹ˆê¹??", "ë°˜í’ˆ", JOptionPane.YES_NO_OPTION);
     			
     			if (state_chk.equals("complete")) {
     				if (yes_or_no == JOptionPane.CLOSED_OPTION) {
     				// ?˜ˆ ?•„?‹ˆ?˜¤ ?„ ?ƒ?—†?´ ì°? ?‹«??ê²½ìš°
     					System.out.println(yes_or_no);
     					System.out.println("ê·¸ëƒ¥ ?‹«?•˜?„¤?");
     				} else if (yes_or_no == JOptionPane.YES_OPTION) {
     				// ?‚¬?š©?ê°? ?˜ˆë¥? ?„ ?ƒ?•œê²½ìš°
//     					refund(select_receipt_no);
     					System.out.println(yes_or_no);
     					System.out.println("ë°˜í’ˆ?´?¼?‹ˆ..");
     				} else {
     				// ?‚¬?š©?ê°? ?•„?‹ˆ?˜¤ë¥? ?„ ?ƒ?•œê²½ìš°
     					System.out.println(yes_or_no);
     					System.out.println("?ˆ ?•ˆì¤˜ë„ ?œ?‹¤~!~!");
     				}	
     			}
     			
     		}
     	});
     	
     	// ================================================================================================
        // '?˜„ê¸ˆì˜?ˆ˜ì¦?' ë²„íŠ¼?„ ?ˆŒ???„?•Œ?˜ ?•¡?…˜
		// ================================================================================================
     	
     	buttons.get(2).addActionListener(new ActionListener() {
     		
     		@Override
     		public void actionPerformed(ActionEvent e) {
     			
     			String a = "" + table.getValueAt(table.getSelectedRow(), 3);
     			
     			// JOptionPane.showConfirmDialog?˜ ê²°ê³¼ê°? ?ˆ«?ë¡? ë°˜í™˜?œ?‹¤.
     			// X ?‘œë¥? ?ˆŒ?Ÿ¬ ?‹«?? ê²½ìš° = -1
     			// ?˜ˆ = 0
     			// ?•„?‹ˆ?˜¤ = 1
     			
     			String[] check;
     			
     			// ?˜„ê¸ˆê²°? œê¸ˆì•¡ê³? ì¹´ë“œê²°ì œê¸ˆì•¡, ?˜„ê¸ˆì˜?ˆ˜ì¦ì²˜ë¦? ?œ ë¬´ë?? ë°›ì•„?˜¤ê¸? 
     			check = cash_receipt(select_receipt_no);
     			
//     			for (int i = 0; i < check.length; i++) {
//     				System.out.print(check[i]);
//     			}
     			// check[0] = ?˜„ê¸ˆê²°? œê¸ˆì•¡		
     			// check[1] = ì¹´ë“œê²°ì œê¸ˆì•¡		
     			// check[2] = ?˜„ê¸ˆì˜?ˆ˜ì¦ì²˜ë¦? ?œ ë¬?
     			
     			int yes_or_no;
     			
     			if (check[2].equals("Y")) {
     				
     				yes_or_no = JOptionPane.showConfirmDialog(null, "?´ë¯? ?˜„ê¸ˆì˜?ˆ˜ì¦? ì²˜ë¦¬ë¥? ?•œ ?ƒ?ƒœ?…?‹ˆ?‹¤. ì·¨ì†Œ?•˜?‹œê² ìŠµ?‹ˆê¹??", "?˜„ê¸ˆì˜?ˆ˜ì¦? ì·¨ì†Œ", JOptionPane.YES_NO_OPTION);
     				
     				if (yes_or_no == JOptionPane.CLOSED_OPTION) {	// ?˜ˆ ?•„?‹ˆ?˜¤ ?„ ?ƒ?—†?´ ì°? ?‹«??ê²½ìš°
     				
     					System.out.println(yes_or_no);
     					System.out.println("ê·¸ëƒ¥ ?‹«?•˜?„¤?");
     					
     				} else if (yes_or_no == JOptionPane.YES_OPTION) {	// ?‚¬?š©?ê°? ?˜ˆë¥? ?„ ?ƒ?•œê²½ìš°
     				
     					cash_receipt_executive(select_receipt_no, "Y");
     					System.out.println(yes_or_no); 
//     					System.out.println("?˜„ê¸ˆì˜?ˆ˜ì¦ì·¨?†Œ");
     					JOptionPane.showMessageDialog(null, "?˜„ê¸ˆì˜?ˆ˜ì¦ì„ ì·¨ì†Œì²˜ë¦¬ ?•˜???Šµ?‹ˆ?‹¤.");
     					
     				} else {	// ?‚¬?š©?ê°? ?•„?‹ˆ?˜¤ë¥? ?„ ?ƒ?•œê²½ìš°
     				
     					System.out.println(yes_or_no);
     					System.out.println("?˜„ê¸ˆì˜?ˆ˜ì¦? ì·¨ì†Œ ?•ˆ?•¨");
     				}
     				
     			} else if (check[2].equals("N") && check[0].equals("0") && !check[1].equals("0")) {
     				// ?˜„ê¸? ê²°ì œê¸ˆì•¡ ?—†?´ ì¹´ë“œ ê²°ì œê¸ˆì•¡ë§? ?ˆ?Š” ê²½ìš° 
     				JOptionPane.showMessageDialog(null, "ì¹´ë“œ ê²°ì œë¡? " + check[1] + "?› ê²°ì œ ?•˜?…¨?Šµ?‹ˆ?‹¤.");
     				
     			} else if (check[2].equals("N") && !check[1].equals("0")) {
     				
     				// ì¹´ë“œ ê²°ì œê¸ˆì•¡?˜ ?œ ë¬´ì? ?ƒê´??—†?´ ?˜„ê¸? ê²°ì œ ê¸ˆì•¡?´ ?ˆ?‹¤ë©? ?˜„ê¸ˆì˜?ˆ˜ì¦? ì²˜ë¦¬ë¥? ?• ì§? ë¬¼ì–´ë´?
     				
     				yes_or_no = JOptionPane.showConfirmDialog(null, "?˜„ê¸ˆìœ¼ë¡? " + check[1] + "?› ê²°ì œ?•˜?…¨?Šµ?‹ˆ?‹¤. ?˜„ê¸ˆì˜?ˆ˜ì¦? ì²˜ë¦¬ë¥? ?•˜?‹œê² ìŠµ?‹ˆê¹??", "?˜„ê¸ˆì˜?ˆ˜ì¦? ì²˜ë¦¬", JOptionPane.YES_NO_OPTION);
     				
     				if (yes_or_no == JOptionPane.CLOSED_OPTION) {
     				// ?˜ˆ ?•„?‹ˆ?˜¤ ?„ ?ƒ?—†?´ ì°? ?‹«??ê²½ìš°
     					System.out.println(yes_or_no);
     					System.out.println("ê·¸ëƒ¥ ?‹«?•˜?„¤?");
     				} else if (yes_or_no == JOptionPane.YES_OPTION) {
     				// ?‚¬?š©?ê°? ?˜ˆë¥? ?„ ?ƒ?•œê²½ìš°
     					cash_receipt_executive(select_receipt_no, "N");
     					System.out.println(yes_or_no);
     					System.out.println("?˜„ê¸ˆì˜?ˆ˜ì¦ì²˜ë¦?");
     					JOptionPane.showMessageDialog(null, "?˜„ê¸ˆì˜?ˆ˜ì¦ì„ ì²˜ë¦¬ ?•˜???Šµ?‹ˆ?‹¤.");
     				} else {
     				// ?‚¬?š©?ê°? ?•„?‹ˆ?˜¤ë¥? ?„ ?ƒ?•œê²½ìš°
     					System.out.println(yes_or_no);
     					System.out.println("?˜„ê¸ˆì˜?ˆ˜ì¦? ì²˜ë¦¬ ?•ˆ?•¨");
     				}	
         			
     				
     			}
     			
     			
     		}
     	});
     	
     	// ================================================================================================
        // 'ê²°ì œë³?ê²?' ë²„íŠ¼?„ ?ˆŒ???„?•Œ?˜ ?•¡?…˜
		// ================================================================================================     	
           
           buttons.get(3).addActionListener(new ActionListener() {
        	    
        	   
        	   
        		@Override
        		public void actionPerformed(ActionEvent e) {
        			
        			payment_change a = new payment_change(select_receipt_no);

        		}
        		
        	});
     	
		// ================================================================================================
        // '? „ì²?' ë²„íŠ¼?„ ?ˆŒ???„?•Œ?˜ ?•¡?…˜
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
        // '?˜„ê¸?' ë²„íŠ¼?„ ?ˆŒ???„?•Œ?˜ ?•¡?…˜
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
       // '?‹ ?š©ì¹´ë“œ' ë²„íŠ¼?„ ?ˆŒ???„?•Œ?˜ ?•¡?…˜
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

