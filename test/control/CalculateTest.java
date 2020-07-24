/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import java.math.MathContext;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import static org.junit.Assert.*;
import org.junit.Test;

/**
 *
 * @author italo
 */
public class CalculateTest {

    public CalculateTest() {
    }

    @BeforeClass
    public static void setUpClass() {
    }

    @AfterClass
    public static void tearDownClass() {
    }

    @Before
    public void setUp() {
    }

    @After
    public void tearDown() {
    }

    /**
     * Test of somar method, of class Calculate.
     */
    @Test
    public void testSomar() {
        System.out.println("somar");
        double n1 = 2.0;
        double n2 = 2.0;
        Calculate instance = new Calculate();
        double expResult = 4.0;
        double result = instance.somar(n1, n2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of subtrair method, of class Calculate.
     */
    @Test
    public void testSubtrair() {
        System.out.println("subtrair");
        double n1 = 4.0;
        double n2 = 2.0;
        Calculate instance = new Calculate();
        double expResult = 2.0;
        double result = instance.subtrair(n1, n2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of multiplicar method, of class Calculate.
     */
    @Test
    public void testMultiplicar() {
        System.out.println("multiplicar");
        double n1 = 4.0;
        double n2 = 2.0;
        Calculate instance = new Calculate();
        double expResult = 8.0;
        double result = instance.multiplicar(n1, n2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of dividir method, of class Calculate.
     */
    @Test
    public void testDividir() {
        System.out.println("dividir");
        double n1 = 4.0;
        double n2 = 2.0;
        Calculate instance = new Calculate();
        double expResult = 2.0;
        double result = instance.dividir(n1, n2);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of porcentagem method, of class Calculate.
     */
    @Test
    public void testPorcentagem() {
        System.out.println("porcentagem");
        double porcentagem = 50.0;
        Calculate instance = new Calculate();
        double expResult = 0.5;
        double result = instance.porcentagem(porcentagem);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of porcentagemDeX method, of class Calculate.
     */
    @Test
    public void testPorcentagemDeX() {
        System.out.println("porcentagemDeX");
        double porcentagem = 50.0;
        double valor = 20.0;
        Calculate instance = new Calculate();
        double expResult = 10.0;
        double result = instance.porcentagemDeX(porcentagem, valor);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Test of porcentagemIncrementando method, of class Calculate.
     */
    @Test
    public void testPorcentagemIncrementando() {
        System.out.println("porcentagemIncrementando");
        double porcentagem = 50.0;
        double valor = 20.0;
        Calculate instance = new Calculate();
        double expResult = 30.0;
        double result = instance.porcentagemIncrementando(porcentagem, valor);
        assertEquals(expResult, result, 0.0);
    }
}
