package gui;

import javax.swing.JButton;
import javax.swing.JFrame;

public class S01_JavaSwing {
	
	/*
		# Java Swing
		 - javax.swing 패키지에 들어있는 클래스들로 Windows GUI 프로그램을 만들 수 있다. 
	
		# Container
		 - 여러 컴포넌트들을 배치할 수 있는 판
		 - JFrame, JPanel, JDialog ... 등
		 - 컨테이너마다 레이아웃을 설정할 수 있다.
		 
		# Component
		 - 컨테이너 위에 배치할 수 있는 부품
		 - 버튼, 표, 슬라이더, 메뉴 ... 등등
		 
		 
	*/
	
	public static void main(String[] args) {
		
		JFrame frame = new JFrame();
		
		// 각 컴포넌트 인스턴스 값을 수정하는 방식으로 해당 컴포넌트를 자세히 설정할 수 있다.
		JButton btn1 = new JButton("This is button1");
		
		btn1.setLocation(100, 100);
		btn1.setSize(150, 80);
		
		JButton btn2 = new JButton("This is button2");
		
		btn2.setLocation(-10, -10);
		btn2.setSize(150, 80);
		
		// 프레임을 만들고 프레임 위에 무언가를 붙이면서 프로그램을 만드는 방식이다.
		frame.add(btn1);
		frame.add(btn2);
		frame.add(new JButton("button 3") {
			{
				setLocation(300,30);
				setSize(150, 80);
			}
		});
		
		
		// 레이아웃 삭제
		frame.setLayout(null);
		
		// X버튼 눌렀을 때의 동작을 설정
//		frame.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
//		frame.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// 프레임 크기 설정
		frame.setSize(500, 500);
		
		// 설정된 대로 프레임을 보이게 한다. ( 화면에 그리는 효과가 있다 ) ※ 마지막에 두는게 좋음
		frame.setVisible(true);
		
		
		
	}
}






















