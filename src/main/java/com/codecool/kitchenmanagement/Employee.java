package com.codecool.kitchenmanagement;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;

public abstract class Employee {
    private String name;
    private SimpleDateFormat birthDate;
    private BigDecimal salary;

    public Employee(String name, SimpleDateFormat birthDate, BigDecimal salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public void printTax() {
        var tax = this.salary.multiply(new BigDecimal(0.99)).setScale(2, BigDecimal.ROUND_HALF_EVEN);
        System.out.println("My name is: " + this.name + ", my tax is: " + tax);
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate.toPattern();
    }

    public BigDecimal getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", birthDate=" + birthDate.toPattern() +
                ", salary=" + salary +
                '}';
    }
}

