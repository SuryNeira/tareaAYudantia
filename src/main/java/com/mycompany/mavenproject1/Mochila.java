/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject1;

import java.util.ArrayList;

/**
 *
 * @author Sala-2-11-PC17
 */
public class Mochila extends Inventario{
    
    public Mochila(int capacidad, ArrayList<Interactuables> ListaObjetos) {
        super(capacidad, ListaObjetos);
    }
    
    // usar objeto :(
    
    public void UsarObjeto(int idObjeto){ //si usa un objeto desaparece de la mochila
        for(int i=0; i<capacidad; i++){
            
            if(ListaObjetos.get(i).getIdObjeto()==idObjeto)
                ListaObjetos.remove(i);
                
            
        }
        
        
    }
    
    
    
}
