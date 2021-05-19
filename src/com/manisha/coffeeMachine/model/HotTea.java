package com.manisha.coffeeMachine.model;

import java.util.HashMap;
import java.util.Map;

public class HotTea implements Beverage{
    HashMap<String,Integer> map;

    HotTea(){
        map=new HashMap<>();
        map.put("hot_water",200);
        map.put("hot_milk",300);
        map.put("sugar_syrup",30);
        map.put("tea_leaves_syrup",30);
    }

    @Override
    public Map<String, Integer> getIngredients() {
        return map;
    }
}
