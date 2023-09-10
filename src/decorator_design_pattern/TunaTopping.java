/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator_design_pattern;

/**
 *
 * @author Yousef
 */
public class TunaTopping extends Decorator {

    public TunaTopping(IPizza pizza) {
        super(pizza);
    }

    @Override
    public float calcPrice() {
        return pizza.calcPrice() + 50;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Tuna topping";
    }
}
