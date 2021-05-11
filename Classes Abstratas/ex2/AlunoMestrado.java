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
public class AlunoMestrado extends Aluno {
    double notaDissertacao;
    int artigosPublicados;
    
    public AlunoMestrado(String nome, int ra, double notaDisciplinas, double notaDissertacao, int artigosPublicados){
        this.setNome(nome);
        this.setRa(ra);
        this.setNotaDisciplinas(notaDisciplinas);
        
        this.notaDissertacao = notaDissertacao;
        this.artigosPublicados = artigosPublicados;
        
    }

    public double getNotaDissertacao() {
        return notaDissertacao;
    }

    public void setNotaDissertacao(double notaDissertacao) {
        this.notaDissertacao = notaDissertacao;
    }

    public int getArtigosPublicados() {
        return artigosPublicados;
    }

    public void setArtigosPublicados(int artigosPublicados) {
        this.artigosPublicados = artigosPublicados;
    }
    
    @Override
    public double getNotaFinal(){
        if(this.artigosPublicados < 1){
            return 0;
        }
        else{
            return (getNotaDisciplinas() + this.notaDissertacao)/2;
        }
        
    }
    
    
}
