package com.manisha.coffeeMachine.dao;

import com.manisha.coffeeMachine.dao.exceptions.IllegalInputException;
import com.manisha.coffeeMachine.dao.exceptions.InsufficientStockException;

import java.util.HashMap;
import java.util.Objects;

public class StockImpl implements Stock {
    HashMap<String, Integer> stock;

    public StockImpl() {
        stock = new HashMap<>();
        stock.put("hot_water", 500);
        stock.put("hot_milk", 500);
        stock.put("coffee_decoction", 100);
        stock.put("sugar_syrup", 100);
        stock.put("tea_leaves_syrup", 100);
        stock.put("green_tea_syrup", 100);
    }

    @Override
    public HashMap<String, Integer> getStock() {
        return new HashMap<>(stock);
    }

    @Override
    public void addStock(String item, int quantity) {
        if(stock.get(item)==null){
            throw new IllegalInputException("Item doesn't exists!!!");
        }else{
            stock.put(item, stock.get(item) + quantity);
        }
    }

    @Override
    public void reduceStock(String item, int quantity) {
        if(Objects.isNull(stock.get(item))){
            throw new IllegalInputException("Item doesn't exists!!!");
        } else if (stock.get(item) - quantity < 0) {
            throw new InsufficientStockException("Insufficient " + item);
        } else {
            stock.put(item, stock.get(item) - quantity);
        }
    }
}
