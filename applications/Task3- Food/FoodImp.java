package com.evergent.corejava.collections.dhruti.task3;

import java.util.HashSet;
import java.util.Set;

public class FoodImp implements FoodInterface {
    private Set<Food> foodSet;

    public FoodImp() {
        foodSet = new HashSet<>();
    }

    @Override
    public String addFood(Food food) {
        foodSet.add(food);
        return food.getId();
    }

    @Override
    public void searchById(String id) {
        boolean found = false;
        if (!foodSet.isEmpty()) {
            for (Food food : foodSet) {
                if (food.getId().equals(id)) {
                    System.out.println(food.getId() + " " + food.getName() + " " + food.getPrice());
                    found = true;
                    break;
                }
            }
        }
        if (!found) {
            System.out.println("The food item is not found.");
        }
    }

    @Override
    public void getAllFoods() {
        if (!foodSet.isEmpty()) {
            for (Food food : foodSet) {
                System.out.println(food.getId() + " " + food.getName() + " " + food.getPrice());
            }
        } else {
            System.out.println("No food items are available.");
        }
    }
}
