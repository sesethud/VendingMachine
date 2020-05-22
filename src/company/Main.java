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

        // Calling the OverloadedVendingMachine class and creating an instance
        OverloadedVendingMachine vendingMachineObj=new OverloadedVendingMachine(6,6,6);

        //Chocolate class instance
        Chocolate chocolate=new Chocolate();

        //Salty snacks class instance
        SaltySnack saltySnackObj= new SaltySnack();

        //Softdrink class class instance
        SoftDrink softDrinkObj=new SoftDrink();

        //Product class instance
        Product productObj=new Product();


        System.out.println("Test for Product method");
        System.out.print("Checking stock: ");

        //Printing out the
        System.out.println(vendingMachineObj.getStock(productObj));

        //Buying different quantities of each type of Product using the Product instance
        vendingMachineObj.buy(productObj);


        //Test printout for getStock() method using all different Product types

        System.out.println("Products left "+vendingMachineObj.getStock(productObj));

        //Troubleshooting the buy() method so that no negative values are a result at any point

        System.out.println("Chocolates left "+vendingMachineObj.getStock(chocolate));
        System.out.println("Salty snacks left"+vendingMachineObj.getStock(saltySnackObj));
        System.out.println("Drinks left "+vendingMachineObj.getStock(softDrinkObj));
    }
}
