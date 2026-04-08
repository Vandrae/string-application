package com.pluralsight;

public class Reciept {
    public static void main(String[] args) {

        String itemName = "Apple";
        double itemPrice = 7.1;
        int itemQuantity = 3;

        //String.format(%.2f) shows the last 2 places in itemPrice
        System.out.println("You bought " + itemQuantity + " " + itemName +"s for " + String.format("%.2f", itemPrice));
    }
}
