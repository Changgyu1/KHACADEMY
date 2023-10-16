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
			System.out.println("������ ����� �����ϴ�.");
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
			System.out.println("���� �߰�:add, ����:remove, ���Ϻ���:list, "
					+ "����:exit �Է��ϼ���!");
			String choice = sc.nextLine();
			if(choice.equalsIgnoreCase("add")) {
				System.out.println("�� ���� �Է��ϼ���");
				String taskc = sc.nextLine();
				todoList.addTask(taskc);
			}else if (choice.equalsIgnoreCase("remove")) {
					todoList.removetask();
					System.out.println("�����Ǿ����ϴ�.");
			
			}else if(choice.equalsIgnoreCase("list")) {
				todoList.displayTasks();
			}else if (choice.equalsIgnoreCase("exit")) {
				break;
			}else {
				System.out.println("�߸��� ��ɾ��Դϴ�.");
			}
		}
		System.out.println("���ø����̼� ����!");
		sc.close();
	}


}