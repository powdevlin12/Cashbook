package com.example.cashbook.entities;

public class Categories {
    private int id;
    private String type;
    private boolean isSpend;

    public Categories(int id, String type, boolean isSpend) {
        this.id = id;
        this.type = type;
        this.isSpend = isSpend;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public boolean isSpend() {
        return isSpend;
    }

    public void setSpend(boolean spend) {
        isSpend = spend;
    }
}
