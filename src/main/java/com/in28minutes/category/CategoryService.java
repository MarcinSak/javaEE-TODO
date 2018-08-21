package com.in28minutes.category;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryService implements CategoryServiceInterface
{
	private static int categoryID = 1;
	private static List<Category> categoryList = new ArrayList<Category>();
	
	static {
		categoryList.add(new Category("root", 0));
		categoryList.add(new Category("study", 1, 0));
		categoryList.add(new Category("work", 1, 0));
	}
	
	@Override
	public List<Category> getCategories()
	{
		return categoryList;
	}
	
	@Override
	public void addCategory(String name, int parent)
	{
		categoryList.add(new Category(name, categoryID++, parent));
	}

	@Override
	public void addCategory(String name)
	{
		categoryList.add(new Category(name, categoryID++));
	}

	@Override
	public void deleteCategory(int removeCategoryID)
	{
		categoryList.remove(removeCategoryID);
	}

	@Override
	public void changeCategoryName(int changeCategoryNameID, String newName)
	{
		categoryList.get(changeCategoryNameID).setName(newName);
	}

}