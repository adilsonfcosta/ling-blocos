/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.logicablocos;

import br.ufpr.lingblocos.logicapalco.Ator;

/**
 *
 * @author helio
 */
public class BlocoRedimenciona extends BlocoSimples{
    
    public BlocoRedimenciona(){
        
        campos.put("rx",new Campo<>(0));
        campos.put("ry",new Campo<>(0));
    }



    @Override
    public void executar() {
        
        Integer rx, ry;
        
        rx = (Integer) campos.get("rx").getValor();
        ry = (Integer) campos.get("ry").getValor();
        
        //EU ACHO QUE AQUI CHAMA A FUNÇÃO DO ATOR
        
        
        
    }
    
}
