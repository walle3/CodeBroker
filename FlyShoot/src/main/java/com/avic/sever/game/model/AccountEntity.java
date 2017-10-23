package com.avic.sever.game.model;

import org.jongo.marshall.jackson.oid.MongoId;

public class AccountEntity {
    @MongoId // auto
    private String accountId;

    private String password;

    public String getAccountId() {
        return accountId;
    }

    public void setAccountId(String accountId) {
        this.accountId = accountId;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}