/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utfpr.CCH9;

/**
 *
 * @author Arthur
 */
public class getTemperaturas {
    public static String getTemperatura(double temperaturas[], int indice)  {
        String range = "";
        try{
            range = "Temperatura[" + indice + "]: " + temperaturas[indice];
        }catch(Exception e){
            range = "Erro! Dados da exceção: " + e.getMessage();
        }
        
        return range;
    }
    
}
