package project;

import java.awt.CardLayout;
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
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import baseSettings.PosFrame;
import gui.mypanel.ImagePanel;

public class Receipt_duck_3 extends PosFrame {
	
	static ArrayList<ArrayList<String>> list_data_default = new ArrayList<ArrayList<String>>();
	static ArrayList<ArrayList<String>> list_data_cash = new ArrayList<ArrayList<String>>();
	static ArrayList<ArrayList<String>> list_data_credit = new ArrayList<ArrayList<String>>();
	
	static String[] columnNames = null;
	
	static String Receipt_list = "select * from payment_view_1";
	static String Receipt_list_cash = "select * from payment_view_1 where cash > 0";
	static String Receipt_list_credit = "select * from payment_view_1 where credit > 0";
	
	static String[][] data_default = null;
	static String[][] data_cash = null;
	static String[][] data_credit = null;
	
	static int select_receipt_no = -1;
	static String select_receipt_no_string = "";
	
	static int w_size, h_size;
	static int cash_w_size, cash_h_size;
	static int credit_w_size, credit_h_size;
	
	
	public void total() {
		try {
            Connection conn = DriverManager.getConnection(
            		"jdbc:oracle:thin:@database-1.cxc98ia1oha4.us-east-2.rds.amazonaws.com:1521/ORCL",
            		"cafe",
            		"!!22Qorthdud");
            
        // ================================================================================================
        // ================================================================================================
            	
            	// 기본 디폴트 리스트 
            	PreparedStatement pstmt_Receipt_list = conn.prepareStatement(Receipt_list);
            	PreparedStatement pstmt_Receipt_list_cash = conn.prepareStatement(Receipt_list_cash);
            	PreparedStatement pstmt_Receipt_list_credit = conn.prepareStatement(Receipt_list_credit);
            	
            	ResultSet rs_list = pstmt_Receipt_list.executeQuery();
            	ResultSet rs_list_cash = pstmt_Receipt_list_cash.executeQuery();
            	ResultSet rs_list_credit = pstmt_Receipt_list_credit.executeQuery();
            	
            	// 컬럼 명을 불러오기 위한 데이터 처리
            	ResultSetMetaData md = rs_list.getMetaData();
            	
            	// 이후 테이블 사이즈를 구성하기 위한 가져온 컬럼의 숫자 저장
            	int column_size = md.getColumnCount();
            	
            	// 구한 컬럼 숫자+1의 이유는 컬럼 이외에 첫번째 col 에는 데이터의 수를 나타내기위한 No 을 추가하기 위함
            	columnNames = new String[column_size+1];
            	
            	// 컬럼명을 배열에 문자열로 저장
            	for(int i = 0; i < columnNames.length; i++) {
            		if (i == 0) {
            			columnNames[i] = "No";
            		} else {
            			columnNames[i] = md.getColumnName(i);
            		}
                }
            	
            	// 기존에 담겨있던 데이터를 비움
            	list_data_default.clear();
            	
            	
            	// 가져온 데이터를 list_data_default(ArrayList) 에 저장
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
            	
            	// 기존에 담겨있던 데이터를 비움
            	list_data_cash.clear();
            	
            	// 가져온 데이터를 list_data_cash(ArrayList) 에 저장
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
            	
            	// 기존에 담겨있던 데이터를 비움
            	list_data_credit.clear();
            	
            	// 가져온 데이터를 list_data_credit(ArrayList) 에 저장
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
            	
            	// 오픈 했던 각 리소스들 종료 
            	rs_list.close();
            	rs_list_cash.close();
            	rs_list_credit.close();
            	
            	pstmt_Receipt_list.close();
            	pstmt_Receipt_list_cash.close();
            	pstmt_Receipt_list_credit.close();
            	
            	conn.close();
            
            // ================================================================================================
        	// ================================================================================================
            	System.out.println("w_size : " + w_size);
            	System.out.println("cash_w_size : " + cash_w_size);
            	System.out.println("credit_w_size : " + credit_w_size);
            	// JTable에 담길 데이터의 사이즈를 설정하기 위한 각 데이터의 사이즈 구하기
            	w_size = list_data_default.size();
            	h_size = list_data_default.get(0).size();
            	cash_w_size = list_data_cash.size();
            	cash_h_size = list_data_cash.get(0).size();
            	credit_w_size = list_data_credit.size();
            	credit_h_size = list_data_credit.get(0).size();
            	
            	System.out.println("w_size : " + w_size);
            	System.out.println("cash_w_size : " + cash_w_size);
            	System.out.println("credit_w_size : " + credit_w_size);
            	
            	// 구한 각 데이터의 사이즈를 가지고 JTable의 크기 설정
             	data_default = new String[w_size][h_size];
             	data_cash = new String[cash_w_size][cash_h_size];
             	data_credit = new String[credit_w_size][credit_h_size];
             	
             	// 전체(total) 데이터를 JTable에 적용할 배열에 저장
             	for (int i = 0; i < w_size; i++) {
            		for (int x = 0; x < h_size; x++) {
            			if (x == 0) {
            				data_default[i][x] = "" + (i+1);
            			}else {
            				data_default[i][x] = list_data_default.get(i).get(x);
            			}
            		}
            	}
             	
             	// 현금(Cash) 데이터를 JTable에 적용할 배열에 저장
             	for (int i = 0; i < cash_w_size; i++) {
            		for (int x = 0; x < cash_h_size; x++) {
            			if (x == 0) {
            				data_cash[i][x] = "" + (i+1);
            			}else {
            				data_cash[i][x] = list_data_cash.get(i).get(x);
            			}
            		}
            	}
             	
             	// 카드(Credit) 데이터를 JTable에 적용할 배열에 저장
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
            System.out.println("getConnection 하다가 문제 생김");
        }
		
	}
	
