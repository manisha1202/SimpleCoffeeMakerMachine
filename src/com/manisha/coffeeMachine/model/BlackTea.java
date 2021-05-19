package com.manisha.coffeeMachine.model;

import java.util.HashMap;
import java.util.Map;

public class BlackTea implements Beverage{
    HashMap<String,Integer> map;

    BlackTea(){
        map=new HashMap<>();
        map.put("hot_water",300);
        map.put("sugar_syrup",20);
        map.put("tea_leaves_syrup",30);
    }

    @Override
    public Map<String, Integer> getIngredients() {
        return map;
    }
}
