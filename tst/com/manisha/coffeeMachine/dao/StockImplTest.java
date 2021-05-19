package com.manisha.coffeeMachine.dao;


import com.manisha.coffeeMachine.dao.exceptions.IllegalInputException;
import com.manisha.coffeeMachine.dao.exceptions.InsufficientStockException;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class StockImplTest {

    StockImpl stockImpl;

    @Before
    public void setup() {
        stockImpl = new StockImpl();
    }

    @Test
    public void addStockShouldUpdateSuccessfully() {
        stockImpl.addStock("hot_water", 10);
        int hotWater = stockImpl.getStock().get("hot_water");
        Assert.assertEquals(hotWater, 510);
    }

    @Test(expected = IllegalInputException.class)
    public void addStockShoudThrowIllegalArgumentExceptionForInvalidOutput() {
        stockImpl.addStock("hot_", 10);
    }

    @Test
    public void reduceStockShouldReduceSuccessfully() {
        stockImpl.reduceStock("hot_water", 50);
        int hotWater = stockImpl.getStock().get("hot_water");
        Assert.assertEquals(hotWater, 450);
    }

    @Test(expected = InsufficientStockException.class)
    public void reduceStockShouldThrowInsufficientStockException() {
        stockImpl.reduceStock("hot_water", 700);
    }

    @Test(expected = IllegalInputException.class)
    public void reduceStockShouldThrowIllegalInputExceptionForInvalidOutput() {
        stockImpl.addStock("hot_", 10);
    }

}
