package test1;

public class testcontroller {
	private testmodel[] cArray = new testmodel[5];
	private final int CUT_LINE = 60;
	
	
	public testcontroller() {
		cArray[0] = new testmodel("김길동", "자바", 100);
		cArray[1] = new testmodel("박길동", "디비", 50);
		cArray[2] = new testmodel("이길동", "화면", 85);
		cArray[3] = new testmodel("정길동", "서버", 60);
		cArray[4] = new testmodel("홍길동", "자바", 20);		
	}
	
	public testmodel[] printtest() {
		return cArray;	
	}
	public int sumScore() {
		int sum = 0;
		for(int a = 0; a < cArray.length; a++) {
			sum += cArray[a].getScore();
		}
		return sum;
	}
}
