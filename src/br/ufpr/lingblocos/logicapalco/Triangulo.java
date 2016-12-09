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
public class Triangulo extends Ator {
    
    private int pontoX;
    private int pontoY;
    
    public Triangulo(int x, int y, int pontoX, int pontoY) {
        super(x, y);
        this.pontoX = pontoX;
        this.pontoY = pontoY;
    }

    @Override
    public void desenhar() {
        desenhador.desenhaTriangulo(x,y, pontoX, pontoY);
    }

    @Override
    public boolean dentro(int x, int y) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return true;
    }

    @Override
    public void moverAtor(Integer dx, Integer dy) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
