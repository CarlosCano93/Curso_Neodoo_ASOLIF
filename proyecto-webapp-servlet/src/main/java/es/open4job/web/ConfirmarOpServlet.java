package es.open4job.web;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class ConfirmarOpServlet
 */
public class ConfirmarOpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public ConfirmarOpServlet() {
		super();
		// TODO Auto-generated constructor stub
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub

		HttpSession sesion = request.getSession(true);

		//coge el parametro id de la url
		int id = Integer.parseInt(request.getParameter("id"));
		
		//guarda la variable en session
		sesion.setAttribute("id", id);

		request.getRequestDispatcher("confirmar_visualizar.jsp").forward(
				request, response);
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
