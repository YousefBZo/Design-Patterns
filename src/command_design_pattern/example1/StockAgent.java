/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command_design_pattern.example1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Yousef
 */
public class StockAgent {
    private List<StockCommand> sc = new ArrayList<>();
public void addStockCommand(StockCommand sc){
    this.sc.add(sc);
}
public void execute(){
    for (StockCommand stockCommand : sc) {
        stockCommand.execute();
    }
}
}
