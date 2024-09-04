package com.example.cashbook.entities;

public class User {
    private int id;
    private String name;
    private int totalMoney;
    private int debtMoney;
    private int loanMoney;

    public User(int id, String name, int totalMoney, int debtMoney, int loanMoney) {
        this.id = id;
        this.name = name;
        this.totalMoney = totalMoney;
        this.debtMoney = debtMoney;
        this.loanMoney = loanMoney;
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

    public int getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(int totalMoney) {
        this.totalMoney = totalMoney;
    }

    public int getDebtMoney() {
        return debtMoney;
    }

    public void setDebtMoney(int debtMoney) {
        this.debtMoney = debtMoney;
    }

    public int getLoanMoney() {
        return loanMoney;
    }

    public void setLoanMoney(int loanMoney) {
        this.loanMoney = loanMoney;
    }
}
