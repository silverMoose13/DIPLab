package dip.lab2.student.solution1;

/**
 *
 * @author agnas
 */

//note this lab is not including validation, final, setters in the consctructor, etc...
public class BaggageServiceTipCalculator implements TipCalculator {

    private double baseRate;
    private int bagCount;
    //this allows it to be more flexible and these values can change in 
    //the getters and setters
    private double goodTip = .20;
    private double fairTip = .15;
    private double poorTip = .10;
    private ServiceQuality serviceQuality;

    //BEWARE of type safety on the parameters here. Use enum. ServiceQuality is an enum.
    public BaggageServiceTipCalculator(double baseRate, int bagCount, ServiceQuality serviceQuality) {
        this.baseRate = baseRate;
        this.serviceQuality = serviceQuality;
        this.bagCount = bagCount;
    }

    public double getBaseRate() {
        return baseRate;
    }

    public void setBaseRate(double baseRate) {
        this.baseRate = baseRate;
    }

    public int getBagCount() {
        return bagCount;
    }

    public void setBagCount(int bagCount) {
        this.bagCount = bagCount;
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
        //switch statments are great for ENUM
        //don't use return in the switch since you will have 
        //a maintenance nightmare. Instead create a sentinel value

        //don't hardcode in the tip either bc it makes it rigid
        //not everybody will tip those amounts so have the ability
        //of getters and setters or some other way to change the value
        double tip = 0;

        switch (serviceQuality) {
            case GOOD:
                tip = baseRate * bagCount * goodTip;
                break;
            case FAIR:
                tip = baseRate * bagCount * fairTip;
                break;
            case POOR:
                tip = baseRate * bagCount * poorTip;
                break;
        }
        return tip;
    }

}
