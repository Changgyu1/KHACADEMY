package 프로그래머스;

import java.util.Arrays;

public class sysou {
	
	public static void main(String[] args) {
		int divisor = 5;
		int[] arr = {3,2,6};
		
		int count = 0;
		int[] answer = new int [arr.length];
        
        for(int a : arr){
        	if(a % divisor == 0) {
        		answer[count] = a;
        		count++;
        	}

        }
        for(int s : answer) {
        	System.out.println(s
        			);
        }
	}
}
