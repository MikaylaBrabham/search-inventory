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

            int command = Integer.parseInt(myScanner.nextLine());

            //add switch
            switch (command) {
                case 1:
                    listAllProducts();
                    break;
                case 2:
                    lookupById();
                    break;
                case 3:
                    searchByPriceRange();
                    break;
                case 4:
                    addProduct();
                    break;
                case 5:
                    return;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }

    // insert getinventory method here to create list of products
    public static ArrayList<Products> getInventory() {
        // create an empty list of products
        ArrayList<Products> products = new ArrayList<>();


        // add a minimum of 5 products to the list
        products.add(new Products(1209, "Black pearls", 5.09f));
        products.add(new Products(2356, "Popping Boba", 13.76f));
        products.add(new Products(8907, "Tapioca Starch", 7.98f));
        products.add(new Products(5674, "Boba Straws", 5.34f));
        products.add(new Products(2390, "Boba Cups", 12.76f));

        //products
        return products;
    }

    //add list options

    //add lookup by id

    //searchby price range

    //addproducts



        {





        System.out.println("Please make a selection from our current inventory: ");

    }

    }


}
