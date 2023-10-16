package com.kh.objExam;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Practice4 {

	public static void main(String[] args) {
		Practice4 pm = new Practice4();
		pm.practice1();
		pm.practice2();
		pm.practice3();
		pm.practice4();
		pm.practice5();
	}

	public void practice1() {
	// 년월일 yyy-MM=dd
		Date curDate = new Date();
		SimpleDateFormat a = new SimpleDateFormat("yyy-MM-dd");
		String forDate = a.format(curDate);
		System.out.println(forDate);	
	}

	public void practice2() {
	// 시분초 HH:mm:ss
		Date curDate = new Date();
		SimpleDateFormat a = new SimpleDateFormat("HH:mm:ss");
		String forDate = a.format(curDate);
		System.out.println(forDate);	
	}

	public void practice3() {
	// 월일 MM-dd
		Date curDate = new Date();
		SimpleDateFormat a = new SimpleDateFormat("MM-dd");
		String forDate = a.format(curDate);
		System.out.println(forDate);	
	}

	public void practice4() {
	// 연도 - 시간 yyyy-HH
		Date curDate = new Date();
		SimpleDateFormat a = new SimpleDateFormat("yyy-HH");
		String forDate = a.format(curDate);
		System.out.println(forDate);	
		
	}
	
	public void practice5() {
		// 날짜-요일 
		Date curDate = new Date();
		SimpleDateFormat a = new SimpleDateFormat("yyyy MM dd E");
		String forDate = a.format(curDate);
		System.out.println(forDate);	
		}
	
	
	
	
	
	
	
	
	
}
