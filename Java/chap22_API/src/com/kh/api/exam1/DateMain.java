package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*

	Date : 날짜와 시간 정보를 나타내는데 사용
			java1.1 이후 권장되지 않음
				java.time 패키지 LocalDate, LocalTime, LocalDateTime

*/
	public static void main(String[] args) {
		// LocalDate | 현재 날짜 출력
		LocalDate currentDate = LocalDate.now();
		System.out.println("현재 날짜 : " + currentDate);
		
		// LocalTime | 현재 시간 출력
		LocalTime currentTime = LocalTime.now();
		System.out.println("현재 시간 : " + currentTime);
		System.out.println("현재 시간 : " + currentTime.getHour() + "시 " + currentTime.getMinute() + "분 " + currentTime.getSecond() + "초");
		
		// LocalDateTime | 현재 날짜 시간 출력
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("현재 날짜와 시간 : " + currentDateTime);
		
		//날짜 계산
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7일 후 날짜 : " + futureDate);
		
		//minus plus 이용해서 각 2개씩 만들어보기 총 4개
		LocalDate MinDate = today.minusMonths(1);
		System.out.println("1달전 날짜 : " + MinDate);
		MinDate = today.minusWeeks(2);
		System.out.println("2주전 날짜 : " + MinDate);
		
		MinDate = today.plusYears(1);
		System.out.println("1년후 날짜 : " + MinDate);
		MinDate = today.plusMonths(3);
		System.out.println("3달후 날짜 : " + MinDate);
		
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 9, 13);
		//date1.isBefore(date2)
		//date1.isAfter(date2)
		if(date1.isBefore(date2)) {
			//출력메소드
			System.out.println(date1 + "의 날짜는 " + date2 + "의 날짜보다 뒤 입니다.");
		} else if (date1.isAfter(date2)) {
			//출력메소드
			System.out.println(date1 + "의 날짜는 " + date2 + "의 날짜보다 앞 입니다.");
		} else {
			//출력메소드
			System.out.println(date1 + "의 날짜는 " + date2 + "의 날짜와 같습니다.");
		}
		
	}

}
