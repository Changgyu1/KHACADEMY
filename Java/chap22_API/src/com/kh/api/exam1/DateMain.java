package com.kh.api.exam1;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class DateMain {
/*

	Date : ��¥�� �ð� ������ ��Ÿ���µ� ���
			java1.1 ���� ������� ����
				java.time ��Ű�� LocalDate, LocalTime, LocalDateTime

*/
	public static void main(String[] args) {
		// LocalDate | ���� ��¥ ���
		LocalDate currentDate = LocalDate.now();
		System.out.println("���� ��¥ : " + currentDate);
		
		// LocalTime | ���� �ð� ���
		LocalTime currentTime = LocalTime.now();
		System.out.println("���� �ð� : " + currentTime);
		System.out.println("���� �ð� : " + currentTime.getHour() + "�� " + currentTime.getMinute() + "�� " + currentTime.getSecond() + "��");
		
		// LocalDateTime | ���� ��¥ �ð� ���
		LocalDateTime currentDateTime = LocalDateTime.now();
		System.out.println("���� ��¥�� �ð� : " + currentDateTime);
		
		//��¥ ���
		LocalDate today = LocalDate.now();
		LocalDate futureDate = today.plusDays(7);
		System.out.println("7�� �� ��¥ : " + futureDate);
		
		//minus plus �̿��ؼ� �� 2���� ������ �� 4��
		LocalDate MinDate = today.minusMonths(1);
		System.out.println("1���� ��¥ : " + MinDate);
		MinDate = today.minusWeeks(2);
		System.out.println("2���� ��¥ : " + MinDate);
		
		MinDate = today.plusYears(1);
		System.out.println("1���� ��¥ : " + MinDate);
		MinDate = today.plusMonths(3);
		System.out.println("3���� ��¥ : " + MinDate);
		
		LocalDate date1 = LocalDate.of(2023, 9, 13);
		LocalDate date2 = LocalDate.of(2023, 9, 13);
		//date1.isBefore(date2)
		//date1.isAfter(date2)
		if(date1.isBefore(date2)) {
			//��¸޼ҵ�
			System.out.println(date1 + "�� ��¥�� " + date2 + "�� ��¥���� �� �Դϴ�.");
		} else if (date1.isAfter(date2)) {
			//��¸޼ҵ�
			System.out.println(date1 + "�� ��¥�� " + date2 + "�� ��¥���� �� �Դϴ�.");
		} else {
			//��¸޼ҵ�
			System.out.println(date1 + "�� ��¥�� " + date2 + "�� ��¥�� �����ϴ�.");
		}
		
	}

}
