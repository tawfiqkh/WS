package models;

import java.util.Date;

public class Account {

    private int code;
    private double amount;
    private Date createdAt;

    public Account() {
    }

    public Account(int code, double amount, Date createdAt) {
        this.code = code;
        this.amount = amount;
        this.createdAt = createdAt;
    }

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }
}
