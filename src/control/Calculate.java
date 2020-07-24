/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

/**
 *
 * @author italo
 */
public class Calculate {

    public double somar(double n1, double n2) {
        return n1 + n2;
    }

    public double subtrair(double n1, double n2) {
        return n1 - n2;
    }

    public double multiplicar(double n1, double n2) {
        return n1 * n2;
    }

    public double dividir(double n1, double n2) {
        return n1 / n2;
    }

    public double porcentagem(double porcentagem) {
        return porcentagem / 100;
    }

    public double porcentagemDeX(double porcentagem, double valor) {
        return porcentagem(porcentagem) * valor;
    }
    
    public double porcentagemIncrementando(double porcentagem, double valor) {
        return porcentagemDeX(porcentagem, valor) + valor;
    }

    public double raizQuadrada(double raiz) {
        return Math.pow(raiz, 2);
    }
}
