/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory_design_pattern;

/**
 *
 * @author Yousef
 */
public class test {

    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Animals a = FactoryAnimals.createAnimals("Lions");
        a.age = 3;
        System.out.println(a.getAge());

    }
}
