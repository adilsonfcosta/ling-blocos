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
import java.awt.Point;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author Lenovo
 */
public class BlocoEspere extends BlocoSimples implements BlocoComCampos{

    private Campos campos = new Campos(this);
    
    public BlocoEspere(TelaBlocos tela, Bloco blocoLogica) {
        super(tela, "Espere", Color.ORANGE, blocoLogica);
        addCampos();
    }

    @Override
    public void addCampos() {
        BlocoCaixaTexto<Double> caixa = new BlocoCaixaTexto("t", "0", new IntegerTransformer());
        campos.addOriginal(caixa);
        caixa.setBounds(70, 10, 20, 20);
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
        this.getBlocoLogica().trocaCampo("t",novo.getBlocoLogica());
    }

    public Campos getCampos() {
        return campos;
    }

    
}
