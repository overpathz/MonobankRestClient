package org.overpathz.mono.rest.entity;

import java.util.List;

public class Accounts {
    private String id;
    private int currencyCode;
    private String cashbackType;
    private int balance;
    private int creditLimit;
    private List<String> maskedPan;
    private String type;
    private String iban;

    public Accounts() {
    }

    public Accounts(String id, int currencyCode, String cashbackType, int balance, int creditLimit, List<String> maskedPan, String type, String iban) {
        this.id = id;
        this.currencyCode = currencyCode;
        this.cashbackType = cashbackType;
        this.balance = balance;
        this.creditLimit = creditLimit;
        this.maskedPan = maskedPan;
        this.type = type;
        this.iban = iban;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public int getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(int currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getCashbackType() {
        return cashbackType;
    }

    public void setCashbackType(String cashbackType) {
        this.cashbackType = cashbackType;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public int getCreditLimit() {
        return creditLimit;
    }

    public void setCreditLimit(int creditLimit) {
        this.creditLimit = creditLimit;
    }

    public List<String> getMaskedPan() {
        return maskedPan;
    }

    public void setMaskedPan(List<String> maskedPan) {
        this.maskedPan = maskedPan;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIban() {
        return iban;
    }

    public void setIban(String iban) {
        this.iban = iban;
    }

    @Override
    public String toString() {
        return "Accounts{" +
                "\n\t\tid='" + id + "\n" +
                "\t\tcurrencyCode=" + currencyCode + "\n" +
                "\t\tcashbackType='" + cashbackType + "\n" +
                "\t\tbalance=" + balance + "\n" +
                "\t\tcreditLimit=" + creditLimit + "\n" +
                "\t\tmaskedPan={" + "\n\t\t\t" + maskedPan + "\n\t\t}\n" +
                "\t\ttype='" + type + "\n" +
                "\t\tiban='" + iban + "\n\t}";
    }
}
