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
public class StartUp {
    
    public static void main(String[] args) {
        //Initialize worker object
        
//        RestaurantTipCalculator calc = new RestaurantTipCalculator(100, .1);
        
        BartenderTipCalculator calc = new BartenderTipCalculator(10, 1);
        TipService tipService = new TipService(calc);
        double tip = tipService.calcTip();  
        
        System.out.println("The tip is: " + tip);
        
        BartenderTipCalculator cal2 = new BartenderTipCalculator(5, .85);
        
    }
    
}
