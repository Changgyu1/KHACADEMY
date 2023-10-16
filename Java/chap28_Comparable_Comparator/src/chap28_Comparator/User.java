package chap28_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class User implements Comparator<String> {
	@Override
	public int compare(String name1, String name2) {
		if(name1.length() == name2.length()) {
			return 1;
		}else if(name1.length() > name2.length()) {
			return 0;
		}else {
		return -1;
		}
	}

	public static void main(String[] args) {
		List<String> str = new ArrayList<>();
		
		str.add("�����ٶ�");
		str.add("��������");
		str.add("�����̿�");
		str.add("����");
		str.add("��");
		str.add("��");
		str.add("��");
		Collections.sort(str, String.CASE_INSENSITIVE_ORDER);
		Collections.sort(str,new User());
		for(String a : str) {
			System.out.println(a);
		}
	}



}
