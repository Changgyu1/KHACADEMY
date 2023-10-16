package com.kh.practice1.rainbow;

import java.util.ArrayList;

public class RainbowMain {

	public static void main(String[] args) {
		
		ArrayList<String> color = new ArrayList<>();
		
		//ArrayList 이용해서 빨주노초파남보
		color.add("빨"); color.add("주"); color.add("노"); color.add("초");
		color.add("파"); color.add("남"); color.add("보");
		System.out.println("색상 : " + color);
		
		//수정 3회 1,3,5 ->블랙, 브라운, 그린 수정
		color.set(1, "블랙");
		color.set(3, "브라운");
		color.set(5, "그린");
		System.out.println("수정 후 색상 : " + color);
		
		//더하기 2회 ->주황, [옐로우],파랑,[연한파랑]
		color.add(2, "옐로우"); color.add(6, "연한파랑");
		System.out.println("더하기 후 색상 : " + color);
		
		//향상된 for문 이용해서 색상 출력하기
		System.out.println("- 색상 출력 -");
		for(String col : color) {
			System.out.println(col);
		}
		
		//최 후 출력 빨 파 보
		//1.인덱스 사용 출력
		System.out.println("인덱스 사용으로 출력");
		System.out.println("최 후 출력 : " + color.get(0) + ", " + color.get(5) + ", " + color.get(8));
		System.out.println("제거 후 출력");

		//3.제거 후 출력
		color.remove(1); color.remove(1); color.remove(1); color.remove(1); color.remove(2); color.remove(2);
		System.out.println("최 후 출력 : " + color.get(0) + ", " + color.get(1) + ", " + color.get(2));
		
		System.out.println("초기화 후 출력");
		//2.초기화 후 출력
		color.clear();
		color.add("빨"); color.add("파"); color.add("보");
		System.out.println("최 후 출력 : " + color.get(0) + ", " + color.get(1) + ", " + color.get(2));

	}

}