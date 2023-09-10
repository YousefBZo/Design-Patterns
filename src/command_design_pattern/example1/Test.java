/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package command_design_pattern.example1;

/**
 *
 * @author Yousef
 */
public class Test {

    public static void main(String[] args) {
        StockMarket sm = new StockMarket();
        BuySharing bs = new BuySharing(sm);
        bs.setBuyerId("32");
        bs.setNoOfShares(321);
        bs.setPriceOfShares(33);
        bs.setTaxRate(12);
        bs.setSellerId("22");

        OpenCompany oc = new OpenCompany(sm);
        oc.setCompanyId("21");
        oc.setCompanyName("hello world");

        StockAgent sa = new StockAgent();
        sa.addStockCommand(bs);
        sa.addStockCommand(oc);
        sa.execute();
    }

}
