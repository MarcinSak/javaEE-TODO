package com.in28minutes.login;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.in28minutes.todo.TodoService;
import com.in28minutes.users.UserService;

@WebServlet(urlPatterns = "/login.do")
public class LogoutServlet extends HttpServlet
{
	private UserService userValidationService = new UserService();
	private TodoService todoService = new TodoService();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		request.getSession().setAttribute("name", request.getParameter("name"));
		request.setAttribute("password", request.getParameter("password"));
		
		request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
	}
	@Override
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		String name = request.getParameter("name");
		String password = request.getParameter("password");

		if(userValidationService.isThePasswordCorrect(name, password)) {
			request.getSession().setAttribute("name", name);
			response.sendRedirect("/list-todos.do");
		} else if(userValidationService.isAnUserRegistered(name)){
			request.setAttribute("errorMessage", "Invalid Credentials, please try again");
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
		} else {
			request.setAttribute("errorMessage", "Please enter a valid user name, or create new account");
			request.getRequestDispatcher("WEB-INF/views/login.jsp").forward(request, response);
		}
		
	}
}
