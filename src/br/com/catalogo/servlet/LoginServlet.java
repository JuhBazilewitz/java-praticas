package br.com.catalogo.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
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
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String usuario = request.getParameter("usuario");
        String senha = request.getParameter("senha");
        
        if(usuario.equals("ze") && senha.equals("123")) {
            //Mandar ele para outro servlet
            request.getSession().setAttribute("usuario", usuario);
            response.sendRedirect("home");
        } else {
            // Indicar a rota mapeada do servlet
            /*
            //Manter ele no mesmo servlet
            response.sendRedirect("login");
            */
            
            //Usar o Dispatcher para o JSP
            
            request.setAttribute("usuarioNaoAutenticado", usuario);
            
            ArrayList<String> motivos = new ArrayList<>();
            motivos.add("Esqueci a minha senha.");
            motivos.add("Esqueci meu usuário.");
            motivos.add("Estava de férias.");
            
            request.setAttribute("motivos", motivos);
            
            RequestDispatcher view = request.getRequestDispatcher("acessoNegado.jsp");
            
            view.forward(request, response);
            
            //Fazer o redirect direto pelo JSP
            //response.sendRedirect("acessoNegado.jsp");
        }
        
    }
}
