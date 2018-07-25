package com.educacionit.java.advanced.classes;

public class EmailNotification implements  INotification {
    @Override
    public void send(String from, String to, String msg) {
        System.out.println("Sending email msg to %s" + from + to + msg);
    }
}
