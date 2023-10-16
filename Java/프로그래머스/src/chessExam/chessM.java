package chessExam;

public class chessM {
	private boolean isTrue = false;
	private int black = 1;
	private String sel;
	public String getSel() {
		return sel;
	}

	public void setSel(String sel) {
		this.sel = sel;
	}

	public String getSel2() {
		return sel2;
	}

	public void setSel2(String sel2) {
		this.sel2 = sel2;
	}

	private String sel2;
	private String blank = "□";
	private String KingB = "♠";
	private String KingW = "♤";
	private String Bpon = "▲";
	private String Wpon = "▽";
	private String[][] che = { { blank, blank, blank, KingW, blank, blank, blank, blank },
			{ Wpon, Wpon, Wpon, Wpon, Wpon, Wpon, Wpon, Wpon },
			{ blank, blank, blank, blank, blank, blank, blank, blank },
			{ blank, blank, blank, blank, blank, blank, blank, blank },
			{ blank, blank, blank, blank, blank, blank, blank, blank },
			{ blank, blank, blank, blank, blank, blank, blank, blank },
			{ Bpon, Bpon, Bpon, Bpon, Bpon, Bpon, Bpon, Bpon },
			{ blank, blank, blank, KingB, blank, blank, blank, blank } };

	public boolean isTrue() {
		return isTrue;
	}

	public void setTrue(boolean isTrue) {
		this.isTrue = isTrue;
	}

	public int getBlack() {
		return black;
	}

	public void setBlack(int black) {
		this.black = black;
	}

	public String getBlank() {
		return blank;
	}

	public void setBlank(String blank) {
		this.blank = blank;
	}

	public String getKingB() {
		return KingB;
	}

	public void setKingB(String kingB) {
		KingB = kingB;
	}

	public String getKingW() {
		return KingW;
	}

	public void setKingW(String kingW) {
		KingW = kingW;
	}

	public String getBpon() {
		return Bpon;
	}

	public void setBpon(String bpon) {
		Bpon = bpon;
	}

	public String getWpon() {
		return Wpon;
	}

	public void setWpon(String wpon) {
		Wpon = wpon;
	}

	public String[][] getChe() {
		return che;
	}

	public void setChe(String[][] che) {
		this.che = che;
	}
	
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
}
