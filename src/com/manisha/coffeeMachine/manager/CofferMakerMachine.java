package com.manisha.coffeeMachine.manager;

import com.manisha.coffeeMachine.dao.Stock;
import com.manisha.coffeeMachine.dao.StockImpl;
import com.manisha.coffeeMachine.dao.exceptions.InsufficientStockException;
import com.manisha.coffeeMachine.manager.exceptions.IllegalInputException;
import com.manisha.coffeeMachine.model.Beverage;
import com.manisha.coffeeMachine.model.Dishes;

import java.util.HashMap;
import java.util.Map;

public class CofferMakerMachine {
    private Stock stock;

    public CofferMakerMachine(final Stock stock) {
        this.stock = stock;
    }

    public void addStock(String item, int quantity) {
        if (stock.getStock().get(item) == null) {
            throw new IllegalInputException("Item doesn't exists.");
        }
         try{
             stock.addStock(item, quantity);
         }catch (IllegalInputException e){
             throw new ArrayIndexOutOfBoundsException("");
         }
    }

    public void getStock() {
        HashMap<String, Integer> map = stock.getStock();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    public void prepare(String dish) {
        if (Dishes.getObject(dish)!=null) {
            throw new IllegalInputException("Wrong " +
                    "dish!!!");
        }
        Beverage beverage = Dishes.getObject(dish);

        Map<String, Integer> map = beverage.getIngredients();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (stock.getStock().get(entry.getKey()) == 0) {
                throw new InsufficientStockException("Insufficient quantity");
            }
            stock.reduceStock(entry.getKey(), entry.getValue());
        }
    }
}
