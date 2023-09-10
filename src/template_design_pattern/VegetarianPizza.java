/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template_design_pattern;

/**
 *
 * @author Yousef
 */
public class VegetarianPizza extends Pizza {

    @Override
    void prepareBase() {
        System.out.println("Preparing base for vegetarian pizza");
    }

    @Override
    void addElements() {
        System.out.println("Adding elements for vegetarian pizza");
    }

    @Override
    void bakePizza() {
        System.out.println("Baking vegetarian pizza");
    }

}
