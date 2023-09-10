/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databus_design_pattern;

/**
 *
 * @author Yousef
 */
public class Test {
    
    public static void main(String[] args) {
        
        Aljzeera aljzeera = new Aljzeera();
        CNN CNN = new CNN();
        DataBus.getInstance().subscribe(aljzeera);
        DataBus.getInstance().subscribe(CNN);
        aljzeera.sendAll("Free Palestine");
        CNN.sendAll("No exist to Israel");
    }
}
