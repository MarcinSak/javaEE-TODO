package com.in28minutes.category;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class CategoryService implements CategoryServiceInterface
{
	private static List<Category> categories = new ArrayList<Category>();
	
	private static int todoID=5;
	
	
	

	@Override
	public List<Category> getCategories()
	{
		CategoryStoredData catData = new CategoryStoredData();
		return catData.getCategoryList();
	}
	
	
	
	
	

		@Override
		public boolean addCategory(String name)
		{
//			if(!isCategoryAlreadyExist(name)) {
//				todoID++;
//				categoryMap.put(new Category(name, todoID), null);
//				return true;
//			}
			return false;
		}

	
		@Override
		public boolean isCategoryAlreadyExist(String name, String parent)
		{
//			if(categoryMap.get(name).equals(parent))
//				return true;
			return false;
		}

		@Override
		public boolean isCategoryAlreadyExist(String name)
		{
			if(isCategoryAlreadyExist(name, "root"))
				return true;
			return false;
		}

		@Override
		public boolean deleteCategory(String name, String parent)
		{
//			if(isCategoryAlreadyExist(name, parent)) {
//				categoryMap.remove(name, parent);
//				return true;
//			}
			return false;
		}

		@Override
		public boolean deleteCategory(String name)
		{
//			if(isCategoryAlreadyExist(name)) {
//				categoryMap.remove(name, null);
//				return true;
//			}
			return false;
		}

		@Override
		public boolean changeCategoryName()
		{
			// TODO Auto-generated method stub
			return false;
		}

		@Override
		public boolean addCategory(String name, String parent)
		{
			// TODO Auto-generated method stub
			return false;
		}


		@Override
		public Map<Category, String> listCategories()
		{
			// TODO Auto-generated method stub
			return null;
		}


}