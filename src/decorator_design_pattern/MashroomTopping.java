/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator_design_pattern;

/**
 *
 * @author Yousef
 */
public class MashroomTopping extends Decorator {

    public MashroomTopping(IPizza pizza) {
        super(pizza);
    }

    @Override
    public float calcPrice() {
        return pizza.calcPrice() + 1;
    }

    @Override
    public String getDescription() {
        return pizza.getDescription() + " + Mashroom topping";
    }

}
