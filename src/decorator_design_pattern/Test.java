/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package decorator_design_pattern;

/**
 *
 * @author Yousef
 */
public class Test {

    public static void main(String[] args) {
        IPizza pizza = new BigPizza(new TunaTopping(new CheesePizza()));
        System.out.println(pizza.getDescription());
        System.out.println(pizza.calcPrice());

    }

}
