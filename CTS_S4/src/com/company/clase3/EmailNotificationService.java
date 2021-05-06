package com.company.clase3;

import com.company.interfete.NotificationService;

public class EmailNotificationService implements NotificationService {

    public void sendNotification(String message) {
        System.out.println("Email: " + message);
    }
}
