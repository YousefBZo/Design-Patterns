/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer_design_pattern;

/**
 *
 * @author Yousef
 */
public class Test {

    public static void main(String[] args) {
        EmailSubscriber email = new EmailSubscriber();
        SMSSubscriber SMS = new SMSSubscriber();
        NewsPublisher newsPublisher = new NewsPublisher();
        newsPublisher.addSubscriber(email);
        newsPublisher.addSubscriber(SMS);
        newsPublisher.notify("Palestine is free, Not exist to Israel");
    }
}
