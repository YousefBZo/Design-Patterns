/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package builder_desing_pattern;

/**
 *
 * @author Yousef
 */
public class Test {

    public static void main(String[] args) {
        Car.builder b = new Car.builder();
        b.setColor("red");
        b.setName("ford");
        b.setSpeed("500");
        b.setYear("1222");
        Car c = b.build();
        System.out.println(c);
    }
}
