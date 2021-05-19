package com.manisha.coffeeMachine.model;

import java.util.HashMap;
import java.util.Map;

public class HotCoffee implements Beverage{
    HashMap<String,Integer> map;

    HotCoffee(){
        map=new HashMap<>();
        map.put("hot_water",100);
        map.put("hot_milk",400);
        map.put("sugar_syrup",30);
        map.put("coffee_decoction",50);
    }

    @Override
    public Map<String, Integer> getIngredients() {
        return map;
    }
}
