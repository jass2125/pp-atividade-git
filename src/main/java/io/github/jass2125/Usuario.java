package io.github.jass2125;

/**
 *
 * @author Anderson Souza
 */
public class Usuario {
    private String nome;
    private String email;
    private String password;
    private String fone;

    public Usuario() {
    }

    public Usuario(String nome, String email, String fone, String password) {
        this.nome = nome;
        this.email = email;
        this.fone = fone;
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFone() {
        return fone;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }
    
}
