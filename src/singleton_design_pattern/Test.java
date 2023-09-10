/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton_design_pattern;

import java.io.FileNotFoundException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Yousef
 */
public class Test {

    public static void main(String[] args) {
        FileReader fr = FileReader.getReader();
        try {
            fr.printFile("singleton_design_pattern/fileReader.txt");
        } catch (FileNotFoundException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
