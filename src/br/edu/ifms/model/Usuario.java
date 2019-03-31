package br.edu.ifms.model;

public class Usuario implements EntidadeBase{
    private Long id;
    private String login;
    private String senha;

    @Override
    public Long getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String nome) {
        this.login = nome;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public Usuario(String nome, String senha) {
        this.login = nome;
        this.senha = senha;
    }
    
    
    
}
