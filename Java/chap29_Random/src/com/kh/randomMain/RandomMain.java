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
		Random rd = new Random(); // ���� ��ü ����

		// 1. ���� ���� ������ ������ ������ ������ �ڴ�.
		int ranInt = rd.nextInt(100); // 0 ~ 99 ���̿��� 1��
		System.out.println(ranInt);
		
		// 2. �Ǽ� ���� ������ ������ ������ ������ �ڴ�.
		double ranD = rd.nextDouble(); // 0.0 ~ 1.0
		System.out.println(ranD);
		
		// 3. �Ҹ��� �� �������� ����
		boolean ranB = rd.nextBoolean();
		System.out.println(ranB);	
	}
	
	public void Lotto() {
		
		Random rd = new Random();
		// ArrayList ����ؼ� ��ٱ��Ϸ� ���
		List<Integer> lottoNum = new ArrayList<>();
		// �ߺ��� ���ϱ� ���� set�� ����� �� ����
		// 6 ���� �� �� ��
		while(lottoNum.size() < 6) { // 0, 1, 2, 3, 4, 5 
			// 1 ~ 45 ������ �����ؼ� ���� ����		
			int ranNumbers = rd.nextInt(45) + 1; // 1 ~ 45\ �ڸ��� �������� ��ȣ �ϳ�
			// int ranNumbers = rd.nextInt(45); // 0 ~ 44 �ڸ��� �������� ��ȣ �ϳ�
			
			// �����ϴ� ���� �ߺ�x
			//�ߺ��� ���� list�� ����� �� ����
			if(!lottoNum.contains(ranNumbers)) { // !�� ������� ���� ������ ���� list�� ����Ǵ� ���̱� ������ ���ѷ��� 
			lottoNum.add(ranNumbers);
			
			}
		}
		System.out.print(lottoNum);	
	}
	
	
	
	

}
