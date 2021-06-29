package org.overpathz.mono.rest.service;

import netscape.javascript.JSObject;
import org.overpathz.mono.rest.entity.PersonalData;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.*;
import org.springframework.stereotype.Component;
import org.springframework.util.MultiValueMap;
import org.springframework.web.client.RestTemplate;

import java.util.Collections;

@Component("connection")
public class ClientConnection {

    private final String URL_MONO_CLIENT_INFO = "https://api.monobank.ua/personal/client-info";
    private final String URL_MONO_BANK_CURRENCY = "https://api.monobank.ua/bank/currency";

    // the value injects from the application.properties
    @Value("${x-token}")
    private String TOKEN;

    private final RestTemplate restTemplate;

    @Autowired
    public ClientConnection(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public PersonalData getClientInfo() {
        MultiValueMap<String, String> multiValueMap = new HttpHeaders();
        multiValueMap.add("X-Token", TOKEN);

        HttpHeaders headers = new HttpHeaders(multiValueMap);
        headers.setAccept(Collections.singletonList(MediaType.APPLICATION_JSON));

        HttpEntity<String> entity = new HttpEntity<>("body", headers);

        ResponseEntity<PersonalData> responseEntity = restTemplate.exchange(URL_MONO_CLIENT_INFO, HttpMethod.GET, entity,
                new ParameterizedTypeReference<PersonalData>() {
        });

        PersonalData data = responseEntity.getBody();

        return data;
    }

    public String getBankCurrency() {

        ResponseEntity<String> responseEntity = restTemplate.exchange(URL_MONO_BANK_CURRENCY, HttpMethod.GET, null,
                new ParameterizedTypeReference<String>() {
                });

        String data = responseEntity.getBody();
        return data;
    }

}
