/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.logicapalco;


public interface Desenhador {
    
    public void desenhaElipse(int x, int y, int largura, int altura);
    public void desenhaRetangulo(int x, int y,int largura, int altura);   
    public void desenhaTriangulo(int x, int y, int pontoX, int pontoY);
    public void desenhaLinhaReta(int x, int y, int x1, int y1);    
    public void desenhaEstrela();
    public void desenhaImagem();
    public void desenhaLinhaLivre();
    public void desenhaPoligono();
    public void limpaTela();

    //--public void desenhaElipse(int x, int y, int largura, int altura, int g);
    
    
    
    
    
    
    
    
    
    
    
    
    
}
