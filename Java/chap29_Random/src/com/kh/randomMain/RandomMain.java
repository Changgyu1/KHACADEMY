package com.kh.randomMain;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomMain {

	public static void main(String[] args) {
		RandomMain r = new RandomMain();
		System.out.println("======== Random ========");
		r.RandomExam();
		System.out.println("======== lotto ========");
		r.Lotto();
	}
	
	public void RandomExam() {
		Random rd = new Random(); // 랜덤 객체 생성

		// 1. 정수 범위 내에서 랜덤인 난수를 만들어야 겠다.
		int ranInt = rd.nextInt(100); // 0 ~ 99 사이에서 1개
		System.out.println(ranInt);
		
		// 2. 실수 범위 내에서 랜덤인 난수를 만들어야 겠다.
		double ranD = rd.nextDouble(); // 0.0 ~ 1.0
		System.out.println(ranD);
		
		// 3. 불리언 값 랜덤으로 생성
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);	
	}
	
	public void Lotto() {
		
		Random rd = new Random();
		// ArrayList 사용해서 장바구니로 담기
		List<Integer> lottoNum = new ArrayList<>();
		// 중복을 피하기 위해 set을 사용할 수 있음
		// 6 숫자 만 들어갈 것
		while(lottoNum.size() < 6) { // 0, 1, 2, 3, 4, 5 
			// 1 ~ 45 범위를 지정해서 난수 생성		
			int ranNumbers = rd.nextInt(45) + 1; // 1 ~ 45\ 자리의 랜덤으로 번호 하나
			// int ranNumbers = rd.nextInt(45); // 0 ~ 44 자리의 랜덤으로 번호 하나
			
			// 존재하는 여부 중복x
			//중복된 값이 list에 저장될 수 있음
			if(!lottoNum.contains(ranNumbers)) { // !가 사라지면 값이 존재할 때만 list에 저장되는 것이기 때문에 무한루프 
			lottoNum.add(ranNumbers);
			
			}
		}
		System.out.print(lottoNum);	
	}
	
	
	
	

}
