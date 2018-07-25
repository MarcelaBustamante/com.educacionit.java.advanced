package com.educacionit.java.advanced.classes;

public class AppNotification {
    public static  void main (String[] args){
        Notificator app= new Notificator();
        //app.setNotif(new EmailNotification());
        //clase anonima
        app.setNotif(new INotification() {

            @Override
            public void send(String from, String to, String msg) {
                System.out.println("Using anonim class");
            }
        });
        app.send("Raul Peña", "Homer","Esta es mi primera clase de java");

        //expr lambda
        app.setNotif((from,to,msg)->System.out.println(" Funcion lambda "+ from + to + msg ));
        app.send("Raul Peña", "Homer","Esta es mi primera clase de java");

    }
}
