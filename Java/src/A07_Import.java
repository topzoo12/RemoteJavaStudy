//import quiz.A00_PrintRabbit;
//import quiz.A01_MemberInfo;
//import quiz.A02_Gildong;

import quiz.*;

public class A07_Import {
	
	/*
	 
	 # 우리는 우리가 만들었던 다른 클래스의 기능들을 모두 가져와서 재사용할 수 있다.
	 
	 # Import
	   - 다른 패키지에 정의되어 있는 클래스를 사용하기 위해서는 import가 필요하다.
	   - 해당 패키지의 모든 클래스를 불러오고 싶을 때는 *를 사용한다.
	   - 같은 패키지에 존재하는 클래스들은 import 없이도 사용할 수 있다.
	 
	 */
	
	public static void main(String[] args) {
		
		// 같은 default 패키지의 클래스들은 아무런 조치없이 사용할 수 있다.
		A00_Hello.main(null);
		A01_Escape.main(null);
		A02_Variable.main(null);
		
		
		// quiz 패키지의 클래스들은 현재 클래스와 다른 패키지에 있으므로 import가 필요하다.
		A00_PrintRabbit.main(null);
		A00_PrintRabbit.main(null);
		
		A01_MemberInfo.main(null);
		A02_Gildong.main(null);
		
		
	}
}
