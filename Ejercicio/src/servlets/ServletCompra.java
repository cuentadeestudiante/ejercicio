package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.Compra;

/**
 * Servlet implementation class ServletCompra
 */
@WebServlet("/ServletCompra")
public class ServletCompra extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String email = request.getParameter("email");
		String producto = request.getParameter("producto");
		int unidades = Integer.parseInt(request.getParameter("unidades"));
		
		Compra compra = new Compra(email, producto, unidades);
		
		request.setAttribute("compra", compra);
		
		request.getRequestDispatcher("compra.jsp").forward(request, response);
		
	}

}
