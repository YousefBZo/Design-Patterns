/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package observer_design_pattern;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Yousef
 */
public class NewsPublisher {
    //
    private Set<Subscriber> subscribers = new HashSet<>();
    
    public void addSubscriber(Subscriber subscriber) {
        this.subscribers.add(subscriber);
    }
    
    public void removeSubscriber(Subscriber subscriber) {
        this.subscribers.remove(subscriber);
    }

    public void notify(String news) {
        for (Subscriber subscriber : subscribers) {
            subscriber.update(news);
        }
    }
    
    public interface Subscriber {
        
        public void update(String lastNews);
    }
    
}
