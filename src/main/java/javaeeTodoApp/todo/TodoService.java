package javaeeTodoApp.todo;

import java.util.ArrayList;
import java.util.List;

import javaeeTodoApp.priority.TodoPriority;
import javaeeTodoApp.time.TagretTime;

public class TodoService
{
	private int todoID=4;
	private static List<Todo> todos = new ArrayList<Todo>();
	private static List<Todo> todosForAnswer = new ArrayList<Todo>();

	static {
		todos.add(new Todo("Learn Web Application Development", 1, "Study", new TodoPriority(1), new TagretTime("", "12:12")));
		todos.add(new Todo("Learn Spring MVC", 2, "Study", new TodoPriority(2), new TagretTime("","")));
		todos.add(new Todo("Learn Rest Services", 3, "Study", new TodoPriority(4), new TagretTime("","")));
	}

	public List<Todo> retriveActiveTodos(){
		todosForAnswer.clear();
		for(Todo todo: todos) 
			if(todo.getState() == true)
				todosForAnswer.add(todo);

		return todosForAnswer;
	}
	
	public List<Todo> retriveNonActiveTodos(){
		todosForAnswer.clear();
		for(Todo todo: todos) {
			if(todo.getState() == false)
				todosForAnswer.add(todo);
		}
		return todosForAnswer;
	}
	public List<Todo> retriveAllTodos(){
		return todosForAnswer;
	}
	public Boolean addTodo(Todo todo) {
		if(!todo.getName().trim().equals("")) {
			this.todoID++;
			todos.add(todo);
			System.out.println("dodano nowe todo");
			return true;
		}
		else {
			System.err.println("nie dodano nowego todo");
			return false;
		}
	}
	public void deleteTodo(int id) {
		for(Todo t: todos) 
			if(t.getId() == id) {
				todos.remove(t);
				break;
			}
	}
	public void checkOutTodo(int id) {
		for(Todo t: todos) 
			if(t.getId() == id) {
				todos.get(id).setState(false);
				break;
			}
	}
	public int nextID() {
		return todoID;
	}
}
