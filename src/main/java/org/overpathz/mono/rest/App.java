package org.overpathz.mono.rest;

import org.overpathz.mono.rest.configuration.MyConfig;
import org.overpathz.mono.rest.entity.PersonalData;
import org.overpathz.mono.rest.service.ClientConnection;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main( String[] args ) {

        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        ClientConnection connection = context.getBean("connection", ClientConnection.class);
        PersonalData data = connection.getClientInfo();
        System.out.println(data);
    }
}
