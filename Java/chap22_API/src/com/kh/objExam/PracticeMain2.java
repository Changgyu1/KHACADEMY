package com.kh.objExam;

public class PracticeMain2 {

	public static void main(String[] args) {
		PracticeMain2 main = new PracticeMain2();
		main.practice1();
		main.practice2();
		main.practice3();
		main.practice4();
		main.practice5();
		
	}
	
	public void practice1() {
		// ¹®ÀÚ¿­ µ¡ ºÙÀÌ±â Ãâ·Â append È°¿ë
		StringBuffer sb = new StringBuffer();
		sb.append("¿À´Ã ³¯¾¾ Âü Á¶ ´ ´Ù~");
		System.out.println("practice1 : " + sb.toString());
		sb.append("Àú³áÀº ¹¹¸ÔÁö~");
		System.out.println("practice1 : " + sb.toString());
	}
	
	public void practice2() {
		//¹®ÀÚ¿­ µÚÁı±â reverse
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö?";
		StringBuffer stra = new StringBuffer(str);
		stra.reverse();
		System.out.println("practice2 : " + stra.toString());
	}

	public void practice3() {
		// ¹®ÀÚ¿­ »ğÀÔ inser ? ¤¾¤¾
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö?";
		StringBuffer stra = new StringBuffer(str);
		stra.insert(1, "¤¾¤¾");
		System.out.println("practice3 : " + stra.toString());
	}
	
	public void practice4() {
		//¹®ÀÚ¿­ ´ëÃ¼ replace(, ,);
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö?";
		StringBuffer stra = new StringBuffer(str);
		stra.replace(1, 7, "*");
		System.out.println("practice4 : " + stra.toString());
	}
	
	public void practice5() {
		//¹®ÀÚ¿­ »èÁ¦ delete (,,);
		String str = "¿À´Ã Àú³áÀº ¹¹¸ÔÁö?";
		StringBuffer stra = new StringBuffer(str);
		stra.delete(0, 7);
		System.out.println("practice5 : " + stra.toString());
	}
	
	
	
	
}
