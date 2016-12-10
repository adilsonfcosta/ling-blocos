/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.logicablocos;

/**
 *
 * @author helio
 */
public class BlocoGire extends BlocoSimples{

    public BlocoGire(){
        campos.put("g",new Campo<>(0));
    }
    
    
    @Override
    public void executar() {
        
        Integer g = (Integer) campos.get("g").getValor();
        
        ator.gire(g);// FALTA IMPLEMENTAR NO ATOR
        
    }
    
}
