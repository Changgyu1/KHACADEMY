package com.kh.practice1.voidnArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class VoidNReturn {
	
	public void practice1() {
		//두 수의 합 계산
		 Scanner scanner = new Scanner(System.in);
	       
			System.out.println("첫 번째 숫자를 입력해주세요!");
			int num1 = scanner.nextInt();
			System.out.println("두 번째 숫자를 입력해주세요!");
			int num2 = scanner.nextInt();

			int sum = num1 + num2;
			System.out.println("두 수의 합 : " + sum);

		}

	public void practice2() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("숫자를 입력해주세요!");
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("1부터 " + n + "까지의 합 : " + factorial);
       
	    
	}

	public void practice3() {
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("문자입력! (거꾸로 출력됨)");
	     String input = scanner.nextLine();

	     String reversed = new StringBuilder(input).reverse().toString();
	     System.out.println(reversed);
	     
	}

	public void practice4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 입력");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        int sum = 0;

       
        for (int i = 0; i < size; i++) {
        	System.out.println((i+1) + " 번째 숫자 입력");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];

        }
        System.out.println(size + "개 정수의 합은 : " + sum);
        
	}

	public void practice5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("숫자 입력");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];

       
        for (int i = 0; i < size; i++) {
        	System.out.println((i+1) + " 번째 숫자 입력");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("가장 큰 숫자 : " + max);
	        
	        
	}

	public void practice6() {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("숫자를 입력해주세요! / 소수 판별");
        int num = scanner.nextInt();
        
        boolean isPrime = isPrimeNumber(num);
        
        if (isPrime) {
        	System.out.println("소수입니다.");
        } else {
        	System.out.println("소수가아닙니다.");
 
        }
    }
	public boolean isPrimeNumber(int num) {
		if (num <= 1) {
			System.out.println("2이상의 숫자를 입력해주세요!");
			return false;
		}

		for (int i = 2; i <= Math.sqrt(num); i++) {
			if (num % i == 0) {
				return false;
			} 
		}
		return true;
	}

	public void calculate() {
    	/*계산기 만들기 (연산 결과 반환):

    	메서드 이름: calculate

    	매개변수: 두 개의 실수(double 타입) num1과 num2, 그리고 연산자(String 타입) operator
    	기능: num1과 num2를 operator에 따라 더하기, 빼기, 곱하기, 나누기 연산을 수행하고 결과를 반환함.
    */
		Scanner sc = new Scanner(System.in);
		boolean isTrue = false;
		double num1, num2;
		String operator;
		System.out.println("첫 번째 숫자를 입력해주세요");
		num1 = sc.nextDouble();
		System.out.println("두 번째 숫자를 입력해주세요");
		num2 = sc.nextDouble();
		
		while(!isTrue) {
			
			System.out.println("연산자를 입력해주세요 ( + , - , * , / , % )");
			operator = sc.next();
			switch(operator) {
				case "+":
					System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
					isTrue = true;
					break;
				case "-":
					System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
					isTrue = true;
					break;
				case "*":
					System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
					isTrue = true;
					break;
				case "/":
					System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
					isTrue = true;
					break;
				case "%":
					System.out.println(num1 + " % " + num2 + " = " + (num1%num2));
					isTrue = true;
					break;
				default :
					System.out.println("연산자는 ( + , - , * , / , % ) 중 하나만 입력해주세요! ");
					isTrue = false;
					
			}
		}
		

    }

	public void countWords() {
    	/*
    	단어 개수 세기:

    	메서드 이름: countWords

    	매개변수: 문자열(String 타입) text
    	기능: 입력된 문자열에서 공백을 기준으로 단어의 개수를 세고 결과를 출력함(void 리턴 타입).
    */
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("단어를 입력해주세요!");
		String input = sc.nextLine();
		StringTokenizer tokenizer = new StringTokenizer(input);
		System.out.println(tokenizer.countTokens());
	}
	public void printTriangle() {
    	/*
    	삼각형 별 출력:

    	메서드 이름: printTriangle

    	매개변수: 양의 정수(int 타입) height
    	기능: 높이가 height인 삼각형 모양의 별을 출력함(void 리턴 타입).
    */
		Scanner sc = new Scanner(System.in);
		System.out.println("양의 정수를 입려해주세요");
		int height = sc.nextInt();
		for(int a = 0; a <= height; a++) {
			for(int k = 0; k < a; k++) {
				System.out.print("*");
			}
			System.out.println("");
		}
    }

	public void generateLottoNumbers() {
    	/*
    	로또 번호 생성기:
    	Random
    	메서드 이름: generateLottoNumbers

    	매개변수: 로또 번호의 개수(int 타입) count
    	기능: 중복되지 않는 무작위 로또 번호를 count만큼 생성하여 출력함(void 리턴 타입).
    */
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("뽑으실 갯수를 적어주세요!");
		int count = sc.nextInt();
		int[] lotto = new int[count];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45)+1;
			for(int a = 0; a < i; a++) {
				if(lotto[i] == lotto[a]) {
					i--;
					break;
				}
			}
		}
		for(int a : lotto) {
			System.out.print(a + " ");
		}

		
		

    }
}