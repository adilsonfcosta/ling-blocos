/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.logicapalco;

import java.util.List;

/**
 *
 * @author cassiele
 */
public class LinhaLivre extends Ator {
    
    private Desenhador desenhador;
    private List<Ponto> ponto;  

    public LinhaLivre(int x, int y) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        desenhador.desenhaLinhaLivre();
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
