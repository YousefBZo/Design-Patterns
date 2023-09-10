/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy_design_pattern.example1;

/**
 *
 * @author Yousef
 */
public class MyService {

    IStrategy strategy;

    public void setStrategy(IStrategy strategy) {
        this.strategy = strategy;
    }

    public void process() {
        if (strategy != null) {
            strategy.execute();
        }
    }
}
