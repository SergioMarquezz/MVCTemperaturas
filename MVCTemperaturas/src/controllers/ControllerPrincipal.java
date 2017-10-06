/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import views.ViewPrincipal;
import views.ViewAscendente;


public class ControllerPrincipal {
    
    ViewPrincipal view_principal;
    ViewAscendente view_ascedente;
    
    public ControllerPrincipal(ViewPrincipal view_principal,ViewAscendente view_ascedente){
        
        this.view_principal = view_principal;
        this.view_ascedente = view_ascedente;
        initView();
        
        view_principal.jm_item_ascedente.addActionListener(e -> this.frameAscedente()); //BOTON QUE ABRE EL FRAME ASCEDENTE
        
    }
    public void initView(){
        
        this.view_principal.setTitle("Temperaturas");
        this.view_principal.setLocationRelativeTo(null);
        this.view_principal.setVisible(true);
        
    }
    
    
    //METODO PARA ABRIR EL FRAME ASCEDENTE
    
    public void frameAscedente(){
        
        this.view_principal.setContentPane(view_ascedente);
        this.view_principal.revalidate();
        this.view_principal.repaint();
    }
    
   
}
