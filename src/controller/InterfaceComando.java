/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controller;

import java.util.List;

/**
 *
 * @author Rennan Cavalcante
 */
public interface InterfaceComando {
    public void cadastrar();
    
    public void remover();
    
    public void pesquisar();
    
    public List<String> listar();
    
    public void atualizar();
    
    
}
