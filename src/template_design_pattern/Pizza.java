/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package template_design_pattern;

/**
 *
 * @author Yousef
 */
public abstract class Pizza {

    public final void preparePizza() {
        prepareBase();
        addElements();
        bakePizza();
    }

    abstract void addElements();

    abstract void prepareBase();

    abstract void bakePizza();
}
