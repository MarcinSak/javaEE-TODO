package com.in28minutes.todo;

import com.in28minutes.priority.TodoPriority;

public class Todo
{
	private String name;
	private int id;
	private String category;
	private Boolean state;
	private TodoPriority priority;
	
	public TodoPriority getPriority()
	{
		return priority;
	}

	public void setPriority(TodoPriority priority)
	{
		this.priority = priority;
	}

	public Todo(String name, int id, String category, TodoPriority priority) {
		super();
		this.name = name;
		this.id = id;
		this.category = category;
		this.state = true;
		this.priority = priority;
	}

	public String getCategory()
	{
		return category;
	}

	public void setCategory(String category)
	{
		this.category = category;
	}

	public int getId()
	{
		return id;
	}

	public void setId(int id)
	{
		this.id = id;
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}


	public Boolean getState()
	{
		return state;
	}
	
	public void setState(Boolean newState)
	{
		this.state = newState;
	}

	@Override
	public String toString()
	{
		return "Todo [name=" + name + ", id=" + id + ", category=" + category + ", state=" + state + ", priority="
				+ priority + "]";
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((category == null) ? 0 : category.hashCode());
		result = prime * result + id;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((priority == null) ? 0 : priority.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Todo other = (Todo) obj;
		if (category == null)
		{
			if (other.category != null)
				return false;
		} else if (!category.equals(other.category))
			return false;
		if (id != other.id)
			return false;
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (priority == null)
		{
			if (other.priority != null)
				return false;
		} else if (!priority.equals(other.priority))
			return false;
		if (state == null)
		{
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		return true;
	}

	

	
}
