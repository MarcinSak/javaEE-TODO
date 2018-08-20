package com.in28minutes.category;

import java.util.List;
import java.util.Map;

public interface CategoryServiceInterface
{
	public List<Category> getCategories();
	boolean isCategoryAlreadyExist(String name, String parent);
	public boolean isCategoryAlreadyExist(String name);
	public boolean addCategory(String name, String parent);
	public boolean addCategory(String name);
	public boolean deleteCategory(String name, String parent);
	public boolean deleteCategory(String name);
	public boolean changeCategoryName();
	public Map<Category,String> listCategories();
	
	
}
