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
public class TipService {

    private TipCalculator tipCalc;

    public TipService(TipCalculator tipCalc) {
        this.tipCalc = tipCalc;
    }
    
    public double calcTip(){
        return tipCalc.calcTip();
    }

    public TipCalculator getTipCalc() {
        return tipCalc;
    }

    public void setTipCalc(TipCalculator tipCalc) {
        this.tipCalc = tipCalc;
    }

}
