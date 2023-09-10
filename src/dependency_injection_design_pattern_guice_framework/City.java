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
public class City {
     Country country;
    
    @Inject
    public City(Country c){
        this.country = c;
    }

    @Override
    public String toString() {
        return "City{" + "country=" + country + '}';
    }
    
}
