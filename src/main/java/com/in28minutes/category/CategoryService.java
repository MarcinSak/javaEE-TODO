package com.in28minutes.category;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryService implements CategoryServiceInterface
{
	private static int categoryID = 3;
	private static List<Category> categoryList = new ArrayList<Category>();
	
	static {
		categoryList.add(new Category("root", 0));
		categoryList.add(new Category("Study", 1, 0));
		categoryList.add(new Category("Work", 2, 0));
	}
	
	public int giveMeID(String sd) {
//		System.out.print(" jestem");
//		String[] strings = newCategoryParent.split("(");
//		System.out.print(" jestem");
//		int lastSplit = strings.length;
//		System.out.print(" jestem");
//		String liczba = newCategoryParent.split("(")[lastSplit].split(")")[0];
//		System.out.print(" jestem");
//		int parentId = Integer.parseInt(liczba);
//		System.out.print(" jestem");
		return 0;
	}
	
	@Override
	public List<Category> getCategories()
	{
		return categoryList;
	}
	
	@Override
	public void addCategory(String name, int parent)
	{
		categoryList.add(new Category(name, ++categoryID, parent));
	}

	@Override
	public void addCategory(String name)
	{
		if(!name.trim().equals(""))
			categoryList.add(new Category(name.trim(), ++categoryID));
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