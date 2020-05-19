package vending;

import vending.product.*;

public class OverloadedVendingMachine {

    private int softDrinkQty;
    private int saltySnacksQty;
    private int chocolatesQty;

    OverloadedVendingMachine(int softDrinkQty, int saltySnacksQty, int chocolatesQty){
        this.chocolatesQty=chocolatesQty;
        this.saltySnacksQty=saltySnacksQty;
        this.softDrinkQty=softDrinkQty;
        // set the stockLevel instance variables for each product in the constructor
    }

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
    public void buy(Product product) {
        if(product !=null){
            saltySnacksQty--;
            softDrinkQty--;
            chocolatesQty--;
            if (saltySnacksQty == 0 || chocolatesQty ==0 || softDrinkQty==0){
                return;
            }
        }
    }
    public void addStock(SoftDrink softdrink){
        softDrinkQty++;
    }
    public void addStock(SaltySnack saltySnack){
        saltySnacksQty++;
    }
    public void addStock(Chocolate chocolate){
        chocolatesQty++;
    }
    public void addStock(Product product){
        softDrinkQty++;
        chocolatesQty++;
        saltySnacksQty++;
    }
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

    }
