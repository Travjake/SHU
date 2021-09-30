package com.company;

import java.lang.reflect.Constructor;
import java.sql.Date;

public class account {
    private int id = 0;
    private double balance = 0;
    private double annualInterestRate = 0;
    private Date dateCreated;

    account defaultAccount = new account();
}
