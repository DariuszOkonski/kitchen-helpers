package com.codecool.kitchenmanagement;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Main {
    public static void main(String[] args) {

        var chef = new Chef("chef", new SimpleDateFormat("1980-01-20"), new BigDecimal(10000));

        System.out.println(chef.getName());
        System.out.println(chef.getSalary());
        System.out.println(chef.getBirthDate());
        chef.printTax();


    }
}

