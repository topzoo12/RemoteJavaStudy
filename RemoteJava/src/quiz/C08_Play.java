package quiz;

public class C08_Play extends C08_Setting {
	
	static int hole_size;
	
	public C08_Play() {
		super();
	}

	public void playerPrick1(int num) {
		/*
		System.out.println("ÇÃ·¹ÀÌ Ã¼Å©");
		System.out.println(num);
		System.out.println("====");
		*/
		System.out.println(hole[num]);
		
		if (hole[num] == true) {
			System.out.println("ÀÌ¹Ì Ä®ÀÌ ²ÈÈù Ä­ÀÔ´Ï´Ù.");
		} else {
			hole[num] = true;
			System.out.println("´ÙÀ½Â÷·Ê");
		}
		
		//System.out.println(hole[num]);
		//System.out.println(hole.length);
	}
/*
	public void playerPrick2(int num) {
		hole[num] = num;
		System.out.println(hole[num]);
	}
	*/
}
