/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

/**
 *
 * @author Rennan Cavalcante
 */
public class Usuario {
    private int ident;
    private String login;
    private String senha;
    //private int pontuacao;
    
    

    public int getIdent() {
        return ident;
    }

    public void setIdent(int ident) {
        this.ident = ident;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

//    public int getPontuacao() {
//        return pontuacao;
//    }
//
//    public void setPontuacao(int pontuacao) {
//        this.pontuacao = pontuacao;
//    }

 
}
