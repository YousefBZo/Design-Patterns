/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer_design_pattern;

/**
 *
 * @author Yousef
 */
public class SMSSubscriber implements NewsPublisher.Subscriber {

    @Override
    public void update(String lastNews) {
        System.out.println("SMS message is " + lastNews);

    }

}
