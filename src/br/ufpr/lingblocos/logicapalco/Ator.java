/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.logicapalco;

import br.ufpr.lingblocos.logicablocos.Painel;

/**
 *    pub    public abstract void gire(Integer g);
lic abstract void gire(Integer g);

 * @author Lenovo
 */
public abstract class Ator {
    protected int x;
    protected int y;
    //criar direcao
    protected int direcao;
    protected Desenhador desenhador;
    protected Palco palco;
    protected Painel painel;

    public Ator(int x, int y) {
        this.x = x;
        this.y = y;
        painel = new Painel(this);
    }

    public abstract void desenhar();
    public abstract boolean dentro(int x, int y);
    public abstract void redimensionaAtor(Integer rx, Integer ry);
    
     public  void gire(int g){
         System.out.println("girando na tela");
     }
    

    public void setDesenhador(Desenhador desenhador) {
        this.desenhador = desenhador;
    }
    

    public void mover(Integer dx, Integer dy) {
        this.x += dx;
        this.y += dy;
        
        palco.desenhar();
    }

    public void setPalco(Palco palco) {
        this.palco = palco;
    }

}
