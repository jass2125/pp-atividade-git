package io.github.jass2125;

import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Souza
 */
public interface UsuarioDaoIF {
    
    public void add(Usuario usuario) throws SQLException;
    
    public boolean login(String login, String senha) throws SQLException;
}
