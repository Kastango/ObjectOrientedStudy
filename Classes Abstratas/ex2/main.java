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
public class main {
    
    public static void main(String args[]) {
        Aluno alunos[] = new Aluno[4];
        alunos[0] = new AlunoGraduacao("Jonas", 1234, 7.8, 10.0); // nome, ra, notadisciplinas, notatcc
        alunos[1] = new AlunoGraduacao("Maria", 5522, 9.8, 7.0);
        alunos[2] = new AlunoMestrado("Pedro", 3311, 7.5, 8.5, 0); // nome, ra, notadisciplinas, notadissertacao, artigos
        alunos[3] = new AlunoMestrado("Patricia", 7098, 9.5, 9.5, 3);
        for (int i=0; i<alunos.length; i++){
            System.out.printf("Aluno(a): %s, Nota Final: %.2f\n", alunos[i].getNome(), alunos[i].getNotaFinal());
        }
    }
}
