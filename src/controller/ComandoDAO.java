/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import java.util.ArrayList;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import model.Comando;

/**
 *
 * @author Rennan Cavalcante
 */
public class ComandoDAO implements InterfaceComando {

    @Override
    public void cadastrar() {          
        JOptionPane.showMessageDialog(null, "Comando cadastrado com sucesso!");
    }

    @Override
    public void remover() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.

    }

    @Override
    public void pesquisar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void listar() {        
        }

    @Override
    public void atualizar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        

}


