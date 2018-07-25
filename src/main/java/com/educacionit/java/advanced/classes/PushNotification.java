package com.educacionit.java.advanced.classes;

public class PushNotification implements  INotification {

    @Override
    public void send(String from, String to, String msg) {
        System.out.println("Using push msg to " + from + to + msg);
    }
}
