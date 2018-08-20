package com.in28minutes.todo;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns="/done-todo.do")
public class CheckOutServlet extends HttpServlet
{
	TodoService todoService = new TodoService();
	@Override
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException
	{
		todoService.deleteTodo(Integer.parseInt(request.getParameter("id-todo")));
		response.sendRedirect("/list-todos.do");
	}
}
