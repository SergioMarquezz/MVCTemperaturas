/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import views.*;
import models.*;
import controllers.*;


public class Main {
    
    ViewPrincipal view_principal;
    ControllerPrincipal controller_principal;
    
    
    
    public static void main(String alb[]){
        
        ViewPrincipal view_principal = new ViewPrincipal();
        ViewAscendente view_ascedente = new ViewAscendente();
        ControllerPrincipal controller_principal = new ControllerPrincipal(view_principal,view_ascedente);
        
        
        ModelAscendente model_ascendente = new ModelAscendente();
        ViewAscendente view_ascendente = new ViewAscendente();
        ControllerAscendente controller_ascendente = new ControllerAscendente(model_ascendente,view_ascedente);
        
        
        
    }
}
