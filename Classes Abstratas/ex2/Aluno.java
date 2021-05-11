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
public abstract class Aluno extends Pessoa {
    private int ra;
    private double notaDisciplinas;

    public abstract double getNotaFinal();

    public int getRa() { return ra; }
    public void setRa(int ra) { this.ra = ra; }
    public double getNotaDisciplinas() { return notaDisciplinas; }
    public void setNotaDisciplinas(double notaDisciplinas) { this.notaDisciplinas = notaDisciplinas; }
}
