package fr.decode.app;

import fr.decode.app.interfaces.Notification;

class Email implements Notification {

    @Override
    public void envoyer(String message) {
        System.out.println("Envoi d'un email avec le message : " + message);
    }
}
