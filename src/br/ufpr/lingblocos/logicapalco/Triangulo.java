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
    private int x_clique;
    private int y_clique;
    
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
        x_clique = x;
        y_clique = y;

        return(x > this.x && 
               x < (this.x + this.pontoX) &&  
               y > this.y &&
               y < (this.pontoY + this.y)); 
    } 

    @Override
    public String toString() {
        return x_clique +":"+ y_clique +"<< Triângulo {x:" + this.x + ", y:" + this.y + ", l:" + (this.x + this.pontoX) + ", a:" + (this.pontoY + this.y) + '}';
    }


    @Override
    public void redimensionaAtor(Integer rx, Integer ry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gire(Integer g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
