/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package dependency_injection_design_pattern_guice_framework;

import com.google.inject.Inject;

/**
 *
 * @author Yousef
 */
public class Address {
      Street street;
    
    @Inject
    public Address(Street s){
        this.street = s;
    }

    @Override
    public String toString() {
        return "Address{" + "street=" + street + '}';
    }
    
}
