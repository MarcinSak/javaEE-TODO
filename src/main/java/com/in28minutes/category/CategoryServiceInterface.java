package com.in28minutes.category;

import java.util.List;
import java.util.Map;

public interface CategoryServiceInterface
{
	public List<Category> getCategories();
	public void addCategory(String name, int parent);
	public void addCategory(String name);
	public void deleteCategory(int removeCategoryID);
	public void changeCategoryName(int changeCategoryNameID, String newName);	
	
}
