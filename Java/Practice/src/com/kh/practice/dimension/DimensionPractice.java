package com.kh.practice.dimension;

public class DimensionPractice {
	int[][] num = new int[5][5];
	int num1 = 1;
	public DimensionPractice() {

	}

	public void practice1() {
		for (int i = 0; i < num.length; i++) {
			for (int a = 0; a < num[i].length; a++)
				System.out.print("(" + i + "," + a + ")");
			System.out.println();
		}
	}
	
	public void practice2() { //�迭�� ������ ù��° �� num�� �����ϰ� �ʱ�ȭ�Ѵ�.
		for(int i = 0; i < num.length; i++) { //�迭num�� ���� ���̸�ŭ �ݺ����� ����ȴ�
			for(int k = 0; k < num[i].length; k++) { //�迭num[i]�� ���� ���̸�ŭ �ݺ����� ����ȴ�
				num[i][k] = num1; // num[i][k]�� num1�� �����Ѵ�
				System.out.print(num[i][k] + " "); //�迭 num�� ����ִ� ���ڸ� ����Ѵ�
				num1++; // num1�� 1 ������Ų��
			}
			System.out.println(); //���� �ٲ۴�
		}
	}
}
