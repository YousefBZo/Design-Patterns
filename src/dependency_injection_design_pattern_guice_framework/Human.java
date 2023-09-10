package dependency_injection_design_pattern_guice_framework;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import com.google.inject.Inject;
/**
 *
 * @author Yousef
 */
public class Human {
      Address address;
    
    @Inject
    public Human(Address a){
        this.address = a;
    }

    @Override
    public String toString() {
        return "Human{" + "address=" + address + '}';
    }
    
}
