/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package memento_design_pattern;

/**
 *
 * @author Yousef
 */
public class Wallet {

    private String coin;
    private float amount;

    public String getCoin() {
        return coin;
    }

    public void setCoin(String Coin) {
        this.coin = Coin;
    }

    public float getAmount() {
        return amount;
    }

    public void setAmount(float Amount) {
        this.amount = Amount;
    }

    public class Memento {

        private String coin;
        private float amount;

        public Memento(String coin, float amount) {
            this.coin = coin;
            this.amount = amount;
        }
    }

    public Memento getState() {
        return new Memento(coin, amount);
    }

    public void restore(Memento m) {
        this.coin = m.coin;
        this.amount = m.amount;

    }

    @Override
    public String toString() {
        return "Wallet{" + "coin=" + coin + ", amount=" + amount + '}';
    }

}
