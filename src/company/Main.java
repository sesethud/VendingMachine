package company;


import org.junit.jupiter.api.Test;
import product.SaltySnack;
import product.SoftDrink;
import vending.OverloadedVendingMachine;
import product.Chocolate;
import vending.Product;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class Main {


    public static void main(String[] args) {

      //  OverloadedVendingMachine obj =new OverloadedVendingMachine(1,2,3);

        OverloadedVendingMachine vendingMachineObj=new OverloadedVendingMachine(4,5,1);
        Chocolate chocolate=new Chocolate();
        SaltySnack saltySnackObj= new SaltySnack();
        SoftDrink softDrinkObj=new SoftDrink();
        Product productObj=new Product();

        System.out.println("Test for Product method");
        System.out.print("Checking stock: ");
        System.out.println(vendingMachineObj.getStock(productObj));
        vendingMachineObj.buy(productObj);
        System.out.println(vendingMachineObj.getStock(productObj));


      //  vendingMachineObj.addStock(productObj);
      //  System.out.println(vendingMachineObj.getStock(productObj));

    }




}
