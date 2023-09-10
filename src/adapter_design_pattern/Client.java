/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter_design_pattern;

/**
 *
 * @author Yousef
 */
public class Client {

    private ArraySorter sorter;

    public void setSorter(ArraySorter sorter) {
        this.sorter = sorter;
    }

    public int[] process(int[] items) {
        // do something with items
        int[] sortedItems = sorter.sort(items);
        return sortedItems;
    }
}
