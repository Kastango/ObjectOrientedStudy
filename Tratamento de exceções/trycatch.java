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
public class trycatch {
    public static void main(String args[]) {
        // input
        Scanner entrada =  new Scanner(System.in);
        entrada.useLocale(Locale.ENGLISH);
        int n;
        
        try {
            n = entrada.nextInt();
            System.out.println(n*2);
        } catch (Exception e){
            System.out.println("Entrada Incorreta: informe somente inteiros.");
        }
       
    }
      
}
