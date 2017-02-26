package dip.lab2.student.solution1;

/**
 *
 * @author agnas
 */
public class FoodServiceTipCalculator implements TipCalculator {

    private double billAmount;
    //this allows it to be more flexible and these values can change in 
    //the getters and setters
    private double goodTip = .20;
    private double fairTip = .15;
    private double poorTip = .10;
    private ServiceQuality serviceQuality;

    //BEWARE of type safety on the parameters here. Use enum. ServiceQuality is an enum.
    public FoodServiceTipCalculator(double billAmount, ServiceQuality serviceQuality) {
        this.billAmount = billAmount;
        this.serviceQuality = serviceQuality;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
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
                tip = billAmount * goodTip;
                break;
            case FAIR:
                tip = billAmount * fairTip;
                break;
            case POOR:
                tip = billAmount * poorTip;
                break;
        }
        return tip;
    }

}
