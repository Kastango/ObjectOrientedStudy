/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.utfpr.cch8.areapumps;

/**
 *
 * @author Arthur
 */
abstract class figura {
    double lado, base, altura;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
}

class Quadrado extends figura implements AreaCalculavel {

    @Override
    public double calcularArea() {
        return getLado()*getLado();
    }
    
}

class Retangulo extends figura implements AreaCalculavel {

    @Override
    public double calcularArea() {
        return getLado()*getAltura();
    }
    
}

class Triangulo extends figura implements AreaCalculavel {

    @Override
    public double calcularArea() {
        return getBase()*getAltura();
    }
    
}
