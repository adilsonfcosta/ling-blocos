/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.apresentacao.desktop.blocos.swing;

import br.ufpr.lingblocos.apresentacao.desktop.telablocos.swing.TelaBlocos;
import br.ufpr.lingblocos.logicablocos.Bloco;
import br.ufpr.lingblocos.util.DoubleTransformer;
import br.ufpr.lingblocos.util.IntegerTransformer;
import java.awt.Color;
import java.awt.Rectangle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.SwingConstants;


public class BlocoSoma extends BlocoEncaixavel<Double> implements BlocoComCampos {
    
    private Campos campos = new Campos(this);

    public BlocoSoma(TelaBlocos tela, Bloco blocoLogica) {
        super(tela,"+", Color.CYAN, blocoLogica);
        addCampos();
        
    }

    @Override
    public void addCampos() {
        BlocoCaixaTexto<Double> caixa1 = new BlocoCaixaTexto("a", "0", new IntegerTransformer());
        getBloco().add(caixa1.getCaixa());
        campos.addOriginal(caixa1);       
        caixa1.setBounds(5, 5, 20, 20);
        caixa1.setPai(this);
        
        BlocoCaixaTexto<Double> caixa2 = new BlocoCaixaTexto("b", "0", new IntegerTransformer());
        getBloco().add(caixa2.getCaixa());
        campos.addOriginal(caixa2);
        caixa2.setBounds(getBloco().getWidth()-25, 5, 20, 20);
        caixa2.setPai(this);
             
    }

    @Override
    public Double getValor() {
        //TO-DO (PARTE DA LÓGICA)
        return 0.0;
    }

    public void setBounds(int i, int i0, int i1, int i2) {
        setBounds(new Rectangle(i, i0, i1, i2));
    }
    

    @Override
    public Iterator<Encaixavel> getCamposIterator() {
        return campos.getCamposIterator();
    }
    
    @Override
    public void removeCampo(Encaixavel campo) {
        campos.removeCampo(campo);
    }

    @Override
    public void trocaCampo(Encaixavel antigo, Encaixavel novo) {
        campos.trocaCampo(antigo, novo);
    }


    
    
    public Campos getCampos() {
        return campos;
    }    
    

 
    
    
    
}
