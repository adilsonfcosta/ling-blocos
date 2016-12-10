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
public class Retangulo extends Ator {
    
    private int largura;
    private int altura;
    private int x_clique;
    private int y_clique;
    
    public Retangulo(int x, int y, int largura, int altura) {
        super(x, y);
        this.largura=largura;
        this.altura=altura;
    }

    @Override
    public void desenhar() {
        desenhador.desenhaRetangulo(x, y, largura, altura);
    }

    @Override
    public boolean dentro(int x, int y) {
        x_clique = x;
        y_clique = y;
        
        return(x > this.x && 
               x < (this.x + this.largura) &&  
               y > this.y &&
               y < (this.altura + this.y)); 
    } 

//    @Override
//    public String toString() {
//        return x_clique +":"+ y_clique +"<< Retangulo {x:" + this.x + ", y:" + this.y + ", l:" + (this.x + this.largura) + ", a:" + (this.altura + this.y) + '}';
//    }



    @Override
    public void redimensionaAtor(Integer rx, Integer ry) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void gire(int g) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
}







