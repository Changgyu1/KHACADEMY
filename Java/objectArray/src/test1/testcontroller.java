package test1;

public class testcontroller {
	private testmodel[] cArray = new testmodel[5];
	private final int CUT_LINE = 60;
	
	
	public testcontroller() {
		cArray[0] = new testmodel("��浿", "�ڹ�", 100);
		cArray[1] = new testmodel("�ڱ浿", "���", 50);
		cArray[2] = new testmodel("�̱浿", "ȭ��", 85);
		cArray[3] = new testmodel("���浿", "����", 60);
		cArray[4] = new testmodel("ȫ�浿", "�ڹ�", 20);		
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
