/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.apresentacao.desktop.mouseadapters;

import java.awt.event.MouseEvent;
import br.ufpr.lingblocos.apresentacao.desktop.teladesenho.TelaDesenho;
import br.ufpr.lingblocos.logicapalco.LinhaReta;
import br.ufpr.lingblocos.logicapalco.Palco;

/**
 *
 * @author Adilson
 */
public class MouseAdapterLinhaReta extends MouseAdapterFigura {

    public MouseAdapterLinhaReta(TelaDesenho telaDesenho, Palco palco) {
        super(telaDesenho, palco);
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        if (pressed) {
            pressed = false;
            //AQUI É ONDE VOCÊS DEVEM FAZER A LÓGICA SER CHAMADA,
            //ANTES DE DESENHAR NA TELA
            palco.inserirAtor(new LinhaReta(x, y, e.getX(), e.getY()));
            tela.desenhaLinhaReta(x, y, e.getX(), e.getY());
        }
    }
    
}
