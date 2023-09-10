/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy_design_pattern.eample2;

/**
 *
 * @author Yousef
 */
public class DefensiveBehavior implements IBehaviour {

    @Override
    public void moveCommand() {
        System.out.println("Defensive Robot");
    }

}
