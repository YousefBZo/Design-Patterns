/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter_design_pattern;

/**
 *
 * @author Yousef
 */
public class Test {

    public Test() {

        Client c = new Client();
        int[] numbers = {9, 2, 6, 4, 7};
        c.setSorter(new AdapterSorter());
        int[] output = c.process(numbers);
        for (int o : output) {
            System.out.println(o);
        }

    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        new Test();
    }
}
