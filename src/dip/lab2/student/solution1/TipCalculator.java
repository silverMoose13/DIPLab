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
public interface TipCalculator {

    //remember command query seperation principle
    //don't use getters in the return since it can be bypassed
    //instead use a constructor so that values have to be passed
    //when the object is instantiated
    double getCalculatedTip();

    double getFairTip();

    double getGoodTip();

    double getPoorTip();

    ServiceQuality getServiceQuality();

    void setFairTip(double fairTip);

    void setGoodTip(double goodTip);

    void setPoorTip(double poorTip);

    void setServiceQuality(ServiceQuality serviceQuality);
    
}
