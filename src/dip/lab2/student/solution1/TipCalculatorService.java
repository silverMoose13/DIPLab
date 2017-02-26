/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dip.lab2.student.solution1;

/**
 *
 * @author agnas
 */
public class TipCalculatorService {
    //this represents the the high level module say that
    //we can plug and play (interchangable)
    
    //use the abstraction here, not the concrete name
    //This is the Liskov Substitution Principle
    private TipCalculator tipCalculator;

    public TipCalculatorService(TipCalculator tipCalculator) {
        setTipCalculator(tipCalculator);
    }
    
    //this is not a part of this class. It is simply passing in the tipcalculator
    public double getTip() {
        return tipCalculator.getCalculatedTip();
    }
    

    public final TipCalculator getTipCalculator() {
        return tipCalculator;
    }

    public void setTipCalculator(TipCalculator tipCalculator) {
        //need validation
        this.tipCalculator = tipCalculator;
        
    }
    
    
}
