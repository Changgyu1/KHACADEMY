package chap37_TodoList;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class todoHash {
	private Set<String> tasks = new HashSet<>();

	
	public void addTask(String task) {
		tasks.add(task);
	}
	
	public void removetask() {
		if(tasks.size() > 0) {
			tasks.removeAll(tasks);
		}else {
			System.out.println("삭제할 목록이 없습니다.");
		}
	}
	
	public void displayTasks() {
		int count = 1;
		System.out.println("My TodoList");
		for(String a : tasks) {
			System.out.println(count + ". "+ a);
			count++;
		
		}
	}


	public static void main(String[] args) {
		todoHash todoList = new todoHash();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("할일 추가:add, 삭제:remove, 할일보기:list, "
					+ "종료:exit 입력하세요!");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("할 일을 입력하세요");
				String taskc = sc.nextLine();
				todoList.addTask(taskc);
			}else if (choice.equalsIgnoreCase("remove")) {
					todoList.removetask();
					System.out.println("삭제되었습니다.");
			
			}else if(choice.equalsIgnoreCase("list")) {
				todoList.displayTasks();
			}else if (choice.equalsIgnoreCase("exit")) {
				break;
			}else {
				System.out.println("잘못된 명령어입니다.");
			}
		}
		System.out.println("어플리케이션 종료!");
		sc.close();
	}


}