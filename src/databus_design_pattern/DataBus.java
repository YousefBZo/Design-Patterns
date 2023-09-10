/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databus_design_pattern;

import java.util.HashSet;
import java.util.Set;

/**
 *
 * @author Yousef
 */
public class DataBus {

    private Set<Subscriber> subscribers = new HashSet<>();
    private static DataBus instance = null;

    private DataBus() {

    }

    public static DataBus getInstance() {
        if (instance == null) {
            instance = new DataBus();
        }
        return instance;
    }

    public void subscribe(Subscriber s) {
        subscribers.add(s);

    }

    public void unsubscribe(Subscriber s) {
        subscribers.remove(s);
    }

    public void publish(News news) {
        for (Subscriber subscriber : subscribers) {
            if (!subscriber.equals(news.getSender())) {
                subscriber.newsReceived(news);
            }
        }
    }

    public interface Subscriber {

        public void newsReceived(News news);
    }

    public static class News {

        private String News;
        private Subscriber sender;

        public News(String News, Subscriber sender) {
            this.News = News;
            this.sender = sender;
        }

        public News() {
        }

        public String getNews() {
            return News;
        }

        public void setNews(String News) {
            this.News = News;
        }

        public Subscriber getSender() {
            return sender;
        }

        public void setSender(Subscriber sender) {
            this.sender = sender;
        }

    }
}
