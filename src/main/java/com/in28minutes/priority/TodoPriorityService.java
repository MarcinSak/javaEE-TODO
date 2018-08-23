package com.in28minutes.priority;

import java.util.ArrayList;
import java.util.List;

public class TodoPriorityService
{
	static List<TodoPriority> todoPriority = new ArrayList<TodoPriority>();
	
	static {
		todoPriority.add(new TodoPriority(1));
		todoPriority.add(new TodoPriority(2));
		todoPriority.add(new TodoPriority(3));
		todoPriority.add(new TodoPriority(4));
	}
	
	public List<TodoPriority> getPriorityOptions() {
		return todoPriority;
	}
	
}