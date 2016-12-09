/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.logicapalco;

import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class Palco {
        
    Desenhador desenhador;   
     
    private List<Ator> atores = new LinkedList();

    public Palco(Desenhador desenhador) {
        this.desenhador = desenhador;
    }
    
    public void selecionarAtor(int x, int y) {
        //System.out.println(x+ " " +y);
                
        for (Ator a : atores) {
            if (a.dentro(x, y)) {
                System.out.println("TO DENTRO >>" + a.toString());   
            } else {
                System.out.println("to fora >>" + a.toString());   
            }
        }
        System.out.println("\n ");
    }

    public void inserirAtor(Ator ator) {
        atores.add(ator);
        ator.setPalco(this);
        ator.setDesenhador(desenhador);
        desenhar();
    }

    public void desenhar() {
        desenhador.limpaTela();
        for (Ator a: atores) {
            a.desenhar();
        }
        //System.out.println(atores);
    }
    
}
