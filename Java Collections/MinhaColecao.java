/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utfpr.cch10;

/**
 *
 * @author Arthur
 */
import java.util.ArrayList;

public class MinhaColecao {
    private ArrayList<String> array = new ArrayList<>();

    public void adicionar(String nome){
        if (!(array.contains(nome))) {
            this.array.add(nome);
        }
    }
    
    public void remover(String nome){
        int a = this.array.indexOf(nome);
        this.array.set(a, "");

    } 
    
    public void imprimir(){
        for(int i = 0; i < array.size(); i++){
            if(!(array.get(i).isEmpty())){
                System.out.println(String.valueOf(i) + "-" + array.get(i));
            }
        }
        if (array.isEmpty()){
            System.out.println("Lista vazia!");
        }
    } 
}
