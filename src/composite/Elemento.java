/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

/**
 *
 * @author Vinicius Corte
 */
public abstract class Elemento {
    private String nome;
    
    public Elemento(String nome){
        this.nome = nome;
    }
    
    public abstract int obterTamanho();
    
    public String getNome(){
        return this.nome;
    }
    
    public void setNome(String nome){
        this.nome = nome;
    }
    
}
