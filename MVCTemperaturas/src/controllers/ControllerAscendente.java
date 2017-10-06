/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;

import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.ListModel;

import views.ViewAscendente;
import models.ModelAscendente;


public class ControllerAscendente {
    
    DefaultListModel modelo_lista;
    ViewAscendente view_ascendente;
    ModelAscendente model_ascendente;
    
    
    
    
    
    public ControllerAscendente( ModelAscendente model_ascendente,ViewAscendente view_ascendente){
        
        modelo_lista = new DefaultListModel();
        view_ascendente.jlist_numeros.setModel(modelo_lista);
      //  ListModel<String> cadena = view_ascendente.jlist_numeros.getModel();
       
        
        
        this.model_ascendente = model_ascendente;
        this.view_ascendente = view_ascendente;
        
        initView();
        
        view_ascendente.jbtn_insertar.addActionListener(e -> this.jbtnAgregarClick());
       view_ascendente.jbtn_ordenar.addActionListener(e -> this.jbtnOrdenarClick());
        
    }
    
    public void initView(){
        
        view_ascendente.jtf_numero.setText(String.valueOf(model_ascendente.getNumeros()));
        
    }
    
    public void jbtnAgregarClick(){
        
        modelo_lista.addElement(view_ascendente.jtf_numero.getText());
        view_ascendente.jtf_numero.setText("");
        
    }
    
    public void jbtnOrdenarClick(){
       
        int suma = 0;
        int promedio = 0;
      
        for(int i=0; i< view_ascendente.jlist_numeros.getModel().getSize(); i++){
            
            String cadena = view_ascendente.jlist_numeros.getModel().getElementAt(i);
            model_ascendente.numeros = Integer.parseInt(cadena);
            suma = suma + model_ascendente.numeros;
            
            
            
            view_ascendente.jl_resultado.setText(String.valueOf(suma));
            
        }
       
        //modelo_lista = (DefaultListModel) view_ascendente.jlist_numeros.getModel(); 
        
        
        //int[] valores = null;
        //model_ascendente.ordenamiento(valores);
    
    
    
    
    
}
    
}
