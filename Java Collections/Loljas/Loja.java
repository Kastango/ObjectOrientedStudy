/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utfpr.cch10.Loljas;

/**
 *
 * @author Arthur
 */

import java.util.ArrayList;
import java.util.Comparator;
        

public class Loja {
    private ArrayList<Produto> produtos = new ArrayList<>();
    
    public void adicionar(Produto p){
        this.produtos.add(p);
    }
    
    public Produto getProdutoMaisCaro(){
        int index = 0;
        double aux = 0;
        int tam = this.produtos.size();

        for (int i = 0; i < tam; i++){
            if (aux < this.produtos.get(i).getPreco()){
                aux = this.produtos.get(i).getPreco();
                index = i;
            }
        }
        return produtos.get(index);
    }
    
    public Produto getProdutoMenosCaro(){
        int index = 0;
        double aux = 100;
        int tam = this.produtos.size();
        
        for (int i = 0; i < tam; i++){
            if(aux > this.produtos.get(i).getPreco()){
               aux = this.produtos.get(i).getPreco();
               index = i;
            }
        }
        return produtos.get(index);
                
    }
    
}
