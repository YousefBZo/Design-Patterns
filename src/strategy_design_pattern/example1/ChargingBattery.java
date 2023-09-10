/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy_design_pattern.example1;

/**
 *
 * @author Yousef
 */
public class ChargingBattery implements IStrategy {

    @Override
    public void execute() {
        System.out.println("Charing: Get updates every 1 minute from the server, and send notification to the client");
    }

}
