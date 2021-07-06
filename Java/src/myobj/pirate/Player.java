package myobj.pirate;

public class Player {
	
	String name;
	int win;
	int lose;
	
	public Player(String name) {
		this.name = name;
	}
	
	public void win() {
		this.win++;
	}
	
	public void lose() {
		this.lose++;
	}
	
	public String getName() {
		return name;
	}


	
}