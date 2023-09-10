/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento_design_pattern;

import java.util.ArrayList;
import java.util.List;
import memento_design_pattern.Wallet.Memento;

/**
 *
 * @author Yousef
 */
public class CareTaker {

    List<Memento> states = new ArrayList<>();

    void addMemento(Memento m) {
        states.add(m);
    }
}
