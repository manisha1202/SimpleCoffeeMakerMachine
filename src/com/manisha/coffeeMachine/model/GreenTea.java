package com.manisha.coffeeMachine.model;

import java.util.HashMap;
import java.util.Map;

public class GreenTea implements Beverage{
    HashMap<String,Integer> map;

    GreenTea(){
        map=new HashMap<>();
        map.put("hot_water",200);
        map.put("sugar_syrup",20);
        map.put("green_tea_syrup",30);
    }

    @Override
    public Map<String, Integer> getIngredients() {
        return map;
    }
}
