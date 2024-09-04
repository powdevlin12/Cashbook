package com.example.cashbook.entities;

public class Wallets {
    private int id;
    private String name;
    private int amountMoney;
    private int idUser;

    public Wallets(int id, String name, int amountMoney, int idUser) {
        this.id = id;
        this.name = name;
        this.amountMoney = amountMoney;
        this.idUser = idUser;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmountMoney() {
        return amountMoney;
    }

    public void setAmountMoney(int amountMoney) {
        this.amountMoney = amountMoney;
    }

    public int getIdUser() {
        return idUser;
    }

    public void setIdUser(int idUser) {
        this.idUser = idUser;
    }
}
