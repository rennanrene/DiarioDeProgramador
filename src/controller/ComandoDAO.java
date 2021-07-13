/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

//import java.util.ArrayList;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JOptionPane;
import model.Comando;
import static view.viewComandos.comandos;

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
    public List<String> listar() {
        List<String> cmdListaNomes = new ArrayList();
        
        for (Comando c:comandos){
            cmdListaNomes.add(c.getNome());   
        }
        return cmdListaNomes;
        
        }

    @Override
    public void atualizar() {
        
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
        
        
        

}


