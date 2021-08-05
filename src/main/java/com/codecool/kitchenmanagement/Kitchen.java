package com.codecool.kitchenmanagement;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

public class Kitchen {
    private Chef chef;
    private final List<KitchenHelper> kitchenHelpers = new ArrayList<>();

//    TODO: task 5, 6, 7

    public Kitchen() {
        this.chef = new Chef("Chef", new SimpleDateFormat("1989-02-14"), new BigDecimal(12000));

        kitchenHelpers.add(new KitchenHelper("kitchenHelper1", new SimpleDateFormat("1980-01-20"), new BigDecimal(1200)));
        kitchenHelpers.add(new KitchenHelper("kitchenHelper2", new SimpleDateFormat("1980-01-20"), new BigDecimal(1200)));
    }

    public void chefRequestIngredient() {
        Ingredients ingredient = this.chef.requestIngredients(Ingredients.POTATO, kitchenHelpers);

        if(ingredient != null)
            System.out.println("Recived Ingredient: " + ingredient);
    }
}
