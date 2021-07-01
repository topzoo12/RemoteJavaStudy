package myobj;

public class Barrack {
	
	final int MAX_QUEUE_SIZE = 5;
	
	Unit[] queue;
	int queue_index;
	
	Barrack() {
		queue = new Unit[MAX_QUEUE_SIZE];
	}
	
	boolean checkQueue() {
		return queue_index == MAX_QUEUE_SIZE;
	}
	
	void createSheep() {
		if (checkQueue()) {
			System.out.println("생산 대기열이 가득 찼습니다! 양을 생산할 수 없습니다!");
			return;
			// void타입 함수도 return을 할 수 있다.
			// 호출한 곳에 값을 돌려주지 않고 함수만 종료한다.
		}
		queue[queue_index++] = new Unit("양", 5);
	}
	
	void createCow() {
		if (checkQueue()) {
			System.out.println("생산 대기열이 가득 찼습니다! 소를 생산할 수 없습니다!");
			return;
		}
		queue[queue_index++] = new Unit("소", 7);
	}
	
}
