package ���α׷��ӽ�;

import java.util.Scanner;

public class test {


	public int asCll(String number) {
		int sel3 = (int) number.charAt(0); // ���ĺ� �ƽ�Ű�ڵ� ��ȯ
		sel3 = sel3 - 65;
		return sel3;
	}

	public int num(String b) {
		String sel2 = b.replaceAll("[^0-9]", ""); // ���ڸ� ����
		int num2 = Integer.parseInt(sel2); // ���Ⱚ ��Ʈ�� ��ȯ
		return num2;
	}

	public static void main(String[] args) {
		test run = new test();
		boolean isTrue = false;
		int black = 1;
		String blank = "��";
		String KingB = "��";
		String KingW = "��";
		String Bpon = "��";
		String Wpon = "��";
		char[] ah = new char[8];
		boolean gameSet = false;
		Scanner sc = new Scanner(System.in);
		String[][] che = { { blank, blank, blank, KingW, blank, blank, blank, blank },
				{ Wpon, Wpon, Wpon, Wpon, Wpon, Wpon, Wpon, Wpon },
				{ blank, blank, blank, blank, blank, blank, blank, blank },
				{ blank, blank, blank, blank, blank, blank, blank, blank },
				{ blank, blank, blank, blank, blank, blank, blank, blank },
				{ blank, blank, blank, blank, blank, blank, blank, blank },
				{ Bpon, Bpon, Bpon, Bpon, Bpon, Bpon, Bpon, Bpon },
				{ blank, blank, blank, KingB, blank, blank, blank, blank } };

		while (!isTrue) {
			System.out.println("==== �⺻���� ====");
			for (int i = 0; i < che.length; i++) {
				ah[i] = (char) (i + 65);
				for (int a = 0; a < che[i].length; a++) {
					System.out.print(che[i][a] + " ");

				}
				System.out.println(ah[i]);
			} // �⺻ ����

			if (black == 1) {
				System.out.println("�� ����");
				System.out.println("���� �������ּ��� ex) F3");
				String sel = sc.next(); // �� ����
				String sel2;
				if (che[run.asCll(sel)][run.num(sel)] != blank) {
					if (che[run.asCll(sel)][run.num(sel)] == KingB) {
						System.out.println("ŷ�� ���õǾ����ϴ�.");
						System.out.println("�̵��Ͻ� ��ġ�� �����ּ���!");
						sel2 = sc.next();

						if (che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2) - 1][run.num(sel2)]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2)][run.num(sel2) - 1]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2) + 1][run.num(sel2)]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2)][run.num(sel2) + 1]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2) - 1][run.num(sel2) - 1]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2) - 1][run.num(sel2) + 1]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2) + 1][run.num(sel2) - 1]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2) + 1][run.num(sel2) + 1]) {
							che[run.asCll(sel)][run.num(sel)] = blank;
							che[run.asCll(sel2)][run.num(sel2)] = KingB;
							System.out.println("�̵��Ǿ����ϴ�.");
							black = 0;
						} else{
							System.out.println("�ش��ڸ��δ� �̵��� �� �����ϴ�. | 1ĭ ���� ����");
						}
					}else if(che[run.asCll(sel)][run.num(sel)] == Bpon) {
						System.out.println("���� ���õǾ����ϴ�.");
						System.out.println("�̵��Ͻ� ��ġ�� �����ּ���!");
						sel2 = sc.next();
						
						if(che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2) - 1][run.num(sel2)]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2)][run.num(sel2) - 1]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2) + 1][run.num(sel2)]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2)][run.num(sel2) + 1]) {
							che[run.asCll(sel)][run.num(sel)] = blank;
							che[run.asCll(sel2)][run.num(sel2)] = Bpon;
							System.out.println("�̵��Ǿ����ϴ�.");
							black = 0;
						}
					}
				} else {
					System.out.println("�ش� �ڸ����� ���� �����ϴ�.");
				}

			} else {
				System.out.println("�� ����");
				System.out.println("���� �������ּ��� ex) F3");
				String sel = sc.next(); // �� ����
				if (che[run.asCll(sel)][run.num(sel)] != blank) {
					if (che[run.asCll(sel)][run.num(sel)] == KingW) {
						System.out.println("ŷ�� ���õǾ����ϴ�.");
						System.out.println("�̵��Ͻ� ��ġ�� �����ּ���!");
						String sel2 = sc.next();

						if (che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2) - 1][run.num(sel2)]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2)][run.num(sel2) - 1]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2) + 1][run.num(sel2)]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2)][run.num(sel2) + 1]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2) - 1][run.num(sel2) - 1]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2) - 1][run.num(sel2) + 1]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2) + 1][run.num(sel2) - 1]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2) + 1][run.num(sel2) + 1]) {
							che[run.asCll(sel)][run.num(sel)] = blank;
							che[run.asCll(sel2)][run.num(sel2)] = KingW;
							System.out.println("�̵��Ǿ����ϴ�.");
							black = 1;
						} else {
							System.out.println("�ش��ڸ��δ� �̵��� �� �����ϴ�. | 1ĭ ���� ����");
						}
					}
				} else {
					System.out.println("�ش� �ڸ����� ���� �����ϴ�.");
				}
			}
		}
	}
}
	

