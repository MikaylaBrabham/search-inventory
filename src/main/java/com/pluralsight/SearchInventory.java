package com.pluralsight;
// import arraylist and scanner
import java.util.ArrayList;
import java.util.Scanner;

public class SearchInventory {
    // insert my scanner to get user input
   static Scanner myScanner = new Scanner(System.in);

    //add an array for product
    static ArrayList<Products> inventory = getInventory();

    //add main
    public static void main(String[] args) {

        //add while statement to get menu options
        while (true) {
            System.out.println("What do you want to do?");
            System.out.println("1 - list all products");
            System.out.println("2 - Lookup product by id");
            System.out.println("3 - Find products within price range");
            System.out.println("4 - Add new product");
            System.out.println("5 - Quit");
            System.out.println("Enter command: ");


        }





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
