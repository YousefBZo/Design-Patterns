/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package adapter_design_pattern;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * @author Yousef
 */
public class AdapterSorter extends ArraySorter {

    ListSorter listSorter;

    public AdapterSorter() {
        this.listSorter = new ListSorter();
    }

    @Override
    public int[] sort(int[] numbers) {
        List<Integer> list1 = new ArrayList<>();
        for (int n : numbers) {
            list1.add(n);
        }

        List<Integer> outputList = listSorter.sort(list1);

        int[] outputArr = new int[outputList.size()];
        for (int i = 0; i < outputList.size(); i++) {
            outputArr[i] = outputList.get(i);
        }

        return outputArr;
    }

}
