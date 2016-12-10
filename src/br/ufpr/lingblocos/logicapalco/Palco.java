/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.logicapalco;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Lenovo
 */
public class Palco {
        
    Desenhador desenhador;   
     
    private List<Ator> atores = new LinkedList();
    private Set<Ator> selecionados = new HashSet<>();
    private List<Ator> agrupado = new LinkedList();
    
    public Palco(Desenhador desenhador) {
        this.desenhador = desenhador;
    }
    
    public void selecionarAtor(int x, int y) {
        //System.out.println(x+ " " +y);
                
        for (Ator a : atores) {
            if (a.dentro(x, y)) {
                selecionados.add(a);
//                System.out.println("TO DENTRO >>" + a.toString());   
//            } else {
//                System.out.println("to fora >>" + a.toString());   
            }
        }
        
        for (Ator s : selecionados) {
            System.out.println("selecionados: " + s);
        }
        
        System.out.println(selecionados + "\n ");
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
    
    public void agrupar(){
        // l impar palco e AtorComposto depois de criar o AtorComposto
    }
}
