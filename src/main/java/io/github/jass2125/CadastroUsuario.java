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
public class CadastroUsuario extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        try{
            String nome = request.getParameter("nome");
            String email = request.getParameter("email");
            String fone = request.getParameter("fone");
            String password = request.getParameter("password");
            GerenciadorUsuario gerenciador = new GerenciadorUsuario();
            Usuario usuario = new Usuario(nome, email, fone, password);
            gerenciador.add(usuario);
            request.getRequestDispatcher("home.jsp").forward(request, resp);
        
        }catch(SQLException e){
            request.getRequestDispatcher("error.jsp").forward(request, resp);
        }   
    }
}
