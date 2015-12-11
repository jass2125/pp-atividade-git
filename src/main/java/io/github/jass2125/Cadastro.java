package io.github.jass2125;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Anderson Souza
 */
public class Cadastro extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse resp) throws ServletException, IOException {
        
        String nome = request.getParameter("nome");
        String email = request.getParameter("email");
        String fone = request.getParameter("fone");
        
        GerenciadorUsuario gerenciador = new GerenciadorUsuario();
        Usuario usuario = new Usuario(nome, email, fone);
        gerenciador.add(usuario);
        
        
            
    }
    
    

}