	public Receipt_duck_3() {
		super();
		super.setTitle("영수증 관리");
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

            // 6. 다 사용한 연결을 나중에 연 순서대로 닫아준다
//            rs.close();
//            pstmt.close();
            conn.close();

        } catch (SQLException e) {
            System.out.println("getConnection 하다가 문제 생김");
        }
		
		setLayout(null);
		
		// 시간을 문자열로 변경하기
		DateTimeFormatter my_date_format = 
				DateTimeFormatter.ofPattern("y년 M월 d일");
		
		String message = my_date_format.format(LocalDate.now());

		JButton date = new JButton(message);
		String product = "";
		
		String string = // 영수증 전체 내용 
				"<html><center>-------------------------------------------------------------------"
				+ "</html>";
		
		// &nbsp 띄어쓰기 &emsp 크게 띄어쓰기
		// <html> +  + <br> + + <p>  + + </html> 줄 바꾸는 법
		
		JPanel frame = new JPanel();
		
		JLabel receipt = new JLabel(string);
		
		ArrayList<JButton> buttons = new ArrayList<>();
		
		buttons.add(new JButton("전표반품")); // 0 
		buttons.add(new JButton("재인쇄"));
		buttons.add(new JButton("현금영수증"));
		
		buttons.add(new JButton("결제변경"));
		buttons.add(new JButton("전체"));
		buttons.add(new JButton("현금"));
		buttons.add(new JButton("신용카드")); // 6
		
		// 버튼 위치 조정
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
		receipt.setOpaque(true); // 백그라운드 색상 허용
		receipt.setHorizontalAlignment(JLabel.CENTER); // 수평 가운데 표시 설정
		receipt.setVerticalAlignment(JLabel.NORTH);; // 세로 가운데 표시 설정
		receipt.setBackground(new Color(0xffffff));// 라벨 배경색
//		receipt.setBounds(730, 140, 540, 2000);
//		frame.setBackground(new Color(0xffffff)); // 패널 배경색
		frame.setBounds(730, 140, 540, 500);
		receipt.setAutoscrolls(true);
		JScrollPane scrollPane = new JScrollPane( // 영수증에 수직 스크롤바 추가
				receipt, JScrollPane.VERTICAL_SCROLLBAR_ALWAYS, JScrollPane.HORIZONTAL_SCROLLBAR_NEVER);
		scrollPane.setPreferredSize(new Dimension(540, 500)); // 스크롤바 크기조정
		
		frame.add(scrollPane);
		
		// 좌측 위 버튼 추가
		add(buttons.get(0));
		add(buttons.get(1));
		add(buttons.get(2));
		add(buttons.get(3));
		
		add(date); // 날짜 출력
		
		// 우측 위 버튼
		add(buttons.get(4));
		add(buttons.get(5));
		add(buttons.get(6));
		
        add(frame);
        

     // ================================================================================================
     // ================================================================================================
        
        total();
//        cash_list();
//        credit_list();

        JPanel receipt_panel_list = new JPanel(new CardLayout(10, 10));        
        
