package com.example.cashbook.entities;

public class SpendMoney {
    private int id;
    private int amountSpendMoney;
    private String desciption;
    private String idCategory;
    private String idUser;
    private String idWallets;

    public SpendMoney(int id, int amountSpendMoney, String desciption, String idCategory, String idUser, String idWallets) {
        this.id = id;
        this.amountSpendMoney = amountSpendMoney;
        this.desciption = desciption;
        this.idCategory = idCategory;
        this.idUser = idUser;
        this.idWallets = idWallets;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAmountSpendMoney() {
        return amountSpendMoney;
    }

    public void setAmountSpendMoney(int amountSpendMoney) {
        this.amountSpendMoney = amountSpendMoney;
    }

    public String getDesciption() {
        return desciption;
    }

    public void setDesciption(String desciption) {
        this.desciption = desciption;
    }

    public String getIdCategory() {
        return idCategory;
    }

    public void setIdCategory(String idCategory) {
        this.idCategory = idCategory;
    }

    public String getIdUser() {
        return idUser;
    }

    public void setIdUser(String idUser) {
        this.idUser = idUser;
    }

    public String getIdWallets() {
        return idWallets;
    }

    public void setIdWallets(String idWallets) {
        this.idWallets = idWallets;
    }
}
