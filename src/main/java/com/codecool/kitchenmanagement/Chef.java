package com.codecool.kitchenmanagement;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class Chef extends Employee implements IShoutable {
    public Chef(String name, SimpleDateFormat birthDate, BigDecimal salary) {
        super(name, birthDate, salary);
    }

    @Override
    public void shout() {
        System.out.println("Chef is shouting");
    }

    public Ingredients requestIngredients(Ingredients ingredient, List<KitchenHelper> kitchenHelpers) {
        for (int i = 0; i < kitchenHelpers.size(); i++) {
            var quantity = kitchenHelpers.get(i).getIngredients().get(ingredient);
            if(quantity > 0) {
                kitchenHelpers.get(i).getIngredients().put(ingredient, quantity - 1);
                return ingredient;
            }
        }
        System.out.println("!!! We're all out !!!");
        return null;
    }
}

