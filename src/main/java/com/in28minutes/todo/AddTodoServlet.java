package com.in28minutes.todo;

import java.io.IOException;

import javax.security.auth.message.callback.PrivateKeyCallback.Request;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.category.CategoryService;
import com.in28minutes.priority.TodoPriority;
import com.in28minutes.priority.TodoPriorityService;
import com.in28minutes.todo.TodoService;

@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet
{
	private TodoService todoService = new TodoService();
	private CategoryService categoryService = new CategoryService();
	private TodoPriorityService todoPriorityService = new TodoPriorityService();
	private static String priorityLevel;
//	salary
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.setAttribute("categotyList", categoryService.getCategories());
		request.setAttribute("priorityList", todoPriorityService.getPriorityOptions());
		
		request.getRequestDispatcher("/WEB-INF/views/add-todo.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		System.out.println("salary -> " + request.getParameter("salary"));

		String action = request.getParameter("action");

		if(action.equals("Add")) {
			String newTodoDescription = request.getParameter("new-todo");
			String newTodoCategory = request.getParameter("new-todo-category");
			String netTodoPriority = request.getParameter("new-todo-priority");
			System.out.println("netTodoPriority   --->   " + netTodoPriority);
			if(!todoService.addTodo(new Todo(newTodoDescription, todoService.nextID(), newTodoCategory, new TodoPriority(1))))
				request.setAttribute("AddTodoErrorMessage", "Nie dodano nowego zadania");
			else
				request.setAttribute("AddTodoErrorMessage", "");
		}
		response.sendRedirect("/list-todos.do");
	}
	
}
