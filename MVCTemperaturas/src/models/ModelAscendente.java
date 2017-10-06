/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package models;

//import javax.swing.ListModel;


import views.ViewAscendente;
public class ModelAscendente {
    
  public  int numeros;
    int auxiliar;
    int suma = 0;
    int numero = 0;
    String cadena="";
    ViewAscendente view_ascendente;
    
    
    public int getNumeros(){
        
        return numeros;
        
    }
     

    public void setNumeros(int numeros) {
      
        this.numeros = numeros;
    }
    
    public int[] ordenamiento(int valores[]){
        
        int auxiliar;
        int longitud=valores.length;
        
        for(int i=1; i<longitud; i++){
            
            for(int j =0; j<longitud-1; j++){
                
                if(valores[j]>valores[j+1]){
                    
                    auxiliar=valores[j];
                    valores[j]=valores[j+1];
                    valores[j+1]=auxiliar;
                }
            }
        }
      return valores;  
        
    }
    
    
   
    
}
