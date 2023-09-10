/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer_design_pattern;

import observer_design_pattern.NewsPublisher.Subscriber;

/**
 *
 * @author Yousef
 */
public class EmailSubscriber implements Subscriber {

    @Override
    public void update(String lastNews) {
        System.out.println("Email message is " + lastNews);

    }

}
