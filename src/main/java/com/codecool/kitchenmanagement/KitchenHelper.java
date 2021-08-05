package com.codecool.kitchenmanagement;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Random;

public class KitchenHelper extends Employee {
    private int MAX_INGREDIENTS_QUANTITY = 3;
    private HashMap<Ingredients, Integer> ingredients = new HashMap<>();

    public KitchenHelper(String name, SimpleDateFormat birthDate, BigDecimal salary) {
        super(name, birthDate, salary);
        setIngredients();
        System.out.println(ingredients);
    }

    private void setIngredients() {
        Random random = new Random();
        for (var ingredient: Ingredients.values()) {
            var quantity = random.nextInt(MAX_INGREDIENTS_QUANTITY + 1);
            ingredients.put(ingredient, quantity);
        }
    }
}
