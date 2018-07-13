package br.com.catalogo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 
 * @author juliane.bazilewitz
 *
 */
public class LoginServlet extends HttpServlet{

    /**
     * id
     */
    private static final long serialVersionUID = 555857352036933291L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        
        PrintWriter writer = response.getWriter();
        writer.println("<html>"
                +"<h2>Faça o login</h2>"
                +"<form action=\"login\" method=\"POST\">"
                + "<label>Usuário:</label>"
                + "<input type=\"text\" name=\"usuario\" />"
                + "<p/>"
                + "<label>Senha:</label>"
                + "<input type=\"password\" name=\"senha\" />"
                + "<p/>"
                + "<input type=\"submit\" value=\"acessar\"/>"
                + " </form>"
                +"</html>");
        
        
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        
        if(usuario.equals("ze") && senha.equals("123")) {
            //Mandar ele para outro servlet
            response.sendRedirect("home");
        } else {
            //Manter ele no mesmo servlet
            response.sendRedirect("login");
        }
        
        request.getSession().setAttribute("usuarioLogado", usuario);
    }
}
