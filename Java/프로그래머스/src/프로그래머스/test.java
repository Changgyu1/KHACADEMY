package 프로그래머스;

import java.util.Scanner;

public class test {


	public int asCll(String number) {
		int sel3 = (int) number.charAt(0); // 알파벳 아스키코드 변환
		sel3 = sel3 - 65;
		return sel3;
	}

	public int num(String b) {
		String sel2 = b.replaceAll("[^0-9]", ""); // 숫자만 추출
		int num2 = Integer.parseInt(sel2); // 추출값 인트로 변환
		return num2;
	}

	public static void main(String[] args) {
		test run = new test();
		boolean isTrue = false;
		int black = 1;
		String blank = "□";
		String KingB = "♠";
		String KingW = "♤";
		String Bpon = "▲";
		String Wpon = "▽";
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
			System.out.println("==== 기본셋팅 ====");
			for (int i = 0; i < che.length; i++) {
				ah[i] = (char) (i + 65);
				for (int a = 0; a < che[i].length; a++) {
					System.out.print(che[i][a] + " ");

				}
				System.out.println(ah[i]);
			} // 기본 셋팅

			if (black == 1) {
				System.out.println("흑 차례");
				System.out.println("말을 선택해주세요 ex) F3");
				String sel = sc.next(); // 말 선택
				String sel2;
				if (che[run.asCll(sel)][run.num(sel)] != blank) {
					if (che[run.asCll(sel)][run.num(sel)] == KingB) {
						System.out.println("킹이 선택되었습니다.");
						System.out.println("이동하실 위치를 적어주세요!");
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
							System.out.println("이동되었습니다.");
							black = 0;
						} else{
							System.out.println("해당자리로는 이동할 수 없습니다. | 1칸 씩만 가능");
						}
					}else if(che[run.asCll(sel)][run.num(sel)] == Bpon) {
						System.out.println("폰이 선택되었습니다.");
						System.out.println("이동하실 위치를 적어주세요!");
						sel2 = sc.next();
						
						if(che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2) - 1][run.num(sel2)]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2)][run.num(sel2) - 1]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2) + 1][run.num(sel2)]
								|| che[run.asCll(sel)][run.num(sel)] == che[run.asCll(sel2)][run.num(sel2) + 1]) {
							che[run.asCll(sel)][run.num(sel)] = blank;
							che[run.asCll(sel2)][run.num(sel2)] = Bpon;
							System.out.println("이동되었습니다.");
							black = 0;
						}
					}
				} else {
					System.out.println("해당 자리에는 말이 없습니다.");
				}

			} else {
				System.out.println("백 차례");
				System.out.println("말을 선택해주세요 ex) F3");
				String sel = sc.next(); // 말 선택
				if (che[run.asCll(sel)][run.num(sel)] != blank) {
					if (che[run.asCll(sel)][run.num(sel)] == KingW) {
						System.out.println("킹이 선택되었습니다.");
						System.out.println("이동하실 위치를 적어주세요!");
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
							System.out.println("이동되었습니다.");
							black = 1;
						} else {
							System.out.println("해당자리로는 이동할 수 없습니다. | 1칸 씩만 가능");
						}
					}
				} else {
					System.out.println("해당 자리에는 말이 없습니다.");
				}
			}
		}
	}
}
	

