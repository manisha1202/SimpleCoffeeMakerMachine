package com.manisha.coffeeMachine.dao;

import com.manisha.coffeeMachine.dao.exceptions.IllegalInputException;
import com.manisha.coffeeMachine.dao.exceptions.InsufficientStockException;

import java.util.HashMap;

public interface Stock {
    HashMap<String,Integer> getStock();
    void addStock(String item,int quantity) throws IllegalInputException;
    void reduceStock(String item,int quantity) throws InsufficientStockException;
}
