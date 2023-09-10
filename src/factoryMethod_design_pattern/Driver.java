/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factoryMethod_design_pattern;

/**
 *
 * @author Yousef
 */
public abstract class Driver {

    public void driveVehicle(String loaction) {
        Vehicle myVehicle = createVehicle();
        myVehicle.drive();
        myVehicle.goLoctaion(loaction);
        myVehicle.stop();
    }

    public abstract Vehicle createVehicle();
}
