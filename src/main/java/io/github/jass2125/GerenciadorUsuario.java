package io.github.jass2125;

import java.sql.SQLException;

/**
 *
 * @author Anderson Souza
 */
public class GerenciadorUsuario {
    private UsuarioDaoIF dao;

    public GerenciadorUsuario() {
        dao = new UsuarioDao();
    }
    
    
    public void add(Usuario usuario) throws SQLException{
        dao.add(usuario);
    }

    public boolean login(String login, String senha) throws SQLException {
        if(dao.login(login, senha) != null) {
            return true;
        }
        return false;
    }
    
}
