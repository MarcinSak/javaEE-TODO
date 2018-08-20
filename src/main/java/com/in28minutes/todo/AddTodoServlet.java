package com.in28minutes.todo;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.category.CategoryService;
import com.in28minutes.todo.TodoService;

@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet
{
	private TodoService todoService = new TodoService();
	private CategoryService categoryService = new CategoryService();
	
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setAttribute("categotyList", categoryService.getCategories());
		request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String action = request.getParameter("action");
		if(action.equals("Add")) {
			String newTodo = request.getParameter("new-todo");
			String category = request.getParameter("new-todo-category");
			String qwer = request.getParameter("qwer");
			todoService.addTodo(new Todo(newTodo, todoService.nextID(), category));
		}
		response.sendRedirect("/list-todos.do");
	}
	
}
