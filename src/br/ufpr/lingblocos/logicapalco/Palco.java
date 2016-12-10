/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.logicapalco;

import br.ufpr.lingblocos.apresentacao.desktop.telablocos.swing.TelaBlocos;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/**
 *
 * @author Lenovo
 */
public class Palco {
    
    TelaBlocos telaBlocos;  //Não está muito certo. Tem que "mascarar" o telaBloco
    Desenhador desenhador;
    int x_mintira;
    int y_mintira;

    
     
    private List<Ator> atores = new LinkedList();
    private Set<Ator> selecionados = new HashSet<>();
    
    
    public Palco(Desenhador desenhador , TelaBlocos telaBlocos) {
        this.desenhador = desenhador;
        this.telaBlocos = telaBlocos;
    }
    
    public void selecionarAtor(int x, int y) {
        //System.out.println(x+ " " +y);
        
        for (Ator a : atores) {
            if (a.dentro(x, y)) {
                selecionados.add(a);
                telaBlocos.setPainel(a.painel);
            }
            System.out.println(a.toString());
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
        // limpar palco e AtorComposto depois de criar o AtorComposto
        AtorComposto atorComposto = new AtorComposto(x_mintira, y_mintira, selecionados);
        atores.add(atorComposto);
        atores.removeAll(selecionados);
        
        
    }
}
