/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator_design_pattern;

/**
 *
 * @author Yousef
 */
public class BigPizza extends Decorator {

    public BigPizza(IPizza pizza) {
        super(pizza);
    }

    @Override
    public float calcPrice() {
        return pizza.calcPrice() + (0.5f * pizza.calcPrice());
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " (big)";
    }

}
