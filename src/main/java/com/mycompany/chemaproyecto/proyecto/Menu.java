/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.chemaproyecto.proyecto;

/**
 *
 * @author marvkare
 */
public class Menu {
    
    public double resultado ;
    
    public void suma (double n1, double n2){
        resultado = n1 + n2 ;
    }
    public void resta (double n1, double n2 ){   
        resultado = n1 - n2;
    }
    public void multiplicacion (double n1, double n2){
        resultado = n1 * n2;
    }
    public void divicion(double n1, double n2){
        resultado = n1 / n2;
        
    }
    
    public void volumenCilindro (double altura , double radio){
        resultado = Math.PI*(Math.pow(radio, 2)*(altura));
        
    }
    
    public void  volumenEsfera (double radio){
        resultado = ((Math.PI*4)*(Math.pow(radio, 3)))/3;
        System.out.println(resultado);
    }
    
    public void volumenCubo(double lado){
        resultado = lado * lado *lado ;
    }
    
    
    
}
