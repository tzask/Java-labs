package com.company;

public class ProductDemo {

    public static void main(String[] args) {
        Product[] myProducts = new Product[5];
        myProducts[0] = new Product("Tea", 110.50, true, "green", 50);
        myProducts[1] = new Product("Coffee", 270.07, false, "black", 0);
        myProducts[2] = new Product("Flower", 15.55, true, "red", 126);
        myProducts[3] = new Product("Umbrella", 236.0, true, "yellow", 55);
        myProducts[4] = new Product();

        //changing myProducts[4]
        myProducts[4].setName("NewItem");
        myProducts[4].setPrice(1023.66);
        myProducts[4].setAvailable(false);
        myProducts[4].setColour("orange");
        myProducts[4].setQuantity(0);

        System.out.println("[All products are shown]");
            for (int i = 0; i < myProducts.length; i++) {
                System.out.println("Product's name: " + myProducts[i].getName());
                System.out.println("\tPrice: " + myProducts[i].getPrice());
                System.out.println("\tAvailability: " + myProducts[i].isAvailable());
                System.out.println("\tColour: " + myProducts[i].getColour());
                System.out.println("\tQuantity: " + myProducts[i].getQuantity());
                System.out.println("----------------------------");
            }
        System.out.println("----------------------------");

        System.out.println("[Only available products are shown]");
        for (int i = 0; i < myProducts.length; i++) {
            if (myProducts[i].isAvailable()) {
                System.out.println("Product's name: " + myProducts[i].getName());
                System.out.println("\tPrice: " + myProducts[i].getPrice());
                System.out.println("\tColour: " + myProducts[i].getColour());
                System.out.println("\tQuantity: " + myProducts[i].getQuantity());
                System.out.println("----------------------------");
            }
        }
    }
}