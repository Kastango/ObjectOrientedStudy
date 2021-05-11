/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utfpr.cch8;

/**
 *
 * @author Arthur
 */
public class MinhaClasse implements MinhaInterface {
    private String frase;
    
    
    

    @Override
    public void concatenar(String s) {
        setFrase(frase.concat(s));
    }

    @Override
    public int tamanho() {
        return frase.length();
    }

    @Override
    public String getFrase() {
        return frase;
    }

    @Override
    public void setFrase(String frase) {
        this.frase = frase;
    }
    
}
