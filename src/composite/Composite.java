/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package composite;

import java.util.LinkedList;

/**
 *
 * @author Vinicius Corte
 */
public class Composite {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Arquivo arq1 = new Arquivo("x.txt", 2);
        Arquivo arq2 = new Arquivo("i.png", 100);
        Arquivo arq3 = new Arquivo("kkkk.pdf", 54);
        LinkedList<Elemento> conteudoHome = new LinkedList<Elemento>();
        LinkedList<Elemento> conteudoTeste = new LinkedList<Elemento>();
        LinkedList<Elemento> conteudoRoot = new LinkedList<Elemento>();
        Pasta teste = new Pasta("Teste", conteudoTeste);
        conteudoHome.add(arq2);
        conteudoHome.add(arq3);
        conteudoHome.add(teste);
        conteudoRoot.add(arq1);
        Pasta home = new Pasta("Home", conteudoHome);
        conteudoRoot.add(home);
        Pasta raiz = new Pasta("Root", conteudoRoot);
        System.out.println("Tamanho do diretório Root: " + raiz.obterTamanho() + "KB");
        System.out.println("Tamanho do diretório Home: " + home.obterTamanho() + "KB");
        System.out.println("Tamanho do diretório Teste: " + teste.obterTamanho() + "KB");
    }
    
}
