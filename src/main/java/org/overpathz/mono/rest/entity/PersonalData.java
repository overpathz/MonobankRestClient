package org.overpathz.mono.rest.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class PersonalData {
    private String clientId;
    private String name;
    private String webHookUrl;
    private String permissions;
    private List<Accounts> accounts;

    public PersonalData() {
    }

    public PersonalData(String clientId, String name, String webHookUrl, String permissions, List<Accounts> accounts) {
        this.clientId = clientId;
        this.name = name;
        this.webHookUrl = webHookUrl;
        this.accounts = accounts;
        this.permissions = permissions;
    }

    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getWebHookUrl() {
        return webHookUrl;
    }

    public void setWebHookUrl(String webHookUrl) {
        this.webHookUrl = webHookUrl;
    }

    public List<Accounts> getAccounts() {
        return accounts;
    }

    public void setAccounts(List<Accounts> accounts) {
        this.accounts = accounts;
    }

    public String getPermissions() {
        return permissions;
    }

    public void setPermissions(String permissions) {
        this.permissions = permissions;
    }

    @Override
    public String toString() {
        return "PersonalData{" + "\n" +
                "\tclientId=" + clientId + "\n" +
                "\tname=" + name + "\n" +
                "\twebHookUrl=" + webHookUrl + "\n" +
                "\tpermissions=" + permissions + "\n" +
                "\taccounts=" + accounts + '}';
    }
}