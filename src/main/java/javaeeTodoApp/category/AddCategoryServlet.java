package javaeeTodoApp.category;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/add-category.do")
public class AddCategoryServlet extends HttpServlet
{
	CategoryService categoryService = new CategoryService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String newCategoryName = request.getParameter("new-todo-category-name");
		String newCategoryParent = request.getParameter("new-todo-category-parent");
		
		if(newCategoryParent.equals("NO parent")) {
			categoryService.addCategory(newCategoryName);
		} 
		else {
			try
			{
				String[] strings = newCategoryParent.split("\\(");
				int lastSplit = strings.length;
				String liczba = newCategoryParent.split("\\(")[lastSplit-1].split("\\)")[0];
				int parentId = Integer.parseInt(liczba);
				
				System.out.println("newCategoryName -> " + newCategoryName);
				System.out.println("newCategoryParentID -> " + parentId);
				categoryService.addCategory(newCategoryName, parentId);
				
			} catch (Exception e)
			{
				System.out.println(" --takie to jest");
			}
		}
		
		for(Category cat: categoryService.getCategories()) {
			System.out.println(cat.toString());			
		}
		
		response.sendRedirect("/add-todo.do");
		
	}
}
