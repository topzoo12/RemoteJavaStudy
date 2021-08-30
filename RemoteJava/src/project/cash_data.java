package project;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.util.ArrayList;

public class cash_data {
	
	public cash_data() {
		 
	}
	
	public String[][] table_cash_data(String date) {
		try {
            Connection conn = DriverManager.getConnection(
            		"jdbc:oracle:thin:@database-1.cxc98ia1oha4.us-east-2.rds.amazonaws.com:1521/ORCL",
            		"cafe",
            		"!!22Qorthdud");
            
        // ================================================================================================
            String[] columnNames = null;
        	String[][] data_cash = null;
        	
        	int cash_w_size, cash_h_size;
        // ================================================================================================
            
            
            	String Receipt_list = "select * from payment_view_2 where cash > 0 and datetime > TO_DATE('" +  date + "')"; ;
            	
            	
            	System.out.println(Receipt_list);
            
            	// 기본 디폴트 리스트 
            	PreparedStatement pstmt_Receipt_cash_list = conn.prepareStatement(Receipt_list);
            	
            	ResultSet rs_list = pstmt_Receipt_cash_list.executeQuery();
            	
            	// 컬럼 명을 불러오기 위한 데이터 처리
            	ResultSetMetaData md = rs_list.getMetaData();
            	
            	// 이후 테이블 사이즈를 구성하기 위한 가져온 컬럼의 숫자 저장
            	int column_size = md.getColumnCount();
            	
            	// 구한 컬럼 숫자+1의 이유는 컬럼 이외에 첫번째 col 에는 데이터의 수를 나타내기위한 No 을 추가하기 위함
            	columnNames = new String[column_size+1];
            	
            	for(int i = 0; i < columnNames.length; i++) {
            		if (i == 0) {
            			columnNames[i] = "No";
            		} else {
            			columnNames[i] = md.getColumnName(i);
            			
            		}
                }
            	
            	ArrayList<ArrayList<String>> list_data_cash = new ArrayList<ArrayList<String>>();
            	
            	while (rs_list.next()) {
            		ArrayList<String> data_total = new ArrayList<>();
            		
            		for (int i = 0; i < columnNames.length; i++) {
            			
            			if (i == 0) {
            				data_total.add("" + (i+1));            				
            			} else {
            				data_total.add(rs_list.getString(columnNames[i]));

            			}
            		}
            		list_data_cash.add(data_total);
            	}
            	
            	cash_w_size = list_data_cash.size();
            	cash_h_size = list_data_cash.get(0).size();
            	data_cash = new String[cash_w_size][cash_h_size];
            	
            	// 현금(Cash) 데이터를 JTable에 적용할 배열에 저장
             	for (int i = 0; i < list_data_cash.size(); i++) {
            		for (int x = 0; x < list_data_cash.get(i).size(); x++) {
            			if (x == 0) {
            				data_cash[i][x] = "" + (i+1);
            				System.out.print((i+1) + "\t");
            			}else {
            				data_cash[i][x] = list_data_cash.get(i).get(x);
            				System.out.print(data_cash[i][x] + "\t");
            			}
            		}
            		System.out.println();
            	}
             	
            	// 오픈 했던 각 리소스들 종료 
            	rs_list.close();
            	
            	pstmt_Receipt_cash_list.close();
            	
            	conn.close();
            
            return data_cash;
            
		} catch (SQLException e) {
            System.out.println("getConnection 하다가 문제 생김");
        }
		return null;
	}
	
	
	
	
		
		
	
}
