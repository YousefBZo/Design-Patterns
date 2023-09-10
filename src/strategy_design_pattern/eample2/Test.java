/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy_design_pattern.eample2;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yousef
 */
public class Test {

    public static void main(String[] args) {
        Robot robot = new Robot();
        Robot robot2 = new Robot();
        Robot robot3 = new Robot();
        NormalBehavior normal = new NormalBehavior();
        AgressiveBehavior agressive = new AgressiveBehavior();
        DefensiveBehavior defensive = new DefensiveBehavior();

        robot.setIb(normal);
        robot.move();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

        robot2.setIb(agressive);
        robot2.move();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }

        robot3.setIb(defensive);
        robot3.move();
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {
            Logger.getLogger(Test.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
