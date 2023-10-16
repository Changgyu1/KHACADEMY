package com.kh.practice1.voidnArray;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.StringTokenizer;

public class VoidNReturn {
	
	public void practice1() {
		//�� ���� �� ���
		 Scanner scanner = new Scanner(System.in);
	       
			System.out.println("ù ��° ���ڸ� �Է����ּ���!");
			int num1 = scanner.nextInt();
			System.out.println("�� ��° ���ڸ� �Է����ּ���!");
			int num2 = scanner.nextInt();

			int sum = num1 + num2;
			System.out.println("�� ���� �� : " + sum);

		}

	public void practice2() {
		Scanner scanner = new Scanner(System.in);
        System.out.println("���ڸ� �Է����ּ���!");
        int n = scanner.nextInt();

        int factorial = 1;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println("1���� " + n + "������ �� : " + factorial);
       
	    
	}

	public void practice3() {
		 Scanner scanner = new Scanner(System.in);
	     System.out.println("�����Է�! (�Ųٷ� ��µ�)");
	     String input = scanner.nextLine();

	     String reversed = new StringBuilder(input).reverse().toString();
	     System.out.println(reversed);
	     
	}

	public void practice4() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է�");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];
        int sum = 0;

       
        for (int i = 0; i < size; i++) {
        	System.out.println((i+1) + " ��° ���� �Է�");
            numbers[i] = scanner.nextInt();
            sum += numbers[i];

        }
        System.out.println(size + "�� ������ ���� : " + sum);
        
	}

	public void practice5() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("���� �Է�");
        int size = scanner.nextInt();
        
        int[] numbers = new int[size];

       
        for (int i = 0; i < size; i++) {
        	System.out.println((i+1) + " ��° ���� �Է�");
            numbers[i] = scanner.nextInt();
        }

        int max = numbers[0];
        for (int i = 1; i < size; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        System.out.println("���� ū ���� : " + max);
	        
	        
	}

	public void practice6() {
		Scanner scanner = new Scanner(System.in);
		
        System.out.println("���ڸ� �Է����ּ���! / �Ҽ� �Ǻ�");
        int num = scanner.nextInt();
        
        boolean isPrime = isPrimeNumber(num);
        
        if (isPrime) {
        	System.out.println("�Ҽ��Դϴ�.");
        } else {
        	System.out.println("�Ҽ����ƴմϴ�.");
 
        }
    }
	public boolean isPrimeNumber(int num) {
		if (num <= 1) {
			System.out.println("2�̻��� ���ڸ� �Է����ּ���!");
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
    	/*���� ����� (���� ��� ��ȯ):

    	�޼��� �̸�: calculate

    	�Ű�����: �� ���� �Ǽ�(double Ÿ��) num1�� num2, �׸��� ������(String Ÿ��) operator
    	���: num1�� num2�� operator�� ���� ���ϱ�, ����, ���ϱ�, ������ ������ �����ϰ� ����� ��ȯ��.
    */
		Scanner sc = new Scanner(System.in);
		boolean isTrue = false;
		double num1, num2;
		String operator;
		System.out.println("ù ��° ���ڸ� �Է����ּ���");
		num1 = sc.nextDouble();
		System.out.println("�� ��° ���ڸ� �Է����ּ���");
		num2 = sc.nextDouble();
		
		while(!isTrue) {
			
			System.out.println("�����ڸ� �Է����ּ��� ( + , - , * , / , % )");
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
					System.out.println("�����ڴ� ( + , - , * , / , % ) �� �ϳ��� �Է����ּ���! ");
					isTrue = false;
					
			}
		}
		

    }

	public void countWords() {
    	/*
    	�ܾ� ���� ����:

    	�޼��� �̸�: countWords

    	�Ű�����: ���ڿ�(String Ÿ��) text
    	���: �Էµ� ���ڿ����� ������ �������� �ܾ��� ������ ���� ����� �����(void ���� Ÿ��).
    */
		Scanner sc = new Scanner(System.in);
		int count = 0;
		System.out.println("�ܾ �Է����ּ���!");
		String input = sc.nextLine();
		StringTokenizer tokenizer = new StringTokenizer(input);
		System.out.println(tokenizer.countTokens());
	}
	public void printTriangle() {
    	/*
    	�ﰢ�� �� ���:

    	�޼��� �̸�: printTriangle

    	�Ű�����: ���� ����(int Ÿ��) height
    	���: ���̰� height�� �ﰢ�� ����� ���� �����(void ���� Ÿ��).
    */
		Scanner sc = new Scanner(System.in);
		System.out.println("���� ������ �Է����ּ���");
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
    	�ζ� ��ȣ ������:
    	Random
    	�޼��� �̸�: generateLottoNumbers

    	�Ű�����: �ζ� ��ȣ�� ����(int Ÿ��) count
    	���: �ߺ����� �ʴ� ������ �ζ� ��ȣ�� count��ŭ �����Ͽ� �����(void ���� Ÿ��).
    */
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		System.out.println("������ ������ �����ּ���!");
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