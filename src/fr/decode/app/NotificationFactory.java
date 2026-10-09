package fr.decode.app;

import fr.decode.app.interfaces.Notification;

public class NotificationFactory {

    public static Notification creer(String canal, String message) {
        return switch (canal) {
            case "email" -> new Email();
            case "sms"   -> new Sms();
            default -> throw new IllegalArgumentException(canal);
        };
    }

}
