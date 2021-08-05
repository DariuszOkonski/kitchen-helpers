package com.codecool.kitchenmanagement;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Chef extends Employee implements IShoutable {
    public Chef(String name, SimpleDateFormat birthDate, BigDecimal salary) {
        super(name, birthDate, salary);
    }

    @Override
    public void shout() {
        System.out.println("Chef is shouting");
    }

    public void requestIngredients() {
        System.out.println("Chef is requesting ingredients");
    }
}

