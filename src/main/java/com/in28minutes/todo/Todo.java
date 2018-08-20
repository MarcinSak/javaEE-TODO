package com.in28minutes.todo;

public class Todo
{
	private String name;
	private int id;
	private String category;
	
	public Todo(String name, int id, String category) {
		super();
		this.name = name;
		this.id = id;
		this.category = category;
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



	@Override
	public String toString()
	{
		return String.format("Todo [name=%s, id=%s, category=%s]", name, id, category);
	}

	@Override
	public int hashCode()
	{
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		if (name == null)
		{
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}
	
}
