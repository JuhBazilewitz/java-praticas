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
public class HomeServlet extends HttpServlet{

    /**
     * id
     */
    private static final long serialVersionUID = -380147675321212574L;

    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException {
        String usuario = (String) request.getSession().getAttribute("usuario");
        PrintWriter writer = response.getWriter();
        writer.println("<html>"
                + "<body>"
                + "Bem vindo, meu amigo...: "
                + usuario
                + "</body>"
                + "</html>");
        
        
    }
    
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) {
        
    }
}
