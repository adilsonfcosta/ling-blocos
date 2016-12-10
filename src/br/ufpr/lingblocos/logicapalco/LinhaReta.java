/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.logicapalco;

/**
 *
 * @author Lenovo
 */
public class LinhaReta extends Ator {
    
    int x1, y1;
    
    public LinhaReta(int x, int y, int x1, int y1) {
        super(x, y);
    }

    @Override
    public void desenhar() {
        desenhador.desenhaLinhaReta(x, y, this.x1, this.y1);
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
