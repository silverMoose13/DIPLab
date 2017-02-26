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
public class Startup {

    public static void main(String[] args) {
        //always perform initialization of worker objects first

        //worker object
        //this is important this line. Follows Liskov Substitution Principle 
        //since we can swap out the new _____________.
        TipCalculator calc
                = new BartenderServiceTipCalculator(1, 5);
        TipCalculator calcTwo
                = new BaggageServiceTipCalculator(1, 5, ServiceQuality.GOOD);
        TipCalculator calcThree
                = new FoodServiceTipCalculator(15.00, ServiceQuality.GOOD);

        //only talk to the boss (high level object) not the low-level worker object
        //boss object
        TipCalculatorService service = new TipCalculatorService(calc);

        double tip = service.getTip();

        System.out.println(tip);

    }

}
