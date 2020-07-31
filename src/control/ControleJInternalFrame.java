/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package control;

import view.jinternalframe.calculator.SimpleCalculator;
import view.jinternalframe.convert.ConvertCoin;
import view.jinternalframe.convert.ConvertDistance;
import view.jinternalframe.convert.ConvertTime;

/**
 *
 * @author italo
 */
public final class ControleJInternalFrame {
    
    private SimpleCalculator simpleCalculator;
    private ConvertTime convertTime;
    private ConvertDistance convertDistance;
    private ConvertCoin convertCoin;

    public SimpleCalculator getSimpleCalculator() {
        return simpleCalculator == null ? new SimpleCalculator() : simpleCalculator;
    }

    public ConvertTime getConvertTime() {
        return convertTime == null ? new ConvertTime() : convertTime;
    }

    public ConvertDistance getConvertDistance() {
        return convertDistance == null ? new ConvertDistance() : convertDistance;
    }

    public ConvertCoin getConvertCoin() {
        return convertCoin == null ? new ConvertCoin() : convertCoin;
    }
    
}
