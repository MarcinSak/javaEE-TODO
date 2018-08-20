package com.in28minutes.category;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryStoredData
{
	private static List<Category> categoryList = new ArrayList<Category>();
	private static Map<Category, Category> categoryMap = new HashMap<Category, Category>();
	
	static {
		categoryList.add(new Category("root", 0));
		categoryList.add(new Category("Study", 1));
	}
	
	public List<Category> getCategoryList()
	{
		return categoryList;
	}
	public static void setCategoryList(List<Category> categoryList)
	{
		CategoryStoredData.categoryList = categoryList;
	}
	public static Map<Category, Category> getCategoryMap()
	{
		return categoryMap;
	}
	public static void setCategoryMap(Map<Category, Category> categoryMap)
	{
		CategoryStoredData.categoryMap = categoryMap;
	}
	
	/*
	 * 	static {	//adding some default categories			
			categories.add(new Category("root", 0));		
			
			categories.add(new Category("Study", 1));
			categoryMap.put(categories.get(0), categories.get(1));

			categories.add(new Category("Shoping", 2));
			categoryMap.put(categories.get(0), categories.get(1));
			
			categories.add(new Category("Relationships", 3));
			categoryMap.put(categories.get(0), categories.get(1));
			
			categories.add(new Category("Myself", 4));
			categoryMap.put(categories.get(0), categories.get(1));

			categories.add(new Category("Body", 5));
			categoryMap.put(categories.get(4), categories.get(5));
			
			categories.add(new Category("Money", 6));
			categoryMap.put(categories.get(4), categories.get(6));
			
		}
	 */

}
