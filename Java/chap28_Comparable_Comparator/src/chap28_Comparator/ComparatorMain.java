package chap28_Comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorMain implements Comparator<String>{
	
	
	@Override
	public int compare(String num1, String num2) {
		// 길이가 같으면 0 반환
		if(num1.length() == num2.length()) {
			return 0;
		} else if(num1.length()>num2.length()) {
			// num1이 num2 보다 길면 양수 반환
			return 1;
		}else {
		//num 1이 num2 보다 짧으면 음수
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
		//Comparator를 사용해서 문자열을 정렬 1. 길이 2. 순서
		str.toArray();
		
		Collections.sort(str, String.CASE_INSENSITIVE_ORDER);
		Collections.sort(str, new ComparatorMain());
		
		//정렬된 결과 출력
		for(String s : str) {
			System.out.println(s);
		}
	}



}

