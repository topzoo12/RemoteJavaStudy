package project;
//package receipt;
//
//import java.awt.CardLayout;
//import java.awt.Color;
//import java.awt.Dimension;
//import java.awt.Font;
//import java.awt.event.ActionEvent;
//import java.awt.event.ActionListener;
//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.ResultSetMetaData;
//import java.sql.SQLException;
//import java.time.LocalDate;
//import java.time.format.DateTimeFormatter;
//import java.util.ArrayList;
//
//import javax.swing.BorderFactory;
//import javax.swing.ImageIcon;
//import javax.swing.JButton;
//import javax.swing.JDialog;
//import javax.swing.JLabel;
//import javax.swing.JPanel;
//import javax.swing.JScrollPane;
//import javax.swing.JTable;
//import javax.swing.ListSelectionModel;
//import javax.swing.event.ListSelectionEvent;
//import javax.swing.event.ListSelectionListener;
//import javax.swing.table.DefaultTableModel;
//
//import baseSettings.PosFrame;
//import gui.mypanel.ImagePanel;
//
//public class Receipt_duck_test extends PosFrame {
//	
//	static ArrayList<ArrayList<String>> list_data_default = new ArrayList<ArrayList<String>>();
//	static ArrayList<ArrayList<String>> list_data_cash = new ArrayList<ArrayList<String>>();
//	static ArrayList<ArrayList<String>> list_data_credit = new ArrayList<ArrayList<String>>();
//	
//	static String[] columnNames = null;
//	
//	static String Receipt_list = "select * from payment_view_1";
//	static String Receipt_list_cash = "select * from payment_view_1 where cash > 0";
//	static String Receipt_list_credit = "select * from payment_view_1 where credit > 0";
//	
//	static String[][] data_default = null;
//	static String[][] data_cash = null;
//	static String[][] data_credit = null;
//	
//	static int select_receipt_no = -1;
//	static String select_receipt_no_string = "";
//	
//	static int w_size, h_size;
//	static int cash_w_size, cash_h_size;
//	static int credit_w_size, credit_h_size;
//	
//	
//	public void total() {
//		try {
//            Connection conn = DriverManager.getConnection(
//            		"jdbc:oracle:thin:@database-1.cxc98ia1oha4.us-east-2.rds.amazonaws.com:1521/ORCL",
//            		"cafe",
//            		"!!22Qorthdud");
//            
//        // ================================================================================================
//        // ================================================================================================
//            	
//            	// ?????? ????????? ????????? 
//            	PreparedStatement pstmt_Receipt_list = conn.prepareStatement(Receipt_list);
//            	PreparedStatement pstmt_Receipt_list_cash = conn.prepareStatement(Receipt_list_cash);
//            	PreparedStatement pstmt_Receipt_list_credit = conn.prepareStatement(Receipt_list_credit);
//            	
//            	ResultSet rs_list = pstmt_Receipt_list.executeQuery();
//            	ResultSet rs_list_cash = pstmt_Receipt_list_cash.executeQuery();
//            	ResultSet rs_list_credit = pstmt_Receipt_list_credit.executeQuery();
//            	
//            	// ?????? ?????? ???????????? ?????? ????????? ??????
//            	ResultSetMetaData md = rs_list.getMetaData();
//            	
//            	// ?????? ????????? ???????????? ???????????? ?????? ????????? ????????? ?????? ??????
//            	int column_size = md.getColumnCount();
//            	
//            	// ?????? ?????? ??????+1??? ????????? ?????? ????????? ????????? col ?????? ???????????? ?????? ?????????????????? No ??? ???????????? ??????
//            	columnNames = new String[column_size+1];
//            	
//            	// ???????????? ????????? ???????????? ??????
//            	for(int i = 0; i < columnNames.length; i++) {
//            		if (i == 0) {
//            			columnNames[i] = "No";
//            		} else {
//            			columnNames[i] = md.getColumnName(i);
//            		}
//                }
//            	
//            	// ????????? ???????????? ???????????? ??????
//            	list_data_default.clear();
//            	
//            	
//            	// ????????? ???????????? list_data_default(ArrayList) ??? ??????
//            	while (rs_list.next()) {
//            		ArrayList<String> data_total = new ArrayList<>();
//            		data_total.clear();
//            		for (int i = 0; i < columnNames.length; i++) {
//            			if (i == 0) {
//            				data_total.add("" + i);
//            			} else {
//            				data_total.add(rs_list.getString(columnNames[i]));
//            			}
//            		}
//            		list_data_default.add(data_total);
//            	}
//            	
//            	// ????????? ???????????? ???????????? ??????
//            	list_data_cash.clear();
//            	
//            	// ????????? ???????????? list_data_cash(ArrayList) ??? ??????
//            	while (rs_list_cash.next()) {
//            		
//            		ArrayList<String> data_cash = new ArrayList<>();
//            		data_cash.clear();
//            		for (int i = 0; i < columnNames.length; i++) {
//            			if (i == 0) {
//            				data_cash.add("" + i);
//            			} else {
//            				data_cash.add(rs_list_cash.getString(columnNames[i]));
//            			}
//            		}
//            		list_data_cash.add(data_cash);
//            	}
//            	
//            	// ????????? ???????????? ???????????? ??????
//            	list_data_credit.clear();
//            	
//            	// ????????? ???????????? list_data_credit(ArrayList) ??? ??????
//            	while (rs_list_credit.next()) {
//            		ArrayList<String> data = new ArrayList<>();
//            		data.clear();
//            		for (int i = 0; i < columnNames.length; i++) {
//            			if (i == 0) {
//            				data.add("" + i);
//            			} else {
//            				data.add(rs_list_credit.getString(columnNames[i]));
//            			}
//            		}
//            		list_data_credit.add(data);
//            	}
//            	
//            	// ?????? ?????? ??? ???????????? ?????? 
//            	rs_list.close();
//            	rs_list_cash.close();
//            	rs_list_credit.close();
//            	
//            	pstmt_Receipt_list.close();
//            	pstmt_Receipt_list_cash.close();
//            	pstmt_Receipt_list_credit.close();
//            	
//            	conn.close();
//            
//            // ================================================================================================
//        	// ================================================================================================
//            	System.out.println("w_size : " + w_size);
//            	System.out.println("cash_w_size : " + cash_w_size);
//            	System.out.println("credit_w_size : " + credit_w_size);
//            	// JTable??? ?????? ???????????? ???????????? ???????????? ?????? ??? ???????????? ????????? ?????????
//            	w_size = list_data_default.size();
//            	h_size = list_data_default.get(0).size();
//            	cash_w_size = list_data_cash.size();
//            	cash_h_size = list_data_cash.get(0).size();
//            	credit_w_size = list_data_credit.size();
//            	credit_h_size = list_data_credit.get(0).size();
//            	
//            	System.out.println("w_size : " + w_size);
//            	System.out.println("cash_w_size : " + cash_w_size);
//            	System.out.println("credit_w_size : " + credit_w_size);
//            	
//            	// ?????? ??? ???????????? ???????????? ????????? JTable??? ?????? ??????
//             	data_default = new String[w_size][h_size];
//             	data_cash = new String[cash_w_size][cash_h_size];
//             	data_credit = new String[credit_w_size][credit_h_size];
//             	
//             	// ??????(total) ???????????? JTable??? ????????? ????????? ??????
//             	for (int i = 0; i < w_size; i++) {
//            		for (int x = 0; x < h_size; x++) {
//            			if (x == 0) {
//            				data_default[i][x] = "" + (i+1);
//            			}else {
//            				data_default[i][x] = list_data_default.get(i).get(x);
//            			}
//            		}
//            	}
//             	
//             	// ??????(Cash) ???????????? JTable??? ????????? ????????? ??????
//             	for (int i = 0; i < cash_w_size; i++) {
//            		for (int x = 0; x < cash_h_size; x++) {
//            			if (x == 0) {
//            				data_cash[i][x] = "" + (i+1);
//            			}else {
//            				data_cash[i][x] = list_data_cash.get(i).get(x);
//            			}
//            		}
//            	}
//             	
//             	// ??????(Credit) ???????????? JTable??? ????????? ????????? ??????
//             	for (int i = 0; i < credit_w_size; i++) {
//            		for (int x = 0; x < credit_h_size; x++) {
//            			if (x == 0) {
//            				data_credit[i][x] = "" + (i+1);
//            			}else {
//        	    			data_credit[i][x] = list_data_credit.get(i).get(x);
//            			}
//            		}
//            	}
//             	
//            
//		} catch (SQLException e) {
//            System.out.println("getConnection ????????? ?????? ??????");
//        }
//		
//	}
//	
//	public Receipt_duck_test() {
//		super();
//		super.setTitle("????????? ??????");
//		try {
//            Connection conn = DriverManager.getConnection(
//            		"jdbc:oracle:thin:@database-1.cxc98ia1oha4.us-east-2.rds.amazonaws.com:1521/ORCL",
//            		"cafe",
//            		"!!22Qorthdud");
//
//            String sql = "select * from PAYMENT_VIEW WHERE RECEIPT_NO = 24" + "";
////            
////            
////            PreparedStatement pstmt = conn.prepareStatement(sql);
////
////            ResultSet rs = pstmt.executeQuery();
//
////            while (rs.next()) {
////                System.out.print(rs.getString("MENU"));
////                System.out.print(rs.getInt("PRICE"));
////                System.out.println();
////            }
//
//            // 6. ??? ????????? ????????? ????????? ??? ???????????? ????????????
////            rs.close();
////            pstmt.close();
//            conn.close();
//
//        } catch (SQLException e) {
//            System.out.println("getConnection ????????? ?????? ??????");
//        }
//		
//		setLayout(null);
//		
//		// ????????? ???????????? ????????????
//		DateTimeFormatter my_date_format = 
//				DateTimeFormatter.ofPattern("y??? M??? d???");
//		
//		String message = my_date_format.format(LocalDate.now());
//
//		JButton date = new JButton(message);
//		String product = "";
//		
//		String string = // ????????? ?????? ?????? 
//				"<html><center>-------------------------------------------------------------------"
//				+ "</html>";
//		
//		// &nbsp ???????????? &emsp ?????? ????????????
//		// <html> +  + <br> + + <p>  + + </html> ??? ????????? ???
//		
//		JPanel frame = new JPanel();
//		
//		JLabel receipt = new JLabel(string);
//		
//		ArrayList<JButton> buttons = new ArrayList<>();
//		
//		buttons.add(new JButton("????????????")); // 0 
//		buttons.add(new JButton("?????????"));
//		buttons.add(new JButton("???????????????"));
//		
//		buttons.add(new JButton("????????????"));
//		buttons.add(new JButton("??????"));
//		buttons.add(new JButton("??????"));
//		buttons.add(new JButton("????????????")); // 6
//		
//		// ?????? ?????? ??????
//		buttons.get(0).setBounds(20, 30, 150, 80);
//		buttons.get(1).setBounds(190, 30, 150, 80);
//		buttons.get(2).setBounds(360, 30, 150, 80);
//		buttons.get(3).setBounds(530, 30, 150, 80);
//		
//		buttons.get(4).setBounds(870, 30, 120, 80);
//		buttons.get(5).setBounds(1010, 30, 120, 80);
//		buttons.get(6).setBounds(1150, 30, 120, 80);
//		
//		for (int i = 0; i < buttons.size(); ++i) {
//			buttons.get(i).setFont(new Font("MV Bold", Font.BOLD, 20));
//		}
//		
//		date.setBounds(730, 30, 120, 80);
//		date.setBackground(new Color(0xffffff));
//		
//		receipt.setFont(new Font("MV Bold", Font.BOLD, 20));
//		receipt.setOpaque(true); // ??????????????? ?????? ??????
//		receipt.setHorizontalAlignment(JLabel.CENTER); // ?????? ????????? ?????? ??????
//		receipt.setVerticalAlignment(JLabel.NORTH);; // ?????? ????????? ?????? ??????
//		receipt.setBackground(new Color(0xffffff));// ?????? ?????????
////		receipt.setBounds(730, 140, 540, 2000);
////		frame.setBackground(new Color(0xffffff)); // ?????? ?????????
//		frame.setBounds(730, 140, 540, 500);
//		receipt.setAutoscrolls(true);
//		JScrollPane scrollPane = new JScrollPane( // ???????????? ?????? ???????????? ??????
//				receipt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
//		scrollPane.setPreferredSize(new Dimension(540, 500)); // ???????????? ????????????
//		
//		frame.add(scrollPane);
//		
//		// ?????? ??? ?????? ??????
//		add(buttons.get(0));
//		add(buttons.get(1));
//		add(buttons.get(2));
//		add(buttons.get(3));
//		
//		add(date); // ?????? ??????
//		
//		// ?????? ??? ??????
//		add(buttons.get(4));
//		add(buttons.get(5));
//		add(buttons.get(6));
//		
//        add(frame);
//        
//
//     // ================================================================================================
//     // ================================================================================================
//        
//        total();
////        cash_list();
////        credit_list();
//
//        JPanel receipt_panel_list = new JPanel(new CardLayout(10, 10));        
//        
//        receipt_panel_list.setBackground(Color.black);
//        receipt_panel_list.setLocation(20, 140);
//        receipt_panel_list.setSize(660, 500);
//
////     	JPanel a = new JPanel();
////     	a.setSize(20,20);
//     	
////     	DefaultTableModel model = new DefaultTableModel(data_default, columnNames);
//     	JTable table_default = new JTable(data_default, columnNames);
//     	JTable table_cash = new JTable(data_cash, columnNames);
//     	JTable table_credit = new JTable(data_credit, columnNames);
//     	
//     	JPanel panel1 = new JPanel();
//		JPanel panel2 = new JPanel();
//		JPanel panel3 = new JPanel();
//     	
////		JTable table = new JTable(model);
//     	
//     	JScrollPane scrollPane_default = new JScrollPane(table_default);
//     	JScrollPane scrollPane_cash = new JScrollPane(table_cash);
//     	JScrollPane scrollPane_credit = new JScrollPane(table_credit);
//     	
//     	scrollPane_default.setBorder(BorderFactory.createEmptyBorder());
////     	scrollPane1.setBounds(20, 120, 6600, 4700);
//     	
////     	scrollPane1.setBackground(Color.pink);
//     	
////     	table.setPreferredSize(new Dimension(660, 1500));
////     	table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
//     	
//     	table_default.getTableHeader().setPreferredSize(new Dimension(scrollPane_default.getWidth(), 50));
//     	
//     	scrollPane_default.setPreferredSize(new Dimension(658, 495));
////     	scrollPane1.setPreferredSize(660, 1500);
////     	scrollPane1.setSize(6600, 1500);
//     	
//     	table_default.setRowSelectionAllowed(true);
//     	table_default.setColumnSelectionAllowed(false);
////     	System.out.println(scrollPane1.getSize(getPreferredSize()));
//     	
////     	table.setShowGrid(true);
//     	
////     	a.add(scrollPane1);
//     	receipt_panel.add(scrollPane_default);
//     	add(receipt_panel);
//     	
//		// ================================================================================================
//     	// ????????? ?????? ?????? ?????? ??????????????? ??? ???????????? ????????? ????????? ???????????? ?????? ?????? 
//		// ================================================================================================
//     	
//     	ListSelectionModel selection = table_default.getSelectionModel();
//     	
//     	selection.addListSelectionListener(new ListSelectionListener() {
//			
//			@Override
//			public void valueChanged(ListSelectionEvent e) {
//				
//				if (e.getValueIsAdjusting()) {
//					
////					int tableRows = table.getRowCount();
////					int selecrow = table.getSelectedRow();
//					
////					System.out.println("w_size : " + w_size + "\tcash_w_size : " + cash_w_size + "\tcredit_w_size : " + credit_w_size);
////					System.out.println("model.getColumnCount() : " + model.getValueAt(table.getSelectedRow(), 2));
////					
////					if (table.getRowCount() == w_size) {
////						
////						System.out.println(data_default[table.getSelectedRow()][2]);
////					} 
////					
////					if (table.getRowCount() == cash_w_size) {
////						
////						System.out.println(data_cash[table.getSelectedRow()][2]);
////					} 
////					if (table.getRowCount() == credit_w_size) {
////						
////						System.out.println(data_credit[table.getSelectedRow()][2]);
////					}
//					
//					
////					select_receipt_no = (Integer)(table.getValueAt(table.getSelectedRow(), 2));
////        			select_receipt_no_string = "" + table.getValueAt(table.getSelectedRow(), 2);
//        			
////        			System.out.println("????????? : \t" + select_receipt_no);
////        			System.out.println("????????? : \t" + select_receipt_no_string);
////        			select_receipt_no = Integer.parseInt(select_receipt_no_string);
//        			
////        			System.out.println(select_receipt_no);
//					
////					System.out.println("????????? row : " + table.getSelectedRow());
////					System.out.println("????????? col : " + table.getSelectedColumn());
////					System.out.println();
//					
//				// ???????????? ?????? ?????? ???????????? ??? ?????? ????????? ????????? ??????
////				select_receipt_no = Integer.parseInt((String) table.getValueAt(table.getSelectedRow(), 2));
//					
////					System.out.println((Integer)(table.getValueAt(table.getSelectedRow(), 2)));
//				
////					System.out.println(
////						table.getSelectedColumn() + "??? / " + 
////						table.getSelectedRow() + "?????? ?????????????????????."
////					);
////					
////					System.out.println("?????? ??? ??? : " +
////						table.getValueAt(table.getSelectedRow(), 2)
////					);
//				}
//			}
//		});
//     	
//     	// ================================================================================================
//        // '????????????' ????????? ??????????????? ??????
//		// ================================================================================================     	
//           
//           buttons.get(3).addActionListener(new ActionListener() {
//        	    
//        	   
//        	   
//        		@Override
//        		public void actionPerformed(ActionEvent e) {
////        			
//////        			int select_receipt_no = -1;
//////        			String select_receipt_no_string = "";
////        			System.out.println("select_receipt_no 1 : " + select_receipt_no);
////        			if (select_receipt_no == -1) {
////        				System.out.println("select_receipt_no 2 : " + select_receipt_no);
//////        				System.out.println("11");
//////        				
//////        				System.out.println("22");
////        			} else if (select_receipt_no > 0) {
////        				System.out.println("select_receipt_no 3 : " + select_receipt_no);
//////        				select_receipt_no_string = "" + table.getValueAt(table.getSelectedRow(), 2);
//////        				select_receipt_no = Integer.parseInt(select_receipt_no_string);
//////        				
//////        				payment_change aa = new payment_change();
//////        				
////        			} 
//        			
////        				select_receipt_no_string = "" + table.getValueAt(table.getSelectedRow(), 2);
////        				select_receipt_no = Integer.parseInt(select_receipt_no_string);
//        			
//        				payment_change aa = new payment_change(select_receipt_no);
//        			
//
//        		}
//        		
//        	});
//     	
//		// ================================================================================================
//        // '??????' ????????? ??????????????? ??????
//		// ================================================================================================     	
//           
//           buttons.get(4).addActionListener(new ActionListener() {
//        	   
//        		@Override
//        		public void actionPerformed(ActionEvent e) {
//        			
//        			DefaultTableModel model = new DefaultTableModel(data_default, columnNames);
//        			table.setModel(model);
////        			JTable table = new JTable(model);
//
//        			model.fireTableDataChanged();
//        		}
//        		
//        	});
//		// ================================================================================================
//        // '??????' ????????? ??????????????? ??????
//		// ================================================================================================
//           
//           buttons.get(5).addActionListener(new ActionListener() {
//        	   
//        		@Override
//        		public void actionPerformed(ActionEvent e) {
//
//        			DefaultTableModel model = new DefaultTableModel(data_cash, columnNames);
//        			
//        			table.setModel(model);
////        			JTable table = new JTable(model);
//        			
//        			model.fireTableDataChanged();
//        			
//        		}
//        		
//        	});
//       // ================================================================================================
//       // '????????????' ????????? ??????????????? ??????
//       // ================================================================================================
//              
//              buttons.get(6).addActionListener(new ActionListener() {
//           	   
//           		@Override
//           		public void actionPerformed(ActionEvent e) {
//           			
////           	        credit_list();
//           	        
//           			DefaultTableModel model = new DefaultTableModel(data_credit, columnNames);
//           			table.setModel(model);
////           		JTable table = new JTable(model);
//           			
//           			model.fireTableDataChanged();
//           		}
//           		
//           	});  
//
//           
//     // ================================================================================================
//     // ================================================================================================
//
//	}
//	
//	public static void main(String[] args) {
//		 Receipt_duck_2 frame = new Receipt_duck_2();	
//		 frame.setDefaultOptions();
//	}
//}
////
////class payment_change extends JDialog{
////	
//////    JLabel jlb = new JLabel("");
//////    JLabel label = new JLabel();
////    
////	JLabel label = new JLabel();
////	JButton btn1 = new JButton();
////	JButton btn2 = new JButton();
////	JPanel new_s1 = new JPanel(); 
////	JPanel new_s2 = new JPanel();
////    
////    public payment_change(int receipt_no){
//////      getContentPane().add(label);
////        
////	setLayout(null);
////	
////	new_s1.setBounds(10, 30, 210, 210);
////	new_s2.setBounds(240, 30, 220, 210);
////	
//////	new_s1.setBackground(Color.black);
//////	new_s2.setBackground(Color.black);
////	
////	label.setLocation(150, 300);
//////	label.setSize(new Dimension(200, 50));
////	label.setBounds(280, 350, 452, 452);
////	label.setBackground(Color.red);
////	
//////	label.setIcon(new ImageIcon("image/cash.png"));
////	
////	
//////      btn1.setText("????????????");
////      btn1.setFont(new Font("??????", Font.PLAIN, 20));
////      btn1.setIcon(new ImageIcon("image/cash.png"));
////      btn1.setLocation(150, 150);
//////      btn1.setSize(300, 300);
////      btn1.setBackground(Color.black);
////      
////      System.out.println(btn1.getSize(getSize()));
////      
////      
//////      btn2.setText("??????????????????");
////      btn2.setIcon(new ImageIcon("image/credit.png"));
////      btn2.setLocation(150, 150);
//////      btn2.setSize(300, 300);
////      btn2.setBackground(Color.black);
////
////      new_s1.add(btn1);
////      new_s2.add(btn2);
////      
////      add(new_s1);
////      add(new_s2);
////      
//////      jlb.setText(receipt_no.toString());
//////      label.add(btn);
//////      add(btn);
//////      this.setSize(600,800);
////      this.setBounds(250, 300, 500, 300);
////		this.setModal(true);
////      this.setVisible(true);
////      this.setResizable(false);
////      this.setBackground(Color.black);
////}
////}