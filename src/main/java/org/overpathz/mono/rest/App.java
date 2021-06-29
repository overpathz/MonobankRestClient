package org.overpathz.mono.rest;

import org.overpathz.mono.rest.configuration.MyConfig;
import org.overpathz.mono.rest.entity.Accounts;
import org.overpathz.mono.rest.entity.PersonalData;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main( String[] args ) {
        ApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);

        ClientConnection connection = context.getBean("connection", ClientConnection.class);
        PersonalData clientInfo = connection.getPersonalDataParametrized();
        System.out.println(clientInfo);
    }
}
