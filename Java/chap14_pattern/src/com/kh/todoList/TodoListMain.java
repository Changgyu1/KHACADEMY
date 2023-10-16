package com.kh.todoList;

public class TodoListMain {

	public static void main(String[] args) {
		
		TodoListModel tdmodel = new TodoListModel("¾ÆÄ§¸Ô±â!");
		TodoListView tdView = new TodoListView();

		System.out.println(tdmodel.getItem());
		tdView.displayTodoList("¾ÆÄ§¹ä");
		System.out.println();
	}

}
