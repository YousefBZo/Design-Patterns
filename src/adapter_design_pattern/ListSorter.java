/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter_design_pattern;

import java.util.Collections;
import java.util.List;

/**
 *
 * @author Yousef
 */
public class ListSorter {

    public List<Integer> sort(List<Integer> items) {
        System.out.println("This is the list sorter");
        Collections.sort(items);
        return items;
    }
}
