/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package databus_design_pattern;

import databus_design_pattern.DataBus.News;

/**
 *
 * @author Yousef
 */
public class Aljzeera implements DataBus.Subscriber {

    public void sendAll(String news) {
        News message = new News();
        message.setNews(news);
        message.setSender(this);
        DataBus.getInstance().publish(message);
    }

    @Override
    public void newsReceived(DataBus.News news) {
        System.out.println("The news is " + news.getNews() + " from " + news.getSender().getClass().getName());
    }

}
