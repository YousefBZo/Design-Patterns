/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator_design_pattern;

/**
 *
 * @author Yousef
 */
public abstract class Decorator implements IPizza {

    IPizza pizza;

    public Decorator(IPizza pizza) {
        this.pizza = pizza;
    }

}
