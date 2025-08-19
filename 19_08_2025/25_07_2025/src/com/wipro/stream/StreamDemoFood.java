package com.wipro.stream;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

public class StreamDemoFood {

    public static void main(String[] args) {

        FoodItem f1 = new FoodItem("Chicken Lollipop", "Non Veg", "Chinese", 160);
        FoodItem f2 = new FoodItem("Fried Rice", "Veg", "Chinese", 100);
        FoodItem f3 = new FoodItem("Pad Thai", "Non Veg", "Thai", 150);
        FoodItem f4 = new FoodItem("Spring Roll", "Veg", "Chinese", 90);
        FoodItem f5 = new FoodItem("Pasta", "Veg", "Continental", 130);

        List<FoodItem> foodList = new ArrayList<>();
        foodList.add(f1);
        foodList.add(f2);
        foodList.add(f3);
        foodList.add(f4);
        foodList.add(f5);

        List<FoodItem> chineseFoods = foodList
                .stream()
                .filter(f -> f.getCuisine().equalsIgnoreCase("Chinese"))
                .collect(Collectors.toList());

        System.out.println(chineseFoods);
        
        Optional<FoodItem> mostExpensiveChinese = chineseFoods.stream()
                .max(Comparator.comparingDouble(FoodItem::getPrice));

        if (mostExpensiveChinese.isPresent()) {
            System.out.println("Most Expensive Chinese Dish: " + mostExpensiveChinese.get());
        } else {
            System.out.println("No Chinese dish found.");
        }
    }
}
