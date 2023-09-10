/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command_design_pattern.example1;

/**
 *
 * @author Yousef
 */
public class OpenCompany implements StockCommand {

    private String companyId, companyName;
    private int noOfShares;
    private double taxRate, priceOfShares;
    private StockMarket sm;

    public OpenCompany(StockMarket sm) {
        this.sm = sm;
    }

    public String getCompanyId() {
        return companyId;
    }

    public void setCompanyId(String companyId) {
        this.companyId = companyId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
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

    public StockMarket getSm() {
        return sm;
    }

    public void setSm(StockMarket sm) {
        this.sm = sm;
    }

    @Override
    public void execute() {
        sm.openCompany(companyId, companyName, noOfShares, taxRate, priceOfShares);
    }

}
