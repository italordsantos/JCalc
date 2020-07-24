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
public class Calcula {
    
    public double calculaSomar(double n1, double n2) {
        return n1 + n2;
    }
    
    public double calculaSubtrair(double n1, double n2) {
        return n1 - n2;
    }
    
    public double calculaMultiplicar(double n1, double n2) {
        return n1 * n2;
    }
    
    public double calculaDividir(double n1, double n2) {
        return n1 / n2;
    }
    
    public double calculaPorcentagem(double porcentagem, double valor) {
        return porcentagem / 100 * valor;
    }
    
    public double calculaPorcentagemIncrementando(double porcentagem, double valor) {
        return calculaPorcentagem(porcentagem, valor) + valor;
    }
    
    public double calculaPorcentagemDecrementando(double porcentagem, double valor) {
        return calculaPorcentagem(porcentagem, valor) - valor;
    }
    
    public double calculaPorcentagemMultiplicando(double porcentagem, double valor) {
        return calculaPorcentagem(porcentagem, valor) * valor;
    }
}
