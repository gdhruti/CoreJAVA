package com.evergent.corejava.collections.dhruti.task3;

import java.util.Scanner;

public class FoodClient {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        FoodInterface foodInterface = new FoodImp();

        for (;;) {
            System.out.println("1. Add Food 2. Search by ID 3. Display All 4. Exit");
            int choice = sc.nextInt();
            sc.nextLine(); // Consume newline

            switch (choice) {
                case 1:
                    System.out.println("Enter the food ID:");
                    String id = sc.nextLine();
                    System.out.println("Enter the food name:");
                    String name = sc.nextLine();
                    System.out.println("Enter the price:");
                    double price = sc.nextDouble();
                    sc.nextLine(); // Consume newline

                    Food food = new Food();
                    food.setId(id);
                    food.setName(name);
                    food.setPrice(price);

                    String message = foodInterface.addFood(food);
                    System.out.println("Food added with ID: " + message);
                    break;

                case 2:
                    System.out.println("Enter the food ID:");
                    String searchId = sc.nextLine();
                    foodInterface.searchById(searchId);
                    break;

                case 3:
                    foodInterface.getAllFoods();
                    break;

                case 4:
                    sc.close();
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}

