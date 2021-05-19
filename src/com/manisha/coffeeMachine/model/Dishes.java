package com.manisha.coffeeMachine.model;

import java.util.HashMap;

public final class Dishes {
    public static HashMap<String,Beverage> map;
    private Dishes(){

    }
    static{
        map=new HashMap<>();
        map.put("hot_tea",new HotTea());
        map.put("hot_coffee",new HotCoffee());
        map.put("black_tea", new BlackTea());
        map.put("green_tea",new GreenTea());
    }

    public static Beverage getObject(String drinkType){
        return map.get(drinkType);
    }
}
