/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento_design_pattern;

/**
 *
 * @author Yousef
 */
public class Test {

    public static void main(String[] args) {
        Wallet myWallet = new Wallet();
        CareTaker ct = new CareTaker();
        myWallet.setCoin("$");
        myWallet.setAmount(100f);
        myWallet.toString();
        ct.addMemento(myWallet.getState());

        myWallet.setAmount(150f);
        myWallet.toString();
        ct.addMemento(myWallet.getState());

        myWallet.setAmount(130f);
        myWallet.toString();
        ct.addMemento(myWallet.getState());

        myWallet.restore(ct.states.get(1));
        myWallet.toString();
        
 
    }
}
