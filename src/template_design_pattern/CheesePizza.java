/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template_design_pattern;

/**
 *
 * @author Yousef
 */
public class CheesePizza extends Pizza {

    @Override
    void prepareBase() {
        System.out.println("Preparing base for cheese pizza");
    }

    @Override
    void addElements() {
        System.out.println("Adding elements for cheese pizza");
    }

    @Override
    void bakePizza() {
        System.out.println("Baking cheese pizza");
    }

}
