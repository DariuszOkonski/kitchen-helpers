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

        // TODO: to remove
//        System.out.println(ingredients);
    }

    public void showIngredients() {
        System.out.println("Ingredients");
        System.out.println(ingredients);
    }

    public HashMap<Ingredients, Integer> getIngredients() {
        return ingredients;
    }

    private void setIngredients() {
        Random random = new Random();
        for (var ingredient: Ingredients.values()) {
            var quantity = random.nextInt(MAX_INGREDIENTS_QUANTITY + 1);
            ingredients.put(ingredient, quantity);
        }
    }
}
