/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy_design_pattern.example1;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yousef
 */
public class Test {

    public static void main(String[] args) {
        MyService myService = new MyService();
        ChargingBattery c1 = new ChargingBattery();
        LowBattery l1 = new LowBattery();
        myService.setStrategy(c1);
        myService.process();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
        myService.setStrategy(l1);
        myService.process();
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
