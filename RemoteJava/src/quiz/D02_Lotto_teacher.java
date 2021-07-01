package quiz;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class D02_Lotto_teacher {
	
	
	final private static int LOTTO_SIZE = 45;
	final private static int BONUS_INDEX = 4;
	
	private int bonus = 0;
	
	
	public Set<Integer> generate(int len) {
		HashSet<Integer> lotto = new HashSet<>();
		
		while (lotto.size() != 6) { 
			int ranNum = (int)(Math.random() * LOTTO_SIZE + 1);
			//System.out.println("Set�� " + ranNum + "�� �������ϴ�.");
			lotto.add(ranNum);
			
			if ( len == 7 && lotto.size() == BONUS_INDEX ) {
				bonus = ranNum;
			}
			
		}
		return lotto;
	}
	
	public void test() {
		Set<Integer> win = generate(7);
		
		System.out.println("��÷��ȣ�� '" + win + "'�Դϴ�. �� �� ���ʽ� ��ȣ�� '" + bonus + "'�Դϴ�.");
		
		List<Integer> checkList = new ArrayList<>();
		
		long spent = 0;
		long count = 0;
		
		while (true) {
			Set<Integer> blackcow = generate(6); 
			count++;
			
			checkList.addAll(win);
			checkList.removeAll(blackcow);
			
			if (checkList.size() == 1) {
				spent = count * 1000;
				
				if (checkList.get(0) == bonus) {
					
					System.out.println("1�� ��÷�Դϴ�. " + count + "�� �����ϼ�����, ���±��� ���� ���� " + spent + "�� �Դϴ�.");
				} else {
					System.out.println("2�� ��÷�Դϴ�. " + count + "�� �����ϼ�����, ���±��� ���� ���� " + spent + "�� �Դϴ�.");
				}
				break;
			}
			checkList.clear();
		}
	}
	
	
	public static void main(String[] args) {
		
		D02_Lotto_teacher quiz = new D02_Lotto_teacher();
//		System.out.println(quiz.generate(7));
		quiz.test();
		
		
		
		
	}
	
	

}













