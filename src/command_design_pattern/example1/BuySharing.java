/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command_design_pattern.example1;

/**
 *
 * @author Yousef
 */
public class BuySharing implements StockCommand {

    private String buyerId, sellerId;
    private int noOfShares;
    private double taxRate, priceOfShares;
    private StockMarket sm;

    public BuySharing(StockMarket sm) {
        this.sm = sm;
    }

    public String getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(String buyerId) {
        this.buyerId = buyerId;
    }

    public String getSellerId() {
        return sellerId;
    }

    public void setSellerId(String sellerId) {
        this.sellerId = sellerId;
    }

    public int getNoOfShares() {
        return noOfShares;
    }

    public void setNoOfShares(int noOfShares) {
        this.noOfShares = noOfShares;
    }

    public double getTaxRate() {
        return taxRate;
    }

    public void setTaxRate(double taxRate) {
        this.taxRate = taxRate;
    }

    public double getPriceOfShares() {
        return priceOfShares;
    }

    public void setPriceOfShares(double priceOfShares) {
        this.priceOfShares = priceOfShares;
    }

    @Override

    public void execute() {
        sm.buyShares(buyerId, sellerId, noOfShares, taxRate, priceOfShares);
    }

}
