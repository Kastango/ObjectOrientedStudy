/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utfpr.CCH7.ex2;

/**
 *
 * @author Arthur
 */
public class AlunoGraduacao extends Aluno {
    private double notaTCC;
    
    public AlunoGraduacao(String nome, int ra, double notaDisciplinas, double notaTCC){
        this.setNome(nome);
        this.setRa(ra);
        this.setNotaDisciplinas(notaDisciplinas);
        this.notaTCC = notaTCC;
        
    }
    
    public double getNotaTCC() {
        return notaTCC;
    }

    public void setNotaTCC(double notaTCC) {
        this.notaTCC = notaTCC;
    }
    
    @Override
    public double getNotaFinal(){
        return (getNotaDisciplinas() + this.notaTCC)/2;
    }
    
    
    
}
