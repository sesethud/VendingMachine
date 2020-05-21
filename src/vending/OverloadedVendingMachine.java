package vending;

import product.*;
import java.util.Scanner;

public class OverloadedVendingMachine {

    private int softDrinkQty;
    private int saltySnacksQty;
    private int chocolatesQty;

    public OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        this.chocolatesQty=chocolatesQty;
        this.saltySnacksQty=saltySnacksQty;
        this.softDrinkQty=softDrinkQty;
        // set the stockLevel instance variables for each product in the constructor
    }
    public OverloadedVendingMachine(){}

//    OverloadedVendingMachine overloadedVendingMachineObj=new OverloadedVendingMachine();
    public void buy(SoftDrink softdrink){
        if(softdrink != null && softDrinkQty ==0){
            softDrinkQty--;
            return;
        }

    }
    public void buy(SaltySnack saltySnack){
        if(saltySnack !=null && saltySnacksQty ==0){
            saltySnacksQty --;
            return;

        }
    }
    public void buy(Chocolate chocolate){
        if (chocolate !=null && chocolatesQty ==0){
            chocolatesQty -- ;
            return;
        }
    }
   /* public void buy(Product product) {
        if(product !=null){
            saltySnacksQty--;
            softDrinkQty--;
            chocolatesQty--;
            if (saltySnacksQty == 0 || chocolatesQty ==0 || softDrinkQty==0){
                return;
            }
        }
    }
*/
    public void addStock(SoftDrink softdrink){
        softDrinkQty++;
    }
    public void addStock(SaltySnack saltySnack){
        saltySnacksQty++;
    }
    public void addStock(Chocolate chocolate){
        chocolatesQty++;
    }
    /*public void addStock(Product product){
        softDrinkQty++;
        chocolatesQty++;
        saltySnacksQty++;
    }*/
    public int getStock(Chocolate chocolate) {
        if (chocolate != null) {
            return chocolatesQty;
        }
        return 0;
    }
        public int getStock (SoftDrink softdrink){
            if (softdrink != null) {
                return softDrinkQty;
            }
            return 0;
        }
        public int getStock(SaltySnack saltySnack){
            if (saltySnack != null) {
                return softDrinkQty;
            }
            return 0;
        }
        public int getStock(Product product){
            if(product != null){
                return softDrinkQty+chocolatesQty+saltySnacksQty;
            }
            return 0;
        }
        public void buy(Product product){
            int chocDiff;

            String available="";


            if(product!=null){
                System.out.println("How many chocolates to buy?");
                Scanner chocolateScanner=new Scanner(System.in);
                int theBuy=chocolateScanner.nextInt();
                if(chocolatesQty>=theBuy) {
                    chocolatesQty = -theBuy;
                    System.out.println(theBuy+" chocolates bought coming out...");
                }


                System.out.println("How many Soft Drinks to buy?");
                Scanner softDrinkScanner=new Scanner(System.in);
                int theBuy2=softDrinkScanner.nextInt();
                if(softDrinkQty>=theBuy2){
                    softDrinkQty=-theBuy2;
                    System.out.println("Softdrinks bought coming out...");
                }
                System.out.println("How many Salty snacks?");
                Scanner saltySnackScanner=new Scanner(System.in);
                int theBuy3=saltySnackScanner.nextInt();
                if(saltySnacksQty>=theBuy3){
                     saltySnacksQty=-theBuy3;
                }
            }

        }

        public void addStock(Product product){

            System.out.println("Add stock for chocolate: ");
            Scanner chocolateScanner=new Scanner(System.in);
            chocolatesQty=+chocolateScanner.nextInt();

            System.out.println("Add stock for salty snacks");
            Scanner saltySnackScanner = new Scanner(System.in);
            saltySnacksQty=+saltySnackScanner.nextInt();

            System.out.println("Add stock for soft");
            Scanner softDrinkScanner=new Scanner(System.in);
            softDrinkQty=+softDrinkScanner.nextInt();

            System.out.println("After add the stock is: "+ getStock(product));
        }
    }
