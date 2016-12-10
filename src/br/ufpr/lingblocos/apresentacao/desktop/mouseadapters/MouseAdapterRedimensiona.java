/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.lingblocos.apresentacao.desktop.mouseadapters;

import br.ufpr.lingblocos.apresentacao.desktop.blocos.swing.BlocoRepita;
import br.ufpr.lingblocos.apresentacao.desktop.telablocos.swing.TelaBlocos;
import br.ufpr.lingblocos.logicablocos.Bloco;
//import br.ufpr.lingblocos.logicablocos.BlocoRedimensiona;
import br.ufpr.lingblocos.apresentacao.desktop.blocos.swing.BlocoRedimensiona;
import java.awt.event.MouseEvent;

/**
 *
 * @author cassiele
 */
public class MouseAdapterRedimensiona extends MouseAdapterBlocos{

    public MouseAdapterRedimensiona(TelaBlocos telaBlocos) {
        super(telaBlocos);
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        Bloco blocoLogico = new br.ufpr.lingblocos.logicablocos.BlocoRedimensiona();
        getPainel().inserirBloco(blocoLogico);
        tela.addBloco(new BlocoRedimensiona(tela, blocoLogico), e.getX(), e.getY());
    }
    
    
    
}
