package dip.lab2.student.solution1;

/**
 *
 * @author agnas
 */

//note this lab is not including validation, final, setters in the consctructor, etc...
public class BartenderServiceTipCalculator implements TipCalculator {

    //ignore the remaining methods that aren't doing anything here like goodtip and service quality 
    //related stuff. You would rethink the interface structure. But this was rushed in class
    
    private double amountPerDrink;
    private int drinkCount;
    //this allows it to be more flexible and these values can change in 
    //the getters and setters
    private double goodTip = .20;
    private double fairTip = .15;
    private double poorTip = .10;
    private ServiceQuality serviceQuality;

    //BEWARE of type safety on the parameters here. Use enum. ServiceQuality is an enum.
    public BartenderServiceTipCalculator(double amountPerDrink, int drinkCount) {
        this.amountPerDrink = amountPerDrink;
        this.serviceQuality = serviceQuality;
        this.drinkCount = drinkCount;
    }

    public double getAmountPerDrink() {
        return amountPerDrink;
    }

    public void setAmountPerDrink(double amountPerDrink) {
        this.amountPerDrink = amountPerDrink;
    }

    public int getDrinkCount() {
        return drinkCount;
    }

    public void setDrinkCount(int drinkCount) {
        this.drinkCount = drinkCount;
    }

    @Override
    public double getGoodTip() {
        return goodTip;
    }

    @Override
    public void setGoodTip(double goodTip) {
        this.goodTip = goodTip;
    }

    @Override
    public double getFairTip() {
        return fairTip;
    }

    @Override
    public void setFairTip(double fairTip) {
        this.fairTip = fairTip;
    }

    @Override
    public double getPoorTip() {
        return poorTip;
    }

    @Override
    public void setPoorTip(double poorTip) {
        this.poorTip = poorTip;
    }

    @Override
    public ServiceQuality getServiceQuality() {
        return serviceQuality;
    }

    @Override
    public void setServiceQuality(ServiceQuality serviceQuality) {
        this.serviceQuality = serviceQuality;
    }

    //remember command query seperation principle
    //don't use getters in the return since it can be bypassed
    //instead use a constructor so that values have to be passed
    //when the object is instantiated
    @Override
    public double getCalculatedTip() {
                return amountPerDrink * drinkCount;
    }

}
