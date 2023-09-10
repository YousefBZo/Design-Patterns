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
public class Street {

    City city;

    @Inject
    public Street(City cy) {
        this.city = cy;
    }

    @Override
    public String toString() {
        return "Street{" + "city=" + city + '}';
    }

}
