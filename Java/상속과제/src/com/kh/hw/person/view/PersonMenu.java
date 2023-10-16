package com.kh.hw.person.view;

import java.util.Scanner;

import com.kh.hw.person.controller.PersonController;

public class PersonMenu {
	private Scanner sc = new Scanner(System.in);
	private PersonController pc = new PersonController();
	
	public void mainMenu() {
		/*
		학생은 최대 3명까지 저장할 수 있습니다.
		현재 저장된 학생은 M명입니다.
		사원은 최대 10명까지 저장할 수 있습니다.
		현재 저장된 사원은 N명입니다.
		M과 N에 들어가는 숫자는 PersonControoler(pc)클래스에 있는
		personCount() 메소드의 반환 값을 이용하여 출력
		*/
		System.out.println("학생은 최대 3명까지 저장할 수 있습니다.");
		System.out.println("현재 저장된 학생은 " + "M");
		System.out.println("사원은 최대 "+ "N" + "명까지 저장할 수 있습니다.");
		
		System.out.println("1.학생 메뉴");
		System.out.println("2.사원 메뉴");
		System.out.println("9.끝내기");
		System.out.println("메뉴 번호 : ");
		int select = sc.nextInt();
		
			switch(select) {
				case 1:
					studentMenu();
					break;
				case 2:
					employeeMenu();
					break;
				case 9:
					System.out.println("종료합니다!");
					break;
				default:
					System.out.println("잘못 입력하셨습니다 다시입력해주세요!");
			}
	}
	
	
	
	
	public void studentMenu() {
		System.out.println("1.학생 추가");
		System.out.println("2.학생 보기");
		System.out.println("9.메인으로");
		System.out.println("");
		System.out.println("메뉴 번호 : ");
		int select = sc.nextInt();

		switch(select) {
			case 1:
				insertStudent();
				break;
			case 2:
				printStudent();
				break;
			case 9:
				mainMenu();
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요!");
		}
	}
	
	public void employeeMenu() {
		System.out.println("1.사원 추가");
		System.out.println("2.사원 보기");
		System.out.println("9.메인으로");
		System.out.println("");
		System.out.println("메뉴 번호 : ");
		int select = sc.nextInt();

		switch(select) {
			case 1:
				insertEmployee();
				break;
			case 2:
				printEmployee();
				break;
			case 9:
				mainMenu();
				break;
			default:
				System.out.println("잘못 입력하셨습니다. 다시 입력해주세요!");
		}
		
	}
	
	public void insertStudent() {
		System.out.println("학생 이름 : ");
		String name = sc.next();
		System.out.println("학생 나이 : ");
		int age = sc.nextInt();
		System.out.println("학생 키 : ");
		double height = sc.nextDouble();
		System.out.println("학생 몸무게 : ");
		double weight = sc.nextDouble();
		System.out.println("학생 학년 : ");
		int grade = sc.nextInt();
		System.out.println("학생 전공 : ");
		String major = sc.next();

	}
	
	public void printStudent() {}
	
	public void insertEmployee() {
		System.out.println("사원 이름 : ");
		String name = sc.next();
		System.out.println("사원 나이 : ");
		int age = sc.nextInt();
		System.out.println("사원 키 : ");
		double height = sc.nextDouble();
		System.out.println("사원 몸무게 : ");
		double weight = sc.nextDouble();
		System.out.println("사원 급여 : ");
		int grade = sc.nextInt();
		System.out.println("사원 부서 : ");
		String major = sc.next();
	}
	
	public void printEmployee() {}
	
	
	
/*


+mainMenu():void
메인 메뉴를 출력하는 메소드
+studentMenu():void
학생 메뉴를 출력하는 메소드
+employeeMenu():void
사원 메뉴를 출력하는 메소드
+insertStudent():void
사용자에게 객체배열에 저장할 학생 데이터를 받는 메소드
+printStudent():void
객체배열에 저장된 학생 데이터를 출력하는 메소드
+insertEmployee():void
사용자에게 객체배열에 저장할 사원 데이터를 받는 메소드
+printEmployee():void
객체배열에 저장된 사원 데이터를 출력하는 메소드

*/
}
