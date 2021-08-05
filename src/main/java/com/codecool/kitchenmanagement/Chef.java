package com.codecool.kitchenmanagement;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Chef extends Employee {
    public Chef(String name, SimpleDateFormat birthDate, BigDecimal salary) {
        super(name, birthDate, salary);
    }
}
