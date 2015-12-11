package io.github.jass2125;

import java.io.IOException;
import java.sql.SQLException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anderson Souza
 */
public class LoginUsuario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String login = request.getParameter("login");
            String senha = request.getParameter("senha");
            GerenciadorUsuario gerenciador = new GerenciadorUsuario();
            if(gerenciador.login(login, senha)){
                request.getRequestDispatcher("home.jsp").forward(request, resp);
            }
            
        }catch(SQLException e){
            request.setAttribute("ex", e);
            request.getRequestDispatcher("error.jsp").forward(request, resp);
        }
        request.getRequestDispatcher("error.jsp").forward(request, resp);
    }
    
    
    
}
