/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;


import javax.swing.JOptionPane;

/**
 *
 * @author Rennan Cavalcante
 */
public class UsuarioDAO implements InterfaceUsuario {

    
    @Override
    public void cadastrar() {
        JOptionPane.showMessageDialog(null, "Usuario cadastrado com sucesso!");
    }

    @Override
    public void remover() {
        JOptionPane.showMessageDialog(null, "Usuario foi removido com sucesso!");
    }

    @Override
    public void pesquisar() {
        
    }

    @Override
    public void listar() {
        
    }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
