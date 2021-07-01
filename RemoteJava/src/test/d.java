package test;

public class d {
	
	public static void main(String[] args) {
		
		int a = 1;
		int star = 0;
		
		
		while(a <= 5) {
			
			star = 0;
			
			while (star < a) {
				System.out.print("*");
				star++;
			}
			System.out.println();
			a++;
		}
		System.out.println("1. ==================================");
		
		for (int x = 0; x < 5; x++) {
			for (int y = 0; y <= x; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("2. ==================================");
		
		for (int i = 1; i <= 5; i++) {
			for (int y = 5; y > 0; y--) {
				if (y > i) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		
		System.out.println("3. ==================================");
		
		
		for (int x = 0; x < 5; x++) {
			for (int y = x; y < 5; y++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		System.out.println("4. ==================================");
		
		for (int i = 0; i < 5; i++) {
			for (int y = 0; y < 5; y++) {
				if (i > y) {
					System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
		/*
//		System.out.println("5. ==================================");
//		
//		for (int i = 0; i < 9; i++) {
//			for (int y = 9; y > 0; y--) {
//				if (i >= y) {
//					System.out.print(" ");
//				} else {
//					System.out.print("*");
//				}
//			}
//			System.out.println();
//		}
		*/
		System.out.println("5. ====================");
		for(int i = 0; i < 5; i++){  
            for(int j = 0; j < 4-i; j++){   
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i+1; j++) {  
                System.out.print("*");
            }
            System.out.println();
        }
		
		System.out.println("6. ====================");
		for(int i = 0; i < 5; i++){ 
			for(int j = 0; j < i; j++){   
                System.out.print(" ");
            }
			
			for(int j = 1; j < 2 * 5-(i*2); j++) {
				System.out.print(j);
                //System.out.print("*");
            }
            System.out.println();
        }
		
		System.out.println("7. ====================");
		for(int i = 0; i < 5; i++){  
            for(int j = 0; j < 4-i; j++){   
                System.out.print(" ");
            }
            for(int j = 0; j < 2 * i+1; j++) {  
                System.out.print("*");
            }
            System.out.println();
        }
		for(int i = 0; i < 5; i++){ 
			for(int j = 0; j < i; j++){   
                System.out.print(" ");
            }
			
			for(int j = 1; j < 2 * 5-(i*2); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
		
		
		
		
		
		
		
		
		
	}
}












