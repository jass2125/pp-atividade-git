package io.github.jass2125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author Anderson Souza
 */
public class UsuarioDao {
    
    public void add(Usuario usuario) throws SQLException{ 
        String url = "jdbc:derby://localhost:1527/pp";
        String user = "pp";
        String password = "123";
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "insert into usuario(nome, email, fone) values(?, ?, ?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, usuario.getEmail());
        ps.setString(2, usuario.getEmail());
        ps.setString(3, usuario.getFone());
        ps.execute();
        
    }
    
    
}
