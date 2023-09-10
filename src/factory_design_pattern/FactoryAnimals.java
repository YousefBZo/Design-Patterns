/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package factory_design_pattern;

/**
 *
 * @author Yousef
 */
public class FactoryAnimals {

    public static Animals createAnimals(String nameAnimal) throws ClassNotFoundException, InstantiationException, IllegalAccessException {

        return (Animals) Class.forName("factory_design_patter." + nameAnimal).newInstance();

    }
}
