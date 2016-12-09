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
        return (x >= this.x && 
                y <= this.y && 
                x <= (this.x + this.largura) 
                && y >= (this.y - this.altura)); 
    }

    @Override
    public String toString() {
        return "Retangulo{" + "largura=" + largura + ", altura=" + altura + '}';
    }
    
    
    
}
