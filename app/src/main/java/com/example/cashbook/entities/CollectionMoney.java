package com.example.cashbook.entities;

public class CollectionMoney {
    private int id;
    private int amountCollectionMoney;
    private String desciption;
    private String idCategory;
    private String idUser;
    private String idWallets;

    public CollectionMoney(int id, int amountCollectionMoney, String desciption, String idCategory, String idUser, String idWallets) {
        this.id = id;
        this.amountCollectionMoney = amountCollectionMoney;
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

    public int getAmountCollectionMoney() {
        return amountCollectionMoney;
    }

    public void setAmountCollectionMoney(int amountCollectionMoney) {
        this.amountCollectionMoney = amountCollectionMoney;
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
