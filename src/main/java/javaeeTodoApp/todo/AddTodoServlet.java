package javaeeTodoApp.todo;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javaeeTodoApp.category.CategoryService;
import javaeeTodoApp.priority.TodoPriority;
import javaeeTodoApp.priority.TodoPriorityService;
import javaeeTodoApp.time.TagretTime;

@WebServlet(urlPatterns = "/add-todo.do")
public class AddTodoServlet extends HttpServlet
{
	private TodoService todoService = new TodoService();
	private CategoryService categoryService = new CategoryService();
	private TodoPriorityService todoPriorityService = new TodoPriorityService();

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
		String action = request.getParameter("action");

		if(action.equals("Add")) {
			String newTodoDescription = request.getParameter("new-todo");
			String newTodoCategory = request.getParameter("new-todo-category");
			
			//date & time
			String dateTodo ="", timeTodo="";
			dateTodo = request.getParameter("newTodoDate");
			timeTodo = request.getParameter("newTodoTime");
			System.out.println("dateTodo  ->  " + dateTodo);
			System.out.println("timeTodo  ->" + timeTodo + "<");
			System.out.println();
			
			int netTodoPriority = Integer.parseInt(request.getParameter("new-todo-priority"));
			if(!todoService.addTodo(new Todo(newTodoDescription, todoService.nextID(), newTodoCategory, new TodoPriority(netTodoPriority), new TagretTime(dateTodo, timeTodo))))
				request.setAttribute("AddTodoErrorMessage", "Nie dodano nowego zadania");
			else
				request.setAttribute("AddTodoErrorMessage", "");
		}
		response.sendRedirect("/list-todos.do");
	}
	
}
