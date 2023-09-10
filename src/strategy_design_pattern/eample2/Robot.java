/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy_design_pattern.eample2;

/**
 *
 * @author Yousef
 */
public class Robot {

    IBehaviour ib;

    public void setIb(IBehaviour ib) {
        this.ib = ib;
    }

    public void move() {
        if (ib != null) {
            ib.moveCommand();
        }
    }
}
