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
public class Arquivo extends Elemento{
    private int tamanho;
    private String nome;
    
    public Arquivo(String nome, int tamanho){
        super(nome);
        this.tamanho = tamanho;
    }
    
    public int obterTamanho(){
        return this.tamanho;
    }
}
