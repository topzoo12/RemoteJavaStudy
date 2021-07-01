package myinterface;

public class Bus implements Vehicle {
	
	int curr_speed = 0;
	int max_seat = 10;
	int curr_passenger = 0;
	
	@Override
	public int acceleration() {
		return curr_speed += 10;
	}
	
	@Override
	public int deceleration() {
		return curr_speed -= 10;
	}
	
	@Override
	public boolean ride() {
		if (curr_passenger == max_seat) {
			return false;
		} else { 
			curr_passenger++;
			return true;
		}
	}
	
	
}
