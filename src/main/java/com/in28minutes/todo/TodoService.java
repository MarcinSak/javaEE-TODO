package com.in28minutes.todo;

import java.util.ArrayList;
import java.util.List;

public class TodoService
{
	private int todoID=4;
	private static List<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("Learn Web Application Development", 1, "Study"));
		todos.add(new Todo("Learn Spring MVC", 2, "Study"));
		todos.add(new Todo("Learn Rest Services", 3, "Study"));
	}
	
	public List<Todo> retriveTodos(){
		return todos;
	}
	public void addTodo(Todo todo) {
		this.todoID++;
		todos.add(todo);
	}
	public void deleteTodo(int id) {
		for(Todo t: todos) 
			if(t.getId() == id) {
				todos.remove(t);
				break;
			}
	}
	public int nextID() {
		return todoID;
	}
}
