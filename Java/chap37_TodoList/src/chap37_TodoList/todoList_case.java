package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class todoList_case {

	
	public static void main(String[] args) {
		Map<Integer, String> todoMap = new HashMap<>();
		int taskNum = 1;
		
		Scanner sc = new Scanner(System.in);
		
		//할일 목록
		
		while(true) {
			System.out.println("할일목록 : ");
			for(Map.Entry<Integer, String> entry : todoMap.entrySet()) {
				System.out.println(entry.getKey() + " : " + entry.getValue());
			}

			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch(choice) {
				case 1:
					if(todoMap.size() == 0) {
						taskNum = 1;
					}
					System.out.println("추가 할 일 : ");
					String todoItem = sc.nextLine();
					todoMap.put(taskNum++, todoItem);
					System.out.println("할 일이 추가되었습니다.");
					break;
				case 2:
					System.out.println("제거 할 일 : ");
					int todoRemove = sc.nextInt();
					if(todoMap.containsKey(todoRemove)) {
						todoMap.remove(todoRemove);
						System.out.println("할 일이 제거되었습니다.");
					} else {
						System.out.println("잘못된 번호 입니다.");
					}
					break;
				case 3:
					System.out.println("프로그램이 종료되었습니다.");
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("잘못된 입력입니다.");
			}
		}

	}

}
