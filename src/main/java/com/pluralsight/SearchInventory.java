package com.pluralsight;

import java.util.ArrayList;
import java.util.Scanner;

public class SearchInventory {
    public static void main(String[] args) {
        /*Scanner userInput = new Scanner(System.in);
        System.out.print("fruit id:");
        String id = userInput.nextLine();
        System.out.print("fruit name:");
        String fruitName = userInput.nextLine();
        System.out.print("fruit price:");
        String price = userInput.nextLine();*/

        //System.out.println(getInventory());
    }
    // Method
    public static String getInventory(/*String id,String fruitName, String price*/){
        // builds list
        ArrayList<String> fruits = new ArrayList<>();
        System.out.println("-----Fruits Available-----");
        fruits.add("1|mango|10.99");
        fruits.add("2|grapes|0.99");
        fruits.add("3|pineapple|3.99");
        fruits.add("4|watermelon|5.99");
        fruits.add("5|strawberry|2.99");



    }
}
