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
public class BlocoSoma extends BlocoEncaixavel<Integer>{
    
    public BlocoSoma(Integer valor) {
        super(valor);
        campos.put("a",new Campo<>(0));
        campos.put("b",new Campo<>(0));
    }

    public BlocoSoma() {
        this(0);
    }
    
    
    @Override
    public Integer getValor() {
        return (Integer) campos.get("a").getValor()+ (Integer)campos.get("b").getValor();
   
    }
    

//    public void setA(BlocoEncaixavel<Double> a) {
//        this.a = a;
//    }
//
//    public void setB(BlocoEncaixavel<Double> b) {
//        this.b = b;
//    }
    
    

   

 
  
    
}
