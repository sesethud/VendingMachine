package tests;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import product.Chocolate;
import product.SaltySnack;
import product.SoftDrink;
import vending.OverloadedVendingMachine;
import vending.Product;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class test {

    OverloadedVendingMachine vendingMachineObj=new OverloadedVendingMachine(4,4,4);
    Chocolate chocolate=new Chocolate();
    SaltySnack saltySnackObj= new SaltySnack();
    SoftDrink softDrinkObj=new SoftDrink();
    Product product=new Product();

    
    @Test
    void testAddStock(){



        vendingMachineObj.addStock(chocolate);
        vendingMachineObj.addStock(saltySnackObj);
        vendingMachineObj.addStock(softDrinkObj);

      /*  System.out.println(vendingMachineObj.getStock(chocolate));
        System.out.println(vendingMachineObj.getStock(saltySnackObj));
        System.out.println(vendingMachineObj.getStock(softDrinkObj));
*/


        assertEquals(vendingMachineObj.getStock(chocolate),5,"Chocolate test");
        assertEquals(vendingMachineObj.getStock(saltySnackObj),5,"Salty Test");
        assertEquals(vendingMachineObj.getStock(softDrinkObj),5,"Soft drink test ");
    }
    @Test
    public void testDescription(){
        Chocolate chocolateObj =new Chocolate();
        SaltySnack saltySnack=new SaltySnack();
        assertEquals( chocolateObj.description(),"This is a chocolate product","This tests the description of chocolates");

    }
    @Test
    public void testBuy(){


        vendingMachineObj.buy(chocolate);
        vendingMachineObj.buy(softDrinkObj);
        vendingMachineObj.buy(saltySnackObj);
        assertEquals(vendingMachineObj.getStock(chocolate),4,"Chocolate test");
        assertEquals(vendingMachineObj.getStock(saltySnackObj),4,"Salty Test");
        assertEquals(vendingMachineObj.getStock(softDrinkObj),4,"Soft drink test ");



    }

}
