/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utfpr.CCH9;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Arthur
 */
public class NewClass {
    public static void main(String args[]) {
        // input
        int i, soma = 0;
        Scanner entry =  new Scanner(System.in);
        entry.useLocale(Locale.ENGLISH);
        
        //alocando espaço
        int tam = 10, aux = tam;
        int vet[] = new int[tam];
        for(i = 0; i < tam; i++){
            try {
                    vet[i] = entry.nextInt();
                    soma += vet[i];
                
            } catch (Exception e){
                entry.next();
                aux--;
            }
        }
        double media = (float)soma/tam;
        System.out.printf("Entradas aceitas: %d, média: %.2f\n", aux, media);        
    }
}
