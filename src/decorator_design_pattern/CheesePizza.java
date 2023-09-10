/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator_design_pattern;

/**
 *
 * @author Yousef
 */
public class CheesePizza implements IPizza {

    public CheesePizza() {
        // TODO Auto-generated constructor stub
    }

    @Override
    public float calcPrice() {
        return 2;
    }

    @Override
    public String getDescription() {
        return "Pizza with cheese topping";
    }

}
