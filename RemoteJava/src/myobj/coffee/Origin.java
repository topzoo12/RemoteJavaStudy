package myobj.coffee;

public class Origin {
	
	public static Origin BRAZIL = new Origin("브라질", 4);
	public static Origin SOUTH_KOREA = new Origin("한국", 1);
	
	String name;
	int value;
	
	private Origin(String name, int value){
		this.name = name;
		this.value = value;
	}
}
