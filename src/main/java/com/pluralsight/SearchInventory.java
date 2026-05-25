package com.pluralsight;
// import arraylist and scanner
import java.util.ArrayList;
import java.util.Scanner;

public class SearchInventory {
    // insert my scanner to get user input
    Scanner myScanner = new Scanner(System.in);

    //add an array for product
    static ArrayList<Products> inventory = getInventory();

    //add main
    public static void main(String[] args) {





        System.out.println("Please make a selection from our current inventory.");
    }

    // insert getinventory method here to create list of products
    public static void getInventory() {

       // create an empty list of products
        ArrayList<String> products = new ArrayList<String>();
        // add a minimum of 5 products to the list
        products.add("Black pearls");
        products.add("Popping Boba");
        products.add("Tapioca Starch");
        products.add("Boba Straws");
        products.add("Boba Cups");



        {





        System.out.println("Please make a selection from our current inventory: ");

    }

    }


}
