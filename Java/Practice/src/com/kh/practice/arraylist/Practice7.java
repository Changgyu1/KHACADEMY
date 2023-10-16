package com.kh.practice.arraylist;

import java.util.Scanner;

public class Practice7 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("행의 크기 : ");
		int numRows = sc.nextInt();
		sc.nextLine();
		
		int[][] charArray = new int[numRows][];
		
		for(int i = 0; i < numRows; i++) {
			System.out.println(i + "열의 크기 받기 :");
			int numCols = sc.nextInt();
			
			charArray[i] = new int[numCols];
			
			int startValue = i * numCols + 1;
			for(int a = 0; a < numCols; a++) {
				charArray[i][a] = startValue++;
			}
		}
			for(int i = 0; i < numRows; i++) {
				for(int a = 0; a < charArray[i].length; a++) {
					System.out.print((char)('a' + charArray[i][a]-1));
				}
				System.out.println();
			}
			
		

	}

}
