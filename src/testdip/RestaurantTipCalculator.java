/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testdip;

/**
 *
 * @author cwerning
 */
public class RestaurantTipCalculator implements TipCalculator{

    private double tipPercent;
    private double billAmount;

    public RestaurantTipCalculator(double billAmount, double tipPercent) {
        this.billAmount = billAmount;
        this.tipPercent = tipPercent;
    }

    @Override
    public double calcTip() {
        return billAmount * tipPercent;
    }

    public double getTipPercent() {
        return tipPercent;
    }

    public void setTipPercent(double tipPercent) {
        this.tipPercent = tipPercent;
    }

}
