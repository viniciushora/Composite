/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.LinkedList;

/**
 *
 * @author ViniciusCorte
 */
public class Pasta extends Elemento{
    private LinkedList<Elemento> conteudo;
    
    public Pasta(String nome, LinkedList<Elemento> conteudo){
        super(nome);
        this.conteudo = new LinkedList<Elemento>();
        this.conteudo = conteudo;
    }
    
    public int obterTamanho(){
        int tam =0;
        for(int i=0; i < this.conteudo.size(); i++){
            tam = tam + conteudo.get(i).obterTamanho();
        }
        return tam;
    }
    
    public LinkedList<Elemento> getConteudo(){
        return this.conteudo;
    }
    
    public void setConteudo(LinkedList<Elemento> conteudo){
        this.conteudo = conteudo;
    }
}