        receipt_panel_list.setBackground(Color.black);
        receipt_panel_list.setLocation(20, 140);
        receipt_panel_list.setSize(660, 500);

//     	JPanel a = new JPanel();
//     	a.setSize(20,20);
     	
//     	DefaultTableModel model = new DefaultTableModel(data_default, columnNames);
     	JTable table_default = new JTable(data_default, columnNames);
     	JTable table_cash = new JTable(data_cash, columnNames);
     	JTable table_credit = new JTable(data_credit, columnNames);
     	
     	JPanel panel1 = new JPanel();
		JPanel panel2 = new JPanel();
		JPanel panel3 = new JPanel();
     	
//		JTable table = new JTable(model);
     	
     	JScrollPane scrollPane_default = new JScrollPane(table_default);
     	JScrollPane scrollPane_cash = new JScrollPane(table_cash);
     	JScrollPane scrollPane_credit = new JScrollPane(table_credit);
     	
     	scrollPane_default.setBorder(BorderFactory.createEmptyBorder());
//     	scrollPane1.setBounds(20, 120, 6600, 4700);
     	
//     	scrollPane1.setBackground(Color.pink);
     	
//     	table.setPreferredSize(new Dimension(660, 1500));
//     	table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
     	
     	table_default.getTableHeader().setPreferredSize(new Dimension(scrollPane_default.getWidth(), 50));
     	
     	scrollPane_default.setPreferredSize(new Dimension(658, 495));
//     	scrollPane1.setPreferredSize(660, 1500);
//     	scrollPane1.setSize(6600, 1500);
     	
     	table_default.setRowSelectionAllowed(true);
     	table_default.setColumnSelectionAllowed(false);
//     	System.out.println(scrollPane1.getSize(getPreferredSize()));
     	
//     	table.setShowGrid(true);
     	
//     	a.add(scrollPane1);
     	receipt_panel.add(scrollPane_default);
     	add(receipt_panel);
     	
		// ================================================================================================
     	// 테이블 내에 어떤 행을 선택했을때 그 데이터의 영수증 번호를 가져오기 위한 액션 
		// ================================================================================================
     	
     	ListSelectionModel selection = table_default.getSelectionModel();
     	
     	selection.addListSelectionListener(new ListSelectionListener() {
			
			@Override
			public void valueChanged(ListSelectionEvent e) {
				
				if (e.getValueIsAdjusting()) {
					
//					int tableRows = table.getRowCount();
//					int selecrow = table.getSelectedRow();
					
//					System.out.println("w_size : " + w_size + "\tcash_w_size : " + cash_w_size + "\tcredit_w_size : " + credit_w_size);
//					System.out.println("model.getColumnCount() : " + model.getValueAt(table.getSelectedRow(), 2));
//					
//					if (table.getRowCount() == w_size) {
//						
//						System.out.println(data_default[table.getSelectedRow()][2]);
//					} 
//					
//					if (table.getRowCount() == cash_w_size) {
//						
//						System.out.println(data_cash[table.getSelectedRow()][2]);
//					} 
//					if (table.getRowCount() == credit_w_size) {
//						
//						System.out.println(data_credit[table.getSelectedRow()][2]);
//					}
					
					
//					select_receipt_no = (Integer)(table.getValueAt(table.getSelectedRow(), 2));
//        			select_receipt_no_string = "" + table.getValueAt(table.getSelectedRow(), 2);
        			
//        			System.out.println("인트형 : \t" + select_receipt_no);
//        			System.out.println("문자열 : \t" + select_receipt_no_string);
//        			select_receipt_no = Integer.parseInt(select_receipt_no_string);
        			
//        			System.out.println(select_receipt_no);
					
//					System.out.println("선택된 row : " + table.getSelectedRow());
//					System.out.println("선택된 col : " + table.getSelectedColumn());
//					System.out.println();
					
				// 테이블의 어떤 행을 선택하면 그 행의 영수증 번호를 조회
//				select_receipt_no = Integer.parseInt((String) table.getValueAt(table.getSelectedRow(), 2));
					
//					System.out.println((Integer)(table.getValueAt(table.getSelectedRow(), 2)));
				
//					System.out.println(
//						table.getSelectedColumn() + "열 / " + 
//						table.getSelectedRow() + "행이 선택되었습니다."
//					);
//					
//					System.out.println("선택 된 값 : " +
//						table.getValueAt(table.getSelectedRow(), 2)
//					);
				}
			}
		});
     	
