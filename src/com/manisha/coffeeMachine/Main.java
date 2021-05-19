package com.manisha.coffeeMachine;

import com.manisha.coffeeMachine.dao.StockImpl;
import com.manisha.coffeeMachine.manager.CofferMakerMachine;

public class Main {

    public static void main(String[] args) {
        // write your code here

        CofferMakerMachine cofferMakerMachine = new CofferMakerMachine(new StockImpl());
        cofferMakerMachine.addStock("hot_water", 100);
        cofferMakerMachine.getStock();
        cofferMakerMachine.prepare("black_tea");
        cofferMakerMachine.getStock();
    }
}
