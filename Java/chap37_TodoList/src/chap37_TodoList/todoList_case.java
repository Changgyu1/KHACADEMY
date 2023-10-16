package chap37_TodoList;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class todoList_case {

	
	public static void main(String[] args) {
		Map<Integer, String> todoMap = new HashMap<>();
		int taskNum = 1;
		
		Scanner sc = new Scanner(System.in);
		
		//���� ���
		
		while(true) {
			System.out.println("���ϸ�� : ");
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
					System.out.println("�߰� �� �� : ");
					String todoItem = sc.nextLine();
					todoMap.put(taskNum++, todoItem);
					System.out.println("�� ���� �߰��Ǿ����ϴ�.");
					break;
				case 2:
					System.out.println("���� �� �� : ");
					int todoRemove = sc.nextInt();
					if(todoMap.containsKey(todoRemove)) {
						todoMap.remove(todoRemove);
						System.out.println("�� ���� ���ŵǾ����ϴ�.");
					} else {
						System.out.println("�߸��� ��ȣ �Դϴ�.");
					}
					break;
				case 3:
					System.out.println("���α׷��� ����Ǿ����ϴ�.");
					sc.close();
					System.exit(0);
					break;
				default:
					System.out.println("�߸��� �Է��Դϴ�.");
			}
		}

	}

}
