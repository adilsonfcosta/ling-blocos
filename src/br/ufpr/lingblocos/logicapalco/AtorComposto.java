/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.logicapalco;

import java.util.Collection;
import java.util.LinkedList;
import java.util.List;

/**
 *
 * @author cassiele
 */
public class AtorComposto extends Ator {
    
    private List<Ator> agrupado = new LinkedList();
    
    public AtorComposto(int x, int y, Collection <Ator> selecionados) {
        super(x, y);
        agrupado.addAll(selecionados);    
    }
    

    @Override
    public void desenhar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean dentro(int x, int y) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void redimensionaAtor(Integer rx, Integer ry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gire(int g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
