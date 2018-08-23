package com.in28minutes.priority;


public class TodoPriority
{
	private int priorityLevel;
	
	public TodoPriority(int priorityLevel) {
		this.priorityLevel = priorityLevel;
	}

	public int getPriorityLevel()
	{
		return priorityLevel;
	}

	public void setPriorityLevel(int priorityLevel)
	{
		this.priorityLevel = priorityLevel;
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + priorityLevel;
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
		TodoPriority other = (TodoPriority) obj;
		if (priorityLevel != other.priorityLevel)
			return false;
		return true;
	}

	@Override
	public String toString()
	{
		return "TodoPriority [priorityLevel=" + priorityLevel + "]";
	}
	
	
}
