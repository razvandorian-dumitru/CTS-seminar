package com.company.clase3;

import com.company.interfete.NotificationService;

public class SMSNotificationService implements NotificationService {

    public void sendNotification(String message) {
        System.out.println("Message: " + message);
    }
}
