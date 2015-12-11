package io.github.jass2125;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author Anderson Souza
 */
public class UsuarioDao implements UsuarioDaoIF {
    
    public void add(Usuario usuario) throws SQLException { 
        String url = "jdbc:derby://localhost:1527/pp";
        String user = "pp";
        String password = "123";
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "insert into PP.USUARIO(nome, email, senha, fone) values(?, ?, ?, ?);";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, usuario.getNome());
        ps.setString(2, usuario.getEmail());
        ps.setString(3, usuario.getPassword());
        ps.setString(4, usuario.getFone());
        ps.execute();
        
    }
    
    public boolean login(String login, String senha) throws SQLException {
        String url = "jdbc:derby://localhost:1527/pp";
        String user = "pp";
        String password = "123";
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "select * from PP.USUARIO where email = ? and senha = ?";
        PreparedStatement ps = connection.prepareStatement(sql);
        ps.setString(1, login);
        ps.setString(2, senha);
        return ps.executeQuery().next();
    }
    
    
}
