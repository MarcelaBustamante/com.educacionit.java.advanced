package com.educacionit.java.advanced.classes;

public class Notificator {
    public void setNotif(INotification notif) {
        this.notif = notif;
    }

    private  INotification notif;

    public void send (String from , String to ,String msg){
        this.notif.send(from, to , msg);
    }

}