     	// ================================================================================================
        // '결제변경' 버튼을 눌렀을때의 액션
		// ================================================================================================     	
           
           buttons.get(3).addActionListener(new ActionListener() {
        	    
        	   
        	   
        		@Override
        		public void actionPerformed(ActionEvent e) {
//        			
////        			int select_receipt_no = -1;
////        			String select_receipt_no_string = "";
//        			System.out.println("select_receipt_no 1 : " + select_receipt_no);
//        			if (select_receipt_no == -1) {
//        				System.out.println("select_receipt_no 2 : " + select_receipt_no);
////        				System.out.println("11");
////        				
////        				System.out.println("22");
//        			} else if (select_receipt_no > 0) {
//        				System.out.println("select_receipt_no 3 : " + select_receipt_no);
////        				select_receipt_no_string = "" + table.getValueAt(table.getSelectedRow(), 2);
////        				select_receipt_no = Integer.parseInt(select_receipt_no_string);
////        				
////        				payment_change aa = new payment_change();
////        				
//        			} 
        			
//        				select_receipt_no_string = "" + table.getValueAt(table.getSelectedRow(), 2);
//        				select_receipt_no = Integer.parseInt(select_receipt_no_string);
        			
        				payment_change aa = new payment_change(select_receipt_no);
        			

        		}
        		
        	});
     	
		// ================================================================================================
        // '전체' 버튼을 눌렀을때의 액션
		// ================================================================================================     	
           
           buttons.get(4).addActionListener(new ActionListener() {
        	   
        		@Override
        		public void actionPerformed(ActionEvent e) {
        			
        			DefaultTableModel model = new DefaultTableModel(data_default, columnNames);
        			table.setModel(model);
//        			JTable table = new JTable(model);

        			model.fireTableDataChanged();
        		}
        		
        	});
		// ================================================================================================
        // '현금' 버튼을 눌렀을때의 액션
		// ================================================================================================
           
           buttons.get(5).addActionListener(new ActionListener() {
        	   
        		@Override
        		public void actionPerformed(ActionEvent e) {

        			DefaultTableModel model = new DefaultTableModel(data_cash, columnNames);
        			
        			table.setModel(model);
//        			JTable table = new JTable(model);
        			
        			model.fireTableDataChanged();
        			
        		}
        		
        	});
       // ================================================================================================
       // '신용카드' 버튼을 눌렀을때의 액션
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

//class payment_change extends JDialog{
//	
////    JLabel jlb = new JLabel("");
////    JLabel label = new JLabel();
//    
//	JLabel label = new JLabel();
//	JButton btn1 = new JButton();
//	JButton btn2 = new JButton();
//	JPanel new_s1 = new JPanel(); 
//	JPanel new_s2 = new JPanel();
//    
//    public payment_change(int receipt_no){
////      getContentPane().add(label);
//        
//	setLayout(null);
//	
//	new_s1.setBounds(10, 30, 210, 210);
//	new_s2.setBounds(240, 30, 220, 210);
//	
////	new_s1.setBackground(Color.black);
////	new_s2.setBackground(Color.black);
//	
//	label.setLocation(150, 300);
////	label.setSize(new Dimension(200, 50));
//	label.setBounds(280, 350, 452, 452);
//	label.setBackground(Color.red);
//	
////	label.setIcon(new ImageIcon("image/cash.png"));
//	
//	
////      btn1.setText("현금결제");
//      btn1.setFont(new Font("돋움", Font.PLAIN, 20));
//      btn1.setIcon(new ImageIcon("image/cash.png"));
//      btn1.setLocation(150, 150);
////      btn1.setSize(300, 300);
//      btn1.setBackground(Color.black);
//      
//      System.out.println(btn1.getSize(getSize()));
//      
//      
////      btn2.setText("신용카드결제");
//      btn2.setIcon(new ImageIcon("image/credit.png"));
//      btn2.setLocation(150, 150);
////      btn2.setSize(300, 300);
//      btn2.setBackground(Color.black);
//
//      new_s1.add(btn1);
//      new_s2.add(btn2);
//      
//      add(new_s1);
//      add(new_s2);
//      
////      jlb.setText(receipt_no.toString());
////      label.add(btn);
////      add(btn);
////      this.setSize(600,800);
//      this.setBounds(250, 300, 500, 300);
//		this.setModal(true);
//      this.setVisible(true);
//      this.setResizable(false);
//      this.setBackground(Color.black);
//}
//}