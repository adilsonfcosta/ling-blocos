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
public class BlocoSoma extends BlocoEncaixavel<Double>{
    
    public BlocoSoma() {
        campos.put("dx",new Campo<>(0));
        campos.put("dy",new Campo<>(0));
}
    
  //  BlocoEncaixavel<Double> a;//igual bloco mova porem com a e b no lgar dx,dy
   // BlocoEncaixavel<Double> b;//bloco campo

    
    
    public BlocoSoma(Double valor) {
        super(valor);
    }

    public BlocoSoma() {
        super(0.0);
    }
    
    

    public void setA(BlocoEncaixavel<Double> a) {
        this.a = a;
    }

    public void setB(BlocoEncaixavel<Double> b) {
        this.b = b;
    }
    
    

    @Override
    public Double getValor() {
        return a.getValor() + b.getValor();
    }

 
  
    
}
