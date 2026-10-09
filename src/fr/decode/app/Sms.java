package fr.decode.app;

import fr.decode.app.interfaces.Notification;

class Sms implements Notification {

    @Override
    public void envoyer(String message) {
        System.out.println("Envoi d'un SMS avec le message : " + message);
    }
}

