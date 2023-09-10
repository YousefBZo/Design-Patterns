package dependency_injection_design_pattern_guice_framework;

import com.google.inject.Guice;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
 
/**
 *
 * @author Yousef
 */

public class Test {

    public static void main(String[] args) {
        Human ahmed = Guice.createInjector().getInstance(Human.class);
         System.out.println(ahmed);

    }
}
