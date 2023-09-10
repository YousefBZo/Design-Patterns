/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryMethod_design_pattern;

/**
 *
 * @author Yousef
 */
public class CarDriver extends Driver {

    @Override
    public Vehicle createVehicle() {
        return new Car();
    }
    
}
