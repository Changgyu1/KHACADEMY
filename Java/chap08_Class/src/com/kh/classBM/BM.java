package com.kh.classBM;

import com.kh.classAM.AM;

public class BM extends AM {
	//public static void main(String[] args) {
	//자바 프로그램의 시작점
		// A 생성자를 classBM 에서 만들고 싶어!
		public void AM() {
			AM am = new AM(); 
			publicMethod();
			protectedMethod();
			 // main 메서드에서 직접 호출을 하거나 뭔가를 통해
			 // 접근 제한자를 가지고 있어서 같은 패키지 내에서 호출
			 // extends 사용해서 호출을 한다
		//	defaultMethod();
			// 같은 패키지 안에서 사용이 가능함
			// 다른 패키지 이므로 사용이 안됨
			
		//am.defaultMethod();   : 다른 패키지에 존재하기 때문에 출력이 안됨
		// 같은 패키지 안에서 사용이 가능함
		// 다른 패키지 이므로 사용이 안됨
		//am.protectedMethod(); : 다른 패키지에 존재하기 때문에 출력이 안됨
		//am.publicMethod();
		//am.privateMethod();   :  다른 클래스에 존재하기 때문에 출력이 안됨
	}
}
/*                            ___
                             /___\   
							//   \\
						   //     \\
						  //       \\
						 //         \\
						//           \\
					   //             \\
					  //               \\
					 //                 \\
					 \\                 //
					  \\               //
					   \\             //
					    \\           //
					     \\         //
					      \\       //
					       \\     //
					        \\___//
					         \___/

 */
