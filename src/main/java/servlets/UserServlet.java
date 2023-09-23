package servlets;

import java.io.IOException;
import java.io.PrintWriter;

import entities.Usuario;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(urlPatterns = "/loginUsuario")
public class UserServlet extends HttpServlet{
	@Override
	protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		Usuario user = new Usuario();
		user.setLogin(req.getParameter("loginUser"));
		user.setSenha(req.getParameter("senhaUser"));
		
		PrintWriter out = resp.getWriter();
		out.println("<hmtl>");
		out.println("<head><title>Págna de Login</title>");
		out.println("<meta charset=\\\"UTF-8\\\"></head>");
		out.println("<body>");
		out.println("<label>Cadastro realizado!</label></br>");
		out.println("<label>Login: " + user.getLogin() + "</label></br>");
		out.println("<label>Senha: " + user.getSenha() + "</label></br>");
		out.println("</body>");
		out.println("</html>");
	}

}
