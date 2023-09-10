/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package iterator_design_pattern;

import java.util.Iterator;

/**
 *
 * @author Yousef
 */
public class Test {

    public static void main(String[] args) {
        Matrix<Integer> m = new Matrix<>(3, 5);

        for (int i = 0; i < m.getRow(); i++) {

            for (int j = 0; j < m.getColumn(); j++) {
                m.setItem(i * j, i, j);
            }
        }

        Iterator<Integer> iter = m.getIterator();
        while (iter.hasNext()) {
            System.out.println(iter.next());
        }
    }
}
