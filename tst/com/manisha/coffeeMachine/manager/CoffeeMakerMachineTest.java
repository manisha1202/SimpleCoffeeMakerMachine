package com.manisha.coffeeMachine.manager;

import com.manisha.coffeeMachine.dao.StockImpl;
import com.manisha.coffeeMachine.dao.exceptions.IllegalInputException;
import org.junit.Before;
import org.junit.Test;

import static org.mockito.Matchers.anyInt;
import static org.mockito.Matchers.anyString;
import static org.mockito.Mockito.*;

public class CoffeeMakerMachineTest {
    StockImpl stockMock;
    CofferMakerMachine cofferMakerMachine;

    @Before
    public void setup(){
        stockMock = mock(StockImpl.class);
        cofferMakerMachine=new CofferMakerMachine(stockMock);
    }

    @Test(expected = ArrayIndexOutOfBoundsException.class)
    public void addStockShouldUpdateSuccessfully(){
        doThrow(new IllegalInputException("")).when(stockMock).addStock(any(),any());
        cofferMakerMachine.addStock("hot_milk",20);

    }
}
