package quiz;
public class D09_BruteForce_Kim {

	public static void main(String[] args) {
		// !, @, #, $, %, ^, &, *
		// 영어 대/소문자, 숫자 특수문자 , 길이 입력받으면 문자로 만들 수 있는 모든 해당 길이의 비밀번호출력

		//		Scanner sc = new Scanner(System.in);
		//		System.out.println("숫자 입력: ");
		//		int num = sc.nextInt();
		int num = 4;

		char[] password = new char[num];
		for(int i = 0; i < num; i++) {
			password[i] = '0';
		}
		System.out.println(password);
		int a = 0;
		while(a < num) {

			if(a == 0) {
				count(0, password);	
			} else {
				countNum(a, password);

				countUpper(a, password);
				
				countLower(a, password);
				
				countSpecial(a, '!', password);
				countSpecial(a, '@', password);
				countSpecial(a, '#', password);
				countSpecial(a, '$', password);
				countSpecial(a, '%', password);
				countSpecial(a, '^', password);
				countSpecial(a, '&', password);
				countSpecial(a, '*', password);

			}

			a++;
		}


	}

	static void count(int a, char[] password) {
		password[a] = '0';
		for(int i =0; i < 10; i++) {
			System.out.println(password);
			password[a]++;
		}
		password[a] = 'A';
		for(int i = 0; i < 26; i++) {
			System.out.println(password);
			password[a]++;
		}

		password[a] = 'a';
		for(int i = 0; i < 26; i++) {
			System.out.println(password);
			password[a]++;
		}
		password[a] = '!';
		System.out.println(password);
		password[a] = '@';
		System.out.println(password);
		password[a] = '#';
		System.out.println(password);
		password[a] = '$';
		System.out.println(password);
		password[a] = '%';
		System.out.println(password);
		password[a] = '^';
		System.out.println(password);
		password[a] = '&';
		System.out.println(password);
		password[a] = '*';
		System.out.println(password);
	}

	static void countNum(int a, char[] password) {
		for(int i = 0; i < 10; i++) {
			countFor(a, password);
			password[a]++;
		}
	}
	static void countUpper(int a, char[] password) {
		password[a] = 'A';
		for(int i = 0; i < 26; i++) {
			countFor(a, password);
			password[a]++;
		}
	}
	static void countLower(int a, char[] password) {
		password[a] = 'a';
		for(int i = 0; i < 26; i++) {
			countFor(a, password);
			password[a]++;
		}
	}
	static void countFor(int a, char[] password) {
		for(int j = 0; j < a; j++) {
			count(j, password);	
		}
	}
	static void countSpecial(int a, char special,char[] password) {
		password[a] = special;
		for(int j = 0; j < a; j++) {
			count(j, password);	
		}
	}
}