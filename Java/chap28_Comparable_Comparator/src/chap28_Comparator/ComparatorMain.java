package chap28_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain implements Comparator<String>{
	
	
	@Override
	public int compare(String num1, String num2) {
		// ���̰� ������ 0 ��ȯ
		if(num1.length() == num2.length()) {
			return 0;
		} else if(num1.length()>num2.length()) {
			// num1�� num2 ���� ��� ��� ��ȯ
			return 1;
		}else {
		//num 1�� num2 ���� ª���� ����
			return -1;
		}
		
	}

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		
		str.add("cc");
		str.add("aa");
		str.add("ee");
		str.add("ddd");
		str.add("aaa");
		//Comparator�� ����ؼ� ���ڿ��� ���� 1. ���� 2. ����
		str.toArray();
		
		Collections.sort(str, String.CASE_INSENSITIVE_ORDER);
		Collections.sort(str, new ComparatorMain());
		
		//���ĵ� ��� ���
		for(String s : str) {
			System.out.println(s);
		}
	}



}

